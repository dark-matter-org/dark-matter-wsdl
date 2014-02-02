package org.dmd.wsdl.shared.generated.types;

import static org.junit.Assert.assertEquals;

import org.dmd.dmc.DmcValueException;
import org.junit.Test;

public class NameSpaceReferenceTest {

	@Test
	public void testParsing() throws DmcValueException{
		NameSpaceReference nsr = new NameSpaceReference("http://greath.example.com/2004/wsdl/resSvc		tns");
		
		assertEquals("URL should be http://greath.example.com/2004/wsdl/resSvc", "http://greath.example.com/2004/wsdl/resSvc", nsr.getUrl());

		assertEquals("Prefix should be tns", "tns", nsr.getPrefix());
		
		System.out.println(nsr.getUrl() + "  " + nsr.getPrefix());
		
		nsr = new NameSpaceReference("http://greath.example.com/2004/wsdl/resSvc");
		
		assertEquals("URL should be http://greath.example.com/2004/wsdl/resSvc", "http://greath.example.com/2004/wsdl/resSvc", nsr.getUrl());

		assertEquals("Prefix should be null", null, nsr.getPrefix());
		
		
	}
}
