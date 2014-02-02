package org.dmd.wsdl.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:442)
import java.util.ArrayList;                                                // To support getMVCopy() - (BaseDMWGenerator.java:1181)
import org.dmd.dmc.*;                                                      // If any attributes - (BaseDMWGenerator.java:1087)
import org.dmd.dmc.definitions.DmcDefinitionIF;                            // The object is a domain specific definition - (BaseDMWGenerator.java:411)
import org.dmd.dmc.types.DefinitionName;                                   // Is named by - (BaseDMWGenerator.java:1062)
import org.dmd.dms.ClassDefinition;                                        // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:1067)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                // Required for MODREC constructor - (BaseDMWGenerator.java:1072)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                      // Required for MODREC constructor - (BaseDMWGenerator.java:1071)
import org.dmd.wsdl.server.extended.WsdlDefinition;                        // Derived class - (BaseDMWGenerator.java:1248)
import org.dmd.wsdl.server.extended.WsdlFault;                             // Is reference type - (BaseDMWGenerator.java:1107)
import org.dmd.wsdl.server.extended.WsdlInterface;                         // Required for getModificationRecorder() - (BaseDMWGenerator.java:1076)
import org.dmd.wsdl.server.extended.WsdlOperation;                         // Is reference type - (BaseDMWGenerator.java:1107)
import org.dmd.wsdl.server.generated.dmw.WsdlFaultIterableDMW;             // For multi-valued WsdlFault - (BaseDMWGenerator.java:1709)
import org.dmd.wsdl.server.generated.dmw.WsdlOperationIterableDMW;         // For multi-valued WsdlOperation - (BaseDMWGenerator.java:1709)
import org.dmd.wsdl.shared.generated.dmo.DmwsdlDMSAG;                      // Attribute faults from the dmwsdl schema - (BaseDMWGenerator.java:897)
import org.dmd.wsdl.shared.generated.dmo.WsdlFaultDMO;                     // For multi-valued adds of WsdlFault - (BaseDMWGenerator.java:1767)
import org.dmd.wsdl.shared.generated.dmo.WsdlInterfaceDMO;                 // Class not auxiliary or abstract - (BaseDMWGenerator.java:1252)
import org.dmd.wsdl.shared.generated.dmo.WsdlOperationDMO;                 // For multi-valued adds of WsdlOperation - (BaseDMWGenerator.java:1767)
import org.dmd.wsdl.shared.generated.types.WsdlModuleREF;                  // Required to access defined in module name - (DMWGenerator.java:180)



/**
 * A WSDL 2.0 interface defines the abstract interface of a Web service as a
 * set of abstract\n operations, each operation representing a simple
 * interaction between the client and the service.\n Each operation specifies
 * the types of messages that the service can send or receive as part of that
 * operation.
 * <P>
 * Generated from the dmwsdl schema at version unknown
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:479)
 */
