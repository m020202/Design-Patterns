package com.pattern.design_patterns.structural_patterns.adapter.direct;

import com.pattern.design_patterns.structural_patterns.adapter.before.security.LoginHandler;
import com.pattern.design_patterns.structural_patterns.adapter.before.security.UserDetailsService;

public class App {
    public static void main(String[] args) {
        UserDetailsService accountService = new AccountService();

        LoginHandler loginHandler = new LoginHandler(accountService);
        String login = loginHandler.login("hello", "test");
        System.out.println(login);

    }
}
