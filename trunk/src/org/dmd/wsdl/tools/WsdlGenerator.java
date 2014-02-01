package org.dmd.wsdl.tools;

import java.io.IOException;
import java.util.Iterator;

import org.dmd.util.exceptions.ResultException;
import org.dmd.util.parsing.ConfigLocation;
import org.dmd.wsdl.server.extended.WsdlDescription;
import org.dmd.wsdl.server.extended.WsdlModule;
import org.dmd.wsdl.server.generated.dsd.WsdlModuleDefinitionManager;
import org.dmd.wsdl.server.generated.dsd.WsdlModuleGenUtility;

public class WsdlGenerator extends WsdlModuleGenUtility {

	@Override
	public void parsingComplete(WsdlModule module, ConfigLocation location, WsdlModuleDefinitionManager definitions) throws ResultException {
		// TODO Auto-generated method stub

	}

	@Override
	public void generate(WsdlModule module, ConfigLocation location, WsdlModuleDefinitionManager definitions) throws IOException {
		
		Iterator<WsdlDescription> it = module.getAllWsdlDescription();
		while(it.hasNext()){
			it.next().dumpAsXML(location.getDirectory());
		}

	}

	@Override
	public void displayHelp() {
		// TODO Auto-generated method stub

	}

}
