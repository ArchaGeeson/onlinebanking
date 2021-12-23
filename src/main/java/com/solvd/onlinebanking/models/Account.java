package com.solvd.onlinebanking.models;

import java.util.Date;
import java.util.List;

public class Account {
	private Long id;
	private Double openingBalance;
	private String type;
	private String status;
	private Date openingDate;
	private Long bankId;
	private Long userId;
	private List<Statement> listOfStatements;
	private List<BalanceHistory> listOfBalanceHistory;
	private List<Offer> listOfOffer;
	private List<Card> listOfCards;
	private List<Transaction> listOfTransactions;
	private List<Notification> listOfNotifications;
	private List<Banking> listOfBankings;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getOpeningBalance() {
		return openingBalance;
	}

	public void setOpeningBalance(Double openingBalance) {
		this.openingBalance = openingBalance;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getOpeningDate() {
		return openingDate;
	}

	public void setOpeningDate(Date openingDate) {
		this.openingDate = openingDate;
	}

	public Long getBankId() {
		return bankId;
	}

	public void setBankId(Long bankId) {
		this.bankId = bankId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public List<Statement> getListOfStatements() {
		return listOfStatements;
	}

	public void setListOfStatements(List<Statement> listOfStatements) {
		this.listOfStatements = listOfStatements;
	}

	public List<BalanceHistory> getListOfBalanceHistory() {
		return listOfBalanceHistory;
	}

	public void setListOfBalanceHistory(List<BalanceHistory> listOfBalanceHistory) {
		this.listOfBalanceHistory = listOfBalanceHistory;
	}

	public List<Offer> getListOfOffer() {
		return listOfOffer;
	}

	public void setListOfOffer(List<Offer> listOfOffer) {
		this.listOfOffer = listOfOffer;
	}

	public List<Card> getListOfCards() {
		return listOfCards;
	}

	public void setListOfCards(List<Card> listOfCards) {
		this.listOfCards = listOfCards;
	}

	public List<Transaction> getListOfTransactions() {
		return listOfTransactions;
	}

	public void setListOfTransactions(List<Transaction> listOfTransactions) {
		this.listOfTransactions = listOfTransactions;
	}

	public List<Notification> getListOfNotifications() {
		return listOfNotifications;
	}

	public void setListOfNotifications(List<Notification> listOfNotifications) {
		this.listOfNotifications = listOfNotifications;
	}

	public List<Banking> getListOfBankings() {
		return listOfBankings;
	}

	public void setListOfBankings(List<Banking> listOfBankings) {
		this.listOfBankings = listOfBankings;
	}

}
