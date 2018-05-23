package com.bridgeit.CommercialDataProcessing;

public class Company {
	private String companySymbol;
	private long companySharesAvailable;
	private long companyPricePerShare;

	public String getCompanySymbol() {
		return companySymbol;
	}

	public void setCompanySymbol(String companySymbol) {
		this.companySymbol = companySymbol;
	}

	public long getCompanySharesAvailable() {
		return companySharesAvailable;
	}

	public void setCompanySharesAvailable(long companySharesAvailable) {
		this.companySharesAvailable = companySharesAvailable;
	}

	public long getCompanyPricePerShare() {
		return companyPricePerShare;
	}

	public void setCompanyPricePerShare(long companyPricePerShare) {
		this.companyPricePerShare = companyPricePerShare;
	}

	public String toString() {
		return "\n\t Company:  \n\tSymbol:  " + companySymbol + "\n\tShares Avail.: " + companySharesAvailable
				+ "\n\tPrice per share: " + companyPricePerShare;
	}

}
