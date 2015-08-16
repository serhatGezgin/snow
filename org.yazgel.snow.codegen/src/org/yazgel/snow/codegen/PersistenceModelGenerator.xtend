package org.yazgel.snow.codegen

import org.yazgel.snow.PersistenceModel
import org.yazgel.snow.Entity
import org.yazgel.snow.ComplexProperty
import org.yazgel.snow.RelationType

class PersistenceModelGenerator {
	extension SnowExtensions ext = new SnowExtensions
	val fs = new SnowFileSystemAccess

	def generate(PersistenceModel model) {
		/* Generate pom.xml */
		fs.write(model.extProjectRootPath + '/pom.xml', model.generatePom)

		/* Genereate ICrudPersistence.java */
		fs.write(model.extServicePath + '/' + 'ICrudPersistence.java', model.generateICrudPersistence)

		/* Generate DbCrudPersistence.java */
		fs.write(model.extServiceImplPath + '/' + 'DbCrudPersistence.java', model.generateDbCrudPersistence)

		/* Generate IPersistenceUnitFactory.java */
		fs.write(model.extServicePath + '/' + 'IPersistenceUnitFactory.java', model.generateIPersistenceUnitFactory)

		/* Generate DbPersistenceUnitFactory.java */
		fs.write(model.extServiceImplPath + '/' + 'DbPersistenceUnitFactory.java',
			model.generateDbPersistenceUnitFactory)

		model.entities.forEach [ e |
			/* Generate entity */
			fs.write(e.extEntityPath, e.generateEntity)
			/* Generate entity persistence interface. */
			fs.write(e.extPersistenceModel.extServicePath + '/' + e.extEntityPeristenceName + '.java',
				e.generateEntityService)
			/* Generate entity persistence implementation. */
			fs.write(e.extPersistenceModel.extServiceImplPath + '/' + e.extEntityPeristenceImplName + '.java',
				e.generateEntityServiceImpl)
		]

		/* Generate injection module. */
		fs.write(model.extServicePath + '/' + 'PersistenceInjectionModule.java', model.generateInjectionModule)

		/* Generate factory. */
		fs.write(model.extRootPath + '/' + model.artifactId.toFirstUpper + 'PersistenceFactory.java',
			model.generateFactory)

		/* Generate persistence.xml */
		fs.write(model.extMainResourcesPath + '/' + 'META-INF' + '/' + 'persistence.xml',
			model.genereateMainPersisenceXml)

		/* Generate persistence.xml */
		fs.write(model.extTestResourcesPath + '/' + 'META-INF' + '/' + 'persistence.xml',
			model.generateTestPersistenceXml)

		/* Generate insert.sql */
		fs.write(model.extTestResourcesPath + '/' + 'insert.sql', '-- TODO add insert statements')

		/* Generate mock persistence unit factory. */
		fs.write(model.extTestServicePath + '/' + 'MockPersistenceUnitFactory.java',
			model.generateMockPersistenceUnitFactory)

		/* Generate mock persistence injection module. */
		fs.write(model.extTestServicePath + '/' + 'MockPersistenceInjectionModule.java',
			model.generateMockPersistenceInjectionModule)

		/* Generate test base. */
		fs.write(model.extTestServicePath + '/' + 'DbPersistenceTestBase.java', model.generateDbPersistenceTestBase)

		/* Generate tests. */
		model.entities.forEach [ e |
			fs.write(model.extTestServicePath + '/' + e.extEntityPeristenceImplName + 'Test.java',
				e.generateDbPersistenceTest)
		]
	}

