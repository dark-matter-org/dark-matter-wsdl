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
// Called from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:123)
import java.io.Serializable;                                                  // To prevent serialization warnings - (NewComplexTypeFormatter.java:92)
import java.util.ArrayList;                                                   // To store NameValuePairs - (NewComplexTypeFormatter.java:99)
import org.dmd.dmc.DmcAttributeInfo;                                          // For fake DmcAttributeInfo - (NewComplexTypeFormatter.java:97)
import org.dmd.dmc.DmcContainerIF;                                            // To support object references - (NewComplexTypeFormatter.java:109)
import org.dmd.dmc.DmcInputStreamIF;                                          // Standard serialization techniques - (NewComplexTypeFormatter.java:93)
import org.dmd.dmc.DmcNameClashResolverIF;                                    // To support possible clashing object references - (NewComplexTypeFormatter.java:113)
import org.dmd.dmc.DmcNameResolverIF;                                         // To support object references - (NewComplexTypeFormatter.java:106)
import org.dmd.dmc.DmcNameResolverWithClashSupportIF;                         // To support possible clashing object references - (NewComplexTypeFormatter.java:111)
import org.dmd.dmc.DmcNamedObjectIF;                                          // To support object references - (NewComplexTypeFormatter.java:107)
import org.dmd.dmc.DmcNamedObjectREF;                                         // To support object references - (NewComplexTypeFormatter.java:108)
import org.dmd.dmc.DmcObject;                                                 // To support possible clashing object references - (NewComplexTypeFormatter.java:114)
import org.dmd.dmc.DmcOutputStreamIF;                                         // Standard serialization techniques - (NewComplexTypeFormatter.java:94)
import org.dmd.dmc.DmcValueException;                                         // Standard value exception - (NewComplexTypeFormatter.java:118)
import org.dmd.dmc.DmcValueExceptionSet;                                      // To support possible clashing object references - (NewComplexTypeFormatter.java:115)
import org.dmd.dmc.util.ComplexTypeSplitter;                                  // For parsing initial input - (NewComplexTypeFormatter.java:98)
import org.dmd.dmc.util.NameValuePair;                                        // To store values parsed from initial input - (NewComplexTypeFormatter.java:100)
import org.dmd.dms.generated.enums.DataTypeEnum;                              // For fake DmcAttributeInfo - (NewComplexTypeFormatter.java:95)
import org.dmd.dms.generated.enums.ValueTypeEnum;                             // For fake DmcAttributeInfo - (NewComplexTypeFormatter.java:96)
import org.dmd.dms.generated.types.DmcTypeStringSTATIC;                       // Standard type - (NewComplexTypeFormatter.java:795)
import org.dmd.wsdl.shared.generated.types.DmcTypeXsElementREFSTATIC;         // Internally generated type - (NewComplexTypeFormatter.java:795)
import org.dmd.wsdl.shared.generated.types.XsElementREF;                      // Object reference - (NewComplexTypeFormatter.java:770)



@SuppressWarnings("serial")
/**
 * The LabelledElementReference class.
 * This code was auto-generated and shouldn't be alterred manually.
 * 
 * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:130)
 */
public class LabelledElementReference implements Serializable {

    final static int requiredParts = 3;

    // The namespace for the element.
    String nameSpaceV;

    final static DmcAttributeInfo nameSpaceAI = new DmcAttributeInfo("nameSpace",0,"String",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN);

    // A reference to an XmlElement
    XsElementREF elementV;

    final static DmcAttributeInfo elementAI = new DmcAttributeInfo("element",0,"XsElement",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN);

    // A label for the element.
    String labelV;

    final static DmcAttributeInfo labelAI = new DmcAttributeInfo("label",0,"String",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN);

    /**
     * Default constructor.
     */
    public LabelledElementReference(){
    }

