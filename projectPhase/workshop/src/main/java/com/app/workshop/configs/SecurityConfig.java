//package com.app.workshop.configs;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//  public void configure(HttpSecurity httpSecurity) throws Exception {
//    httpSecurity.authorizeRequests()
//      .antMatchers("/add").hasRole("USER")
//      .and()
//      .formLogin();
//  }
//
//  @Autowired
//  public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//    auth.inMemoryAuthentication()
//      .withUser("user").password("{noop}password").roles("USER");
//  }
//}
