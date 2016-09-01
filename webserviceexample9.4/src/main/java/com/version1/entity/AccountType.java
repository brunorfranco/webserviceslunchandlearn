package com.version1.entity;

public class AccountType {

	private int cdTypeAcct;

	public AccountType(int cdTypeAcct) {
		this.cdTypeAcct = cdTypeAcct;
	}

	public static AccountType forCode(int cdTypeAcct) {
		// TODO Auto-generated method stub
		return new AccountType(cdTypeAcct);
	}

	public int getCdTypeAcct() {
		return cdTypeAcct;
	}

	public void setCdTypeAcct(int cdTypeAcct) {
		this.cdTypeAcct = cdTypeAcct;
	}

}
