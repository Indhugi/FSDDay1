package com.assignment.app;

import java.util.ArrayList;
import java.util.List;

import com.assignment.Account;

public class AccountList {
	public static void main(String[] args) {
		/*
		 * List<Account> accounts=new ArrayList<Account>(); Account account1=new
		 * Account("FD"); account1.setBalance(5000); accounts.add(account1); Account
		 * account2=new Account("RD"); account2.setBalance(8000);
		 * accounts.add(account2); System.out.println(accounts);
		 */
		Account[] accounts=new Account[10];
		for (int i = 0; i < accounts.length; i++) {
			Account account=new Account("Name"+i);
			account.setBalance(i*1000);
			accounts[i]=account;
			System.out.println(accounts[i]);			
		}
		List<Account> accs=new ArrayList<Account>();
		for (int i = 0; i < 10; i++) {
			Account acc=new Account("AccName"+i);
			acc.setBalance(100*i);
			accs.add(acc);
		}
		System.out.println(accs.toString());
		
		}

	}

