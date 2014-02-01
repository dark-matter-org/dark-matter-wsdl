package org.dmd.wsdl.server.extended;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.DMWGenerator.dumpExtendedClass(DMWGenerator.java:276)
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.dmd.dms.ClassDefinition;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.wsdl.server.generated.dmw.NameSpaceReferenceIterableDMW;
import org.dmd.wsdl.server.generated.dmw.WsdlDescriptionDMW;
import org.dmd.wsdl.shared.generated.dmo.WsdlDescriptionDMO;
import org.dmd.wsdl.shared.generated.types.NameSpaceReference;


public class WsdlDescription extends WsdlDescriptionDMW {

    public WsdlDescription(){
        super();
    }

    public WsdlDescription(WsdlDescriptionDMO dmo, ClassDefinition cd){
        super(dmo,cd);
    }
    
    public void dumpAsXML(String dn) throws IOException{
		DebugInfo.debug("Writing to: " + dn + File.separator + getDefinedInWsdlModule().getName() + ".xml");

		BufferedWriter out = new BufferedWriter(new FileWriter(dn + File.separator + getDefinedInWsdlModule().getName() + ".xml"));
    	
		out.write("<?xml version=\"1.0\" encoding=\"utf-8\" ?> \n");
		out.write("<!-- " + DebugInfo.getWhereWeAreNow() + "--> \n");
		
		out.write("<description\n");
		
		NameSpaceReferenceIterableDMW nsit = getNameSpaceIterable();
		while(nsit.hasNext()){
			NameSpaceReference nsr = nsit.next();
			if (nsr.getPrefix() == null){
				out.write("    xmlns:" + nsr.getPrefix() + "= \"" + nsr.getUrl() + "\"\n");
			}
			else{
				out.write("    xmlns=\"" + nsr.getUrl() + "\"\n");
			}
		}
		
		out.write("  >\n");
		
		
		
		out.close();
    }

}

