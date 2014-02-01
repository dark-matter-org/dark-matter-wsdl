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

import org.dmd.wsdl.shared.generated.types.WsdlModuleREF;

import org.dmd.wsdl.shared.generated.dmo.WsdlModuleDMO;

/**
 * This is the generated DmcAttribute derivative for values of type WsdlModule
 * <P>
 * Generated from the dmwsdl schema at version unknown
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREFHelperType(DmoTypeFormatter.java:585)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeWsdlModuleREF extends DmcTypeNamedObjectREF<WsdlModuleREF, DefinitionName> {

    public DmcTypeWsdlModuleREF(){
    
    }

    public DmcTypeWsdlModuleREF(DmcAttributeInfo ai){
        super(ai);
    }

    @Override
    protected WsdlModuleREF getNewHelper(){
        return(new WsdlModuleREF());
    }

    @Override
    protected DefinitionName getNewName(){
        return(new DefinitionName());
    }

    @Override
    protected String getDMOClassName(){
        return( WsdlModuleDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof WsdlModuleDMO)
            return(true);
        return(false);
    }

    @Override
    protected WsdlModuleREF typeCheck(Object value) throws DmcValueException {
        WsdlModuleREF rc = null;

        if (value instanceof WsdlModuleREF)
            rc = (WsdlModuleREF)value;
        else if (value instanceof WsdlModuleDMO)
            rc = new WsdlModuleREF((WsdlModuleDMO)value);
        else if (value instanceof DefinitionName)
            rc = new WsdlModuleREF((DefinitionName)value);
        else if (value instanceof String)
            rc = new WsdlModuleREF((String)value);
        else
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with WsdlModuleREF, WsdlModuleDMO or String expected."));

        return(rc);
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, WsdlModuleREF value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public WsdlModuleREF deserializeValue(DmcInputStreamIF dis) throws Exception {
        WsdlModuleREF rc = new WsdlModuleREF();
        rc.deserializeIt(dis);
        return(rc);
    }

    @Override
    public WsdlModuleREF cloneValue(WsdlModuleREF value){
        return(new WsdlModuleREF(value));
    }



}
