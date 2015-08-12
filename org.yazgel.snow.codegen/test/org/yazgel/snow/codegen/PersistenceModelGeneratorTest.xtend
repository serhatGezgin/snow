package org.yazgel.snow.codegen

import org.junit.Rule
import org.junit.Test
import org.junit.rules.TemporaryFolder
import org.yazgel.snow.SnowFactory
import org.junit.Assert

class PersistenceModelGeneratorTest {
	@Rule
	public var folder = new TemporaryFolder();

	@Test
	def void testGeneratePersistenceModel() {
		// TODO: Assert.fail("Not yet implemented");
	}

	@Test
	def void testGenerateEntity() {
		var persistenceModel = SnowFactory.eINSTANCE.createPersistenceModel();
		persistenceModel.setGroupId("com.akgund");
		persistenceModel.setArtifactId("myproj");
		persistenceModel.setOutputFolder(folder.getRoot().toString());

		var entity = SnowFactory.eINSTANCE.createEntity();
		entity.setName("Ogrenci");
		persistenceModel.getEntities().add(entity);

		var persistenceModelGenerator = new PersistenceModelGenerator();
		var entityString = persistenceModelGenerator.generate(entity);

		Assert.assertEquals('''
			package com.akgund.myproj.model;
			
			public class Ogrenci {
			}
		'''.toString, entityString);
	}
}