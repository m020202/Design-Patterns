package com.pattern.design_patterns.structural_patterns.adapter.after;

import com.pattern.design_patterns.structural_patterns.adapter.before.Account;
import com.pattern.design_patterns.structural_patterns.adapter.before.security.UserDetails;

public class AccountUserDetails implements UserDetails {
    private Account account;

    public AccountUserDetails(Account account) {
        this.account = account;
    }

    @Override
    public String getUsername() {
        return account.getName();
    }

    @Override
    public String getPassword() {
        return account.getPassword();
    }
}
