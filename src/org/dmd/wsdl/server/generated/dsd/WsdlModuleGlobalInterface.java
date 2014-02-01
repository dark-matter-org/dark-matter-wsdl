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
import java.util.Iterator;                                  // To provide iterators over definitions - (DSDArtifactFormatter.java:359)
import org.dmd.dmc.types.DotName;                           // To support the find method for definitions - (DSDefinitionModule.java:163)
import org.dmd.wsdl.server.extended.WsdlDefinition;         // A definition from the WsdlModule Module - (DSDefinitionModule.java:161)
import org.dmd.wsdl.server.extended.WsdlModule;             // A definition from the WsdlModule Module - (DSDefinitionModule.java:174)


// Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateGlobalInterface(DSDArtifactFormatter.java:366)
/**
 * This interface is implemented by definition managers that store definitions from the WsdlModule module.
 */
public interface WsdlModuleGlobalInterface {

    public int getWsdlDefinitionCount();
    public WsdlDefinition getWsdlDefinition(DotName name);
    public Iterator<WsdlDefinition> getAllWsdlDefinition();

    public void addWsdlModule(WsdlModule def);
    public int getWsdlModuleCount();
    public WsdlModule getWsdlModule(DotName name);
    public Iterator<WsdlModule> getAllWsdlModule();

}