	def protected String generatePom(
		PersistenceModel persistence
	) '''
		<?xml version="1.0"?>
		<project
			xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd"
			xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
			<modelVersion>4.0.0</modelVersion>
			
			<groupId>«persistence.groupId»</groupId>
			<artifactId>«persistence.artifactId»</artifactId>
			<version>1.0.0-SNAPSHOT</version>
			<packaging>jar</packaging>
			
			<name>«persistence.artifactId»</name>
			
			<properties>
				<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
				<project.java.version>1.8</project.java.version>
				
				<!-- Dependency versions -->
				<junit.version>4.12</junit.version>
				<derby.version>10.9.1.0</derby.version>
				<guice.version>4.0</guice.version>
				<hibernate.version>4.3.10.Final</hibernate.version>
				<javaee-api.version>7.0</javaee-api.version>
			</properties>
			
			<dependencies>
				<dependency>
					<groupId>javax</groupId>
					<artifactId>javaee-api</artifactId>
					<version>${javaee-api.version}</version>
					<scope>provided</scope>
				</dependency>
				<dependency>
					<groupId>org.hibernate</groupId>
					<artifactId>hibernate-entitymanager</artifactId>
					<version>${hibernate.version}</version>
				</dependency>
				<dependency>
					<groupId>com.google.inject</groupId>
					<artifactId>guice</artifactId>
					<version>${guice.version}</version>
				</dependency>
				
				<!-- JDBC Connector Dependency -->
				«persistence.dbConnectorDependency»
		
				<!-- Test dependencies -->
				<dependency>
			<groupId>junit</groupId>
			<artifactId>junit</artifactId>
			<version>${junit.version}</version>
			<scope>test</scope>
				</dependency>
				<dependency>
					<groupId>org.apache.derby</groupId>
					<artifactId>derby</artifactId>
					<version>${derby.version}</version>
					<scope>test</scope>
				</dependency>
			</dependencies>
			
			<build>
				<plugins>
					<plugin>
					<groupId>org.apache.maven.plugins</groupId>
					<artifactId>maven-compiler-plugin</artifactId>
					<version>3.3</version>
					<configuration>
						<source>${project.java.version}</source>
						<target>${project.java.version}</target>
					</configuration>
					</plugin>
				</plugins>
			</build>
		</project>
	'''

	def protected String generateICrudPersistence(
		PersistenceModel model
	) '''
		package «model.extServicePackage»;
		
		public interface ICrudPersistence<T> {
		
			void save(T entity);
		
			T get(Long id);
		
			java.util.List<T> list();
		
			Class<T> getPersistenceClass();
		}
	'''

	def protected String generateDbCrudPersistence(
		PersistenceModel model
	) '''
		package «model.extServiceImplPackage»;
		
		public abstract class DbCrudPersistence<T> implements «model.extServicePackage».ICrudPersistence<T> {
			@com.google.inject.Inject
			private «model.extServicePackage».IPersistenceUnitFactory persistenceUnitFactory;
		
			@Override
			public void save(T entity) {
				javax.persistence.EntityManagerFactory entityManagerFactory = persistenceUnitFactory.getEntityManagerFactory();
		
				javax.persistence.EntityManager entityManager = entityManagerFactory.createEntityManager();
				javax.persistence.EntityTransaction transaction = entityManager.getTransaction();
				transaction.begin();
				entityManager.persist(entity);
				transaction.commit();
		
				entityManager.close();
				entityManagerFactory.close();
			}
		
			@Override
			public T get(Long id) {
				javax.persistence.EntityManagerFactory entityManagerFactory = persistenceUnitFactory.getEntityManagerFactory();
				javax.persistence.EntityManager entityManager = entityManagerFactory.createEntityManager();
		
				return (T) entityManager.find(getPersistenceClass(), id);
			}
		
			@Override
			public java.util.List<T> list() {
				javax.persistence.EntityManagerFactory emf = persistenceUnitFactory.getEntityManagerFactory();
				javax.persistence.EntityManager em = emf.createEntityManager();
		
				javax.persistence.criteria.CriteriaBuilder builder = em.getCriteriaBuilder();
				javax.persistence.criteria.CriteriaQuery<T> criteriaQuery = builder.createQuery(getPersistenceClass());
				javax.persistence.criteria.Root<T> c = criteriaQuery.from(getPersistenceClass());
				criteriaQuery.select(c);
		
				return em.createQuery(criteriaQuery).getResultList();
			}
		}
	'''

	def protected String generateIPersistenceUnitFactory(
		PersistenceModel model
	) '''
		package «model.extServicePackage»;
		
		public interface IPersistenceUnitFactory {
		
			javax.persistence.EntityManagerFactory getEntityManagerFactory();
		
			String getPersistenceUnitName();
		}
	'''

	def protected String generateDbPersistenceUnitFactory(
		PersistenceModel model
	) '''
		package «model.extServiceImplPackage»;
		
		public class DbPersistenceUnitFactory implements «model.extServicePackage».IPersistenceUnitFactory {
		
			@Override
			public javax.persistence.EntityManagerFactory getEntityManagerFactory() {
				return javax.persistence.Persistence.createEntityManagerFactory(getPersistenceUnitName());
			}
		
			@Override
			public String getPersistenceUnitName() {
				return "prod";
			}
		}
	'''

