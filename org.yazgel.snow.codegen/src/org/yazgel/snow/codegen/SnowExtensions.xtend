package org.yazgel.snow.codegen

import org.yazgel.snow.Entity
import org.yazgel.snow.OneToManyRelationProperty
import org.yazgel.snow.PersistenceModel
import org.yazgel.snow.Property
import org.yazgel.snow.RelationProperty
import org.yazgel.snow.ManyToOneRelationProperty
import org.yazgel.snow.OneToOneRelationProperty
import org.yazgel.snow.ManyToManyRelationProperty

class SnowExtensions {

	def extProjectRootPath(PersistenceModel persistenceModel) {
		return String.format('%s/%s', persistenceModel.outputFolder, persistenceModel.artifactId)
	}

	def extMainJavaPath(PersistenceModel persistenceModel) {
		return String.format('%s/src/main/java', persistenceModel.extProjectRootPath)
	}

	def extMainResourcesPath(PersistenceModel persistenceModel) {
		return String.format('%s/src/main/resources', persistenceModel.extProjectRootPath)
	}

	def extTestJavaPath(PersistenceModel persistenceModel) {
		return String.format('%s/src/test/java', persistenceModel.extProjectRootPath)
	}

	def extTestResourcesPath(PersistenceModel persistenceModel) {
		return String.format('%s/src/test/resources', persistenceModel.extProjectRootPath);
	}

	def extTestServicePath(PersistenceModel persistenceModel) {
		return String.format('%s/%s', persistenceModel.extTestJavaPath,
			persistenceModel.extServicePackage.extPackageToPath)
	}

	def extRootPackage(PersistenceModel model) {
		return String.format('%s.%s', model.groupId, model.artifactId)
	}

	def extRootPath(PersistenceModel model) {
		return String.format('%s/%s', model.extMainJavaPath, model.extRootPackage.extPackageToPath)
	}

	def extModelPackage(PersistenceModel model) {
		return String.format('%s.model', model.extRootPackage)
	}

	def extModelPath(PersistenceModel model) {
		return String.format("%s/%s", model.extMainJavaPath, model.extModelPackage.extPackageToPath);
	}

	def extServicePackage(PersistenceModel model) {
		return String.format('%s.service', model.extRootPackage)
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

	def extGetterName(Property property) {
		if (property.type == 'boolean') {
			return String.format('is%s', property.name.toFirstUpper)
		}

		return String.format('get%s', property.name.toFirstUpper)
	}

	def extSetterName(Property property) {
		return String.format('set%s', property.name.toFirstUpper)
	}

	def dispatch extPropertyType(Property property) {
		return property.type
	}

	def dispatch extPropertyType(OneToManyRelationProperty property) {
		return String.format('java.util.List<%s>', property.type)
	}
	
	def dispatch extPropertyType(ManyToManyRelationProperty property) {
		return String.format('java.util.List<%s>', property.type)
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

	def extEntityPersistenceFullName(Entity entity) {
		return String.format('%s.%s', entity.extPersistenceModel.extServicePackage, entity.extEntityPeristenceName)
	}

	def extEntityPeristenceImplName(Entity entity) {
		return String.format('Db%sPersistence', entity.name)
	}

	def extEntityPersistenceImplFullName(Entity entity) {
		return String.format('%s.%s', entity.extPersistenceModel.extServiceImplPackage,
			entity.extEntityPeristenceImplName)
	}

	def extFactoryName(PersistenceModel model) {
		return String.format('%sPersistenceFactory', model.artifactId.toFirstUpper)
	}

	def extFactoryFullName(PersistenceModel persistenceModel) {
		return String.format('%s.%s', persistenceModel.extRootPackage, persistenceModel.extFactoryName)
	}

	def extCascade(RelationProperty property) {
		var cascadeList = property.cascade
		if (cascadeList.empty) {
			return 'cascade = {}'
		}

		val sb = new StringBuilder
		sb.append('cascade = {')
		cascadeList.forEach [ c |
			sb.append('javax.persistence.CascadeType.' + c.literal)
			sb.append(',')
		]
		sb.append('}')
	}

	def extFetch(RelationProperty property) {
		return 'fetch = javax.persistence.FetchType.' + property.fetch.literal
	}

	def extMappedBy(OneToManyRelationProperty property) {
		if (property.mappedBy == null) {
			return ''
		}
		return String.format('mappedBy = "%s"', property.mappedBy)
	}
	
	def extMappedBy(OneToOneRelationProperty property) {
		if (property.mappedBy == null) {
			return ''
		}
		return String.format('mappedBy = "%s"', property.mappedBy)
	}
	
	def extMappedBy(ManyToManyRelationProperty property) {
		if (property.mappedBy == null) {
			return ''
		}
		return String.format('mappedBy = "%s"', property.mappedBy)
	}

	def extOrphanRemoval(OneToManyRelationProperty property) {
		return 'orphanRemoval = ' + property.orphanRemoval
	}
	
	def extOrphanRemoval(OneToOneRelationProperty property) {
		return 'orphanRemoval = ' + property.orphanRemoval
	}
	
	def extOptional(ManyToOneRelationProperty property){
		return 'optional = ' + property.optional
	}
	
	def extOptional(OneToOneRelationProperty property){
		return 'optional = ' + property.optional
	}
}