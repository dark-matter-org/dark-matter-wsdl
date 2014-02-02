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
package org.dmd.wsdl.server.generated.dsd;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:144)
import java.util.Iterator;                                                  // To allow access to our definitions - (DSDArtifactFormatter.java:131)
import org.dmd.dmc.DmcAttributeInfo;                                        // Used when resolving clashes - (DSDArtifactFormatter.java:140)
import org.dmd.dmc.DmcNameClashException;                                   // Used when resolving clashes - (DSDArtifactFormatter.java:142)
import org.dmd.dmc.DmcNameClashObjectSet;                                   // Used when resolving clashes - (DSDArtifactFormatter.java:141)
import org.dmd.dmc.DmcNameClashResolverIF;                                  // To support object resolution - (DSDArtifactFormatter.java:133)
import org.dmd.dmc.DmcNameResolverWithClashSupportIF;                       // To support object resolution - (DSDArtifactFormatter.java:134)
import org.dmd.dmc.DmcNamedObjectIF;                                        // To support object resolution - (DSDArtifactFormatter.java:135)
import org.dmd.dmc.DmcObject;                                               // To support object resolution - (DSDArtifactFormatter.java:136)
import org.dmd.dmc.DmcObjectName;                                           // To support object resolution - (DSDArtifactFormatter.java:137)
import org.dmd.dmc.DmcValueException;                                       // Can be thrown when we try to resolve references - (DSDArtifactFormatter.java:139)
import org.dmd.dmc.DmcValueExceptionSet;                                    // Can be thrown when we try to resolve references - (DSDArtifactFormatter.java:138)
import org.dmd.dmc.definitions.DmcDefinitionSet;                            // Our base to provide definition set storage - (DSDArtifactFormatter.java:130)
import org.dmd.dmc.types.DotName;                                           // To support the find method for definitions - (DSDArtifactFormatter.java:132)
import org.dmd.dms.DSDefinition;                                            // The base of all definitions - (DSDArtifactFormatter.java:129)
import org.dmd.wsdl.server.extended.WsdlBinding;                            // A definition from the WsdlModule Module - (DSDArtifactFormatter.java:281)
import org.dmd.wsdl.server.extended.WsdlDefinition;                         // A definition from the WsdlModule Module - (DSDArtifactFormatter.java:277)
import org.dmd.wsdl.server.extended.WsdlDescription;                        // A definition from the WsdlModule Module - (DSDArtifactFormatter.java:281)
import org.dmd.wsdl.server.extended.WsdlFault;                              // A definition from the WsdlModule Module - (DSDArtifactFormatter.java:281)
import org.dmd.wsdl.server.extended.WsdlInterface;                          // A definition from the WsdlModule Module - (DSDArtifactFormatter.java:281)
import org.dmd.wsdl.server.extended.WsdlModule;                             // A definition from the WsdlModule Module - (DSDArtifactFormatter.java:281)
import org.dmd.wsdl.server.extended.WsdlOperation;                          // A definition from the WsdlModule Module - (DSDArtifactFormatter.java:281)
import org.dmd.wsdl.server.extended.WsdlService;                            // A definition from the WsdlModule Module - (DSDArtifactFormatter.java:281)
import org.dmd.wsdl.server.extended.XsComplexType;                          // A definition from the WsdlModule Module - (DSDArtifactFormatter.java:281)
import org.dmd.wsdl.server.extended.XsElement;                              // A definition from the WsdlModule Module - (DSDArtifactFormatter.java:281)
import org.dmd.wsdl.server.extended.XsSchema;                               // A definition from the WsdlModule Module - (DSDArtifactFormatter.java:281)
import org.dmd.wsdl.server.extended.XsType;                                 // A definition from the WsdlModule Module - (DSDArtifactFormatter.java:281)
import org.dmd.wsdl.server.generated.dsd.WsdlModuleGlobalInterface;         // Interface for WsdlModule definitions - (DSDArtifactFormatter.java:274)


// Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:148)
public class WsdlModuleDefinitionManager implements DmcNameClashResolverIF, DmcNameResolverWithClashSupportIF, WsdlModuleGlobalInterface {

    DmcDefinitionSet<DSDefinition>	allDefinitions;

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.dumpDefinitionManagerMembers(DSDArtifactFormatter.java:300)
    DmcDefinitionSet<WsdlDefinition> WsdlDefinitionDefs;
    DmcDefinitionSet<WsdlBinding> WsdlBindingDefs;
    DmcDefinitionSet<WsdlDescription> WsdlDescriptionDefs;
    DmcDefinitionSet<WsdlFault> WsdlFaultDefs;
    DmcDefinitionSet<WsdlInterface> WsdlInterfaceDefs;
    DmcDefinitionSet<WsdlModule> WsdlModuleDefs;
    DmcDefinitionSet<WsdlOperation> WsdlOperationDefs;
    DmcDefinitionSet<WsdlService> WsdlServiceDefs;
    DmcDefinitionSet<XsComplexType> XsComplexTypeDefs;
    DmcDefinitionSet<XsElement> XsElementDefs;
    DmcDefinitionSet<XsSchema> XsSchemaDefs;
    DmcDefinitionSet<XsType> XsTypeDefs;

    public WsdlModuleDefinitionManager(){

        // This will be populated as a result of adding definitions to the definition sets for each definition type
        allDefinitions = new DmcDefinitionSet<DSDefinition>("allDefinitions");

        // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.initializeDefinitionManagerMembers(DSDArtifactFormatter.java:327)
        WsdlDefinitionDefs = new DmcDefinitionSet<WsdlDefinition>("WsdlDefinition", allDefinitions);
        WsdlBindingDefs = new DmcDefinitionSet<WsdlBinding>("WsdlBinding", allDefinitions);
        WsdlDescriptionDefs = new DmcDefinitionSet<WsdlDescription>("WsdlDescription", allDefinitions);
        WsdlFaultDefs = new DmcDefinitionSet<WsdlFault>("WsdlFault", allDefinitions);
        WsdlInterfaceDefs = new DmcDefinitionSet<WsdlInterface>("WsdlInterface", allDefinitions);
        WsdlModuleDefs = new DmcDefinitionSet<WsdlModule>("WsdlModule", allDefinitions);
        WsdlOperationDefs = new DmcDefinitionSet<WsdlOperation>("WsdlOperation", allDefinitions);
        WsdlServiceDefs = new DmcDefinitionSet<WsdlService>("WsdlService", allDefinitions);
        XsComplexTypeDefs = new DmcDefinitionSet<XsComplexType>("XsComplexType", allDefinitions);
        XsElementDefs = new DmcDefinitionSet<XsElement>("XsElement", allDefinitions);
        XsSchemaDefs = new DmcDefinitionSet<XsSchema>("XsSchema", allDefinitions);
        XsTypeDefs = new DmcDefinitionSet<XsType>("XsType", allDefinitions);

    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:164)
    public void resolveReferences() throws DmcValueExceptionSet {
        for(DSDefinition def: allDefinitions.values()){
            def.resolveReferences(this,this);
        }
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:172)
    @Override
    public DmcNamedObjectIF findNamedObject(DmcObjectName name) {
        DSDefinition def = null;
        try {
    	       def = allDefinitions.getDefinition(name.toString());
        } catch (DmcNameClashException e) {
    	       // TODO Auto-generated catch block
    	       e.printStackTrace();
        } catch (DmcValueException e) {
    	       // TODO Auto-generated catch block
    	       e.printStackTrace();
        }

        return(def);
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:189)
    @Override
    public DmcNamedObjectIF findNamedObject(DmcObjectName name, int attributeID) {
        throw(new IllegalStateException("This method is not supported on generated definition managers"));
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:195)
    @Override
    public DmcObject findNamedDMO(DmcObjectName name) {
        DSDefinition def = null;
        try {
    	       def = allDefinitions.getDefinition(name.toString());
        } catch (DmcNameClashException e) {
    	       // TODO Auto-generated catch block
    	       e.printStackTrace();
        } catch (DmcValueException e) {
    	       // TODO Auto-generated catch block
    	       e.printStackTrace();
        }

        if (def==null)
            return(null);

        return(def.getDMO());
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:215)
    @Override
    public DmcNamedObjectIF findNamedObjectMayClash(DmcObject object, DmcObjectName name, DmcNameClashResolverIF resolver, DmcAttributeInfo ai) throws DmcValueException {
        DmcNamedObjectIF rc = null;
        DotName dn = new DotName(name.getNameString() + "." + ai.type);
    
        // The name might contain module.defname, in which case we'll try to look it up
        // using a fully qualified DotName of the form module.defname.type. Otherwise,
        // we use the getDefinitionByNameAndType() form of the lookup.
        if (name.getNameString().indexOf(".") == -1){
            try{
                rc = allDefinitions.getDefinitionByNameAndType(dn);
            } catch (DmcNameClashException e) {
                rc = resolver.resolveClash(object, ai, e.getClashSet());
            }
        }
        else{
            rc = allDefinitions.getDefinition(dn);
        }
    
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:238)
    @Override
    public DmcNamedObjectIF resolveClash(DmcObject obj, DmcAttributeInfo ai, DmcNameClashObjectSet<?> ncos) throws DmcValueException {
        DmcNamedObjectIF rc = null;
        DSDefinition resolving = (DSDefinition) obj.getContainer();
    
        Iterator<DmcNamedObjectIF> it = ncos.getMatches();
        while(it.hasNext()){
            DSDefinition def = (DSDefinition) it.next();
            if (resolving.getNameOfModuleWhereThisCameFrom().equals(def.getNameOfModuleWhereThisCameFrom())){
                rc = def;
                break;
            }
        }
        return(rc);
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:219)
    // Called from: org.dmd.dmg.generators.DSDArtifactFormatter.dumpDefinitionInterfaceMethods(DSDArtifactFormatter.java:321)
    /**
     * All definitions are added to the base definition collection.
     */
    void addWsdlDefinition(WsdlDefinition def){
        WsdlDefinitionDefs.add(def);
    }

