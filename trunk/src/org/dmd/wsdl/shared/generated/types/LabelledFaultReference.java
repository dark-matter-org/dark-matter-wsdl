//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2014 dark-matter-data committers
//	---------------------------------------------------------------------------
//	This program is free software; you can redistribute it and/or modify it
//	under the terms of the GNU Lesser General Public License as published by the
//	Free Software Foundation; either version 3 of the License, or (at your
//	option) any later version.
//	This program is distributed in the hope that it will be useful, but WITHOUT
//	ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
//	FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for
//	more details.
//	You should have received a copy of the GNU Lesser General Public License along
//	with this program; if not, see <http://www.gnu.org/licenses/lgpl.html>.
//	---------------------------------------------------------------------------
package org.dmd.wsdl.shared.generated.types;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:106)
import java.io.Serializable;                                                  // To prevent serialization warnings - (ComplexTypeFormatter.java:70)
import org.dmd.dmc.DmcAttributeInfo;                                          // For fake DmcAttributeInfo - (ComplexTypeFormatter.java:76)
import org.dmd.dmc.DmcContainerIF;                                            // To support object references - (ComplexTypeFormatter.java:82)
import org.dmd.dmc.DmcInputStreamIF;                                          // Standard serialization techniques - (ComplexTypeFormatter.java:71)
import org.dmd.dmc.DmcNameClashResolverIF;                                    // To support possible clashing object references - (ComplexTypeFormatter.java:86)
import org.dmd.dmc.DmcNameResolverIF;                                         // To support object references - (ComplexTypeFormatter.java:79)
import org.dmd.dmc.DmcNameResolverWithClashSupportIF;                         // To support possible clashing object references - (ComplexTypeFormatter.java:84)
import org.dmd.dmc.DmcNamedObjectIF;                                          // To support object references - (ComplexTypeFormatter.java:80)
import org.dmd.dmc.DmcNamedObjectREF;                                         // To support object references - (ComplexTypeFormatter.java:81)
import org.dmd.dmc.DmcObject;                                                 // To support possible clashing object references - (ComplexTypeFormatter.java:87)
import org.dmd.dmc.DmcOutputStreamIF;                                         // Standard serialization techniques - (ComplexTypeFormatter.java:72)
import org.dmd.dmc.DmcValueException;                                         // Standard value exception - (ComplexTypeFormatter.java:99)
import org.dmd.dmc.DmcValueExceptionSet;                                      // To support possible clashing object references - (ComplexTypeFormatter.java:88)
import org.dmd.dmc.types.IntegerVar;                                          // To support getNextField() - (ComplexTypeFormatter.java:73)
import org.dmd.dms.generated.enums.DataTypeEnum;                              // For fake DmcAttributeInfo - (ComplexTypeFormatter.java:74)
import org.dmd.dms.generated.enums.ValueTypeEnum;                             // For fake DmcAttributeInfo - (ComplexTypeFormatter.java:75)
import org.dmd.dms.generated.types.DmcTypeStringSTATIC;                       // Standard type - (ComplexTypeFormatter.java:616)
import org.dmd.wsdl.shared.generated.types.DmcTypeWsdlFaultREFSTATIC;         // Internally generated type - (ComplexTypeFormatter.java:616)
import org.dmd.wsdl.shared.generated.types.WsdlFaultREF;                      // Object reference - (ComplexTypeFormatter.java:579)



@SuppressWarnings("serial")
/**
 * The LabelledFaultReference class.
 * This code was auto-generated and shouldn't be alterred manually.
 * 
 * Generated from: org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:113)
 */
public class LabelledFaultReference implements Serializable {

    // The namespace for the fault.
    String nameSpace;

    final static DmcAttributeInfo nameSpaceAI = new DmcAttributeInfo("nameSpace",0,"String",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN);

    // A reference to a fault.
    WsdlFaultREF fault;

    final static DmcAttributeInfo faultAI = new DmcAttributeInfo("fault",0,"WsdlFault",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN);

    // A label for the fault.
    String label;

    final static DmcAttributeInfo labelAI = new DmcAttributeInfo("label",0,"String",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN);

    /**
     * Default constructor.
     */
    public LabelledFaultReference(){
    }

    /**
     * Copy constructor.
     */
    public LabelledFaultReference(LabelledFaultReference original){
        nameSpace = original.nameSpace;
        fault = original.fault;
        label = original.label;
    }

