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

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.wsdl.shared.generated.types.NameSpaceReference;    // base type import

/**
 * The DmcTypeNameSpaceReferenceSTATIC provides static access to functions used to manage values of type NameSpaceReference
 * These methods are used to support ComplexTypeDefinitions.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSTATICType(GenUtility.java:2144)
 *    Called from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2059)
 */
public class DmcTypeNameSpaceReferenceSTATIC {
    
    public static DmcTypeNameSpaceReferenceSTATIC instance;
    static DmcTypeNameSpaceReferenceSV typeHelper;
    
    static {
        instance = new DmcTypeNameSpaceReferenceSTATIC();
    }
    
    protected DmcTypeNameSpaceReferenceSTATIC() {
        typeHelper = new DmcTypeNameSpaceReferenceSV();
    }
    
    public NameSpaceReference typeCheck(Object value) throws DmcValueException {
    	   return(typeHelper.typeCheck(value));
    }
    
    public NameSpaceReference cloneValue(NameSpaceReference value) throws DmcValueException {
    	   return(typeHelper.cloneValue(value));
    }
    
    public void serializeValue(DmcOutputStreamIF dos, NameSpaceReference value) throws Exception {
    	   typeHelper.serializeValue(dos, value);
    }
    
    public NameSpaceReference deserializeValue(DmcInputStreamIF dis) throws Exception {
    	   return(typeHelper.deserializeValue(dis));
    }
    
}

