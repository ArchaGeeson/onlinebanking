package com.solvd.onlinebanking.utilities;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.solvd.onlinebanking.models.User;

public class SAXHandler extends DefaultHandler {
	
	
	private User user;
	private String content;

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

		if (qName.equalsIgnoreCase("user")) {
			setUser(new User());
			//System.out.println("qname " + qName);
		}
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {

		switch (qName) {
		
		case "firstName":
			getUser().setFirstName(content);
			//System.out.println(content);
			break;

		case "lastName":
			getUser().setLastName(content);
			//System.out.println(content);
			break;
		}
	}

	@Override
	public void characters(char ch[], int start, int length) throws SAXException {
		content = String.copyValueOf(ch, start, length).trim();
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	

}
