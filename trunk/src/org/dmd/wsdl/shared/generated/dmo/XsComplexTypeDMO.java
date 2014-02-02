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
import java.io.Serializable;                                              // Always required - (GenUtility.java:224)
import java.util.*;                                                       // Always required if we have any MV attributes - (GenUtility.java:221)
import org.dmd.dmc.DmcAttribute;                                          // Named object - (GenUtility.java:376)
import org.dmd.dmc.DmcNamedObjectIF;                                      // Named object - (GenUtility.java:375)
import org.dmd.dmc.DmcOmni;                                               // Lazy resolution - (GenUtility.java:320)
import org.dmd.dmc.DmcSliceInfo;                                          // Required for object slicing - (GenUtility.java:229)
import org.dmd.dmc.DmcValueException;                                     // Any attributes - (GenUtility.java:241)
import org.dmd.dmc.types.DefinitionName;                                  // Naming attribute type - (GenUtility.java:370)
import org.dmd.dms.generated.dmo.MetaDMSAG;                               // Required for MODREC constructor - (GenUtility.java:228)
import org.dmd.dms.generated.types.DmcTypeDefinitionNameSV;               // Required type - (GenUtility.java:328)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                     // Required for MODREC constructor - (GenUtility.java:227)
import org.dmd.wsdl.shared.generated.dmo.XsElementDMO;                    // Type specific set/add - (GenUtility.java:307)
import org.dmd.wsdl.shared.generated.dmo.XsTypeDMO;                       // Base class - (GenUtility.java:355)
import org.dmd.wsdl.shared.generated.types.DmcTypeXsElementREFMV;         // Reference type - (GenUtility.java:300)
import org.dmd.wsdl.shared.generated.types.XsElementREF;                  // Helper class - (GenUtility.java:335)

// Generated from: org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:677)
/**
 * A complex type composed of other, previously defined elements.
 * <P>
 * Generated from the dmwsdl schema at version unknown
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
public class XsComplexTypeDMO  extends XsTypeDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "XsComplexType";


    static {
    }

    public XsComplexTypeDMO() {
        super("XsComplexType");
    }

    protected XsComplexTypeDMO(String oc) {
        super(oc);
    }

    @Override
    public XsComplexTypeDMO getNew(){
        XsComplexTypeDMO rc = new XsComplexTypeDMO();
        return(rc);
    }

    @Override
    public XsComplexTypeDMO getSlice(DmcSliceInfo info){
        XsComplexTypeDMO rc = new XsComplexTypeDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public XsComplexTypeDMO(DmcTypeModifierMV mods) {
        super("XsComplexType");
        modrec(true);
        setModifier(mods);
    }

    public XsComplexTypeDMO getModificationRecorder(){
        XsComplexTypeDMO rc = new XsComplexTypeDMO();
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
        if (obj instanceof XsComplexTypeDMO){
            return( getObjectName().equals( ((XsComplexTypeDMO) obj).getObjectName()) );
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

    /**
     * @return An Iterator of XsElementDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:970)
    public Iterator<XsElementREF> getElements(){
        DmcTypeXsElementREFMV attr = (DmcTypeXsElementREFMV) get(DmwsdlDMSAG.__elements);
        if (attr == null)
            return( ((List<XsElementREF>) Collections.EMPTY_LIST).iterator() );

        if (DmcOmni.instance().lazyResolution()){
            if (attr.doLazyResolution(this)){
                rem(attr.getAttributeInfo());
                return( ((List<XsElementREF>) Collections.EMPTY_LIST).iterator() );
            }
        }

        return(attr.getMV());
    }

    /**
     * @return An Iterator of XsElementREFs without attempting lazy resolution (if it's turned on).
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:990)
    public Iterator<XsElementREF> getElementsREFs(){
        DmcTypeXsElementREFMV attr = (DmcTypeXsElementREFMV) get(DmwsdlDMSAG.__elements);
        if (attr == null)
            return( ((List<XsElementREF>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * Adds another elements to the specified value.
     * @param value XsElement
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1004)
    public DmcAttribute<?> addElements(XsElementDMO value) {
        DmcAttribute<?> attr = get(DmwsdlDMSAG.__elements);
        if (attr == null)
            attr = new DmcTypeXsElementREFMV(DmwsdlDMSAG.__elements);
        
        try{
            setLastValue(attr.add(value));
            add(DmwsdlDMSAG.__elements,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another elements value.
     * @param value A value compatible with XsElement
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1245)
    public DmcAttribute<?> addElements(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmwsdlDMSAG.__elements);
        if (attr == null)
            attr = new DmcTypeXsElementREFMV(DmwsdlDMSAG.__elements);
        
        setLastValue(attr.add(value));
        add(DmwsdlDMSAG.__elements,attr);
        return(attr);
    }

    /**
     * Returns the number of values in elements
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1262)
    public int getElementsSize(){
        DmcAttribute<?> attr = get(DmwsdlDMSAG.__elements);
        if (attr == null){
            if (DmwsdlDMSAG.__elements.indexSize == 0)
                return(0);
            else
                return(DmwsdlDMSAG.__elements.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a elements value.
     * @param value The XsElement to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1301)
    public DmcAttribute<?> delElements(Object value){
        DmcAttribute<?> attr = get(DmwsdlDMSAG.__elements);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeXsElementREFMV(DmwsdlDMSAG.__elements), value);
        else
            attr = del(DmwsdlDMSAG.__elements, value);
        
        return(attr);
    }

    /**
     * Removes the elements attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1355)
    public void remElements(){
         rem(DmwsdlDMSAG.__elements);
    }




}
