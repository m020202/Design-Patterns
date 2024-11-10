package com.pattern.design_patterns.structural_patterns.adapter.after;

import com.pattern.design_patterns.structural_patterns.adapter.before.AccountService;
import com.pattern.design_patterns.structural_patterns.adapter.before.security.LoginHandler;
import com.pattern.design_patterns.structural_patterns.adapter.before.security.UserDetailsService;

public class App {
    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        UserDetailsService userDetailsService = new AccountUserDetailsService(accountService);

        LoginHandler loginHandler = new LoginHandler(userDetailsService);
        String login = loginHandler.login("hello", "test");
        System.out.println(login);

    }
}
