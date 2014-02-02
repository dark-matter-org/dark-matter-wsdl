package org.dmd.wsdl.server.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwContainerIterator;
import org.dmd.wsdl.shared.generated.types.XsElementREF;
import org.dmd.wsdl.server.extended.XsElement;
/**
 * The XsElementIteratorDMW will cast from an underlying XsElementREF class to 
 * the associated wrapper class: XsElement when accessing object references in a wrapper context.
 * <P>
 * Generated from the dmwsdl schema at version unknown
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be altered manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpIterable(BaseDMWGenerator.java:323)
 */
public class XsElementIterableDMW extends DmwContainerIterator<XsElement,XsElementREF> {

    public final static XsElementIterableDMW emptyList = new XsElementIterableDMW();

    protected XsElementIterableDMW(){
        super();
    }

    public XsElementIterableDMW(Iterator<XsElementREF> it){
        super(it);
    }

}

