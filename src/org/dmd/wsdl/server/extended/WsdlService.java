package org.dmd.wsdl.server.extended;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.DMWGenerator.dumpExtendedClass(DMWGenerator.java:276)
import org.dmd.dms.ClassDefinition;                              // Used in derived constructors - (DMWGenerator.java:270)
import org.dmd.wsdl.server.generated.dmw.WsdlServiceDMW;         // The wrapper we're extending - (DMWGenerator.java:268)
import org.dmd.wsdl.shared.generated.dmo.WsdlServiceDMO;         // The wrapper we're extending - (DMWGenerator.java:269)


public class WsdlService extends WsdlServiceDMW {

    public WsdlService(){
        super();
    }

    public WsdlService(WsdlServiceDMO dmo, ClassDefinition cd){
        super(dmo,cd);
    }

    public String toXML(){
    	StringBuffer sb = new StringBuffer();
    	
    	return(sb.toString());
    }

}

