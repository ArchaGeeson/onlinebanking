package com.solvd.onlinebanking.utilities;

import java.io.FileInputStream;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.xml.sax.SAXException;

public class SAXParserDemo {

	private static Logger log = LogManager.getLogger(SAXParserDemo.class.getName());

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {

		SAXParserFactory parserFactory = SAXParserFactory.newInstance();
		SAXParser parser = parserFactory.newSAXParser();

		SAXHandler handler = new SAXHandler();
		// parser.parse(ClassLoader.getSystemResourceAsStream("/onlinebanking/src/main/resources/xml/users.xml"),
		// handler);
		parser.parse(
				new FileInputStream(
						"C:\\Users\\archa\\eclipse-workspace\\onlinebanking\\src\\main\\resources\\xml\\users.xml"),
				handler);

		log.info(handler.getUser().getFirstName());
		log.info(handler.getUser().getLastName());

	}

}