    public int getWsdlDefinitionCount(){
        return(WsdlDefinitionDefs.size());
    }

    public WsdlDefinition getWsdlDefinition(DotName name){
        return(WsdlDefinitionDefs.getDefinition(name));
    }

    public Iterator<WsdlDefinition> getAllWsdlDefinition(){
        return(WsdlDefinitionDefs.values().iterator());
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:254)
    public void addWsdlBinding(WsdlBinding def){
        WsdlBindingDefs.add(def);
        addWsdlDefinition(def);
    }

    public int getWsdlBindingCount(){
        return(WsdlBindingDefs.size());
    }

    public WsdlBinding getWsdlBinding(DotName name){
        return(WsdlBindingDefs.getDefinition(name));
    }

    public Iterator<WsdlBinding> getAllWsdlBinding(){
        return(WsdlBindingDefs.values().iterator());
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:254)
    public void addWsdlDescription(WsdlDescription def){
        WsdlDescriptionDefs.add(def);
        addWsdlDefinition(def);
    }

    public int getWsdlDescriptionCount(){
        return(WsdlDescriptionDefs.size());
    }

    public WsdlDescription getWsdlDescription(DotName name){
        return(WsdlDescriptionDefs.getDefinition(name));
    }

    public Iterator<WsdlDescription> getAllWsdlDescription(){
        return(WsdlDescriptionDefs.values().iterator());
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:254)
    public void addWsdlFault(WsdlFault def){
        WsdlFaultDefs.add(def);
        addWsdlDefinition(def);
    }

    public int getWsdlFaultCount(){
        return(WsdlFaultDefs.size());
    }

