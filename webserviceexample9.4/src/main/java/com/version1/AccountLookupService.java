package com.version1;

import org.springframework.stereotype.Service;

import com.version1.entity.Account;
import com.version1.entity.AccountId;

@Service
public class AccountLookupService {

	public Account getAccount(AccountId accountId, Integer numYearsToRetrieve) {
		
		return new Account(1l, "Account Name", accountId);
	}

}
