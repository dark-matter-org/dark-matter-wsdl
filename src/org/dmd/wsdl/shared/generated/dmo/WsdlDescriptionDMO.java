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
import java.io.Serializable;                                                    // Always required - (GenUtility.java:224)
import java.util.*;                                                             // Always required if we have any MV attributes - (GenUtility.java:221)
import org.dmd.dmc.DmcAttribute;                                                // Named object - (GenUtility.java:376)
import org.dmd.dmc.DmcNamedObjectIF;                                            // Named object - (GenUtility.java:375)
import org.dmd.dmc.DmcOmni;                                                     // Lazy resolution - (GenUtility.java:320)
import org.dmd.dmc.DmcSliceInfo;                                                // Required for object slicing - (GenUtility.java:229)
import org.dmd.dmc.DmcValueException;                                           // Any attributes - (GenUtility.java:241)
import org.dmd.dmc.types.DefinitionName;                                        // Naming attribute type - (GenUtility.java:370)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                     // Required for MODREC constructor - (GenUtility.java:228)
import org.dmd.dms.generated.types.DmcTypeDefinitionNameSV;                     // Required type - (GenUtility.java:328)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                           // Required for MODREC constructor - (GenUtility.java:227)
import org.dmd.dms.generated.types.DmcTypeStringMV;                             // Required type - (GenUtility.java:328)
import org.dmd.dms.generated.types.DmcTypeStringSV;                             // Required type - (GenUtility.java:328)
import org.dmd.wsdl.shared.generated.dmo.WsdlBindingDMO;                        // Type specific set/add - (GenUtility.java:307)
import org.dmd.wsdl.shared.generated.dmo.WsdlDefinitionDMO;                     // Base class - (GenUtility.java:355)
import org.dmd.wsdl.shared.generated.dmo.WsdlInterfaceDMO;                      // Type specific set/add - (GenUtility.java:307)
import org.dmd.wsdl.shared.generated.dmo.WsdlServiceDMO;                        // Type specific set/add - (GenUtility.java:307)
import org.dmd.wsdl.shared.generated.dmo.XsSchemaDMO;                           // Type specific set/add - (GenUtility.java:307)
import org.dmd.wsdl.shared.generated.types.DmcTypeNameSpaceReferenceMV;         // Required type - (GenUtility.java:328)
import org.dmd.wsdl.shared.generated.types.DmcTypeWsdlBindingREFSV;             // Reference type - (GenUtility.java:300)
import org.dmd.wsdl.shared.generated.types.DmcTypeWsdlInterfaceREFMV;           // Reference type - (GenUtility.java:300)
import org.dmd.wsdl.shared.generated.types.DmcTypeWsdlServiceREFSV;             // Reference type - (GenUtility.java:300)
import org.dmd.wsdl.shared.generated.types.DmcTypeXsSchemaREFSV;                // Reference type - (GenUtility.java:300)
import org.dmd.wsdl.shared.generated.types.NameSpaceReference;                  // Primitive type and !auxiliary class - (GenUtility.java:271)
import org.dmd.wsdl.shared.generated.types.WsdlBindingREF;                      // Helper class - (GenUtility.java:335)
import org.dmd.wsdl.shared.generated.types.WsdlInterfaceREF;                    // Helper class - (GenUtility.java:335)
import org.dmd.wsdl.shared.generated.types.WsdlServiceREF;                      // Helper class - (GenUtility.java:335)
import org.dmd.wsdl.shared.generated.types.XsSchemaREF;                         // Helper class - (GenUtility.java:335)

