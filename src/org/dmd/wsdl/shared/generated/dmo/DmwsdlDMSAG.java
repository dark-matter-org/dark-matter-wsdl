package org.dmd.wsdl.shared.generated.dmo;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpHeaderDMSAG(DmoCompactSchemaFormatter.java:1064)
import java.util.ArrayList;                                  // For storage of schema info - (DmoCompactSchemaFormatter.java:998)
import java.util.HashMap;                                    // For storage of schema info - (DmoCompactSchemaFormatter.java:997)
import java.util.Iterator;                                   // For access of schema info - (DmoCompactSchemaFormatter.java:999)
import org.dmd.dmc.*;                                        // Basic DMC stuff - (DmoCompactSchemaFormatter.java:1000)
import org.dmd.dmc.rules.RuleIF;                             // For rule info - (DmoCompactSchemaFormatter.java:1001)
import org.dmd.dms.generated.dmo.MetaDMSAG;                  // Required attribute from MetaDMSAG - (DmoCompactSchemaFormatter.java:1017)
import org.dmd.dms.generated.enums.ClassTypeEnum;            // Have class definitions - (DmoCompactSchemaFormatter.java:1005)
import org.dmd.dms.generated.enums.DataTypeEnum;             // Have class/attribute definitions - (DmoCompactSchemaFormatter.java:1006)
import org.dmd.dms.generated.enums.OriginalTypeEnum;         // Have type/internal type definitions - (DmoCompactSchemaFormatter.java:1011)
import org.dmd.dms.generated.enums.ValueTypeEnum;            // Have attribute definitions - (DmoCompactSchemaFormatter.java:1032)




// Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:137)
public class DmwsdlDMSAG implements DmcCompactSchemaIF {


    static String schemaName = "dmwsdl";


    static int schemaBaseID = -478500;


    static int schemaIDRange = 50;


    static int schemaMaxID = -478450;

