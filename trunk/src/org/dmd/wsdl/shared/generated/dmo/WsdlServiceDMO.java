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
package org.dmd.wsdl.shared.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:396)
import java.io.Serializable;                                        // Always required - (GenUtility.java:224)
import org.dmd.dmc.DmcAttribute;                                    // Named object - (GenUtility.java:376)
import org.dmd.dmc.DmcNamedObjectIF;                                // Named object - (GenUtility.java:375)
import org.dmd.dmc.DmcSliceInfo;                                    // Required for object slicing - (GenUtility.java:229)
import org.dmd.dmc.DmcValueException;                               // Any attributes - (GenUtility.java:241)
import org.dmd.dmc.types.DefinitionName;                            // Naming attribute type - (GenUtility.java:370)
import org.dmd.dms.generated.dmo.MetaDMSAG;                         // Required for MODREC constructor - (GenUtility.java:228)
import org.dmd.dms.generated.types.DmcTypeDefinitionNameSV;         // Required type - (GenUtility.java:328)
import org.dmd.dms.generated.types.DmcTypeModifierMV;               // Required for MODREC constructor - (GenUtility.java:227)
import org.dmd.wsdl.shared.generated.dmo.WsdlDefinitionDMO;         // Base class - (GenUtility.java:355)

// Generated from: org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:677)
/**
 * A WsdlService specifies a single interface that the service will support,
 * and a list of\n endpoint locations where that service can be accessed.
 * Each endpoint must also reference a previously\n defined binding to
 * indicate what protocols and transmission formats are to be used at that
 * endpoint.\n A service is only permitted to have one interface.
 * <P>
 * Generated from the dmwsdl schema at version unknown
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
public class WsdlServiceDMO  extends WsdlDefinitionDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "WsdlService";


    static {
    }

    public WsdlServiceDMO() {
        super("WsdlService");
    }

    protected WsdlServiceDMO(String oc) {
        super(oc);
    }

    @Override
    public WsdlServiceDMO getNew(){
        WsdlServiceDMO rc = new WsdlServiceDMO();
        return(rc);
    }

    @Override
    public WsdlServiceDMO getSlice(DmcSliceInfo info){
        WsdlServiceDMO rc = new WsdlServiceDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public WsdlServiceDMO(DmcTypeModifierMV mods) {
        super("WsdlService");
        modrec(true);
        setModifier(mods);
    }

    public WsdlServiceDMO getModificationRecorder(){
        WsdlServiceDMO rc = new WsdlServiceDMO();
        rc.setName(getName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:751)
    public DefinitionName getObjectName(){
        DmcAttribute<?> name = get(MetaDMSAG.__name);
        if (name != null)
            return((DefinitionName)name.getSV());
    
        return(null);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:768)
    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(MetaDMSAG.__name);
        return(name);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:775)
    public boolean equals(Object obj){
        if (obj instanceof WsdlServiceDMO){
            return( getObjectName().equals( ((WsdlServiceDMO) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:783)
    public int hashCode(){
        DefinitionName objn = getObjectName();
        if (objn == null)
            return(0);
        
        return(objn.hashCode());
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:784)
    public DefinitionName getName(){
        DmcTypeDefinitionNameSV attr = (DmcTypeDefinitionNameSV) get(MetaDMSAG.__name);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets name to the specified value.
     * @param value DefinitionName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:824)
    public void setName(DefinitionName value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__name);
        if (attr == null)
            attr = new DmcTypeDefinitionNameSV(MetaDMSAG.__name);
        
        try{
            attr.set(value);
            set(MetaDMSAG.__name,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeDefinitionNameSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:877)
    public void setName(Object value) throws DmcValueException {
        DmcTypeDefinitionNameSV attr  = (DmcTypeDefinitionNameSV) get(MetaDMSAG.__name);
        if (attr == null)
            attr = new DmcTypeDefinitionNameSV(MetaDMSAG.__name);
        
        attr.set(value);
        set(MetaDMSAG.__name,attr);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:897)
    public void remName(){
         rem(MetaDMSAG.__name);
    }




}