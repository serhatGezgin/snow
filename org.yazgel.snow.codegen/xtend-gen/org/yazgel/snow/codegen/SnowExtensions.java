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
  
  public String extEntityModelPackage(final Entity entity) {
    EObject _eContainer = entity.eContainer();
    PersistenceModel model = ((PersistenceModel) _eContainer);
    String _groupId = model.getGroupId();
    String _artifactId = model.getArtifactId();
    return String.format("%s.%s.model", _groupId, _artifactId);
  }
  
  public String extEntityServicePackage(final Entity entity) {
    EObject _eContainer = entity.eContainer();
    PersistenceModel model = ((PersistenceModel) _eContainer);
    String _groupId = model.getGroupId();
    String _artifactId = model.getArtifactId();
    return String.format("%s.%s.service", _groupId, _artifactId);
  }
  
  public String extICrudServicePackage(final PersistenceModel model) {
    String _groupId = model.getGroupId();
    String _artifactId = model.getArtifactId();
    return String.format("%s.%s.service", _groupId, _artifactId);
  }
  
  public String extEntityModelPath(final Entity entity) {
    EObject _eContainer = entity.eContainer();
    PersistenceModel model = ((PersistenceModel) _eContainer);
    String _extMainJavaPath = this.extMainJavaPath(model);
    String _extEntityModelPackage = this.extEntityModelPackage(entity);
    String _extPackageToPath = this.extPackageToPath(_extEntityModelPackage);
    String _name = entity.getName();
    return String.format("%s/%s/%s.java", _extMainJavaPath, _extPackageToPath, _name);
  }
  
  public String extEntityServiceName(final Entity entity) {
    String _name = entity.getName();
    return String.format("I%sPersistence", _name);
  }
  
  public String extEntityServicePath(final Entity entity) {
    EObject _eContainer = entity.eContainer();
    PersistenceModel model = ((PersistenceModel) _eContainer);
    String _extMainJavaPath = this.extMainJavaPath(model);
    String _extEntityServicePackage = this.extEntityServicePackage(entity);
    String _extPackageToPath = this.extPackageToPath(_extEntityServicePackage);
    String _extEntityServiceName = this.extEntityServiceName(entity);
    return String.format("%s/%s/%s.java", _extMainJavaPath, _extPackageToPath, _extEntityServiceName);
  }
  
  public String extICrudServicePath(final PersistenceModel model) {
    String _extMainJavaPath = this.extMainJavaPath(model);
    String _extICrudServicePackage = this.extICrudServicePackage(model);
    String _extPackageToPath = this.extPackageToPath(_extICrudServicePackage);
    return String.format("%s/%s/ICrudPersistence.java", _extMainJavaPath, _extPackageToPath);
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
}
