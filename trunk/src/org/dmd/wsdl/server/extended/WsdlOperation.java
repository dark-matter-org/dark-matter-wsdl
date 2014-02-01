package org.dmd.wsdl.server.extended;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.DMWGenerator.dumpExtendedClass(DMWGenerator.java:276)
import org.dmd.dms.ClassDefinition;                                // Used in derived constructors - (DMWGenerator.java:270)
import org.dmd.wsdl.server.generated.dmw.WsdlOperationDMW;         // The wrapper we're extending - (DMWGenerator.java:268)
import org.dmd.wsdl.shared.generated.dmo.WsdlOperationDMO;         // The wrapper we're extending - (DMWGenerator.java:269)


public class WsdlOperation extends WsdlOperationDMW {

    public WsdlOperation(){
        super();
    }

    public WsdlOperation(WsdlOperationDMO dmo, ClassDefinition cd){
        super(dmo,cd);
    }

}

