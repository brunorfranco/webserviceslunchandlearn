package com.version1.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.version1.AccountLookupService;
import com.version1.entity.Account;
import com.version1.entity.AccountId;
import com.version1.entity.AccountType;

@Controller
@RequestMapping(value = "/customerfinancials/restful/account")
public class AccountLookupController {

	/**
	 * accountLookupService.
	 */
	@Autowired
	private AccountLookupService accountLookupService;

	@RequestMapping(value = "/{id}", method = { RequestMethod.GET })
	@ResponseBody
	public ResponseEntity<Account> lookupAccountById(@PathVariable final Integer id,
			@RequestParam(value = "cdTypeAcct", required = false, defaultValue="0") Integer cdTypeAcct,
			@RequestParam(value = "idTypeSeq", required = false, defaultValue="0") Integer idTypeSeq,
			@RequestParam(value = "numYearsToRetrieve", required = false) Integer numYearsToRetrieve,
			HttpServletResponse response) {

		final AccountId accountId = new AccountId(id, new AccountType(cdTypeAcct), idTypeSeq);

		final Account account = accountLookupService.getAccount(accountId, numYearsToRetrieve);

		if(account == null){
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		
		return ResponseEntity.ok(account);
	}

	//http://localhost:8080/customerfinancials/restful/account/1998?cdTypeAcct=4
	//http://localhost:8080/customerfinancial/restful/account/1998-04-11?numYearsToRetrieve=3
}
