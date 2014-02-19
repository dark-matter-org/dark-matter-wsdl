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
import java.io.Serializable;                                                      // To prevent serialization warnings - (NewComplexTypeFormatter.java:92)
import java.util.ArrayList;                                                       // To store NameValuePairs - (NewComplexTypeFormatter.java:99)
import org.dmd.dmc.DmcAttributeInfo;                                              // For fake DmcAttributeInfo - (NewComplexTypeFormatter.java:97)
import org.dmd.dmc.DmcContainerIF;                                                // To support object references - (NewComplexTypeFormatter.java:109)
import org.dmd.dmc.DmcInputStreamIF;                                              // Standard serialization techniques - (NewComplexTypeFormatter.java:93)
import org.dmd.dmc.DmcNameClashResolverIF;                                        // To support possible clashing object references - (NewComplexTypeFormatter.java:113)
import org.dmd.dmc.DmcNameResolverIF;                                             // To support object references - (NewComplexTypeFormatter.java:106)
import org.dmd.dmc.DmcNameResolverWithClashSupportIF;                             // To support possible clashing object references - (NewComplexTypeFormatter.java:111)
import org.dmd.dmc.DmcNamedObjectIF;                                              // To support object references - (NewComplexTypeFormatter.java:107)
import org.dmd.dmc.DmcNamedObjectREF;                                             // To support object references - (NewComplexTypeFormatter.java:108)
import org.dmd.dmc.DmcObject;                                                     // To support possible clashing object references - (NewComplexTypeFormatter.java:114)
import org.dmd.dmc.DmcOutputStreamIF;                                             // Standard serialization techniques - (NewComplexTypeFormatter.java:94)
import org.dmd.dmc.DmcValueException;                                             // Standard value exception - (NewComplexTypeFormatter.java:118)
import org.dmd.dmc.DmcValueExceptionSet;                                          // To support possible clashing object references - (NewComplexTypeFormatter.java:115)
import org.dmd.dmc.util.ComplexTypeSplitter;                                      // For parsing initial input - (NewComplexTypeFormatter.java:98)
import org.dmd.dmc.util.NameValuePair;                                            // To store values parsed from initial input - (NewComplexTypeFormatter.java:100)
import org.dmd.dms.generated.enums.DataTypeEnum;                                  // For fake DmcAttributeInfo - (NewComplexTypeFormatter.java:95)
import org.dmd.dms.generated.enums.ValueTypeEnum;                                 // For fake DmcAttributeInfo - (NewComplexTypeFormatter.java:96)
import org.dmd.dms.generated.types.DmcTypeStringSTATIC;                           // Standard type - (NewComplexTypeFormatter.java:795)
import org.dmd.wsdl.shared.generated.types.DmcTypeWsdlInterfaceREFSTATIC;         // Internally generated type - (NewComplexTypeFormatter.java:795)
import org.dmd.wsdl.shared.generated.types.WsdlInterfaceREF;                      // Object reference - (NewComplexTypeFormatter.java:770)



@SuppressWarnings("serial")
/**
 * The InterfaceReference class.
 * This code was auto-generated and shouldn't be alterred manually.
 * 
 * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:130)
 */
public class InterfaceReference implements Serializable {

    final static int requiredParts = 2;

    // The namespace for the interface.
    String nameSpaceV;

    final static DmcAttributeInfo nameSpaceAI = new DmcAttributeInfo("nameSpace",0,"String",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN);

    // A reference to a WsdlInterface.
    WsdlInterfaceREF interfaceRefV;

    final static DmcAttributeInfo interfaceRefAI = new DmcAttributeInfo("interfaceRef",0,"WsdlInterface",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN);

    /**
     * Default constructor.
     */
    public InterfaceReference(){
    }

    /**
     * Copy constructor.
     */
    public InterfaceReference(InterfaceReference original){
    // Generated from: org.dmd.dms.util.NewComplexTypeFormatter.getCopyConstructorAssignments(NewComplexTypeFormatter.java:733)
        nameSpaceV =  original.nameSpaceV;
        interfaceRefV =  original.interfaceRefV;
    }

    /**
     * All fields constructor.
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:161)
     */
    public InterfaceReference(String nameSpace_, WsdlInterfaceREF interfaceRef_) throws DmcValueException {
        nameSpaceV = DmcTypeStringSTATIC.instance.typeCheck(nameSpace_);
        interfaceRefV = DmcTypeWsdlInterfaceREFSTATIC.instance.typeCheck(interfaceRef_);
    }

    /**
     * String based constructor.
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:234)
     */
    public InterfaceReference(String initialInput) throws DmcValueException {
        initialize(initialInput);
    }
    /**
     * Initialize content based on string form.
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:242)
     */
    void initialize(String initialInput) throws DmcValueException {
        ArrayList<NameValuePair> nvp = ComplexTypeSplitter.parse(initialInput);

        if (nvp.size() < requiredParts)
            throw(new DmcValueException("Missing required values for complex type: InterfaceReference"));

        nameSpaceV = DmcTypeStringSTATIC.instance.typeCheck(nvp.get(0).getValue());
        interfaceRefV = DmcTypeWsdlInterfaceREFSTATIC.instance.typeCheck(nvp.get(1).getValue());
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
        sb.append(interfaceRefV.toString());
        return(sb.toString());
    }

    public String getNameSpace(){
        return(nameSpaceV);
    }

    public WsdlInterfaceREF getInterfaceRef(){
        return(interfaceRefV);
    }

    // Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:447)
    @SuppressWarnings({"unchecked", "rawtypes"})
    public void resolve(DmcNameResolverIF resolver, String attrName) throws DmcValueException {
        DmcNamedObjectIF  obj = null;

        if ((interfaceRefV != null) && (!interfaceRefV.isResolved())){
            obj = resolver.findNamedObject(interfaceRefV.getObjectName());
            if (obj == null)
                throw(new DmcValueException("Could not resolve reference to: " + interfaceRefV.getObjectName() + " via attribute: " + attrName));
        
            if (obj instanceof DmcContainerIF)
                ((DmcNamedObjectREF)interfaceRefV).setObject((DmcNamedObjectIF) ((DmcContainerIF)obj).getDmcObject());
            else
                ((DmcNamedObjectREF)interfaceRefV).setObject(obj);
        }
        
    }

    // Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:492)
    @SuppressWarnings({"unchecked", "rawtypes"})
    public void resolve(DmcNameResolverWithClashSupportIF resolver, DmcObject object, DmcNameClashResolverIF ncr, DmcAttributeInfo ai) throws DmcValueException, DmcValueExceptionSet {
        DmcNamedObjectIF  obj = null;

        if ((interfaceRefV != null) && (!interfaceRefV.isResolved())){
            obj = resolver.findNamedObjectMayClash(object, interfaceRefV.getObjectName(), ncr, interfaceRefAI);
            if (obj == null)
                throw(new DmcValueException("Could not resolve reference to: " + interfaceRefV.getObjectName() + " via attribute: " + ai.name));
        
            if (obj instanceof DmcContainerIF)
                ((DmcNamedObjectREF)interfaceRefV).setObject((DmcNamedObjectIF) ((DmcContainerIF)obj).getDmcObject());
            else
                ((DmcNamedObjectREF)interfaceRefV).setObject(obj);
        }
        
    }

}