    public WsdlFault getWsdlFault(DotName name){
        return(WsdlFaultDefs.getDefinition(name));
    }

    public Iterator<WsdlFault> getAllWsdlFault(){
        return(WsdlFaultDefs.values().iterator());
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:254)
    public void addWsdlInterface(WsdlInterface def){
        WsdlInterfaceDefs.add(def);
        addWsdlDefinition(def);
    }

    public int getWsdlInterfaceCount(){
        return(WsdlInterfaceDefs.size());
    }

    public WsdlInterface getWsdlInterface(DotName name){
        return(WsdlInterfaceDefs.getDefinition(name));
    }

    public Iterator<WsdlInterface> getAllWsdlInterface(){
        return(WsdlInterfaceDefs.values().iterator());
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:254)
    public void addWsdlModule(WsdlModule def){
        WsdlModuleDefs.add(def);
        addWsdlDefinition(def);
    }

    public int getWsdlModuleCount(){
        return(WsdlModuleDefs.size());
    }

    public WsdlModule getWsdlModule(DotName name){
        return(WsdlModuleDefs.getDefinition(name));
    }

    public Iterator<WsdlModule> getAllWsdlModule(){
        return(WsdlModuleDefs.values().iterator());
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:254)
    public void addWsdlOperation(WsdlOperation def){
        WsdlOperationDefs.add(def);
        addWsdlDefinition(def);
    }

    public int getWsdlOperationCount(){
        return(WsdlOperationDefs.size());
    }

    public WsdlOperation getWsdlOperation(DotName name){
        return(WsdlOperationDefs.getDefinition(name));
    }

    public Iterator<WsdlOperation> getAllWsdlOperation(){
        return(WsdlOperationDefs.values().iterator());
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:254)
    public void addWsdlService(WsdlService def){
        WsdlServiceDefs.add(def);
        addWsdlDefinition(def);
    }

    public int getWsdlServiceCount(){
        return(WsdlServiceDefs.size());
    }

    public WsdlService getWsdlService(DotName name){
        return(WsdlServiceDefs.getDefinition(name));
    }

    public Iterator<WsdlService> getAllWsdlService(){
        return(WsdlServiceDefs.values().iterator());
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:254)
    public void addXsComplexType(XsComplexType def){
        XsComplexTypeDefs.add(def);
        addXsType(def);
    }

    public int getXsComplexTypeCount(){
        return(XsComplexTypeDefs.size());
    }

    public XsComplexType getXsComplexType(DotName name){
        return(XsComplexTypeDefs.getDefinition(name));
    }

    public Iterator<XsComplexType> getAllXsComplexType(){
        return(XsComplexTypeDefs.values().iterator());
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:254)
    public void addXsElement(XsElement def){
        XsElementDefs.add(def);
        addWsdlDefinition(def);
    }

    public int getXsElementCount(){
        return(XsElementDefs.size());
    }

    public XsElement getXsElement(DotName name){
        return(XsElementDefs.getDefinition(name));
    }

    public Iterator<XsElement> getAllXsElement(){
        return(XsElementDefs.values().iterator());
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:254)
    public void addXsSchema(XsSchema def){
        XsSchemaDefs.add(def);
        addWsdlDefinition(def);
    }

    public int getXsSchemaCount(){
        return(XsSchemaDefs.size());
    }

    public XsSchema getXsSchema(DotName name){
        return(XsSchemaDefs.getDefinition(name));
    }

    public Iterator<XsSchema> getAllXsSchema(){
        return(XsSchemaDefs.values().iterator());
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:254)
    public void addXsType(XsType def){
        XsTypeDefs.add(def);
        addWsdlDefinition(def);
    }

    public int getXsTypeCount(){
        return(XsTypeDefs.size());
    }

    public XsType getXsType(DotName name){
        return(XsTypeDefs.getDefinition(name));
    }

    public Iterator<XsType> getAllXsType(){
        return(XsTypeDefs.values().iterator());
    }


}

