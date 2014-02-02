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
import java.io.Serializable;                                    // To prevent serialization warnings - (ComplexTypeFormatter.java:70)
import org.dmd.dmc.DmcAttributeInfo;                            // For fake DmcAttributeInfo - (ComplexTypeFormatter.java:76)
import org.dmd.dmc.DmcInputStreamIF;                            // Standard serialization techniques - (ComplexTypeFormatter.java:71)
import org.dmd.dmc.DmcOutputStreamIF;                           // Standard serialization techniques - (ComplexTypeFormatter.java:72)
import org.dmd.dmc.DmcValueException;                           // Standard value exception - (ComplexTypeFormatter.java:99)
import org.dmd.dmc.types.IntegerVar;                            // To support getNextField() - (ComplexTypeFormatter.java:73)
import org.dmd.dms.generated.enums.DataTypeEnum;                // For fake DmcAttributeInfo - (ComplexTypeFormatter.java:74)
import org.dmd.dms.generated.enums.ValueTypeEnum;               // For fake DmcAttributeInfo - (ComplexTypeFormatter.java:75)
import org.dmd.dms.generated.types.DmcTypeStringSTATIC;         // Standard type - (ComplexTypeFormatter.java:616)



@SuppressWarnings("serial")
/**
 * The ProtocolReference class.
 * This code was auto-generated and shouldn't be alterred manually.
 * 
 * Generated from: org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:113)
 */
public class ProtocolReference implements Serializable {

    // The namespace for the protocol reference.
    String nameSpace;

    final static DmcAttributeInfo nameSpaceAI = new DmcAttributeInfo("nameSpace",0,"String",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN);

    // the URL indicating the protocol.
    String url;

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
        nameSpace = original.nameSpace;
        url = original.url;
    }

    /**
     * All fields constructor.
     * Generated from: org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:140)
     */
    public ProtocolReference(String f1, String f2) throws DmcValueException {
        nameSpace = DmcTypeStringSTATIC.instance.typeCheck(f1);
        url = DmcTypeStringSTATIC.instance.typeCheck(f2);
    }

    /**
     * String based constructor.
     * Generated from: org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:180)
     */
    public ProtocolReference(String initialInput) throws DmcValueException {
        IntegerVar seppos = new IntegerVar(-1);
        String input = initialInput.trim();
        input = input.replaceAll("(\\s)+", " ");
        nameSpace = DmcTypeStringSTATIC.instance.typeCheck(getNextField(input,seppos,"nameSpace",false));
        url = DmcTypeStringSTATIC.instance.typeCheck(getNextField(input,seppos,"url",true));
    }

    /**
     * Serialization.
     * Generated from: org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:225)
     */
    public void serializeIt(DmcOutputStreamIF dos) throws Exception {
        DmcTypeStringSTATIC.instance.serializeValue(dos, nameSpace);
        DmcTypeStringSTATIC.instance.serializeValue(dos, url);
    }

    /**
     * Deserialization.
     * Generated from: org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:242)
     */
    public void deserializeIt(DmcInputStreamIF dis) throws Exception {
        nameSpace = DmcTypeStringSTATIC.instance.deserializeValue(dis);
        url = DmcTypeStringSTATIC.instance.deserializeValue(dis);
    }

    /**
     * String form.
     * Generated from: org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:259)
     */
    public String toString(){
        return(nameSpace.toString() + " " + url.toString());
    }

    public String getNameSpace(){
        return(nameSpace);
    }

    public String getUrl(){
        return(url);
    }

    // org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:334)
    String getNextField(String input, IntegerVar seppos, String fn, boolean last) throws DmcValueException {
    	   String rc = null;
    	   int start = seppos.intValue();

    	   if ( (start+1) >= input.length()){
            throw (new DmcValueException("Missing value for field: " + fn + " in complex type: ProtocolReference"));
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
