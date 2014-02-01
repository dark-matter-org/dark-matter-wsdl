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

import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.types.DmcTypeNamedObjectREF;
import org.dmd.dmc.types.DefinitionName;

import org.dmd.wsdl.shared.generated.types.WsdlInterfaceREF;

import org.dmd.wsdl.shared.generated.dmo.WsdlInterfaceDMO;

/**
 * This is the generated DmcAttribute derivative for values of type WsdlInterface
 * <P>
 * Generated from the dmwsdl schema at version unknown
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREFHelperType(DmoTypeFormatter.java:585)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeWsdlInterfaceREF extends DmcTypeNamedObjectREF<WsdlInterfaceREF, DefinitionName> {

    public DmcTypeWsdlInterfaceREF(){
    
    }

    public DmcTypeWsdlInterfaceREF(DmcAttributeInfo ai){
        super(ai);
    }

    @Override
    protected WsdlInterfaceREF getNewHelper(){
        return(new WsdlInterfaceREF());
    }

    @Override
    protected DefinitionName getNewName(){
        return(new DefinitionName());
    }

    @Override
    protected String getDMOClassName(){
        return( WsdlInterfaceDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof WsdlInterfaceDMO)
            return(true);
        return(false);
    }

    @Override
    protected WsdlInterfaceREF typeCheck(Object value) throws DmcValueException {
        WsdlInterfaceREF rc = null;

        if (value instanceof WsdlInterfaceREF)
            rc = (WsdlInterfaceREF)value;
        else if (value instanceof WsdlInterfaceDMO)
            rc = new WsdlInterfaceREF((WsdlInterfaceDMO)value);
        else if (value instanceof DefinitionName)
            rc = new WsdlInterfaceREF((DefinitionName)value);
        else if (value instanceof String)
            rc = new WsdlInterfaceREF((String)value);
        else
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with WsdlInterfaceREF, WsdlInterfaceDMO or String expected."));

        return(rc);
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, WsdlInterfaceREF value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public WsdlInterfaceREF deserializeValue(DmcInputStreamIF dis) throws Exception {
        WsdlInterfaceREF rc = new WsdlInterfaceREF();
        rc.deserializeIt(dis);
        return(rc);
    }

    @Override
    public WsdlInterfaceREF cloneValue(WsdlInterfaceREF value){
        return(new WsdlInterfaceREF(value));
    }



}