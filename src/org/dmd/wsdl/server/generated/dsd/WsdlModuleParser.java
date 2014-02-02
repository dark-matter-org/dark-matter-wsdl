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
// Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParser(DSDArtifactFormatter.java:465)
import java.util.Iterator;                                                  // To iterate over collections - (DSDArtifactFormatter.java:437)
import org.dmd.dmc.DmcNameClashException;                                   // May be thrown when instantiating objects - (DSDArtifactFormatter.java:448)
import org.dmd.dmc.DmcValueException;                                       // May be thrown when parsing objects - (DSDArtifactFormatter.java:447)
import org.dmd.dmc.definitions.DsdParserInterface;                          // Standard parser interface - (DSDArtifactFormatter.java:431)
import org.dmd.dmc.rules.DmcRuleExceptionSet;                               // May be thrown by rule manager - (DSDArtifactFormatter.java:450)
import org.dmd.dmc.rules.SourceInfo;                                        // To indicate the source of rule problems - (DSDArtifactFormatter.java:453)
import org.dmd.dmc.util.DmcUncheckedObject;                                 // Basic parsing of objects - (DSDArtifactFormatter.java:430)
import org.dmd.dms.SchemaDefinition;                                        // To support dynamic loading of schemas - (DSDArtifactFormatter.java:438)
import org.dmd.dms.SchemaManager;                                           // Manages the schemas we use - (DSDArtifactFormatter.java:426)
import org.dmd.dms.generated.dmw.StringIterableDMW;                         // To iterate over defFiles - (DSDArtifactFormatter.java:452)
import org.dmd.dmv.shared.DmvRuleManager;                                   // The injected rule manager used for initializations - (DSDArtifactFormatter.java:451)
import org.dmd.dmw.DmwObjectFactory;                                        // Constructs wrapped objects - (DSDArtifactFormatter.java:433)
import org.dmd.dmw.DmwWrapper;                                              // To handle factory created objects - (DSDArtifactFormatter.java:454)
import org.dmd.util.exceptions.ResultException;                             // May be thrown by schema management - (DSDArtifactFormatter.java:449)
import org.dmd.util.parsing.ConfigLocation;                                 // Config file location info - (DSDArtifactFormatter.java:432)
import org.dmd.util.parsing.DmcUncheckedOIFHandlerIF;                       // Basic parsing of objects - (DSDArtifactFormatter.java:429)
import org.dmd.util.parsing.DmcUncheckedOIFParser;                          // Basic parsing of objects - (DSDArtifactFormatter.java:428)
import org.dmd.wsdl.server.extended.WsdlBinding;                            // A definition from the WsdlModule Module - (DSDArtifactFormatter.java:715)
import org.dmd.wsdl.server.extended.WsdlDefinition;                         // The base definition from the WsdlModule Module - (DSDArtifactFormatter.java:707)
import org.dmd.wsdl.server.extended.WsdlDescription;                        // A definition from the WsdlModule Module - (DSDArtifactFormatter.java:715)
import org.dmd.wsdl.server.extended.WsdlFault;                              // A definition from the WsdlModule Module - (DSDArtifactFormatter.java:715)
import org.dmd.wsdl.server.extended.WsdlInterface;                          // A definition from the WsdlModule Module - (DSDArtifactFormatter.java:715)
import org.dmd.wsdl.server.extended.WsdlModule;                             // The kind of DDM we're reading - (DSDArtifactFormatter.java:458)
import org.dmd.wsdl.server.extended.WsdlOperation;                          // A definition from the WsdlModule Module - (DSDArtifactFormatter.java:715)
import org.dmd.wsdl.server.extended.WsdlService;                            // A definition from the WsdlModule Module - (DSDArtifactFormatter.java:715)
import org.dmd.wsdl.server.extended.XsComplexType;                          // A definition from the WsdlModule Module - (DSDArtifactFormatter.java:715)
import org.dmd.wsdl.server.extended.XsElement;                              // A definition from the WsdlModule Module - (DSDArtifactFormatter.java:715)
import org.dmd.wsdl.server.extended.XsSchema;                               // A definition from the WsdlModule Module - (DSDArtifactFormatter.java:715)
import org.dmd.wsdl.server.extended.XsType;                                 // A definition from the WsdlModule Module - (DSDArtifactFormatter.java:715)
import org.dmd.wsdl.server.generated.DmwsdlSchemaAG;                        // The schema recognized by this parser - (DSDArtifactFormatter.java:446)
import org.dmd.wsdl.server.generated.dsd.WsdlModuleGlobalInterface;         // Interface to our definition storage - (DSDArtifactFormatter.java:434)



// Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParser(DSDArtifactFormatter.java:468)
public class WsdlModuleParser implements DsdParserInterface, DmcUncheckedOIFHandlerIF {

    final static String fileExtension = "dmwsdl";

    // Generated from: org.dmd.util.codegen.MemberManager.getFormattedMembers(MemberManager.java:59)
    // Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParser(DSDArtifactFormatter.java:482)
    SchemaManager                schema;                                             // Manages the schema for this DSD
    DmcUncheckedOIFParser        parser         = new DmcUncheckedOIFParser(this);   // Parses objects from the config file
    DmwObjectFactory             factory;                                            // Instantiates wrapped objects
    WsdlModuleGlobalInterface    definitions;                                        // Place to store parsed definitions
    DmvRuleManager               rules;                                              // The overall rule manager
    ConfigLocation               location;                                           // The location of the config being parsed
    WsdlModule                   module;                                             // The DDM module

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParser(DSDArtifactFormatter.java:485)
    public WsdlModuleParser(WsdlModuleGlobalInterface d, DmvRuleManager r) throws ResultException, DmcValueException, DmcNameClashException {
        schema = new SchemaManager();
        schema.manageSchema(new DmwsdlSchemaAG());
        
        factory      = new DmwObjectFactory(schema);
        
        definitions  = d;
        rules        = r;
    }

