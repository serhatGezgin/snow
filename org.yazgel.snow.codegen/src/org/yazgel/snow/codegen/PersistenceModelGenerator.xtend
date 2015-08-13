package org.yazgel.snow.codegen

import org.yazgel.snow.PersistenceModel
import org.yazgel.snow.Entity

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

		fs.write(model.extRootPath + '/' + model.artifactId.toFirstUpper + 'PersistenceFactory.java',
			model.generateFactory)
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
				«p.generatePropertField»
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

	def protected String generatePropertField(
		org.yazgel.snow.Property property
	) '''
		private «property.type» «property.name»;
	'''

	def protected String generateGetterSetter(
		org.yazgel.snow.Property property
	) '''
		public «property.type» «property.extGetterName»(){
			return this.«property.name»;
		}
		
		public void «property.extSetterName»(«property.type» «property.name»){
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
}