package com.pattern.design_patterns.structural_patterns.adapter.before.security;

public interface UserDetailsService {
    UserDetails loadUser(String username, String password);
}
