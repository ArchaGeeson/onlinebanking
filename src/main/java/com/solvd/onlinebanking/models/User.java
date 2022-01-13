package com.solvd.onlinebanking.models;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "user")

public class User {
	private Long id;
	private String firstName;
	private String lastName;
	private String gender;
	private int age;
	private String type;
	private List<Form> listOfForms;
	private List<Account> listOfAccounts;

	@XmlAttribute
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Form> getListOfForms() {
		return listOfForms;
	}

	public void setListOfForms(List<Form> listOfForms) {
		this.listOfForms = listOfForms;
	}

	public List<Account> getListOfAccounts() {
		return listOfAccounts;
	}

	public void setListOfAccounts(List<Account> listOfAccounts) {
		this.listOfAccounts = listOfAccounts;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender
				+ ", age=" + age + ", type=" + type + ", listOfForms=" + listOfForms + ", listOfAccounts="
				+ listOfAccounts + "]";
	}

}
