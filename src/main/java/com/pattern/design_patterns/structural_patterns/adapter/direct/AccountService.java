package com.pattern.design_patterns.structural_patterns.adapter.direct;

import com.pattern.design_patterns.structural_patterns.adapter.before.security.UserDetails;
import com.pattern.design_patterns.structural_patterns.adapter.before.security.UserDetailsService;

public class AccountService implements UserDetailsService {

    public Account findAccountByUsernameAndPassword(String username, String password) {
        Account account = new Account();
        account.setName(username);
        account.setPassword(password);
        account.setEmail(username);
        return account;
    }

    @Override
    public UserDetails loadUser(String username, String password) {
        Account account = findAccountByUsernameAndPassword(username, password);
        return account;
    }

    public void createNewAccount(Account account) {

    }

    public void updateAccount(Account account) {

    }

}
