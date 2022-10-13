package com.faith.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TblCustomer")
public class Customer {
	
	//fields
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int Cid;
	private int accountNumber;
	
	
	private int pin;
	private String CustomerName;
	private String accountType;
	private double Balance;
	private double MinBalance;
	private long MobileNumber;
	private String emailId;
	
	
	//default constructor
	public Customer() {
		super();
	}

//parameterized constructor
	public Customer(int cid, int accountNumber, int pin, String customerName, String accountType, double balance,
			double minBalance, long mobileNumber, String emailId) {
		super();
		Cid = cid;
		this.accountNumber = accountNumber;
		this.pin = pin;
		CustomerName = customerName;
		this.accountType = accountType;
		Balance = balance;
		MinBalance = minBalance;
		MobileNumber = mobileNumber;
		this.emailId = emailId;
	}

//getters and setters
	public int getCid() {
		return Cid;
	}


	public void setCid(int cid) {
		Cid = cid;
	}


	public int getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}


	public int getPin() {
		return pin;
	}


	public void setPin(int pin) {
		this.pin = pin;
	}


	public String getCustomerName() {
		return CustomerName;
	}


	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}


	public String getAccountType() {
		return accountType;
	}


	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}


	public double getBalance() {
		return Balance;
	}


	public void setBalance(double balance) {
		Balance = balance;
	}


	public double getMinBalance() {
		return MinBalance;
	}


	public void setMinBalance(double minBalance) {
		MinBalance = minBalance;
	}


	public long getMobileNumber() {
		return MobileNumber;
	}


	public void setMobileNumber(long mobileNumber) {
		MobileNumber = mobileNumber;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
}
