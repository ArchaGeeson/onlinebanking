package com.solvd.onlinebanking.models;

import java.util.List;

public class Bank {
	private Long id;
	private String name;
	private List<Account> listOfAccounts;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Account> getListOfAccounts() {
		return listOfAccounts;
	}

	public void setListOfAccounts(List<Account> listOfAccounts) {
		this.listOfAccounts = listOfAccounts;
	}

}
