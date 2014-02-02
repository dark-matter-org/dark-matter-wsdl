package org.dmd.wsdl.server.extended;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.DMWGenerator.dumpExtendedClass(DMWGenerator.java:276)
import org.dmd.dms.ClassDefinition;                           // Used in derived constructors - (DMWGenerator.java:270)
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.wsdl.server.generated.dmw.NameSpaceReferenceIterableDMW;
import org.dmd.wsdl.server.generated.dmw.XsSchemaDMW;         // The wrapper we're extending - (DMWGenerator.java:268)
import org.dmd.wsdl.server.generated.dmw.XsTypeIterableDMW;
import org.dmd.wsdl.shared.generated.dmo.XsSchemaDMO;         // The wrapper we're extending - (DMWGenerator.java:269)
import org.dmd.wsdl.shared.generated.types.NameSpaceReference;


public class XsSchema extends XsSchemaDMW {

    public XsSchema(){
        super();
    }

    public XsSchema(XsSchemaDMO dmo, ClassDefinition cd){
        super(dmo,cd);
    }

    public String toXML(){
    	StringBuffer sb = new StringBuffer();
    	
    	sb.append("<!-- " + DebugInfo.getWhereWeAreNow() + "-->\n");
    	sb.append("<xs:schema ");
		NameSpaceReferenceIterableDMW nsit = getNameSpaceIterable();
		while(nsit.hasNext()){
			NameSpaceReference nsr = nsit.next();
			if (nsr.getPrefix() == null){
				sb.append(" xmlns=\"" + nsr.getUrl() + "\" ");
			}
			else{
				sb.append(" xmlns:" + nsr.getPrefix() + "= \"" + nsr.getUrl() + "\" ");
			}
		}
		sb.append("targetNamespace=\"" + getTargetNameSpace() + "\"");

		sb.append(">\n");
		
		if (getXstypesHasValue()){
			XsTypeIterableDMW it = getXstypesIterable();
			while(it.hasNext()){
				sb.append(it.getNext().toXML());
			}
		}

    	sb.append("</xs:schema>");
    	
    	return(sb.toString());
    }
}

