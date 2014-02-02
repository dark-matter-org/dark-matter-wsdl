package org.dmd.wsdl.server.extended;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.DMWGenerator.dumpExtendedClass(DMWGenerator.java:276)
import org.dmd.dms.ClassDefinition;                              // Used in derived constructors - (DMWGenerator.java:270)
import org.dmd.wsdl.server.generated.dmw.WsdlBindingDMW;         // The wrapper we're extending - (DMWGenerator.java:268)
import org.dmd.wsdl.shared.generated.dmo.WsdlBindingDMO;         // The wrapper we're extending - (DMWGenerator.java:269)


public class WsdlBinding extends WsdlBindingDMW {

    public WsdlBinding(){
        super();
    }

    public WsdlBinding(WsdlBindingDMO dmo, ClassDefinition cd){
        super(dmo,cd);
    }

    public String toXML(){
    	StringBuffer sb = new StringBuffer();
    	
    	sb.append("<binding name=\"" + getName() + "\" ");
    	sb.append("interface=\"" + getInterface().getNameSpace() + ":" + getInterface().getInterfaceRef().getName() + "\" ");
    	sb.append("type=\"" + getBindingType() + "\" ");
    	sb.append(getProtocol().getNameSpace() + ":protocol=\"" + getProtocol().getUrl() + "\"> ");
    	sb.append("</binding> ");
    	
    	return(sb.toString());
    }
}

