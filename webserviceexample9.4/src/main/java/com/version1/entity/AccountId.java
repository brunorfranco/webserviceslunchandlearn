package com.version1.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class AccountId {

	private int idInternal;
	private AccountType accountType;
	private int idTypeSeq;

	public AccountId(int idInternal, AccountType accountType, int idTypeSeq) {
		this.idInternal = idInternal;
		this.accountType = accountType;
		this.idTypeSeq = idTypeSeq;
	}

	public int getIdInternal() {
		return idInternal;
	}

	public void setIdInternal(int idInternal) {
		this.idInternal = idInternal;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	public int getIdTypeSeq() {
		return idTypeSeq;
	}

	public void setIdTypeSeq(int idTypeSeq) {
		this.idTypeSeq = idTypeSeq;
	}

	@Override
	public String toString() {
		return "AccountId [idInternal=" + idInternal + ", accountType=" + accountType + ", idTypeSeq=" + idTypeSeq
				+ "]";
	}

}
