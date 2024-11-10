package com.pattern.design_patterns.structural_patterns.adapter.before.security;

import com.pattern.design_patterns.structural_patterns.adapter.after.AccountUserDetails;
import com.pattern.design_patterns.structural_patterns.adapter.before.Account;
import com.pattern.design_patterns.structural_patterns.adapter.before.AccountService;

public interface UserDetailsService {
    UserDetails loadUser(String username, String password);
}
