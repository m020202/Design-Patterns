package com.pattern.design_patterns.structural_patterns.adapter.before;

public class AccountService {
    public Account findAccountByUsernameAndPassword(String username, String password) {
        Account account = new Account();
        account.setName(username);
        account.setPassword(password);
        account.setEmail(username);
        return account;
    }

    public void createNewAccount(Account account) {

    }

    public void updateAccount(Account account) {

    }

}
