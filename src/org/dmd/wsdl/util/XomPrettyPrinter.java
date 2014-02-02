package org.dmd.wsdl.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import nu.xom.Builder;
import nu.xom.ParsingException;
import nu.xom.Serializer;

public class XomPrettyPrinter {

	public static String format(String xml) throws ParsingException, IOException {
	    ByteArrayOutputStream out = new ByteArrayOutputStream();
	    Serializer serializer = new Serializer(out);
	    serializer.setIndent(4);  // or whatever you like
	    serializer.setMaxLength(80);
	    serializer.write(new Builder().build(xml, ""));
	    return out.toString("UTF-8");
	}
}