	def protected String generateEntity(
		Entity entity
	) '''
		package «entity.extPersistenceModel.extModelPackage»;
		
		@javax.persistence.Entity
		«IF entity.tableName != null»@javax.persistence.Table(name="«entity.tableName»")«ENDIF»
		public class «entity.name» {
			@javax.persistence.Id
			@javax.persistence.GeneratedValue
			private Long id;
			«FOR p : entity.properties»
				«p.generatePropertyField»
			«ENDFOR»
			
			public Long getId(){
				return this.id;
			}
			
			public void setId(Long id){
				this.id = id;
			}
			
			«FOR p : entity.properties»
				«p.generateGetterSetter»
			«ENDFOR»
		}
	'''

	def dispatch protected String generatePropertyField(
		org.yazgel.snow.Property property
	) '''
		private «property.extTypeName» «property.name»;
	'''

	def dispatch protected String generatePropertyField(
		ComplexProperty complexProperty
	) '''
		«complexProperty.extAnnotation»
		private «complexProperty.extTypeName» «complexProperty.name»«IF complexProperty.relationType == RelationType.ONE_TO_MANY» = new java.util.ArrayList<«complexProperty.type»>()«ENDIF»;
	'''

	def protected String generateGetterSetter(
		org.yazgel.snow.Property property
	) '''
		public «property.extTypeName» «property.extGetterName»(){
			return this.«property.name»;
		}
		
		public void «property.extSetterName»(«property.extTypeName» «property.name»){
			this.«property.name» = «property.name»;
		}
	'''

	def protected String generateEntityService(
		Entity entity
	) '''
		package «entity.extPersistenceModel.extServicePackage»;
		
		public interface «entity.extEntityPeristenceName» extends ICrudPersistence<«entity.extEntityFullName»> {
		}
	'''

	def protected String generateEntityServiceImpl(
		Entity entity
	) '''
		package «entity.extPersistenceModel.extServiceImplPackage»;
		
		public class «entity.extEntityPeristenceImplName» 
				extends «entity.extPersistenceModel.extServiceImplPackage».DbCrudPersistence<«entity.extEntityFullName»>
				implements «entity.extEntityPersistenceFullName» {
		
			@Override
			public Class<«entity.extEntityFullName»> getPersistenceClass() {
				return «entity.extEntityFullName».class;
			}
		}
	'''

	def protected String generateInjectionModule(
		PersistenceModel persistenceModel
	) '''
		package «persistenceModel.extServicePackage»;
		
		public class PersistenceInjectionModule extends com.google.inject.AbstractModule {
		
			@Override
			protected void configure() {
				bind(«persistenceModel.extServicePackage».IPersistenceUnitFactory.class).to(«persistenceModel.extServiceImplPackage».DbPersistenceUnitFactory.class);
		
				«FOR e : persistenceModel.entities»
					bind(new com.google.inject.TypeLiteral<«persistenceModel.extServiceImplPackage».DbCrudPersistence<«e.extEntityFullName»>>() {
					}).to(new com.google.inject.TypeLiteral<«e.extEntityPersistenceImplFullName»>() {
					});
					bind(«e.extEntityPersistenceFullName».class).to(«e.extEntityPersistenceImplFullName».class);
				«ENDFOR»
			}
		}
	'''

	def protected String generateFactory(PersistenceModel persistenceModel) '''
		package «persistenceModel.extRootPackage»;
		
		public class «persistenceModel.extFactoryName» {
			private com.google.inject.Module injectionModule;
			«FOR e : persistenceModel.entities»
				private «e.extEntityPersistenceFullName» _«e.extEntityPeristenceName»;
			«ENDFOR»
		
			public «persistenceModel.extFactoryName»() {
				this(new «persistenceModel.extServicePackage».PersistenceInjectionModule());
			}
		
			public «persistenceModel.extFactoryName»(com.google.inject.Module injectionModule) {
				this.injectionModule = injectionModule;
			}
		
			private com.google.inject.Injector getInjector() {
				return com.google.inject.Guice.createInjector(injectionModule);
			}
			
			«FOR e : persistenceModel.entities»
				public «e.extEntityPersistenceFullName» get«e.extEntityPeristenceName»() {
					if (_«e.extEntityPeristenceName» == null) {
						_«e.extEntityPeristenceName» = getInjector().getInstance(«e.extEntityPersistenceFullName».class);
					}
					
					return _«e.extEntityPeristenceName»;
				}
			«ENDFOR»
		}
	'''

