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

	def extModelPackage(PersistenceModel model) {
		return String.format('%s.%s.model', model.groupId, model.artifactId)
	}

	def extModelPath(PersistenceModel model) {
		return String.format("%s/%s", model.extMainJavaPath, model.extModelPackage.extPackageToPath);
	}

	def extServicePackage(PersistenceModel model) {
		return String.format('%s.%s.service', model.groupId, model.artifactId)
	}

	def extServicePath(PersistenceModel model) {
		return String.format('%s/%s', model.extMainJavaPath, model.extServicePackage.extPackageToPath)
	}

	def extServiceImplPackage(PersistenceModel model) {
		return String.format('%s.impl', model.extServicePackage)
	}

	def extServiceImplPath(PersistenceModel model) {
		return String.format('%s/impl', model.extServicePath)
	}

	def extPersistenceModel(Entity entity) {
		return entity.eContainer as PersistenceModel
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

	def extEntityFullName(Entity entity) {
		return String.format('%s.%s', entity.extPersistenceModel.extModelPackage, entity.name)
	}

	def extEntityPath(Entity entity) {
		return String.format('%s/%s.java', entity.extPersistenceModel.extModelPath, entity.name);
	}

	def extEntityPeristenceName(Entity entity) {
		return String.format('I%sPersistence', entity.name)
	}

	def extEntityPeristenceImplName(Entity entity) {
		return String.format('Db%sPersistence', entity.name)
	}

	def extEntityPersistenceFullName(Entity entity) {
		return String.format('%s.%s', entity.extPersistenceModel.extServicePackage, entity.extEntityPeristenceName)
	}
}