// Generated from: org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:677)
/**
 * The WsdlDescription defines a web service.
 * <P>
 * Generated from the dmwsdl schema at version unknown
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
public class WsdlDescriptionDMO  extends WsdlDefinitionDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "WsdlDescription";


    static {
    }

    public WsdlDescriptionDMO() {
        super("WsdlDescription");
    }

    protected WsdlDescriptionDMO(String oc) {
        super(oc);
    }

    @Override
    public WsdlDescriptionDMO getNew(){
        WsdlDescriptionDMO rc = new WsdlDescriptionDMO();
        return(rc);
    }

    @Override
    public WsdlDescriptionDMO getSlice(DmcSliceInfo info){
        WsdlDescriptionDMO rc = new WsdlDescriptionDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public WsdlDescriptionDMO(DmcTypeModifierMV mods) {
        super("WsdlDescription");
        modrec(true);
        setModifier(mods);
    }

    public WsdlDescriptionDMO getModificationRecorder(){
        WsdlDescriptionDMO rc = new WsdlDescriptionDMO();
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
        if (obj instanceof WsdlDescriptionDMO){
            return( getObjectName().equals( ((WsdlDescriptionDMO) obj).getObjectName()) );
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

    /**
     * @return An Iterator of WsdlInterfaceDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:970)
    public Iterator<WsdlInterfaceREF> getInterfaces(){
        DmcTypeWsdlInterfaceREFMV attr = (DmcTypeWsdlInterfaceREFMV) get(DmwsdlDMSAG.__interfaces);
        if (attr == null)
            return( ((List<WsdlInterfaceREF>) Collections.EMPTY_LIST).iterator() );

        if (DmcOmni.instance().lazyResolution()){
            if (attr.doLazyResolution(this)){
                rem(attr.getAttributeInfo());
                return( ((List<WsdlInterfaceREF>) Collections.EMPTY_LIST).iterator() );
            }
        }

        return(attr.getMV());
    }

    /**
     * @return An Iterator of WsdlInterfaceREFs without attempting lazy resolution (if it's turned on).
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:990)
    public Iterator<WsdlInterfaceREF> getInterfacesREFs(){
        DmcTypeWsdlInterfaceREFMV attr = (DmcTypeWsdlInterfaceREFMV) get(DmwsdlDMSAG.__interfaces);
        if (attr == null)
            return( ((List<WsdlInterfaceREF>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * Adds another interfaces to the specified value.
     * @param value WsdlInterface
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1004)
    public DmcAttribute<?> addInterfaces(WsdlInterfaceDMO value) {
        DmcAttribute<?> attr = get(DmwsdlDMSAG.__interfaces);
        if (attr == null)
            attr = new DmcTypeWsdlInterfaceREFMV(DmwsdlDMSAG.__interfaces);
        
        try{
            setLastValue(attr.add(value));
            add(DmwsdlDMSAG.__interfaces,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another interfaces value.
     * @param value A value compatible with WsdlInterface
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1245)
    public DmcAttribute<?> addInterfaces(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmwsdlDMSAG.__interfaces);
        if (attr == null)
            attr = new DmcTypeWsdlInterfaceREFMV(DmwsdlDMSAG.__interfaces);
        
        setLastValue(attr.add(value));
        add(DmwsdlDMSAG.__interfaces,attr);
        return(attr);
    }

    /**
     * Returns the number of values in interfaces
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1262)
    public int getInterfacesSize(){
        DmcAttribute<?> attr = get(DmwsdlDMSAG.__interfaces);
        if (attr == null){
            if (DmwsdlDMSAG.__interfaces.indexSize == 0)
                return(0);
            else
                return(DmwsdlDMSAG.__interfaces.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a interfaces value.
     * @param value The WsdlInterface to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1301)
    public DmcAttribute<?> delInterfaces(Object value){
        DmcAttribute<?> attr = get(DmwsdlDMSAG.__interfaces);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeWsdlInterfaceREFMV(DmwsdlDMSAG.__interfaces), value);
        else
            attr = del(DmwsdlDMSAG.__interfaces, value);
        
        return(attr);
    }

    /**
     * Removes the interfaces attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1355)
    public void remInterfaces(){
         rem(DmwsdlDMSAG.__interfaces);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:655)
    public WsdlServiceREF getService(){
        DmcTypeWsdlServiceREFSV attr = (DmcTypeWsdlServiceREFSV) get(DmwsdlDMSAG.__service);
        if (attr == null)
            return(null);

        if (DmcOmni.instance().lazyResolution()){
            if (attr.doLazyResolution(this)){
                rem(attr.getAttributeInfo());
                return(null);
            }
        }

        return(attr.getSV());
    }

    /**
     * Returns the reference to WsdlService without attempting lazy resolution (if turned on).
     */
    public WsdlServiceREF getServiceREF(){
        DmcTypeWsdlServiceREFSV attr = (DmcTypeWsdlServiceREFSV) get(DmwsdlDMSAG.__service);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets service to the specified value.
     * @param value WsdlServiceDMO
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:709)
    public void setService(WsdlServiceDMO value) {
        DmcAttribute<?> attr = get(DmwsdlDMSAG.__service);
        if (attr == null)
            attr = new DmcTypeWsdlServiceREFSV(DmwsdlDMSAG.__service);
        else
            ((DmcTypeWsdlServiceREFSV)attr).removeBackReferences();
        
        try{
            attr.set(value);
            set(DmwsdlDMSAG.__service,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets service to the specified value.
     * @param value A value compatible with DmcTypeWsdlServiceREFSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:877)
    public void setService(Object value) throws DmcValueException {
        DmcTypeWsdlServiceREFSV attr  = (DmcTypeWsdlServiceREFSV) get(DmwsdlDMSAG.__service);
        if (attr == null)
            attr = new DmcTypeWsdlServiceREFSV(DmwsdlDMSAG.__service);
        else
            attr.removeBackReferences();
        
        attr.set(value);
        set(DmwsdlDMSAG.__service,attr);
    }

    /**
     * Removes the service attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:897)
    public void remService(){
         rem(DmwsdlDMSAG.__service);
    }

    /**
     * @return An Iterator of String objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1112)
    public Iterator<String> getDescription(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaDMSAG.__description);
        if (attr == null)
            return( ((List<String>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth String value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1124)
    public String getNthDescription(int i){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaDMSAG.__description);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another description to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1138)
    public DmcAttribute<?> addDescription(String value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__description);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaDMSAG.__description);
        
        try{
            setLastValue(attr.add(value));
            add(MetaDMSAG.__description,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified String.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1213)
    public boolean descriptionContains(String value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__description);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another description value.
     * @param value A value compatible with String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1245)
    public DmcAttribute<?> addDescription(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__description);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaDMSAG.__description);
        
        setLastValue(attr.add(value));
        add(MetaDMSAG.__description,attr);
        return(attr);
    }

    /**
     * Returns the number of values in description
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1262)
    public int getDescriptionSize(){
        DmcAttribute<?> attr = get(MetaDMSAG.__description);
        if (attr == null){
            if (MetaDMSAG.__description.indexSize == 0)
                return(0);
            else
                return(MetaDMSAG.__description.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a description value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1320)
    public DmcAttribute<?> delDescription(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__description);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringMV(MetaDMSAG.__description), value);
        else
            attr = del(MetaDMSAG.__description, value);
        
        return(attr);
    }

    /**
     * Deletes a description from the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1336)
    public DmcAttribute<?> delDescription(String value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__description);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringMV(MetaDMSAG.__description), value);
        else
            attr = del(MetaDMSAG.__description, value);
        
        return(attr);
    }

    /**
     * Removes the description attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1355)
    public void remDescription(){
         rem(MetaDMSAG.__description);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:655)
    public XsSchemaREF getEmbedSchema(){
        DmcTypeXsSchemaREFSV attr = (DmcTypeXsSchemaREFSV) get(DmwsdlDMSAG.__embedSchema);
        if (attr == null)
            return(null);

        if (DmcOmni.instance().lazyResolution()){
            if (attr.doLazyResolution(this)){
                rem(attr.getAttributeInfo());
                return(null);
            }
        }

        return(attr.getSV());
    }

    /**
     * Returns the reference to XsSchema without attempting lazy resolution (if turned on).
     */
    public XsSchemaREF getEmbedSchemaREF(){
        DmcTypeXsSchemaREFSV attr = (DmcTypeXsSchemaREFSV) get(DmwsdlDMSAG.__embedSchema);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets embedSchema to the specified value.
     * @param value XsSchemaDMO
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:709)
    public void setEmbedSchema(XsSchemaDMO value) {
        DmcAttribute<?> attr = get(DmwsdlDMSAG.__embedSchema);
        if (attr == null)
            attr = new DmcTypeXsSchemaREFSV(DmwsdlDMSAG.__embedSchema);
        else
            ((DmcTypeXsSchemaREFSV)attr).removeBackReferences();
        
        try{
            attr.set(value);
            set(DmwsdlDMSAG.__embedSchema,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets embedSchema to the specified value.
     * @param value A value compatible with DmcTypeXsSchemaREFSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:877)
    public void setEmbedSchema(Object value) throws DmcValueException {
        DmcTypeXsSchemaREFSV attr  = (DmcTypeXsSchemaREFSV) get(DmwsdlDMSAG.__embedSchema);
        if (attr == null)
            attr = new DmcTypeXsSchemaREFSV(DmwsdlDMSAG.__embedSchema);
        else
            attr.removeBackReferences();
        
        attr.set(value);
        set(DmwsdlDMSAG.__embedSchema,attr);
    }

    /**
     * Removes the embedSchema attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:897)
    public void remEmbedSchema(){
         rem(DmwsdlDMSAG.__embedSchema);
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
     * @return An Iterator of NameSpaceReference objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1112)
    public Iterator<NameSpaceReference> getNameSpace(){
        DmcTypeNameSpaceReferenceMV attr = (DmcTypeNameSpaceReferenceMV) get(DmwsdlDMSAG.__nameSpace);
        if (attr == null)
            return( ((List<NameSpaceReference>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth NameSpaceReference value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1124)
    public NameSpaceReference getNthNameSpace(int i){
        DmcTypeNameSpaceReferenceMV attr = (DmcTypeNameSpaceReferenceMV) get(DmwsdlDMSAG.__nameSpace);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another nameSpace to the specified value.
     * @param value NameSpaceReference
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1138)
    public DmcAttribute<?> addNameSpace(NameSpaceReference value) {
        DmcAttribute<?> attr = get(DmwsdlDMSAG.__nameSpace);
        if (attr == null)
            attr = new DmcTypeNameSpaceReferenceMV(DmwsdlDMSAG.__nameSpace);
        
        try{
            setLastValue(attr.add(value));
            add(DmwsdlDMSAG.__nameSpace,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified NameSpaceReference.
     * @param value NameSpaceReference
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1213)
    public boolean nameSpaceContains(NameSpaceReference value) {
        DmcAttribute<?> attr = get(DmwsdlDMSAG.__nameSpace);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another nameSpace value.
     * @param value A value compatible with NameSpaceReference
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1245)
    public DmcAttribute<?> addNameSpace(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmwsdlDMSAG.__nameSpace);
        if (attr == null)
            attr = new DmcTypeNameSpaceReferenceMV(DmwsdlDMSAG.__nameSpace);
        
        setLastValue(attr.add(value));
        add(DmwsdlDMSAG.__nameSpace,attr);
        return(attr);
    }

    /**
     * Returns the number of values in nameSpace
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1262)
    public int getNameSpaceSize(){
        DmcAttribute<?> attr = get(DmwsdlDMSAG.__nameSpace);
        if (attr == null){
            if (DmwsdlDMSAG.__nameSpace.indexSize == 0)
                return(0);
            else
                return(DmwsdlDMSAG.__nameSpace.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a nameSpace value.
     * @param value The NameSpaceReference to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1320)
    public DmcAttribute<?> delNameSpace(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmwsdlDMSAG.__nameSpace);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeNameSpaceReferenceMV(DmwsdlDMSAG.__nameSpace), value);
        else
            attr = del(DmwsdlDMSAG.__nameSpace, value);
        
        return(attr);
    }

    /**
     * Deletes a nameSpace from the specified value.
     * @param value NameSpaceReference
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1336)
    public DmcAttribute<?> delNameSpace(NameSpaceReference value) {
        DmcAttribute<?> attr = get(DmwsdlDMSAG.__nameSpace);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeNameSpaceReferenceMV(DmwsdlDMSAG.__nameSpace), value);
        else
            attr = del(DmwsdlDMSAG.__nameSpace, value);
        
        return(attr);
    }

    /**
     * Removes the nameSpace attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1355)
    public void remNameSpace(){
         rem(DmwsdlDMSAG.__nameSpace);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:784)
    public String getTargetNameSpace(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(DmwsdlDMSAG.__targetNameSpace);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets targetNameSpace to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:824)
    public void setTargetNameSpace(String value) {
        DmcAttribute<?> attr = get(DmwsdlDMSAG.__targetNameSpace);
        if (attr == null)
            attr = new DmcTypeStringSV(DmwsdlDMSAG.__targetNameSpace);
        
        try{
            attr.set(value);
            set(DmwsdlDMSAG.__targetNameSpace,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets targetNameSpace to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:877)
    public void setTargetNameSpace(Object value) throws DmcValueException {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(DmwsdlDMSAG.__targetNameSpace);
        if (attr == null)
            attr = new DmcTypeStringSV(DmwsdlDMSAG.__targetNameSpace);
        
        attr.set(value);
        set(DmwsdlDMSAG.__targetNameSpace,attr);
    }

    /**
     * Removes the targetNameSpace attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:897)
    public void remTargetNameSpace(){
         rem(DmwsdlDMSAG.__targetNameSpace);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:784)
    public String getServiceTitle(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(DmwsdlDMSAG.__serviceTitle);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets serviceTitle to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:824)
    public void setServiceTitle(String value) {
        DmcAttribute<?> attr = get(DmwsdlDMSAG.__serviceTitle);
        if (attr == null)
            attr = new DmcTypeStringSV(DmwsdlDMSAG.__serviceTitle);
        
        try{
            attr.set(value);
            set(DmwsdlDMSAG.__serviceTitle,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets serviceTitle to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:877)
    public void setServiceTitle(Object value) throws DmcValueException {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(DmwsdlDMSAG.__serviceTitle);
        if (attr == null)
            attr = new DmcTypeStringSV(DmwsdlDMSAG.__serviceTitle);
        
        attr.set(value);
        set(DmwsdlDMSAG.__serviceTitle,attr);
    }

    /**
     * Removes the serviceTitle attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:897)
    public void remServiceTitle(){
         rem(DmwsdlDMSAG.__serviceTitle);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:655)
    public WsdlBindingREF getBinding(){
        DmcTypeWsdlBindingREFSV attr = (DmcTypeWsdlBindingREFSV) get(DmwsdlDMSAG.__binding);
        if (attr == null)
            return(null);

        if (DmcOmni.instance().lazyResolution()){
            if (attr.doLazyResolution(this)){
                rem(attr.getAttributeInfo());
                return(null);
            }
        }

        return(attr.getSV());
    }

    /**
     * Returns the reference to WsdlBinding without attempting lazy resolution (if turned on).
     */
    public WsdlBindingREF getBindingREF(){
        DmcTypeWsdlBindingREFSV attr = (DmcTypeWsdlBindingREFSV) get(DmwsdlDMSAG.__binding);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets binding to the specified value.
     * @param value WsdlBindingDMO
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:709)
    public void setBinding(WsdlBindingDMO value) {
        DmcAttribute<?> attr = get(DmwsdlDMSAG.__binding);
        if (attr == null)
            attr = new DmcTypeWsdlBindingREFSV(DmwsdlDMSAG.__binding);
        else
            ((DmcTypeWsdlBindingREFSV)attr).removeBackReferences();
        
        try{
            attr.set(value);
            set(DmwsdlDMSAG.__binding,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets binding to the specified value.
     * @param value A value compatible with DmcTypeWsdlBindingREFSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:877)
    public void setBinding(Object value) throws DmcValueException {
        DmcTypeWsdlBindingREFSV attr  = (DmcTypeWsdlBindingREFSV) get(DmwsdlDMSAG.__binding);
        if (attr == null)
            attr = new DmcTypeWsdlBindingREFSV(DmwsdlDMSAG.__binding);
        else
            attr.removeBackReferences();
        
        attr.set(value);
        set(DmwsdlDMSAG.__binding,attr);
    }

    /**
     * Removes the binding attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:897)
    public void remBinding(){
         rem(DmwsdlDMSAG.__binding);
    }




}
