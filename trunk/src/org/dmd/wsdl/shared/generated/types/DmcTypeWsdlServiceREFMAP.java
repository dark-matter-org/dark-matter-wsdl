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
package org.dmd.wsdl.shared.generated.types;

import java.io.Serializable;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcMappedAttributeIF;
import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.dmc.types.DefinitionName;    // key type import
/**
 * The DmcTypeWsdlServiceREFMAP provides storage for a map of WsdlServiceREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2842)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:540)
 */
@SuppressWarnings("serial")
// public class DmcTypeWsdlServiceREFMAP extends DmcTypeWsdlServiceREF<WsdlServiceREF,DefinitionName> {
public class DmcTypeWsdlServiceREFMAP extends DmcTypeWsdlServiceREF implements Serializable {
    
    private final static Iterator<WsdlServiceREF> emptyList = (new HashMap<DefinitionName,WsdlServiceREF>()).values().iterator();
    
    protected Map<DefinitionName,WsdlServiceREF> value;
    
    public DmcTypeWsdlServiceREFMAP(){
        value = null;
    }
    
    public DmcTypeWsdlServiceREFMAP(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED)
            value = new HashMap<DefinitionName,WsdlServiceREF>();
        else
            value = new TreeMap<DefinitionName,WsdlServiceREF>();
    }
    
    public DefinitionName firstKey(){
        if (getAttributeInfo().valueType == ValueTypeEnum.TREEMAPPED){
            if (value == null)
                return(null);
            TreeMap<DefinitionName,WsdlServiceREF> map = (TreeMap<DefinitionName,WsdlServiceREF>)value;
            return(map.firstKey());
        }
        throw(new IllegalStateException("Attribute " + getAttributeInfo().name + " is HASHMAPPED and doesn't support firstKey()"));
    }
    
    @Override
    public DmcTypeWsdlServiceREFMAP getNew(){
        return(new DmcTypeWsdlServiceREFMAP(getAttributeInfo()));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2899)
    public DmcAttribute<WsdlServiceREF> cloneIt(){
        synchronized(this){
            DmcTypeWsdlServiceREFMAP rc = getNew();
    
            if (value == null)
                return(rc);
    
            for(WsdlServiceREF val: value.values())
            try {
                rc.add(val);
            } catch (DmcValueException e) {
                throw(new IllegalStateException("typeCheck() should never fail here!",e));
            }
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2919)
    public WsdlServiceREF add(Object v) throws DmcValueException {
        synchronized(this){
            WsdlServiceREF newval = typeCheck(v);
            if (value == null)
                initValue();
            DefinitionName key = (DefinitionName)((DmcMappedAttributeIF)newval).getKey();
            WsdlServiceREF oldval = value.put(key,newval);
            
            if (oldval != null){
                // We had a value with this key, ensure that the value actually changed
                if (oldval.valuesAreEqual(newval))
                    newval = null;
            }
            
            return(newval);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2940)
    public WsdlServiceREF del(Object key){
        synchronized(this){
    
            if (value == null)
                return(null);
    
           if (key instanceof DefinitionName)
                return(value.remove(key));
            else
                throw(new IllegalStateException("Incompatible key type: " + key.getClass().getName() + " passed to del():" + getName()));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2956)
    public Iterator<WsdlServiceREF> getMV(){
        synchronized(this){
    
            if (value == null)
                return(emptyList);
    
            Map<DefinitionName,WsdlServiceREF> clone = null;
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED)
                clone = new HashMap<DefinitionName,WsdlServiceREF>(value);
            else
                clone = new TreeMap<DefinitionName,WsdlServiceREF>(value);
            return(clone.values().iterator());
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2973)
    public Map<DefinitionName,WsdlServiceREF> getMVCopy(){
        synchronized(this){
            Map<DefinitionName,WsdlServiceREF> clone = null;
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED){
                if (value == null)
                    clone = new HashMap<DefinitionName,WsdlServiceREF>();
                else
                    clone = new HashMap<DefinitionName,WsdlServiceREF>(value);
            }
            else{
                if (value == null)
                    clone = new TreeMap<DefinitionName,WsdlServiceREF>();
                else
                    clone = new TreeMap<DefinitionName,WsdlServiceREF>(value);
            }
            return(clone);
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:2994)
    @Override
    public int getMVSize(){
        synchronized(this){
            if (value == null)
                return(0);
            return(value.size());
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3006)
    public WsdlServiceREF getByKey(Object key){
        synchronized(this){
           if (value == null)
               return(null);
    
            if (key instanceof DefinitionName)
                return(value.get((DefinitionName) key));
            else
                throw(new IllegalStateException("Incompatible type: " + key.getClass().getName() + " passed to del():" + getName()));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3021)
    public boolean contains(Object v){
        synchronized(this){
           if (value == null)
               return(false);
    
            try {
                WsdlServiceREF val = typeCheck(v);
                return(value.containsValue(val));
            } catch (DmcValueException e) {
                return(false);
            }
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3038)
    public boolean containsKey(Object key){
        synchronized(this){
           if (value == null)
               return(false);
    
           if (key instanceof DefinitionName)
                return(value.containsKey(key));
            return(false);
        }
    }
    
}