abstract public class WsdlInterfaceDMW extends WsdlDefinition implements DmcDefinitionIF, DmcNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:558)
    public WsdlInterfaceDMW() {
        super(new WsdlInterfaceDMO(), org.dmd.wsdl.server.generated.DmwsdlSchemaAG._WsdlInterface);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:564)
    public WsdlInterfaceDMW(DmcTypeModifierMV mods) {
        super(new WsdlInterfaceDMO(mods), org.dmd.wsdl.server.generated.DmwsdlSchemaAG._WsdlInterface);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:606)
    public WsdlInterface getModificationRecorder(){
        WsdlInterface rc = new WsdlInterface();
        rc.setName(getName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:627)
    public WsdlInterfaceDMW(WsdlInterfaceDMO obj) {
        super(obj, org.dmd.wsdl.server.generated.DmwsdlSchemaAG._WsdlInterface);
    }

    public WsdlInterface cloneIt() {
        WsdlInterface rc = new WsdlInterface();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public WsdlInterfaceDMO getDMO() {
        return((WsdlInterfaceDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:642)
    protected WsdlInterfaceDMW(WsdlInterfaceDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.getAccessFunctions(BaseDMWGenerator.java:1297)
    public DefinitionName getObjectName(){
        return(((WsdlInterfaceDMO) core).getName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((WsdlInterfaceDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof WsdlInterfaceDMW){
            return( getObjectName().equals( ((WsdlInterfaceDMW) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @return The number of WsdlFault items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1671)
    public int getFaultsSize(){
        return(((WsdlInterfaceDMO) core).getFaultsSize());
    }

    /**
     * @return true if there are no WsdlFaultDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1679)
    public boolean getFaultsIsEmpty(){
        if (((WsdlInterfaceDMO) core).getFaultsSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any WsdlFaultDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1689)
    public boolean getFaultsHasValue(){
        if (((WsdlInterfaceDMO) core).getFaultsSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of WsdlFaultDMO objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1716)
    public WsdlFaultIterableDMW getFaultsIterable(){
        DmcAttribute<?> attr = core.get(DmwsdlDMSAG.__faults);
        if (attr == null)
            return(WsdlFaultIterableDMW.emptyList);
        
        return(new WsdlFaultIterableDMW(((WsdlInterfaceDMO) core).getFaults()));
    }

    /**
     * Adds another faults value.
     * @param value A value compatible with WsdlFault
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1773)
    public DmcAttribute<?> addFaults(WsdlFault value){
        DmcAttribute<?> attr = ((WsdlInterfaceDMO) core).addFaults(((WsdlFaultDMO)value.getDmcObject()));
        return(attr);
    }

    /**
     * Deletes a faults value.
     * @param value The WsdlFault to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1823)
    public void delFaults(WsdlFault value){
        ((WsdlInterfaceDMO) core).delFaults(value.getDMO());
    }

    /**
     * @return A COPY of the collection of WsdlFault objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1887)
    public ArrayList<WsdlFault> getFaultsCopy(){
        DmcAttribute<?> attr = ((WsdlInterfaceDMO) core).get(DmwsdlDMSAG.__faults);
        if (attr == null)
            return(new ArrayList<WsdlFault>());
        
        ArrayList<WsdlFault> rc = new ArrayList<WsdlFault>(attr.getMVSize());
        
        WsdlFaultIterableDMW it = getFaultsIterable();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Removes the faults attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2292)
    public void remFaults(){
        ((WsdlInterfaceDMO) core).remFaults();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public DefinitionName getName(){
        return(((WsdlInterfaceDMO) core).getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeDefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1584)
    public void setName(Object value) throws DmcValueException {
        ((WsdlInterfaceDMO) core).setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value DefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1593)
    public void setName(DefinitionName value){
        ((WsdlInterfaceDMO) core).setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1619)
    public void remName(){
        ((WsdlInterfaceDMO) core).remName();
    }

    /**
     * @return The number of WsdlOperation items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1671)
    public int getOperationsSize(){
        return(((WsdlInterfaceDMO) core).getOperationsSize());
    }

    /**
     * @return true if there are no WsdlOperationDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1679)
    public boolean getOperationsIsEmpty(){
        if (((WsdlInterfaceDMO) core).getOperationsSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any WsdlOperationDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1689)
    public boolean getOperationsHasValue(){
        if (((WsdlInterfaceDMO) core).getOperationsSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of WsdlOperationDMO objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1716)
    public WsdlOperationIterableDMW getOperationsIterable(){
        DmcAttribute<?> attr = core.get(DmwsdlDMSAG.__operations);
        if (attr == null)
            return(WsdlOperationIterableDMW.emptyList);
        
        return(new WsdlOperationIterableDMW(((WsdlInterfaceDMO) core).getOperations()));
    }

    /**
     * Adds another operations value.
     * @param value A value compatible with WsdlOperation
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1773)
    public DmcAttribute<?> addOperations(WsdlOperation value){
        DmcAttribute<?> attr = ((WsdlInterfaceDMO) core).addOperations(((WsdlOperationDMO)value.getDmcObject()));
        return(attr);
    }

    /**
     * Deletes a operations value.
     * @param value The WsdlOperation to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1823)
    public void delOperations(WsdlOperation value){
        ((WsdlInterfaceDMO) core).delOperations(value.getDMO());
    }

    /**
     * @return A COPY of the collection of WsdlOperation objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1887)
    public ArrayList<WsdlOperation> getOperationsCopy(){
        DmcAttribute<?> attr = ((WsdlInterfaceDMO) core).get(DmwsdlDMSAG.__operations);
        if (attr == null)
            return(new ArrayList<WsdlOperation>());
        
        ArrayList<WsdlOperation> rc = new ArrayList<WsdlOperation>(attr.getMVSize());
        
        WsdlOperationIterableDMW it = getOperationsIterable();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Removes the operations attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2292)
    public void remOperations(){
        ((WsdlInterfaceDMO) core).remOperations();
    }

    // Generated from: org.dmd.dmg.generators.DMWGenerator.dumpAdditionalWrapperFunctions(DMWGenerator.java:221)
    /**
     * This method indicates the name of the module from which this definition was loaded.
     */
    @Override
    public String getNameOfModuleWhereThisCameFrom(){
        WsdlModuleREF ref = ((WsdlInterfaceDMO) core).getDefinedInWsdlModule();
        return(ref.getName().getNameString());
    }


}
