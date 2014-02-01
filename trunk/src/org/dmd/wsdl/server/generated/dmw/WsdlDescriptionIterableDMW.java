package org.dmd.wsdl.server.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwContainerIterator;
import org.dmd.wsdl.shared.generated.types.WsdlDescriptionREF;
import org.dmd.wsdl.server.extended.WsdlDescription;
/**
 * The WsdlDescriptionIteratorDMW will cast from an underlying WsdlDescriptionREF class to 
 * the associated wrapper class: WsdlDescription when accessing object references in a wrapper context.
 * <P>
 * Generated from the dmwsdl schema at version unknown
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be altered manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpIterable(BaseDMWGenerator.java:323)
 */
public class WsdlDescriptionIterableDMW extends DmwContainerIterator<WsdlDescription,WsdlDescriptionREF> {

    public final static WsdlDescriptionIterableDMW emptyList = new WsdlDescriptionIterableDMW();

    protected WsdlDescriptionIterableDMW(){
        super();
    }

    public WsdlDescriptionIterableDMW(Iterator<WsdlDescriptionREF> it){
        super(it);
    }

}

