package org.yazgel.snow.codegen;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.yazgel.snow.Entity;
import org.yazgel.snow.PersistenceModel;
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
	public void testExtEntityPackage() {
		Entity entity = createEntity();

		String entityPackage = snowExtensions.extEntityPackage(entity);

		assertEquals("com.akgund.myproj.model", entityPackage);
	}

	@Test
	public void testExtEntiyModelPath() {
		Entity entity = createEntity();

		String entityModelPath = snowExtensions.extEntiyModelPath(entity);
		assertEquals("c:/workspace/myproj/src/main/java/com/akgund/myproj/model/Ogrenci.java", entityModelPath);
	}

	@Test
	public void testExtPackageToPath() {
		String packageToPath = snowExtensions.extPackageToPath("com.akgun");

		assertEquals("com/akgun", packageToPath);
	}

}
