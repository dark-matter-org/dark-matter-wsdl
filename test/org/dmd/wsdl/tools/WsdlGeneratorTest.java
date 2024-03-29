package org.dmd.wsdl.tools;

import java.io.File;
import java.io.IOException;

import org.dmd.dmc.DmcNameClashException;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcValueExceptionSet;
import org.dmd.dmc.rules.DmcRuleExceptionSet;
import org.dmd.util.exceptions.ResultException;
import org.junit.Before;
import org.junit.Test;

public class WsdlGeneratorTest {

	static String workingDir;

	@Before
	public void initialize() throws IOException {
        File curr = new File(".");
        workingDir = curr.getCanonicalPath();
		System.out.println("*** Generator running from: " + workingDir);
	}
	

	@Test
	public void generateTest() throws ResultException, DmcValueException, IOException, DmcRuleExceptionSet, DmcNameClashException, DmcValueExceptionSet{
		String[] args = { "-workspace", workingDir,
				"-srcdir", "test/org/dmd/wsdl/tools",
				"-target", "greatH"
		};
		
		WsdlGenerator generator = new WsdlGenerator();
		
		generator.run(args);
		
	}
}
