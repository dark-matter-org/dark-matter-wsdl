package org.dmd.wsdl.server.extended;

import static org.junit.Assert.assertEquals;

import org.dmd.dmc.DmcNameClashException;
import org.dmd.dmc.DmcValueException;
import org.dmd.dms.SchemaManager;
import org.dmd.util.exceptions.ResultException;
import org.dmd.wsdl.server.generated.DmwsdlSchemaAG;
import org.junit.Test;

public class WsdlBindingTest {
	
//	WsdlBinding
//	name			greathBinding
//	interface		tns reservationInterface
//	bindingType		http://www.w3.org/ns/wsdl/soap
//	protocol		wsoap http://www.w3.org/2003/05/soap/bindings/HTTP/


	@Test
	public void testParsing() throws DmcValueException, ResultException, DmcNameClashException {
		
		SchemaManager schema = new SchemaManager();
		DmwsdlSchemaAG dmwsdl = new DmwsdlSchemaAG();
		schema.manageSchema(dmwsdl);
		
		WsdlBinding binding = new WsdlBinding();
		binding.setName("greathBinding");
		binding.setInterface("tns reservationInterface");
		binding.setBindingType("http://www.w3.org/ns/wsdl/soap");
		binding.setProtocol("wsoap http://www.w3.org/2003/05/soap/bindings/HTTP/");
		
		System.out.println(binding.toXML());
//		NameSpaceReference nsr = new NameSpaceReference("http://greath.example.com/2004/wsdl/resSvc		tns");
//		
//		assertEquals("URL should be http://greath.example.com/2004/wsdl/resSvc", "http://greath.example.com/2004/wsdl/resSvc", nsr.getUrl());
//
//		assertEquals("Prefix should be tns", "tns", nsr.getPrefix());
//		
//		System.out.println(nsr.getUrl() + "  " + nsr.getPrefix());
//		
//		nsr = new NameSpaceReference("http://greath.example.com/2004/wsdl/resSvc");
//		
//		assertEquals("URL should be http://greath.example.com/2004/wsdl/resSvc", "http://greath.example.com/2004/wsdl/resSvc", nsr.getUrl());
//
//		assertEquals("Prefix should be null", null, nsr.getPrefix());
		
		
	}
}
