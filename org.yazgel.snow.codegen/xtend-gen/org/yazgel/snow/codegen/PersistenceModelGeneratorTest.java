package org.yazgel.snow.codegen;

import java.io.File;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.yazgel.snow.Entity;
import org.yazgel.snow.PersistenceModel;
import org.yazgel.snow.SnowFactory;
import org.yazgel.snow.codegen.PersistenceModelGenerator;

@SuppressWarnings("all")
public class PersistenceModelGeneratorTest {
  @Rule
  public TemporaryFolder folder = new TemporaryFolder();
  
  @Test
  public void testGeneratePersistenceModel() {
  }
  
  @Test
  public void testGenerateEntity() {
    PersistenceModel persistenceModel = SnowFactory.eINSTANCE.createPersistenceModel();
    persistenceModel.setGroupId("com.akgund");
    persistenceModel.setArtifactId("myproj");
    File _root = this.folder.getRoot();
    String _string = _root.toString();
    persistenceModel.setOutputFolder(_string);
    Entity entity = SnowFactory.eINSTANCE.createEntity();
    entity.setName("Ogrenci");
    EList<Entity> _entities = persistenceModel.getEntities();
    _entities.add(entity);
    PersistenceModelGenerator persistenceModelGenerator = new PersistenceModelGenerator();
    String entityString = persistenceModelGenerator.generate(entity);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package com.akgund.myproj.model;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class Ogrenci {");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    String _string_1 = _builder.toString();
    Assert.assertEquals(_string_1, entityString);
  }
}
