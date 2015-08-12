package org.yazgel.snow.codegen;

import org.eclipse.emf.ecore.EObject;
import org.yazgel.snow.Entity;
import org.yazgel.snow.PersistenceModel;

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
  
  public String extEntityPackage(final Entity entity) {
    EObject _eContainer = entity.eContainer();
    PersistenceModel model = ((PersistenceModel) _eContainer);
    String _groupId = model.getGroupId();
    String _artifactId = model.getArtifactId();
    return String.format("%s.%s.model", _groupId, _artifactId);
  }
  
  public String extEntiyModelPath(final Entity entity) {
    EObject _eContainer = entity.eContainer();
    PersistenceModel model = ((PersistenceModel) _eContainer);
    String _extMainJavaPath = this.extMainJavaPath(model);
    String _extEntityPackage = this.extEntityPackage(entity);
    String _extPackageToPath = this.extPackageToPath(_extEntityPackage);
    String _name = entity.getName();
    return String.format("%s/%s/%s.java", _extMainJavaPath, _extPackageToPath, _name);
  }
  
  public String extPackageToPath(final String str) {
    return str.replace(".", "/");
  }
}
