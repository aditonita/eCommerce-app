package com.shop.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    @Autowired
    public void configureGlobalSecurity(AuthenticationManagerBuilder auth)
            throws Exception {
        auth.inMemoryAuthentication()
            .withUser("Aurelian").password("password")
            .roles("USER", "ADMIN", "shoper")
            .and()
            .withUser("Vero").password("password")
            .roles("USER");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
            .antMatchers("/login").permitAll()
            .antMatchers("/", "/*product*/**").access("hasRole('USER')")
            .antMatchers("/", "/*user*/**").access("hasRole('ADMIN')")
            .and()
            .formLogin();

        http.authorizeRequests().antMatchers("/login").permitAll()
            .antMatchers("/", "/administrationPage").access("hasRole('ADMIN')").and()
            .formLogin();


    }
}