    /**
     * All fields constructor.
     * Generated from: org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:140)
     */
    public LabelledFaultReference(String f1, WsdlFaultREF f2, String f3) throws DmcValueException {
        nameSpace = DmcTypeStringSTATIC.instance.typeCheck(f1);
        fault = DmcTypeWsdlFaultREFSTATIC.instance.typeCheck(f2);
        label = DmcTypeStringSTATIC.instance.typeCheck(f3);
    }

    /**
     * String based constructor.
     * Generated from: org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:180)
     */
    public LabelledFaultReference(String initialInput) throws DmcValueException {
        IntegerVar seppos = new IntegerVar(-1);
        String input = initialInput.trim();
        input = input.replaceAll("(\\s)+", " ");
        nameSpace = DmcTypeStringSTATIC.instance.typeCheck(getNextField(input,seppos,"nameSpace",false));
        fault = DmcTypeWsdlFaultREFSTATIC.instance.typeCheck(getNextField(input,seppos,"fault",false));
        label = DmcTypeStringSTATIC.instance.typeCheck(getNextField(input,seppos,"label",true));
    }

    /**
     * Serialization.
     * Generated from: org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:225)
     */
    public void serializeIt(DmcOutputStreamIF dos) throws Exception {
        DmcTypeStringSTATIC.instance.serializeValue(dos, nameSpace);
        DmcTypeWsdlFaultREFSTATIC.instance.serializeValue(dos, fault);
        DmcTypeStringSTATIC.instance.serializeValue(dos, label);
    }

    /**
     * Deserialization.
     * Generated from: org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:242)
     */
    public void deserializeIt(DmcInputStreamIF dis) throws Exception {
        nameSpace = DmcTypeStringSTATIC.instance.deserializeValue(dis);
        fault = DmcTypeWsdlFaultREFSTATIC.instance.deserializeValue(dis);
        label = DmcTypeStringSTATIC.instance.deserializeValue(dis);
    }

    /**
     * String form.
     * Generated from: org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:259)
     */
    public String toString(){
        return(nameSpace.toString() + " " + fault.toString() + " " + label.toString());
    }

    public String getNameSpace(){
        return(nameSpace);
    }

    public WsdlFaultREF getFault(){
        return(fault);
    }

    public String getLabel(){
        return(label);
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    // org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:291)
    public void resolve(DmcNameResolverIF resolver, String attrName) throws DmcValueException {
        DmcNamedObjectIF  obj = null;

        obj = resolver.findNamedObject(fault.getObjectName());
        if (obj == null)
            throw(new DmcValueException("Could not resolve reference to: " + fault.getObjectName() + " via attribute: " + attrName));
        
        if (obj instanceof DmcContainerIF)
            ((DmcNamedObjectREF)fault).setObject((DmcNamedObjectIF) ((DmcContainerIF)obj).getDmcObject());
        else
            ((DmcNamedObjectREF)fault).setObject(obj);
        
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    // org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:313)
    public void resolve(DmcNameResolverWithClashSupportIF resolver, DmcObject object, DmcNameClashResolverIF ncr, DmcAttributeInfo ai) throws DmcValueException, DmcValueExceptionSet {
        DmcNamedObjectIF  obj = null;

        obj = resolver.findNamedObjectMayClash(object, fault.getObjectName(), ncr, faultAI);
        if (obj == null)
            throw(new DmcValueException("Could not resolve reference to: " + fault.getObjectName() + " via attribute: " + ai.name));
        
        if (obj instanceof DmcContainerIF)
            ((DmcNamedObjectREF)fault).setObject((DmcNamedObjectIF) ((DmcContainerIF)obj).getDmcObject());
        else
            ((DmcNamedObjectREF)fault).setObject(obj);
        
    }

    // org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:334)
    String getNextField(String input, IntegerVar seppos, String fn, boolean last) throws DmcValueException {
    	   String rc = null;
    	   int start = seppos.intValue();

    	   if ( (start+1) >= input.length()){
            throw (new DmcValueException("Missing value for field: " + fn + " in complex type: LabelledFaultReference"));
        }

    	   if (last){
    	       rc = input.substring(start+1);
    	   }
    	   else{
    	       int pos = -1;
    	       if (start > 0)
    		       pos = input.indexOf(" ", start+1);
    	       else
    		       pos = input.indexOf(" ");

    	       if (pos == -1){
    		       rc = input.substring(start+1);
                seppos.set(input.length());
                return(rc);
            }

    		   while(pos < (input.length()-1)){
    		       if ( input.charAt(pos+1) == ' ')
    		           pos++;
    		       else
    		           break;
    		   }

    	       rc = input.substring(start+1, pos).trim();

    	       seppos.set(pos);
        }

        return(rc);
    }

}
