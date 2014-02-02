package org.dmd.wsdl.server.extended;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.DMWGenerator.dumpExtendedClass(DMWGenerator.java:276)
import org.dmd.dms.ClassDefinition;                                // Used in derived constructors - (DMWGenerator.java:270)
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.wsdl.server.generated.dmw.LabelledElementReferenceIterableDMW;
import org.dmd.wsdl.server.generated.dmw.LabelledFaultReferenceIterableDMW;
import org.dmd.wsdl.server.generated.dmw.WsdlOperationDMW;         // The wrapper we're extending - (DMWGenerator.java:268)
import org.dmd.wsdl.shared.generated.dmo.WsdlOperationDMO;         // The wrapper we're extending - (DMWGenerator.java:269)
import org.dmd.wsdl.shared.generated.types.LabelledElementReference;
import org.dmd.wsdl.shared.generated.types.LabelledFaultReference;


public class WsdlOperation extends WsdlOperationDMW {

    public WsdlOperation(){
        super();
    }

    public WsdlOperation(WsdlOperationDMO dmo, ClassDefinition cd){
        super(dmo,cd);
    }

    public String toXML(){
    	StringBuffer sb = new StringBuffer();

    	sb.append("<!-- " + DebugInfo.getWhereWeAreNow() + "-->\n");
    	sb.append("<operation name=\"" + getName() + "\" ");
    	if (getPattern() != null)
        	sb.append("        pattern=\"" + getPattern() + "\" ");
    	if (getStyle() != null)
        	sb.append("        style=\"" + getStyle() + "\" ");
    	sb.append("      > ");
    	
    	if (getInputHasValue()){
    		LabelledElementReferenceIterableDMW it = getInputIterable();
    		while(it.hasNext()){
    			sb.append(formatLabelledXmlTypeReference("input", it.getNext()));
    		}
    	}
    	
    	if (getOutputHasValue()){
    		LabelledElementReferenceIterableDMW it = getOutputIterable();
    		while(it.hasNext()){
    			sb.append(formatLabelledXmlTypeReference("output", it.getNext()));
    		}
    	}
    	
    	if (getOutfaultHasValue()){
    		LabelledFaultReferenceIterableDMW it = getOutfaultIterable();
    		while(it.hasNext()){
    			sb.append(formatLabelledFaultReference(it.getNext()));
    		}
    	}
    	
    	sb.append("</operation> ");

    	return(sb.toString());
    }
    
    String formatLabelledXmlTypeReference(String direction, LabelledElementReference ref){
    	StringBuffer sb = new StringBuffer();
    	
    	sb.append("<" + direction + " messageLabel=\"" + ref.getLabel() + "\" ");
    	sb.append("element=\"" + ref.getNameSpace() + ":" + ref.getElement().getName() + "\" /> ");
    	
    	return(sb.toString());
    }
    
    String formatLabelledFaultReference(LabelledFaultReference ref){
    	StringBuffer sb = new StringBuffer();
    	
    	sb.append("<outfault ref=\"" + ref.getNameSpace() + ":" + ref.getFault().getName() + "\" messageLabel=\"" + ref.getLabel() + "\" /> ");
    	
    	return(sb.toString());
    }
}