    /**
     * Copy constructor.
     */
    public LabelledElementReference(LabelledElementReference original){
    // Generated from: org.dmd.dms.util.NewComplexTypeFormatter.getCopyConstructorAssignments(NewComplexTypeFormatter.java:733)
        nameSpaceV =  original.nameSpaceV;
        elementV =  original.elementV;
        labelV =  original.labelV;
    }

    /**
     * All fields constructor.
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:161)
     */
    public LabelledElementReference(String nameSpace_, XsElementREF element_, String label_) throws DmcValueException {
        nameSpaceV = DmcTypeStringSTATIC.instance.typeCheck(nameSpace_);
        elementV = DmcTypeXsElementREFSTATIC.instance.typeCheck(element_);
        labelV = DmcTypeStringSTATIC.instance.typeCheck(label_);
    }

    /**
     * String based constructor.
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:234)
     */
    public LabelledElementReference(String initialInput) throws DmcValueException {
        initialize(initialInput);
    }
    /**
     * Initialize content based on string form.
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:242)
     */
    void initialize(String initialInput) throws DmcValueException {
        ArrayList<NameValuePair> nvp = ComplexTypeSplitter.parse(initialInput);

        if (nvp.size() < requiredParts)
            throw(new DmcValueException("Missing required values for complex type: LabelledElementReference"));

        nameSpaceV = DmcTypeStringSTATIC.instance.typeCheck(nvp.get(0).getValue());
        elementV = DmcTypeXsElementREFSTATIC.instance.typeCheck(nvp.get(1).getValue());
        labelV = DmcTypeStringSTATIC.instance.typeCheck(nvp.get(2).getValue());
    }

    /**
     * Serialization.
     */
    public void serializeIt(DmcOutputStreamIF dos) throws Exception {
        dos.writeUTF(toString());
    }

    /**
     * Deserialization.
     */
    public void deserializeIt(DmcInputStreamIF dis) throws Exception {
        initialize(dis.readUTF());
    }

    /**
     * String form.
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:341)
     */
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append(nameSpaceV.toString());
        sb.append(' ');
        sb.append(elementV.toString());
        sb.append(' ');
        sb.append(labelV.toString());
        return(sb.toString());
    }

    public String getNameSpace(){
        return(nameSpaceV);
    }

    public XsElementREF getElement(){
        return(elementV);
    }

    public String getLabel(){
        return(labelV);
    }

    // Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:447)
    @SuppressWarnings({"unchecked", "rawtypes"})
    public void resolve(DmcNameResolverIF resolver, String attrName) throws DmcValueException {
        DmcNamedObjectIF  obj = null;

        if ((elementV != null) && (!elementV.isResolved())){
            obj = resolver.findNamedObject(elementV.getObjectName());
            if (obj == null)
                throw(new DmcValueException("Could not resolve reference to: " + elementV.getObjectName() + " via attribute: " + attrName));
        
            if (obj instanceof DmcContainerIF)
                ((DmcNamedObjectREF)elementV).setObject((DmcNamedObjectIF) ((DmcContainerIF)obj).getDmcObject());
            else
                ((DmcNamedObjectREF)elementV).setObject(obj);
        }
        
    }

    // Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:492)
    @SuppressWarnings({"unchecked", "rawtypes"})
    public void resolve(DmcNameResolverWithClashSupportIF resolver, DmcObject object, DmcNameClashResolverIF ncr, DmcAttributeInfo ai) throws DmcValueException, DmcValueExceptionSet {
        DmcNamedObjectIF  obj = null;

        if ((elementV != null) && (!elementV.isResolved())){
            obj = resolver.findNamedObjectMayClash(object, elementV.getObjectName(), ncr, elementAI);
            if (obj == null)
                throw(new DmcValueException("Could not resolve reference to: " + elementV.getObjectName() + " via attribute: " + ai.name));
        
            if (obj instanceof DmcContainerIF)
                ((DmcNamedObjectREF)elementV).setObject((DmcNamedObjectIF) ((DmcContainerIF)obj).getDmcObject());
            else
                ((DmcNamedObjectREF)elementV).setObject(obj);
        }
        
    }

}
