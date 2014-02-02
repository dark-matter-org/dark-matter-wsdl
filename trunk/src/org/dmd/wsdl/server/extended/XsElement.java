package org.dmd.wsdl.server.extended;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.DMWGenerator.dumpExtendedClass(DMWGenerator.java:276)
import org.dmd.dms.ClassDefinition;                            // Used in derived constructors - (DMWGenerator.java:270)
import org.dmd.wsdl.server.generated.dmw.XsElementDMW;         // The wrapper we're extending - (DMWGenerator.java:268)
import org.dmd.wsdl.shared.generated.dmo.XsElementDMO;         // The wrapper we're extending - (DMWGenerator.java:269)


public class XsElement extends XsElementDMW {

    public XsElement(){
        super();
    }

    public XsElement(XsElementDMO dmo, ClassDefinition cd){
        super(dmo,cd);
    }

    public String toXML(){
    	StringBuffer sb = new StringBuffer();
    	
    	sb.append("<xs:element name=\"" + getName() + "\" " + formatTypeRef() + "> ");
    	sb.append("</xs:element> ");
    	
    	return(sb.toString());
    }
    
    String formatTypeRef(){
    	if (getXstype().getPrefix() == null)
    		return("type = \"" + getXstype().getName() + "\"");
    	else
    		return("type = \"" + getXstype().getPrefix() + ":" + getXstype().getName() + "\"");
    }
}

