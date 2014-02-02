package org.dmd.wsdl.server.extended;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.DMWGenerator.dumpExtendedClass(DMWGenerator.java:276)
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import org.dmd.dms.ClassDefinition;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.wsdl.server.generated.dmw.NameSpaceReferenceIterableDMW;
import org.dmd.wsdl.server.generated.dmw.WsdlDescriptionDMW;
import org.dmd.wsdl.server.generated.dmw.WsdlInterfaceIterableDMW;
import org.dmd.wsdl.shared.generated.dmo.WsdlDescriptionDMO;
import org.dmd.wsdl.shared.generated.types.NameSpaceReference;
import org.dmd.wsdl.util.XomPrettyPrinter;


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
    			
		try{
			out.write(XomPrettyPrinter.format(toXML()));
		}
		catch(Exception ex){
			System.err.println(ex.toString());
		}
		
		out.close();
    }
    
    public String toXML(){
    	StringBuffer sb = new StringBuffer();

		sb.append("<?xml version=\"1.0\" encoding=\"utf-8\" ?> \n");
		sb.append("<!-- " + DebugInfo.getWhereWeAreNow() + "--> \n\n");
		
		sb.append("<description\n");
		
		NameSpaceReferenceIterableDMW nsit = getNameSpaceIterable();
		while(nsit.hasNext()){
			NameSpaceReference nsr = nsit.next();
			if (nsr.getPrefix() == null){
				sb.append(" xmlns=\"" + nsr.getUrl() + "\" ");
			}
			else{
				sb.append(" xmlns:" + nsr.getPrefix() + "= \"" + nsr.getUrl() + "\" ");
			}
		}
		sb.append("targetNamespace=\"" + getTargetNameSpace() + "\"");
		
		sb.append(">\n");
		
		///////////////////////////////////////////////////////////////////////
		// Documentation
		
		if (getDescriptionHasValue()){
			sb.append("<documentation> ");
			Iterator<String> it = getDescription();
			while(it.hasNext()){
				sb.append(it.next() + "\n");
			}
			
			sb.append("</documentation> ");
		}
		
		
		///////////////////////////////////////////////////////////////////////
		// Types
		
		sb.append("<types>");
		
		if (getEmbedSchema() != null)
			sb.append(getEmbedSchema().toXML());
		
		sb.append("</types>");
				
		///////////////////////////////////////////////////////////////////////
		// Interfaces
		
		WsdlInterfaceIterableDMW ifs = getInterfacesIterable();
		while(ifs.hasNext()){
			sb.append(ifs.next().toXML());
		}
		
		///////////////////////////////////////////////////////////////////////
		// Binding
		
		sb.append(getBinding().toXML());
		
		///////////////////////////////////////////////////////////////////////
		// End of description
		
		sb.append("</description>\n\n");

    	return(sb.toString());
    }

}

