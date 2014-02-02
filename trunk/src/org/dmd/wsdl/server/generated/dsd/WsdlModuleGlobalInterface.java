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
// Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateGlobalInterface(DSDArtifactFormatter.java:362)
import java.util.Iterator;                                   // To provide iterators over definitions - (DSDArtifactFormatter.java:359)
import org.dmd.dmc.types.DotName;                            // To support the find method for definitions - (DSDefinitionModule.java:163)
import org.dmd.wsdl.server.extended.WsdlBinding;             // A definition from the WsdlModule Module - (DSDefinitionModule.java:174)
import org.dmd.wsdl.server.extended.WsdlDefinition;          // A definition from the WsdlModule Module - (DSDefinitionModule.java:161)
import org.dmd.wsdl.server.extended.WsdlDescription;         // A definition from the WsdlModule Module - (DSDefinitionModule.java:174)
import org.dmd.wsdl.server.extended.WsdlFault;               // A definition from the WsdlModule Module - (DSDefinitionModule.java:174)
import org.dmd.wsdl.server.extended.WsdlInterface;           // A definition from the WsdlModule Module - (DSDefinitionModule.java:174)
import org.dmd.wsdl.server.extended.WsdlModule;              // A definition from the WsdlModule Module - (DSDefinitionModule.java:174)
import org.dmd.wsdl.server.extended.WsdlOperation;           // A definition from the WsdlModule Module - (DSDefinitionModule.java:174)
import org.dmd.wsdl.server.extended.WsdlService;             // A definition from the WsdlModule Module - (DSDefinitionModule.java:174)
import org.dmd.wsdl.server.extended.XsComplexType;           // A definition from the WsdlModule Module - (DSDefinitionModule.java:174)
import org.dmd.wsdl.server.extended.XsElement;               // A definition from the WsdlModule Module - (DSDefinitionModule.java:174)
import org.dmd.wsdl.server.extended.XsSchema;                // A definition from the WsdlModule Module - (DSDefinitionModule.java:174)
import org.dmd.wsdl.server.extended.XsType;                  // A definition from the WsdlModule Module - (DSDefinitionModule.java:174)


// Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateGlobalInterface(DSDArtifactFormatter.java:366)
/**
 * This interface is implemented by definition managers that store definitions from the WsdlModule module.
 */
public interface WsdlModuleGlobalInterface {

    public int getWsdlDefinitionCount();
    public WsdlDefinition getWsdlDefinition(DotName name);
    public Iterator<WsdlDefinition> getAllWsdlDefinition();

    public void addWsdlBinding(WsdlBinding def);
    public int getWsdlBindingCount();
    public WsdlBinding getWsdlBinding(DotName name);
    public Iterator<WsdlBinding> getAllWsdlBinding();

    public void addWsdlDescription(WsdlDescription def);
    public int getWsdlDescriptionCount();
    public WsdlDescription getWsdlDescription(DotName name);
    public Iterator<WsdlDescription> getAllWsdlDescription();

    public void addWsdlFault(WsdlFault def);
    public int getWsdlFaultCount();
    public WsdlFault getWsdlFault(DotName name);
    public Iterator<WsdlFault> getAllWsdlFault();

    public void addWsdlInterface(WsdlInterface def);
    public int getWsdlInterfaceCount();
    public WsdlInterface getWsdlInterface(DotName name);
    public Iterator<WsdlInterface> getAllWsdlInterface();

    public void addWsdlModule(WsdlModule def);
    public int getWsdlModuleCount();
    public WsdlModule getWsdlModule(DotName name);
    public Iterator<WsdlModule> getAllWsdlModule();

    public void addWsdlOperation(WsdlOperation def);
    public int getWsdlOperationCount();
    public WsdlOperation getWsdlOperation(DotName name);
    public Iterator<WsdlOperation> getAllWsdlOperation();

    public void addWsdlService(WsdlService def);
    public int getWsdlServiceCount();
    public WsdlService getWsdlService(DotName name);
    public Iterator<WsdlService> getAllWsdlService();

    public void addXsComplexType(XsComplexType def);
    public int getXsComplexTypeCount();
    public XsComplexType getXsComplexType(DotName name);
    public Iterator<XsComplexType> getAllXsComplexType();

    public void addXsElement(XsElement def);
    public int getXsElementCount();
    public XsElement getXsElement(DotName name);
    public Iterator<XsElement> getAllXsElement();

    public void addXsSchema(XsSchema def);
    public int getXsSchemaCount();
    public XsSchema getXsSchema(DotName name);
    public Iterator<XsSchema> getAllXsSchema();

    public void addXsType(XsType def);
    public int getXsTypeCount();
    public XsType getXsType(DotName name);
    public Iterator<XsType> getAllXsType();

}

