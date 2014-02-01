package org.dmd.wsdl.server.extended;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.DMWGenerator.dumpExtendedClass(DMWGenerator.java:276)
import org.dmd.dms.ClassDefinition;                                 // Used in derived constructors - (DMWGenerator.java:270)
import org.dmd.wsdl.server.generated.dmw.WsdlDefinitionDMW;         // The wrapper we're extending - (DMWGenerator.java:268)
import org.dmd.wsdl.shared.generated.dmo.WsdlDefinitionDMO;         // The wrapper we're extending - (DMWGenerator.java:269)


abstract public class WsdlDefinition extends WsdlDefinitionDMW {

    public WsdlDefinition(){
        super();
    }

    public WsdlDefinition(WsdlDefinitionDMO dmo, ClassDefinition cd){
        super(dmo,cd);
    }

}

