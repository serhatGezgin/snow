package org.yazgel.snow.codegen

import org.yazgel.snow.Entity
import org.yazgel.snow.PersistenceModel

class SnowExtensions {

	def extProjectRootPath(PersistenceModel persistenceModel) {
		return String.format('%s/%s', persistenceModel.outputFolder, persistenceModel.artifactId)
	}

	def extMainJavaPath(PersistenceModel persistenceModel) {
		return String.format("%s/src/main/java", persistenceModel.extProjectRootPath)
	}

	def extEntityModelPackage(Entity entity) {
		var model = entity.eContainer as PersistenceModel

		return String.format('%s.%s.model', model.groupId, model.artifactId)
	}

	def extEntityServicePackage(Entity entity) {
		var model = entity.eContainer as PersistenceModel

		return String.format('%s.%s.service', model.groupId, model.artifactId)
	}

	def extICrudServicePackage(PersistenceModel model) {
		return String.format('%s.%s.service', model.groupId, model.artifactId)
	}

	def extEntityModelPath(Entity entity) {
		var model = entity.eContainer as PersistenceModel;

		return String.format('%s/%s/%s.java', model.extMainJavaPath, entity.extEntityModelPackage.extPackageToPath,
			entity.name)
	}

	def extEntityServiceName(Entity entity) {
		return String.format('I%sPersistence', entity.name)
	}

	def extEntityServicePath(Entity entity) {
		var model = entity.eContainer as PersistenceModel;

		return String.format('%s/%s/%s.java', model.extMainJavaPath, entity.extEntityServicePackage.extPackageToPath,
			entity.extEntityServiceName)
	}

	def extICrudServicePath(PersistenceModel model) {
		return String.format('%s/%s/ICrudPersistence.java', model.extMainJavaPath,
			model.extICrudServicePackage.extPackageToPath)
	}

	def extPackageToPath(String str) {
		return str.replace('.', '/')
	}

	def extGetterName(org.yazgel.snow.Property property) {
		if (property.type == 'boolean') {
			return String.format('is%s', property.name.toFirstUpper)
		}

		return String.format('get%s', property.name.toFirstUpper)
	}

	def extSetterName(org.yazgel.snow.Property property) {
		return String.format('set%s', property.name.toFirstUpper)
	}
}