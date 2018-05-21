package com.bridgeit.CommercialDataProcessing;

public class Customer {
	private String customerSymbol;
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
		return "\n\tCustomer:-  \n\tSymbol: " + customerSymbol + "\n\tAmount: " + customerAmount + "\n\tShare: "
				+ customerShare;
	}
}
