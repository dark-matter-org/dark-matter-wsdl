package org.dmd.wsdl.server.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwContainerIterator;
import org.dmd.wsdl.shared.generated.types.WsdlDefinitionREF;
import org.dmd.wsdl.server.extended.WsdlDefinition;
/**
 * The WsdlDefinitionIteratorDMW will cast from an underlying WsdlDefinitionREF class to 
 * the associated wrapper class: WsdlDefinition when accessing object references in a wrapper context.
 * <P>
 * Generated from the dmwsdl schema at version unknown
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be altered manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpIterable(BaseDMWGenerator.java:323)
 */
public class WsdlDefinitionIterableDMW extends DmwContainerIterator<WsdlDefinition,WsdlDefinitionREF> {

    public final static WsdlDefinitionIterableDMW emptyList = new WsdlDefinitionIterableDMW();

    protected WsdlDefinitionIterableDMW(){
        super();
    }

    public WsdlDefinitionIterableDMW(Iterator<WsdlDefinitionREF> it){
        super(it);
    }

}
