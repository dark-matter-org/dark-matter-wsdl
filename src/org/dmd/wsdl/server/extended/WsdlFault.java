package org.dmd.wsdl.server.extended;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.DMWGenerator.dumpExtendedClass(DMWGenerator.java:276)
import org.dmd.dms.ClassDefinition;                            // Used in derived constructors - (DMWGenerator.java:270)
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.wsdl.server.generated.dmw.WsdlFaultDMW;         // The wrapper we're extending - (DMWGenerator.java:268)
import org.dmd.wsdl.shared.generated.dmo.WsdlFaultDMO;         // The wrapper we're extending - (DMWGenerator.java:269)


public class WsdlFault extends WsdlFaultDMW {

    public WsdlFault(){
        super();
    }

    public WsdlFault(WsdlFaultDMO dmo, ClassDefinition cd){
        super(dmo,cd);
    }

    public String toXML(){
    	StringBuffer sb = new StringBuffer();
    	
    	sb.append("<!-- " + DebugInfo.getWhereWeAreNow() + "-->\n");
    	sb.append("<fault name=\"" + getName() + "\" element=\"" + getElement().getNameSpace() + ":" + getElement().getElement().getName() + "\" /> ");
    	
    	return(sb.toString());
    }
}