    public final static DmcAttributeInfo __binding = new DmcAttributeInfo("dmwsdl", "binding", -478477, "WsdlBinding", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __bindingType = new DmcAttributeInfo("dmwsdl", "bindingType", -478478, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __definedInWsdlModule = new DmcAttributeInfo("dmwsdl", "definedInWsdlModule", -478498, "WsdlModule", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __dependsOnWsdlModule = new DmcAttributeInfo("dmwsdl", "dependsOnWsdlModule", -478499, "WsdlModule", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __element = new DmcAttributeInfo("dmwsdl", "element", -478481, "ElementReference", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __elements = new DmcAttributeInfo("dmwsdl", "elements", -478485, "XsElement", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __embedSchema = new DmcAttributeInfo("dmwsdl", "embedSchema", -478482, "XsSchema", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __faults = new DmcAttributeInfo("dmwsdl", "faults", -478480, "WsdlFault", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __input = new DmcAttributeInfo("dmwsdl", "input", -478491, "LabelledElementReference", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __interface = new DmcAttributeInfo("dmwsdl", "interface", -478479, "InterfaceReference", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __interfaces = new DmcAttributeInfo("dmwsdl", "interfaces", -478494, "WsdlInterface", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __nameSpace = new DmcAttributeInfo("dmwsdl", "nameSpace", -478497, "NameSpaceReference", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __operations = new DmcAttributeInfo("dmwsdl", "operations", -478493, "WsdlOperation", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __outfault = new DmcAttributeInfo("dmwsdl", "outfault", -478486, "LabelledFaultReference", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __output = new DmcAttributeInfo("dmwsdl", "output", -478490, "LabelledElementReference", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __pattern = new DmcAttributeInfo("dmwsdl", "pattern", -478489, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __prefix = new DmcAttributeInfo("dmwsdl", "prefix", -478484, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __protocol = new DmcAttributeInfo("dmwsdl", "protocol", -478476, "ProtocolReference", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __service = new DmcAttributeInfo("dmwsdl", "service", -478492, "WsdlService", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __serviceTitle = new DmcAttributeInfo("dmwsdl", "serviceTitle", -478495, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __style = new DmcAttributeInfo("dmwsdl", "style", -478488, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __targetNameSpace = new DmcAttributeInfo("dmwsdl", "targetNameSpace", -478496, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __xstype = new DmcAttributeInfo("dmwsdl", "xstype", -478487, "XsType", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __xstypes = new DmcAttributeInfo("dmwsdl", "xstypes", -478483, "XsType", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:176)
    public final static DmcTypeInfo __type_ElementReference = new DmcTypeInfo("ElementReference", OriginalTypeEnum.COMPLEXTYPE);
    public final static DmcTypeInfo __type_InterfaceReference = new DmcTypeInfo("InterfaceReference", OriginalTypeEnum.COMPLEXTYPE);
    public final static DmcTypeInfo __type_LabelledElementReference = new DmcTypeInfo("LabelledElementReference", OriginalTypeEnum.COMPLEXTYPE);
    public final static DmcTypeInfo __type_LabelledFaultReference = new DmcTypeInfo("LabelledFaultReference", OriginalTypeEnum.COMPLEXTYPE);
    public final static DmcTypeInfo __type_NameSpaceReference = new DmcTypeInfo("NameSpaceReference", OriginalTypeEnum.COMPLEXTYPE);
    public final static DmcTypeInfo __type_ProtocolReference = new DmcTypeInfo("ProtocolReference", OriginalTypeEnum.COMPLEXTYPE);
    public final static DmcTypeInfo __type_WsdlBinding = new DmcTypeInfo("WsdlBinding", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_WsdlDefinition = new DmcTypeInfo("WsdlDefinition", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_WsdlDescription = new DmcTypeInfo("WsdlDescription", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_WsdlFault = new DmcTypeInfo("WsdlFault", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_WsdlInterface = new DmcTypeInfo("WsdlInterface", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_WsdlModule = new DmcTypeInfo("WsdlModule", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_WsdlOperation = new DmcTypeInfo("WsdlOperation", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_WsdlService = new DmcTypeInfo("WsdlService", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_XsComplexType = new DmcTypeInfo("XsComplexType", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_XsElement = new DmcTypeInfo("XsElement", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_XsSchema = new DmcTypeInfo("XsSchema", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_XsType = new DmcTypeInfo("XsType", OriginalTypeEnum.REFERENCE);

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:217)
    public final static DmcClassInfo __WsdlDefinition = new DmcClassInfo("WsdlDefinition","org.dmd.wsdl.shared.generated.dmo.WsdlDefinitionDMO", -478498, ClassTypeEnum.ABSTRACT, DataTypeEnum.PERSISTENT,MetaDMSAG.__DSDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __WsdlBinding = new DmcClassInfo("WsdlBinding","org.dmd.wsdl.shared.generated.dmo.WsdlBindingDMO", -478492, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__WsdlDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __WsdlDescription = new DmcClassInfo("WsdlDescription","org.dmd.wsdl.shared.generated.dmo.WsdlDescriptionDMO", -478497, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__WsdlDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __WsdlFault = new DmcClassInfo("WsdlFault","org.dmd.wsdl.shared.generated.dmo.WsdlFaultDMO", -478491, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__WsdlDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __WsdlInterface = new DmcClassInfo("WsdlInterface","org.dmd.wsdl.shared.generated.dmo.WsdlInterfaceDMO", -478496, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__WsdlDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __WsdlModule = new DmcClassInfo("WsdlModule","org.dmd.wsdl.shared.generated.dmo.WsdlModuleDMO", -478499, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__WsdlDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __WsdlOperation = new DmcClassInfo("WsdlOperation","org.dmd.wsdl.shared.generated.dmo.WsdlOperationDMO", -478495, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__WsdlDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __WsdlService = new DmcClassInfo("WsdlService","org.dmd.wsdl.shared.generated.dmo.WsdlServiceDMO", -478494, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__WsdlDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __XsElement = new DmcClassInfo("XsElement","org.dmd.wsdl.shared.generated.dmo.XsElementDMO", -478493, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__WsdlDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __XsSchema = new DmcClassInfo("XsSchema","org.dmd.wsdl.shared.generated.dmo.XsSchemaDMO", -478490, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__WsdlDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __XsType = new DmcClassInfo("XsType","org.dmd.wsdl.shared.generated.dmo.XsTypeDMO", -478489, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__WsdlDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __XsComplexType = new DmcClassInfo("XsComplexType","org.dmd.wsdl.shared.generated.dmo.XsComplexTypeDMO", -478488, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__XsType,MetaDMSAG.__name);

    static  HashMap<Integer, DmcClassInfo> _CmAp;

    static  HashMap<Integer, DmcAttributeInfo> _SmAp;

    static  HashMap<String, DmcNameBuilderIF> _NmAp;

    static  HashMap<String, DmcFilterBuilderIF> _FmAp;

    static  HashMap<String, DmcSliceInfo> _SImAp;

    static  HashMap<String, DmcTypeInfo> _TImAp;

    static  ArrayList<RuleIF>             _RmAp;

    static {
        _CmAp = new HashMap<Integer, DmcClassInfo>();

        _SmAp = new HashMap<Integer, DmcAttributeInfo>();

        _NmAp = new HashMap<String, DmcNameBuilderIF>();

        _FmAp = new HashMap<String, DmcFilterBuilderIF>();

        _SImAp = new HashMap<String, DmcSliceInfo>();

        _TImAp = new HashMap<String, DmcTypeInfo>();

        _RmAp = new ArrayList<RuleIF>();

        DmwsdlDMSAGAMAP.initSmAp(_SmAp);

        DmwsdlDMSAGCMAP.initCmAp(_CmAp);

    }

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:300)
    static {


        __WsdlDefinition.addMust(MetaDMSAG.__name);
        __WsdlDefinition.addMust(MetaDMSAG.__dotName);
        __WsdlDefinition.addMust(__definedInWsdlModule);
        __WsdlDefinition.addMay(MetaDMSAG.__description);

        __WsdlDescription.addMust(MetaDMSAG.__name);
        __WsdlDescription.addMust(__nameSpace);
        __WsdlDescription.addMust(__targetNameSpace);
        __WsdlDescription.addMust(__serviceTitle);
        __WsdlDescription.addMust(__binding);
        __WsdlDescription.addMay(__interfaces);
        __WsdlDescription.addMay(__service);
        __WsdlDescription.addMay(MetaDMSAG.__description);
        __WsdlDescription.addMay(__embedSchema);

        __WsdlInterface.addMust(MetaDMSAG.__name);
        __WsdlInterface.addMust(__operations);
        __WsdlInterface.addMay(__faults);

        __WsdlOperation.addMust(MetaDMSAG.__name);
        __WsdlOperation.addMay(__pattern);
        __WsdlOperation.addMay(__style);
        __WsdlOperation.addMay(__input);
        __WsdlOperation.addMay(__output);
        __WsdlOperation.addMay(__outfault);

        __WsdlService.addMust(MetaDMSAG.__name);

        __XsElement.addMust(MetaDMSAG.__name);
        __XsElement.addMust(__xstype);

        __WsdlBinding.addMust(MetaDMSAG.__name);
        __WsdlBinding.addMust(__interface);
        __WsdlBinding.addMust(__bindingType);
        __WsdlBinding.addMust(__protocol);

        __WsdlFault.addMust(MetaDMSAG.__name);
        __WsdlFault.addMust(__element);

        __XsSchema.addMust(MetaDMSAG.__name);
        __XsSchema.addMust(__nameSpace);
        __XsSchema.addMust(__targetNameSpace);
        __XsSchema.addMay(__xstypes);
        __XsSchema.addMay(__elements);

        __XsType.addMust(MetaDMSAG.__name);
        __XsType.addMay(__prefix);

        __XsComplexType.addMust(MetaDMSAG.__name);
        __XsComplexType.addMust(__elements);

        __WsdlModule.addMust(MetaDMSAG.__name);
        __WsdlModule.addMay(MetaDMSAG.__loadSchemaClass);
        __WsdlModule.addMay(MetaDMSAG.__description);
        __WsdlModule.addMay(MetaDMSAG.__defFiles);
        __WsdlModule.addMay(__dependsOnWsdlModule);

    }

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:344)
    static {


    }

    static  DmwsdlDMSAG instance;

    protected DmwsdlDMSAG (){
    }

    public synchronized static DmwsdlDMSAG instance(){
        if (instance == null)
            instance = new DmwsdlDMSAG();
        
        return(instance);
    }


    public DmcClassInfo getClassInfo(Integer id){
        return(_CmAp.get(id));
    }


    public DmcAttributeInfo getAttributeInfo(Integer id){
        return(_SmAp.get(id));
    }


    public Iterator<DmcAttributeInfo> getAttributeInfo(){
        return(_SmAp.values().iterator());
    }


    public Iterator<DmcClassInfo> getClassInfo(){
        return(_CmAp.values().iterator());
    }


    public Iterator<DmcNameBuilderIF> getNameBuilders(){
        return(_NmAp.values().iterator());
    }


    public Iterator<DmcFilterBuilderIF> getFilterBuilders(){
        return(_FmAp.values().iterator());
    }


    public Iterator<DmcSliceInfo> getSliceInfo(){
        return(_SImAp.values().iterator());
    }


    public Iterator<DmcTypeInfo> getTypeInfo(){
        return(_TImAp.values().iterator());
    }


    public String getSchemaName(){
        return(schemaName);
    }


    public int getSchemaBaseID(){
        return(schemaBaseID);
    }


    public int getSchemaIDRange(){
        return(schemaIDRange);
    }


    public int getSchemaMaxID(){
        return(schemaMaxID);
    }


    public Iterator<RuleIF> getRules(){
        return(_RmAp.iterator());
    }


}

