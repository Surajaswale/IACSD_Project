package com.banking;

/*
 * state - account no , 
 * customer name(first name ,last name) , balance ,  
 * account  type : string
 */
public class BankAccount {
	private int acctNo;
	private String firstName;
	private String lastName;
	private double balance;
	private String acctType;
	public BankAccount(int acctNo, String firstName, 
			String lastName, double balance, String acctType) {
		super();
		this.acctNo = acctNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.balance = balance;
		this.acctType = acctType;
	}
	@Override
	public String toString() {
		return "BankAccount Summary -"+ acctNo + ", firstName=" + firstName + ", lastName=" + lastName + ", balance="
				+ balance + ", acctType=" + acctType + "]";
	}
	
}
