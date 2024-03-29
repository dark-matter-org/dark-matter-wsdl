package org.dmd.wsdl.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:442)
import org.dmd.dmc.*;                                             // If any attributes - (BaseDMWGenerator.java:1087)
import org.dmd.dmc.definitions.DmcDefinitionIF;                   // The object is a domain specific definition - (BaseDMWGenerator.java:411)
import org.dmd.dmc.types.DefinitionName;                          // Is named by - (BaseDMWGenerator.java:1062)
import org.dmd.dms.ClassDefinition;                               // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:1067)
import org.dmd.dms.generated.dmo.MetaDMSAG;                       // Required for MODREC constructor - (BaseDMWGenerator.java:1072)
import org.dmd.dms.generated.types.DmcTypeModifierMV;             // Required for MODREC constructor - (BaseDMWGenerator.java:1071)
import org.dmd.wsdl.server.extended.WsdlDefinition;               // Derived class - (BaseDMWGenerator.java:1248)
import org.dmd.wsdl.server.extended.XsElement;                    // Required for getModificationRecorder() - (BaseDMWGenerator.java:1076)
import org.dmd.wsdl.server.extended.XsType;                       // Is reference type - (BaseDMWGenerator.java:1107)
import org.dmd.wsdl.shared.generated.dmo.XsElementDMO;            // Class not auxiliary or abstract - (BaseDMWGenerator.java:1252)
import org.dmd.wsdl.shared.generated.types.WsdlModuleREF;         // Required to access defined in module name - (DMWGenerator.java:180)
import org.dmd.wsdl.shared.generated.types.XsTypeREF;             // Is reference type REF - (BaseDMWGenerator.java:1115)



/**
 * This is representative of an XML schema element, which pretty much aligns
 * to a dark-matter\n attribute definition. I've cheated a bit by defining it
 * here as a part of this DSL. In reality, there would\n be a separate XML
 * schema DSL (lets call it XmlSchemaModule) that the WsdlModule would
 * indicate via the\n refersToDefsFromDSD attribute.
 * <P>
 * Generated from the dmwsdl schema at version unknown
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:479)
 */
abstract public class XsElementDMW extends WsdlDefinition implements DmcDefinitionIF, DmcNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:558)
    public XsElementDMW() {
        super(new XsElementDMO(), org.dmd.wsdl.server.generated.DmwsdlSchemaAG._XsElement);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:564)
    public XsElementDMW(DmcTypeModifierMV mods) {
        super(new XsElementDMO(mods), org.dmd.wsdl.server.generated.DmwsdlSchemaAG._XsElement);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:606)
    public XsElement getModificationRecorder(){
        XsElement rc = new XsElement();
        rc.setName(getName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:627)
    public XsElementDMW(XsElementDMO obj) {
        super(obj, org.dmd.wsdl.server.generated.DmwsdlSchemaAG._XsElement);
    }

    public XsElement cloneIt() {
        XsElement rc = new XsElement();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public XsElementDMO getDMO() {
        return((XsElementDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:642)
    protected XsElementDMW(XsElementDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.getAccessFunctions(BaseDMWGenerator.java:1297)
    public DefinitionName getObjectName(){
        return(((XsElementDMO) core).getName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((XsElementDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof XsElementDMW){
            return( getObjectName().equals( ((XsElementDMW) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public DefinitionName getName(){
        return(((XsElementDMO) core).getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeDefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1584)
    public void setName(Object value) throws DmcValueException {
        ((XsElementDMO) core).setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value DefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1593)
    public void setName(DefinitionName value){
        ((XsElementDMO) core).setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1619)
    public void remName(){
        ((XsElementDMO) core).remName();
    }

    /**
     * @return A XsType object.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1434)
    public XsType getXstype(){
        XsTypeREF ref = ((XsElementDMO) core).getXstype();
        if (ref == null)
            return(null);
        
        if (ref.getObject() == null)
            return(null);
        
        return((XsType)ref.getObject().getContainer());
    }

    /**
     * Sets the xstype to the specified value.
     * @param value A value compatible with XsTypeREF
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1519)
    public void setXstype(XsType value) {
        ((XsElementDMO) core).setXstype(value.getDMO());
    }

    /**
     * Sets the xstype to the specified value.
     * @param value A value compatible with XsTypeREF
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1528)
    public void setXstype(Object value) throws DmcValueException {
        ((XsElementDMO) core).setXstype(value);
    }

    /**
     * Removes the xstype attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1619)
    public void remXstype(){
        ((XsElementDMO) core).remXstype();
    }

    // Generated from: org.dmd.dmg.generators.DMWGenerator.dumpAdditionalWrapperFunctions(DMWGenerator.java:221)
    /**
     * This method indicates the name of the module from which this definition was loaded.
     */
    @Override
    public String getNameOfModuleWhereThisCameFrom(){
        WsdlModuleREF ref = ((XsElementDMO) core).getDefinedInWsdlModule();
        return(ref.getName().getNameString());
    }


}