    public String getFileExtension(){
        return(fileExtension);
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParser(DSDArtifactFormatter.java:500)
    public WsdlModule parseConfig(ConfigLocation l) throws ResultException, DmcValueException, DmcRuleExceptionSet, DmcNameClashException {
        location = l;

        // We're starting to parse a new config. Reset the module to null so that we only parse one module per config.
        module = null;

        if (location.isFromJAR()){
            System.out.println("Reading: " + location.getFileName() + " - from " + location.getJarFilename());
            parser.parseFile(location.getFileName(),true);
        }
        else{
            System.out.println("Reading: " + location.getFileName());
            parser.parseFile(location.getFileName());
        }

        if (module.getDefFilesHasValue()){
            StringIterableDMW it = module.getDefFilesIterable();
            while(it.hasNext()){
                String fn = location.getDirectory() + "/" + it.next();

                if (location.isFromJAR())
                    parser.parseFile(fn,true);
                else
                    parser.parseFile(fn);
            }
        }

        return(module);
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParser(DSDArtifactFormatter.java:533)
    @Override
    public void handleObject(DmcUncheckedObject uco, String infile, int lineNumber) throws ResultException, DmcValueException, DmcRuleExceptionSet, DmcNameClashException {
        WsdlDefinition definition = null;
        DmwWrapper wrapper = null;

        try{
            wrapper = factory.createWrapper(uco);
            definition = (WsdlDefinition) wrapper;
        } catch (ClassNotFoundException e) {
            ResultException ex = new ResultException("Unknown object class: " + uco.classes.get(0));
            ex.result.lastResult().fileName(infile);
            ex.result.lastResult().lineNumber(lineNumber);
            throw(ex);
        }
        catch (ResultException ex){
            ex.setLocationInfo(infile, lineNumber);
            throw(ex);
        }
        catch(DmcValueException e){
            ResultException ex = new ResultException();
            ex.addError(e.getMessage());
            if (e.getAttributeName() != null)
                ex.result.lastResult().moreMessages("Attribute: " + e.getAttributeName());
            ex.setLocationInfo(infile, lineNumber);
            throw(ex);
        }
        catch(ClassCastException e){
            ResultException ex = new ResultException();
            ex.addError("The following object is not valid in a .dmwsdl file:\n\n" + wrapper.toOIF());
            ex.setLocationInfo(infile, lineNumber);
            throw(ex);
        }

        definition.setLineNumber(lineNumber);
        definition.setFile(infile);

        try{
            // Run the rules against the definition
            rules.executeInitializers(definition.getDmcObject());
            rules.executeAttributeValidation(definition.getDmcObject());
            rules.executeObjectValidation(definition.getDmcObject());
        }
        catch(DmcRuleExceptionSet ex){
            ex.source(new SourceInfo(infile, lineNumber));
            throw(ex);
        }

        // The first definition we expect is the module definition
        if (module == null){
            if (definition instanceof WsdlModule){
                module = (WsdlModule)definition;
            
                definition.setDotName(module.getName() + "." + definition.getConstructionClassName());
                definition.setNameAndTypeName(module.getName() + "." + definition.getConstructionClassName());
            
                module.setDefinedInWsdlModule(module);
                definitions.addWsdlModule(module);
                if (module.getLoadSchemaClassHasValue()){
                    loadSchemas(module);
                }
            }
            else{
                ResultException ex = new ResultException("Expecting a WsdlModule module definition");
                ex.setLocationInfo(infile, lineNumber);
                throw(ex);
            }
        }
        else{
            // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateParser(DSDArtifactFormatter.java:607)
            if (definition instanceof WsdlModule){
                ResultException ex = new ResultException("Multiple WsdlModule definitions while parsing config: " + location.getFileName());
                ex.setLocationInfo(infile, lineNumber);
                throw(ex);
            }
            
            definition.setDefinedInWsdlModule(module);
            definition.setDotName(module.getName() + "." + definition.getName() + "." + definition.getConstructionClassName());
            definition.setNameAndTypeName(definition.getName() + "." + definition.getConstructionClassName());
            
            if (definition instanceof WsdlBinding){
                definitions.addWsdlBinding((WsdlBinding)definition);
                module.addWsdlBinding((WsdlBinding)definition);
            }
            else if (definition instanceof WsdlDescription){
                definitions.addWsdlDescription((WsdlDescription)definition);
                module.addWsdlDescription((WsdlDescription)definition);
            }
            else if (definition instanceof WsdlFault){
                definitions.addWsdlFault((WsdlFault)definition);
                module.addWsdlFault((WsdlFault)definition);
            }
            else if (definition instanceof WsdlInterface){
                definitions.addWsdlInterface((WsdlInterface)definition);
                module.addWsdlInterface((WsdlInterface)definition);
            }
            else if (definition instanceof WsdlOperation){
                definitions.addWsdlOperation((WsdlOperation)definition);
                module.addWsdlOperation((WsdlOperation)definition);
            }
            else if (definition instanceof WsdlService){
                definitions.addWsdlService((WsdlService)definition);
                module.addWsdlService((WsdlService)definition);
            }
            else if (definition instanceof XsComplexType){
                definitions.addXsComplexType((XsComplexType)definition);
                module.addXsComplexType((XsComplexType)definition);
            }
            else if (definition instanceof XsElement){
                definitions.addXsElement((XsElement)definition);
                module.addXsElement((XsElement)definition);
            }
            else if (definition instanceof XsSchema){
                definitions.addXsSchema((XsSchema)definition);
                module.addXsSchema((XsSchema)definition);
            }
            else if (definition instanceof XsType){
                definitions.addXsType((XsType)definition);
                module.addXsType((XsType)definition);
            }

        }

    }
    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.writeLoadSchemasFunction(DSDArtifactFormatter.java:645)
    void loadSchemas(WsdlModule module) throws ResultException {
    	   Class<?> schemaClass = null;
    	   SchemaDefinition sd	= null;
    	   Iterator<String> it = module.getDMO().getLoadSchemaClass();
        while(it.hasNext()){
		       String cn = it.next();
		       try {
			       schemaClass = Class.forName(cn);
            } catch (ClassNotFoundException e) {
                ResultException ex = new ResultException(e);
                ex.addError("Couldn't load schema class: " + cn);
                ex.setLocationInfo(module.getFile(), module.getLineNumber());
                throw(ex);
            }

            try {
                Object obj = schemaClass.newInstance();

                if (obj instanceof SchemaDefinition){
                    sd = (SchemaDefinition) obj;
                }
                else{
                    ResultException ex = new ResultException("The specified class is not a SchemaDefinition: " + cn);
                    ex.setLocationInfo(module.getFile(), module.getLineNumber());
                    throw(ex);
                }
            } catch (Exception e) {
                ResultException ex = new ResultException(e);
                ex.addError("Couldn't instantiate schema class: " + cn);
                ex.setLocationInfo(module.getFile(), module.getLineNumber());
                throw(ex);
            }

                try {
                    if (schema.isSchema(sd.getInstance().getName().getNameString()) == null){
                        schema.manageSchema(sd);
                    }
                } catch (DmcValueException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (DmcNameClashException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

        }
    }
}

