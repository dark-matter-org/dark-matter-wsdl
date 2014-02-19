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
import java.io.Serializable;                                    // To prevent serialization warnings - (NewComplexTypeFormatter.java:92)
import java.util.ArrayList;                                     // To store NameValuePairs - (NewComplexTypeFormatter.java:99)
import org.dmd.dmc.DmcAttributeInfo;                            // For fake DmcAttributeInfo - (NewComplexTypeFormatter.java:97)
import org.dmd.dmc.DmcInputStreamIF;                            // Standard serialization techniques - (NewComplexTypeFormatter.java:93)
import org.dmd.dmc.DmcOutputStreamIF;                           // Standard serialization techniques - (NewComplexTypeFormatter.java:94)
import org.dmd.dmc.DmcValueException;                           // Standard value exception - (NewComplexTypeFormatter.java:118)
import org.dmd.dmc.util.ComplexTypeSplitter;                    // For parsing initial input - (NewComplexTypeFormatter.java:98)
import org.dmd.dmc.util.NameValuePair;                          // To store values parsed from initial input - (NewComplexTypeFormatter.java:100)
import org.dmd.dms.generated.enums.DataTypeEnum;                // For fake DmcAttributeInfo - (NewComplexTypeFormatter.java:95)
import org.dmd.dms.generated.enums.ValueTypeEnum;               // For fake DmcAttributeInfo - (NewComplexTypeFormatter.java:96)
import org.dmd.dms.generated.types.DmcTypeStringSTATIC;         // Standard type - (NewComplexTypeFormatter.java:795)



@SuppressWarnings("serial")
/**
 * The ProtocolReference class.
 * This code was auto-generated and shouldn't be alterred manually.
 * 
 * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:130)
 */
public class ProtocolReference implements Serializable {

    final static int requiredParts = 2;

    // The namespace for the protocol reference.
    String nameSpaceV;

    final static DmcAttributeInfo nameSpaceAI = new DmcAttributeInfo("nameSpace",0,"String",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN);

    // The URL indicating the protocol.
    String urlV;

    final static DmcAttributeInfo urlAI = new DmcAttributeInfo("url",0,"String",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN);

    /**
     * Default constructor.
     */
    public ProtocolReference(){
    }

    /**
     * Copy constructor.
     */
    public ProtocolReference(ProtocolReference original){
    // Generated from: org.dmd.dms.util.NewComplexTypeFormatter.getCopyConstructorAssignments(NewComplexTypeFormatter.java:733)
        nameSpaceV =  original.nameSpaceV;
        urlV =  original.urlV;
    }

    /**
     * All fields constructor.
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:161)
     */
    public ProtocolReference(String nameSpace_, String url_) throws DmcValueException {
        nameSpaceV = DmcTypeStringSTATIC.instance.typeCheck(nameSpace_);
        urlV = DmcTypeStringSTATIC.instance.typeCheck(url_);
    }

    /**
     * String based constructor.
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:234)
     */
    public ProtocolReference(String initialInput) throws DmcValueException {
        initialize(initialInput);
    }
    /**
     * Initialize content based on string form.
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:242)
     */
    void initialize(String initialInput) throws DmcValueException {
        ArrayList<NameValuePair> nvp = ComplexTypeSplitter.parse(initialInput);

        if (nvp.size() < requiredParts)
            throw(new DmcValueException("Missing required values for complex type: ProtocolReference"));

        nameSpaceV = DmcTypeStringSTATIC.instance.typeCheck(nvp.get(0).getValue());
        urlV = DmcTypeStringSTATIC.instance.typeCheck(nvp.get(1).getValue());
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
        sb.append(urlV.toString());
        return(sb.toString());
    }

    public String getNameSpace(){
        return(nameSpaceV);
    }

    public String getUrl(){
        return(urlV);
    }

}
