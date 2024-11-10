package com.pattern.design_patterns.structural_patterns.adapter.after;

import com.pattern.design_patterns.structural_patterns.adapter.before.Account;
import com.pattern.design_patterns.structural_patterns.adapter.before.AccountService;
import com.pattern.design_patterns.structural_patterns.adapter.before.security.UserDetails;
import com.pattern.design_patterns.structural_patterns.adapter.before.security.UserDetailsService;

public class AccountUserDetailsService implements UserDetailsService {
    AccountService accountService;

    public AccountUserDetailsService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public UserDetails loadUser(String username, String password) {
        Account account = accountService.findAccountByUsernameAndPassword(username, password);
        return new AccountUserDetails(account);
    }
}
