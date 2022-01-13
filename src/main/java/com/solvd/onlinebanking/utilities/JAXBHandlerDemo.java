package com.solvd.onlinebanking.utilities;

import java.io.File;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.onlinebanking.models.User;

public class JAXBHandlerDemo {

	private static Logger log = LogManager.getLogger(JAXBHandlerDemo.class.getName());

	public static void main(String[] args) {
		User user = new User();

		File xmlFile = new File(
				"C:\\Users\\archa\\eclipse-workspace\\onlinebanking\\src\\main\\resources\\xml\\users.xml");
		File file = new File("C:\\Users\\archa\\eclipse-workspace\\onlinebanking\\src\\main\\resources\\xml\\user.xml");
		JAXBContext jaxbContext;
		try {
			jaxbContext = JAXBContext.newInstance(User.class);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			user = (User) unmarshaller.unmarshal(xmlFile);
			log.info(user);
			Marshaller marshaller = jaxbContext.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(user, file);
			StringWriter sw = new StringWriter();
			marshaller.marshal(user, sw);
			String xmlContent = sw.toString();
			log.info(sw);

		} catch (JAXBException e) {
			log.error(e);
		}
	}
}
