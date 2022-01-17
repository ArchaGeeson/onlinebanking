package com.solvd.onlinebanking.utilities;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.solvd.onlinebanking.models.Account;
import com.solvd.onlinebanking.models.Form;
import com.solvd.onlinebanking.models.User;

import jdk.internal.org.jline.utils.Log;

public class JacksonDemo {
	private static Logger log = LogManager.getLogger(JacksonDemo.class.getName());

	public User readData() {
		User user = null;
		try {
			ObjectMapper mapper = new ObjectMapper();
			// mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			user = mapper.readValue(
					new File("C:\\Users\\archa\\eclipse-workspace\\onlinebanking\\src\\main\\resources\\user.json"),
					User.class);
		} catch (JsonMappingException e) {
			log.error(e);
		} catch (JsonProcessingException e) {
			log.error(e);
		} catch (IOException e) {
			log.error(e);
		}

		return user;
	}

	public void writeAllData(User user) {
		ObjectMapper mapper = new ObjectMapper();
		try {

			mapper.writerWithDefaultPrettyPrinter().writeValue(
					new File("C:\\Users\\archa\\eclipse-workspace\\onlinebanking\\src\\main\\resources\\userOne.json"),
					user);
		} catch (StreamWriteException e) {

			log.error(e);
		} catch (DatabindException e) {

			log.error(e);
		} catch (IOException e) {

			log.error(e);
		} catch (Exception e) {
			log.error(e);
		}
	}

	public static void main(String[] args) {
		User userOne = new User();
		userOne.setId(Long.valueOf(1000));
		userOne.setFirstName("Calvin");
		userOne.setLastName("Klein");
		userOne.setAge(35);
		userOne.setGender("Male");
		
		Form form = new Form();
		form.setFormType("Application");
		form.setId(Long.valueOf(1));
		form.setUserId(Long.valueOf(1000));
		
		List<Form> formList = new ArrayList<>();
		formList.add(form);
		userOne.setListOfForms(formList);
		
		Account account = new Account();
		account.setBankId(Long.valueOf(1));
		account.setId(Long.valueOf(1));
		account.setOpeningBalance(1000.0);
		account.setStatus("active");
		account.setType("Savings");
		
		List<Account> accList = new ArrayList<>();
		accList.add(account);
		userOne.setListOfAccounts(accList);
		
		JacksonDemo demo = new JacksonDemo();
		demo.writeAllData(userOne);

		User user = new User();
		user = demo.readData();
		
		log.info(user);
		
	}
}
