package org.yazgel.snow.codegen;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.yazgel.snow.Entity;
import org.yazgel.snow.PersistenceModel;
import org.yazgel.snow.Property;
import org.yazgel.snow.SnowFactory;

public class SnowExtensionsTest {
	private SnowExtensions snowExtensions;

	@Before
	public void setUp() throws Exception {
		snowExtensions = new SnowExtensions();
	}

	private PersistenceModel createPersistenceModel() {
		PersistenceModel persistenceModel = SnowFactory.eINSTANCE.createPersistenceModel();
		persistenceModel.setGroupId("com.akgund");
		persistenceModel.setArtifactId("myproj");
		persistenceModel.setOutputFolder("c:/workspace");
		return persistenceModel;
	}

	private Entity createEntity() {
		PersistenceModel persistenceModel = createPersistenceModel();

		Entity entity = SnowFactory.eINSTANCE.createEntity();
		entity.setName("Ogrenci");
		persistenceModel.getEntities().add(entity);
		return entity;
	}

	@Test
	public void testExtProjectRootPath() {
		PersistenceModel persistenceModel = createPersistenceModel();

		String projectRootPath = snowExtensions.extProjectRootPath(persistenceModel);

		assertEquals("c:/workspace/myproj", projectRootPath);
	}

	@Test
	public void testExtMainJavaPath() {
		PersistenceModel persistenceModel = createPersistenceModel();

		String mainJavaPath = snowExtensions.extMainJavaPath(persistenceModel);

		assertEquals("c:/workspace/myproj/src/main/java", mainJavaPath);
	}

	@Test
	public void testExtModelPackage() {
		PersistenceModel persistenceModel = createPersistenceModel();

		String modelPackage = snowExtensions.extModelPackage(persistenceModel);

		assertEquals("com.akgund.myproj.model", modelPackage);
	}

	@Test
	public void testExtModelPath() {
		PersistenceModel persistenceModel = createPersistenceModel();

		String modelPath = snowExtensions.extModelPath(persistenceModel);

		assertEquals("c:/workspace/myproj/src/main/java/com/akgund/myproj/model", modelPath);
	}

	@Test
	public void testExtServicePackage() {
		PersistenceModel persistenceModel = createPersistenceModel();

		String servicePackage = snowExtensions.extServicePackage(persistenceModel);

		assertEquals("com.akgund.myproj.service", servicePackage);
	}

	@Test
	public void testExtServicePath() {
		PersistenceModel persistenceModel = createPersistenceModel();

		String servicePath = snowExtensions.extServicePath(persistenceModel);

		assertEquals("c:/workspace/myproj/src/main/java/com/akgund/myproj/service", servicePath);
	}

	@Test
	public void testExtServiceImplPackage() {
		PersistenceModel persistenceModel = createPersistenceModel();

		String serviceImplPackage = snowExtensions.extServiceImplPackage(persistenceModel);

		assertEquals("com.akgund.myproj.service.impl", serviceImplPackage);
	}

	@Test
	public void testExtServiceImplPath() {
		PersistenceModel persistenceModel = createPersistenceModel();

		String serviceImplPath = snowExtensions.extServiceImplPath(persistenceModel);

		assertEquals("c:/workspace/myproj/src/main/java/com/akgund/myproj/service/impl", serviceImplPath);
	}

	public void testExtPersistenceModel() {
		Entity entity = createEntity();

		PersistenceModel persistenceModel = snowExtensions.extPersistenceModel(entity);

		assertNotNull(persistenceModel);
	}

	@Test
	public void testExtPackageToPath() {
		String packageToPath = snowExtensions.extPackageToPath("com.akgun");

		assertEquals("com/akgun", packageToPath);
	}

	@Test
	public void testExtGetterName() {
		Property property = SnowFactory.eINSTANCE.createProperty();
		property.setName("ad");
		property.setType("String");
		String getterName = snowExtensions.extGetterName(property);

		assertEquals("getAd", getterName);
	}

	@Test
	public void testExtGetterNameBool() {
		Property property = SnowFactory.eINSTANCE.createProperty();
		property.setName("ad");
		property.setType("boolean");
		String getterName = snowExtensions.extGetterName(property);

		assertEquals("isAd", getterName);
	}

	@Test
	public void testExtSetterName() {
		Property property = SnowFactory.eINSTANCE.createProperty();
		property.setName("ad");
		property.setType("String");
		String getterName = snowExtensions.extSetterName(property);

		assertEquals("setAd", getterName);
	}

	@Test
	public void testExtEntityFullName() {
		Entity entity = createEntity();

		String entityFullName = snowExtensions.extEntityFullName(entity);

		assertEquals("com.akgund.myproj.model.Ogrenci", entityFullName);
	}

	@Test
	public void testExtEntityPath() {
		Entity entity = createEntity();

		String entityPath = snowExtensions.extEntityPath(entity);

		assertEquals("c:/workspace/myproj/src/main/java/com/akgund/myproj/model/Ogrenci.java", entityPath);
	}

	@Test
	public void testExtEntityPersistenceName() {
		Entity entity = createEntity();

		String entityServiceName = snowExtensions.extEntityPeristenceName(entity);

		assertEquals("IOgrenciPersistence", entityServiceName);
	}

	@Test
	public void testExtEntityPersistenceImplName() {
		Entity entity = createEntity();

		String entityServiceName = snowExtensions.extEntityPeristenceImplName(entity);

		assertEquals("DbOgrenciPersistence", entityServiceName);
	}
}
