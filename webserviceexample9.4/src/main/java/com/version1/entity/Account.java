package com.version1.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class Account {

	private Long id;
	private String name;
	private AccountId accountId;

	public Account() {
		super();
	}

	public Account(AccountId accountId) {
		this.accountId = accountId;
	}

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

	public AccountId getAccountId() {
		return accountId;
	}

	public void setAccountId(AccountId accountId) {
		this.accountId = accountId;
	}

	public Account(Long id, String name, AccountId accountId) {
		super();
		this.id = id;
		this.name = name;
		this.accountId = accountId;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", accountId=" + accountId + "]";
	}

}
