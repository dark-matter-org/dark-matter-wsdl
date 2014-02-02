package org.dmd.wsdl.server.extended;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.DMWGenerator.dumpExtendedClass(DMWGenerator.java:276)
import org.dmd.dms.ClassDefinition;                         // Used in derived constructors - (DMWGenerator.java:270)
import org.dmd.wsdl.server.generated.dmw.XsTypeDMW;         // The wrapper we're extending - (DMWGenerator.java:268)
import org.dmd.wsdl.shared.generated.dmo.XsTypeDMO;         // The wrapper we're extending - (DMWGenerator.java:269)


public class XsType extends XsTypeDMW {

    public XsType(){
        super();
    }

    public XsType(XsTypeDMO dmo, ClassDefinition cd){
        super(dmo,cd);
    }

    public String toXML(){
    	StringBuffer sb = new StringBuffer();
    	
    	return(sb.toString());
    }
}

