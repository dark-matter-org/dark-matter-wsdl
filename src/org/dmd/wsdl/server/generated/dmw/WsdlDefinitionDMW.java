package org.dmd.wsdl.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:442)
import java.util.ArrayList;                                         // Support for MULTI attribute - (BaseDMWGenerator.java:2226)
import java.util.Iterator;                                          // Support copy of MV objects - (BaseDMWGenerator.java:2240)
import org.dmd.dmc.*;                                               // If any attributes - (BaseDMWGenerator.java:1087)
import org.dmd.dmc.definitions.DmcDefinitionIF;                     // The object is a domain specific definition - (BaseDMWGenerator.java:411)
import org.dmd.dmc.types.DefinitionName;                            // Is named by - (BaseDMWGenerator.java:1062)
import org.dmd.dmc.types.DotName;                                   // Primitive type - (BaseDMWGenerator.java:1150)
import org.dmd.dms.ClassDefinition;                                 // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:1067)
import org.dmd.dms.DSDefinition;                                    // Derived class - (BaseDMWGenerator.java:1248)
import org.dmd.dms.generated.dmo.MetaDMSAG;                         // Attribute description from the meta schema - (BaseDMWGenerator.java:897)
import org.dmd.dms.generated.dmw.StringIterableDMW;                 // For multi-valued String - (BaseDMWGenerator.java:2103)
import org.dmd.wsdl.server.extended.WsdlDefinition;                 // Required for getModificationRecorder() - (BaseDMWGenerator.java:1076)
import org.dmd.wsdl.server.extended.WsdlModule;                     // Is reference type - (BaseDMWGenerator.java:1107)
import org.dmd.wsdl.shared.generated.dmo.WsdlDefinitionDMO;         // Abstract class - (BaseDMWGenerator.java:1230)
import org.dmd.wsdl.shared.generated.types.WsdlModuleREF;           // Is reference type REF - (BaseDMWGenerator.java:1115)



/**
 * The WsdlDefinition provides a common base for all dm-wsdl related
 * definitions.
 * <P>
 * Generated from the dmwsdl schema at version unknown
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:479)
 */
abstract public class WsdlDefinitionDMW extends DSDefinition implements DmcDefinitionIF, DmcNamedObjectIF {

    protected WsdlDefinitionDMW() {
        super();
    }

    abstract public WsdlDefinition getModificationRecorder();

    public WsdlDefinitionDMO getDMO() {
        return((WsdlDefinitionDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:642)
    protected WsdlDefinitionDMW(WsdlDefinitionDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.getAccessFunctions(BaseDMWGenerator.java:1297)
    public DefinitionName getObjectName(){
        return(((WsdlDefinitionDMO) core).getName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((WsdlDefinitionDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof WsdlDefinitionDMW){
            return( getObjectName().equals( ((WsdlDefinitionDMW) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @return A WsdlModule object.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1434)
    public WsdlModule getDefinedInWsdlModule(){
        WsdlModuleREF ref = ((WsdlDefinitionDMO) core).getDefinedInWsdlModule();
        if (ref == null)
            return(null);
        
        if (ref.getObject() == null)
            return(null);
        
        return((WsdlModule)ref.getObject().getContainer());
    }

    /**
     * Sets the definedInWsdlModule to the specified value.
     * @param value A value compatible with WsdlModuleREF
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1519)
    public void setDefinedInWsdlModule(WsdlModule value) {
        ((WsdlDefinitionDMO) core).setDefinedInWsdlModule(value.getDMO());
    }

    /**
     * Sets the definedInWsdlModule to the specified value.
     * @param value A value compatible with WsdlModuleREF
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1528)
    public void setDefinedInWsdlModule(Object value) throws DmcValueException {
        ((WsdlDefinitionDMO) core).setDefinedInWsdlModule(value);
    }

    /**
     * Removes the definedInWsdlModule attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1619)
    public void remDefinedInWsdlModule(){
        ((WsdlDefinitionDMO) core).remDefinedInWsdlModule();
    }

    /**
     * @return The number of String items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1671)
    public int getDescriptionSize(){
        return(((WsdlDefinitionDMO) core).getDescriptionSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1679)
    public boolean getDescriptionIsEmpty(){
        if (((WsdlDefinitionDMO) core).getDescriptionSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1689)
    public boolean getDescriptionHasValue(){
        if (((WsdlDefinitionDMO) core).getDescriptionSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2107)
    public StringIterableDMW getDescriptionIterable(){
        DmcAttribute<?> attr = core.get(MetaDMSAG.__description);
        if (attr == null)
            return(StringIterableDMW.emptyList);
        
        return(new StringIterableDMW(((WsdlDefinitionDMO) core).getDescription()));
    }

    /**
     * Adds another description value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2133)
    public void addDescription(Object value) throws DmcValueException {
        ((WsdlDefinitionDMO) core).addDescription(value);
    }

    /**
     * Adds another description value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2143)
    public void addDescription(String value){
        ((WsdlDefinitionDMO) core).addDescription(value);
    }

    /**
     * Returns true if the collection contains the description value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2200)
    public boolean descriptionContains(String value){
        return(((WsdlDefinitionDMO) core).descriptionContains(value));
    }

    /**
     * @return A COPY of the collection of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2244)
    @SuppressWarnings("unchecked")
    public ArrayList<String> getDescriptionCopy(){
        DmcAttribute<?> attr = core.get(MetaDMSAG.__description);
        if (attr == null)
            return(new ArrayList<String>());
        
        ArrayList<String> rc = new ArrayList<String>(attr.getMVSize());
        
        Iterator<String> it = (Iterator<String>) attr.getMV();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Deletes a description value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2271)
    public void delDescription(Object value) throws DmcValueException {
        ((WsdlDefinitionDMO) core).delDescription(value);
    }

    /**
     * Deletes a description value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2280)
    public void delDescription(String value){
        ((WsdlDefinitionDMO) core).delDescription(value);
    }

    /**
     * Removes the description attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2292)
    public void remDescription(){
        ((WsdlDefinitionDMO) core).remDescription();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public DotName getDotName(){
        return(((WsdlDefinitionDMO) core).getDotName());
    }

    /**
     * Sets dotName to the specified value.
     * @param value A value compatible with DmcTypeDotName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1584)
    public void setDotName(Object value) throws DmcValueException {
        ((WsdlDefinitionDMO) core).setDotName(value);
    }

    /**
     * Sets dotName to the specified value.
     * @param value DotName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1593)
    public void setDotName(DotName value){
        ((WsdlDefinitionDMO) core).setDotName(value);
    }

    /**
     * Removes the dotName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1619)
    public void remDotName(){
        ((WsdlDefinitionDMO) core).remDotName();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public DefinitionName getName(){
        return(((WsdlDefinitionDMO) core).getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeDefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1584)
    public void setName(Object value) throws DmcValueException {
        ((WsdlDefinitionDMO) core).setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value DefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1593)
    public void setName(DefinitionName value){
        ((WsdlDefinitionDMO) core).setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1619)
    public void remName(){
        ((WsdlDefinitionDMO) core).remName();
    }


}