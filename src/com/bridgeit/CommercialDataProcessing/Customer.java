package com.bridgeit.CommercialDataProcessing;

public class Customer {
	private String customerName;
	private String customerSymbol;
	
	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	private long customerAmount;
	private long customerShare;

	public String getCustomerSymbol() {
		return customerSymbol;
	}

	public void setCustomerSymbol(String customerSymbol) {
		this.customerSymbol = customerSymbol;
	}

	public long getCustomerAmount() {
		return customerAmount;
	}

	public void setCustomerAmount(long customerAmount) {
		this.customerAmount = customerAmount;
	}

	public long getCustomerShare() {
		return customerShare;
	}

	public void setCustomerShare(long customerShare) {
		this.customerShare = customerShare;
	}

	public String toString() {
		return "\n\tCustomer:- Name: " + customerName + " \n\tSymbol: " + customerSymbol + "\n\tAmount: "
				+ customerAmount + "\n\tShare: " + customerShare;
	}
}
