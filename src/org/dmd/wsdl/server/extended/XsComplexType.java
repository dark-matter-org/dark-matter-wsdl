package org.dmd.wsdl.server.extended;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.DMWGenerator.dumpExtendedClass(DMWGenerator.java:276)
import org.dmd.dms.ClassDefinition;                                // Used in derived constructors - (DMWGenerator.java:270)
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.wsdl.server.generated.dmw.XsComplexTypeDMW;         // The wrapper we're extending - (DMWGenerator.java:268)
import org.dmd.wsdl.server.generated.dmw.XsElementIterableDMW;
import org.dmd.wsdl.shared.generated.dmo.XsComplexTypeDMO;         // The wrapper we're extending - (DMWGenerator.java:269)


public class XsComplexType extends XsComplexTypeDMW {

    public XsComplexType(){
        super();
    }

    public XsComplexType(XsComplexTypeDMO dmo, ClassDefinition cd){
        super(dmo,cd);
    }

    @Override
    public String toXML(){
    	StringBuffer sb = new StringBuffer();
    	
		sb.append("<!-- " + DebugInfo.getWhereWeAreNow() + "-->\n");
    	sb.append("<xs:complexType name=\"" + getName() + "\"> ");
    	sb.append("<xs:sequence> ");

		XsElementIterableDMW it = getElementsIterable();
		while(it.hasNext()){
			sb.append(it.getNext().toXML());
		}

    	sb.append("</xs:sequence> ");
    	sb.append("</xs:complexType>");
    	
    	return(sb.toString());
    }

}

