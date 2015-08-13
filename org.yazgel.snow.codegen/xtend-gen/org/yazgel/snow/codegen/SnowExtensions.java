package org.yazgel.snow.codegen;

import com.google.common.base.Objects;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.yazgel.snow.Entity;
import org.yazgel.snow.PersistenceModel;
import org.yazgel.snow.Property;

@SuppressWarnings("all")
public class SnowExtensions {
  public String extProjectRootPath(final PersistenceModel persistenceModel) {
    String _outputFolder = persistenceModel.getOutputFolder();
    String _artifactId = persistenceModel.getArtifactId();
    return String.format("%s/%s", _outputFolder, _artifactId);
  }
  
  public String extMainJavaPath(final PersistenceModel persistenceModel) {
    String _extProjectRootPath = this.extProjectRootPath(persistenceModel);
    return String.format("%s/src/main/java", _extProjectRootPath);
  }
  
  public String extTestJavaPath(final PersistenceModel persistenceModel) {
    String _extProjectRootPath = this.extProjectRootPath(persistenceModel);
    return String.format("%s/src/test/java", _extProjectRootPath);
  }
  
  public String extTestResourcesPath(final PersistenceModel persistenceModel) {
    String _extProjectRootPath = this.extProjectRootPath(persistenceModel);
    return String.format("%s/src/test/resources", _extProjectRootPath);
  }
  
  public String extTestServicePath(final PersistenceModel persistenceModel) {
    String _extTestJavaPath = this.extTestJavaPath(persistenceModel);
    String _extServicePackage = this.extServicePackage(persistenceModel);
    String _extPackageToPath = this.extPackageToPath(_extServicePackage);
    return String.format("%s/%s", _extTestJavaPath, _extPackageToPath);
  }
  
  public String extRootPackage(final PersistenceModel model) {
    String _groupId = model.getGroupId();
    String _artifactId = model.getArtifactId();
    return String.format("%s.%s", _groupId, _artifactId);
  }
  
  public String extRootPath(final PersistenceModel model) {
    String _extMainJavaPath = this.extMainJavaPath(model);
    String _extRootPackage = this.extRootPackage(model);
    String _extPackageToPath = this.extPackageToPath(_extRootPackage);
    return String.format("%s/%s", _extMainJavaPath, _extPackageToPath);
  }
  
  public String extModelPackage(final PersistenceModel model) {
    String _extRootPackage = this.extRootPackage(model);
    return String.format("%s.model", _extRootPackage);
  }
  
  public String extModelPath(final PersistenceModel model) {
    String _extMainJavaPath = this.extMainJavaPath(model);
    String _extModelPackage = this.extModelPackage(model);
    String _extPackageToPath = this.extPackageToPath(_extModelPackage);
    return String.format("%s/%s", _extMainJavaPath, _extPackageToPath);
  }
  
  public String extServicePackage(final PersistenceModel model) {
    String _extRootPackage = this.extRootPackage(model);
    return String.format("%s.service", _extRootPackage);
  }
  
  public String extServicePath(final PersistenceModel model) {
    String _extMainJavaPath = this.extMainJavaPath(model);
    String _extServicePackage = this.extServicePackage(model);
    String _extPackageToPath = this.extPackageToPath(_extServicePackage);
    return String.format("%s/%s", _extMainJavaPath, _extPackageToPath);
  }
  
  public String extServiceImplPackage(final PersistenceModel model) {
    String _extServicePackage = this.extServicePackage(model);
    return String.format("%s.impl", _extServicePackage);
  }
  
  public String extServiceImplPath(final PersistenceModel model) {
    String _extServicePath = this.extServicePath(model);
    return String.format("%s/impl", _extServicePath);
  }
  
  public PersistenceModel extPersistenceModel(final Entity entity) {
    EObject _eContainer = entity.eContainer();
    return ((PersistenceModel) _eContainer);
  }
  
  public String extPackageToPath(final String str) {
    return str.replace(".", "/");
  }
  
  public String extGetterName(final Property property) {
    String _type = property.getType();
    boolean _equals = Objects.equal(_type, "boolean");
    if (_equals) {
      String _name = property.getName();
      String _firstUpper = StringExtensions.toFirstUpper(_name);
      return String.format("is%s", _firstUpper);
    }
    String _name_1 = property.getName();
    String _firstUpper_1 = StringExtensions.toFirstUpper(_name_1);
    return String.format("get%s", _firstUpper_1);
  }
  
  public String extSetterName(final Property property) {
    String _name = property.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    return String.format("set%s", _firstUpper);
  }
  
  public String extEntityFullName(final Entity entity) {
    PersistenceModel _extPersistenceModel = this.extPersistenceModel(entity);
    String _extModelPackage = this.extModelPackage(_extPersistenceModel);
    String _name = entity.getName();
    return String.format("%s.%s", _extModelPackage, _name);
  }
  
  public String extEntityPath(final Entity entity) {
    PersistenceModel _extPersistenceModel = this.extPersistenceModel(entity);
    String _extModelPath = this.extModelPath(_extPersistenceModel);
    String _name = entity.getName();
    return String.format("%s/%s.java", _extModelPath, _name);
  }
  
  public String extEntityPeristenceName(final Entity entity) {
    String _name = entity.getName();
    return String.format("I%sPersistence", _name);
  }
  
  public String extEntityPersistenceFullName(final Entity entity) {
    PersistenceModel _extPersistenceModel = this.extPersistenceModel(entity);
    String _extServicePackage = this.extServicePackage(_extPersistenceModel);
    String _extEntityPeristenceName = this.extEntityPeristenceName(entity);
    return String.format("%s.%s", _extServicePackage, _extEntityPeristenceName);
  }
  
  public String extEntityPeristenceImplName(final Entity entity) {
    String _name = entity.getName();
    return String.format("Db%sPersistence", _name);
  }
  
  public String extEntityPersistenceImplFullName(final Entity entity) {
    PersistenceModel _extPersistenceModel = this.extPersistenceModel(entity);
    String _extServiceImplPackage = this.extServiceImplPackage(_extPersistenceModel);
    String _extEntityPeristenceImplName = this.extEntityPeristenceImplName(entity);
    return String.format("%s.%s", _extServiceImplPackage, _extEntityPeristenceImplName);
  }
  
  public String extFactoryName(final PersistenceModel model) {
    String _artifactId = model.getArtifactId();
    String _firstUpper = StringExtensions.toFirstUpper(_artifactId);
    return String.format("%sPersistenceFactory", _firstUpper);
  }
  
  public String extFactoryFullName(final PersistenceModel persistenceModel) {
    String _extRootPackage = this.extRootPackage(persistenceModel);
    String _extFactoryName = this.extFactoryName(persistenceModel);
    return String.format("%s.%s", _extRootPackage, _extFactoryName);
  }
}
