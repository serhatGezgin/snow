package org.yazgel.snow.codegen.ui;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.yazgel.snow.PersistenceModel;
import org.yazgel.snow.SnowFactory;
import org.yazgel.snow.SnowPackage;
import org.yazgel.snow.codegen.SnowGenerator;
import org.yazgel.util.ecore.ModelIO;
import org.yazgel.util.ui.AbstractJob;
import org.yazgel.util.ui.WorkbenchSelector;

public class GeneratePersistenceCodeHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		final WorkbenchSelector workbenchSelector = new WorkbenchSelector(window);
		final IFile selectedFile = workbenchSelector.getIFileSelection().get(0);

		new AbstractJob(window) {

			@Override
			protected IStatus runInsideJob(IProgressMonitor monitor) {
				try {
					System.out.println(selectedFile.getLocation().toOSString());
					ModelIO<PersistenceModel> modelIO = new ModelIO<PersistenceModel>() {

						@Override
						protected void registerPackages(Registry packageRegistry) {
							packageRegistry.put(SnowPackage.eNS_URI, SnowFactory.eINSTANCE);
						}
					};
					PersistenceModel persistenceModel = modelIO
							.read(URI.createFileURI(selectedFile.getLocation().toOSString())).get(0);

					SnowGenerator snowGenerator = new SnowGenerator();
					snowGenerator.generate(persistenceModel);
				} catch (Exception e) {
					e.printStackTrace();
					return new Status(Status.ERROR, Activator.PLUGIN_ID,
							"Code generation failed. Reason: " + e.getMessage());
				}

				return Status.OK_STATUS;
			}

			@Override
			protected String jobName() {
				return "Generating Persistence Code...";
			}
		}.execute();

		return null;
	}
}