	def protected String genereateMainPersisenceXml(PersistenceModel persistenceModel) '''
		<?xml version="1.0" encoding="UTF-8"?>
		<persistence xmlns="http://xmlns.jcp.org/xml/ns/persistence"
		             xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
		             xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/persistence http://xmlns.jcp.org/xml/ns/persistence/persistence_2_1.xsd"
		             version="2.1">
		
		<persistence-unit name="prod" transaction-type="RESOURCE_LOCAL">
		   	<provider>org.hibernate.jpa.HibernatePersistenceProvider</provider>
		   	«FOR e : persistenceModel.entities»
		   		<class>«e.extEntityFullName»</class>
			«ENDFOR»
			<properties>
			<property name="javax.persistence.jdbc.driver" value="«persistenceModel.jdbcDriver»"/>
			<property name="javax.persistence.jdbc.url" value="«persistenceModel.jdbcUrl»"/>
			<property name="javax.persistence.jdbc.user" value="«persistenceModel.jdbcUser»"/>
			<property name="javax.persistence.jdbc.password" value="«persistenceModel.jdbcPassword»"/>
			<property name="hibernate.hbm2ddl.auto" value="update"/>
			</properties>
		</persistence-unit>
		</persistence>        
	'''

	def protected String generateTestPersistenceXml(PersistenceModel model) '''
		<?xml version="1.0" encoding="UTF-8"?>
		<persistence xmlns="http://xmlns.jcp.org/xml/ns/persistence"
			xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
			xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/persistence http://xmlns.jcp.org/xml/ns/persistence/persistence_2_1.xsd"
			version="2.1">
		
			<persistence-unit name="test" transaction-type="RESOURCE_LOCAL">
				<provider>org.hibernate.jpa.HibernatePersistenceProvider</provider>
				«FOR e : model.entities»
					<class>«e.extEntityFullName»</class>
				«ENDFOR»
				<properties>
					<property name="javax.persistence.jdbc.driver" value="org.apache.derby.jdbc.EmbeddedDriver" />
					<property name="javax.persistence.jdbc.url" value="jdbc:derby:memory:«model.artifactId»;create=true" />
					<property name="javax.persistence.schema-generation.database.action"
						value="drop-and-create" />
					<property name="javax.persistence.schema-generation.scripts.action"
						value="drop-and-create" />
					<property name="javax.persistence.schema-generation.scripts.create-target"
						value="target/create.sql" />
					<property name="javax.persistence.schema-generation.scripts.drop-target"
						value="target/drop.sql" />
					<property name="javax.persistence.sql-load-script-source"
						value="insert.sql" />
				</properties>
			</persistence-unit>
		
		</persistence>        
	'''

	def protected String generateMockPersistenceUnitFactory(PersistenceModel persistenceModel) '''
		package «persistenceModel.extServicePackage»;
		
		public class MockPersistenceUnitFactory extends «persistenceModel.extServiceImplPackage».DbPersistenceUnitFactory {
		
			@Override
			public String getPersistenceUnitName() {
				return "test";
			}
		}
	'''

	def protected String generateMockPersistenceInjectionModule(PersistenceModel persistenceModel) '''
		package «persistenceModel.extServicePackage»;
		
		public class MockPersistenceInjectionModule implements com.google.inject.Module {
		
			@Override
			public void configure(com.google.inject.Binder binder) {
				binder.bind(«persistenceModel.extServicePackage».IPersistenceUnitFactory.class).to(
						«persistenceModel.extServicePackage».MockPersistenceUnitFactory.class);
			}
		}	
	'''

	def protected String generateDbPersistenceTestBase(PersistenceModel persistenceModel) '''
		package «persistenceModel.extServicePackage»;
		
		public class DbPersistenceTestBase {
			protected «persistenceModel.extFactoryFullName» persistenceFactory;
		
			@org.junit.Before
			public void setup() throws Exception {
				com.google.inject.Module mock = com.google.inject.util.Modules.override(new PersistenceInjectionModule()).with(new MockPersistenceInjectionModule());
				persistenceFactory = new «persistenceModel.extFactoryFullName»(mock);
			}
		}
	'''

	def protected String generateDbPersistenceTest(Entity entity) '''
		package «entity.extPersistenceModel.extServicePackage»;
		
		
		public class «entity.extEntityPeristenceImplName»Test extends «entity.extPersistenceModel.extServicePackage».DbPersistenceTestBase {
			private «entity.extEntityPersistenceFullName» persistence;
		
			@org.junit.Before
			public void setUp() throws Exception {
				super.setup();
		
				persistence = persistenceFactory.get«entity.extEntityPeristenceName»();
			}
		
			@org.junit.Test
			public void test() {
				/* TODO: implement. */
				org.junit.Assert.assertTrue(true);
			}
		}
	'''
}