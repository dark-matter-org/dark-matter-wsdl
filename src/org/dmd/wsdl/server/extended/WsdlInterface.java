package org.dmd.wsdl.server.extended;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.DMWGenerator.dumpExtendedClass(DMWGenerator.java:276)
import org.dmd.dms.ClassDefinition;                                // Used in derived constructors - (DMWGenerator.java:270)
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.wsdl.server.generated.dmw.WsdlFaultIterableDMW;
import org.dmd.wsdl.server.generated.dmw.WsdlInterfaceDMW;         // The wrapper we're extending - (DMWGenerator.java:268)
import org.dmd.wsdl.server.generated.dmw.WsdlOperationIterableDMW;
import org.dmd.wsdl.shared.generated.dmo.WsdlInterfaceDMO;         // The wrapper we're extending - (DMWGenerator.java:269)


public class WsdlInterface extends WsdlInterfaceDMW {

    public WsdlInterface(){
        super();
    }

    public WsdlInterface(WsdlInterfaceDMO dmo, ClassDefinition cd){
        super(dmo,cd);
    }

    public String toXML(){
    	StringBuffer sb = new StringBuffer();
    	
    	sb.append("    <!-- " + DebugInfo.getWhereWeAreNow() + "-->\n");
    	sb.append("    <interface name =\"" + getName() + "\" >\n");
    	
    	if (getFaultsHasValue()){
    		WsdlFaultIterableDMW it = getFaultsIterable();
    		while(it.hasNext()){
    			sb.append(it.getNext().toXML());
    		}
    	}
    	
    	WsdlOperationIterableDMW ops = getOperationsIterable();
    	while(ops.hasNext()){
    		sb.append(ops.next().toXML());
    	}
    	
    	sb.append("    </interface>\n");
    	
    	return(sb.toString());
    }
}

