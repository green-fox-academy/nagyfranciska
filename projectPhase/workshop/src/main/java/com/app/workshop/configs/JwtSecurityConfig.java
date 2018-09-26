package com.app.workshop.configs;

import com.app.workshop.security.JwtAuthenticationEntryPoint;
import com.app.workshop.security.JwtAuthenticationFilter;
import com.app.workshop.security.JwtAuthenticationProvider;
import com.app.workshop.security.JwtAuthenticationSuccessHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class JwtSecurityConfig extends WebSecurityConfigurerAdapter {

  private JwtAuthenticationProvider provider;
  private JwtAuthenticationEntryPoint entryPoint;

  public JwtAuthenticationFilter authenticationFilter() {
    JwtAuthenticationFilter filter = new JwtAuthenticationFilter();
    filter.setAuthenticationSuccessHandler(new JwtAuthenticationSuccessHandler());
    return filter;
  }

  @Override
  protected void configure(HttpSecurity httpSecurity) throws Exception {
    httpSecurity.csrf().disable()
      .authorizeRequests().antMatchers("/rest/**").authenticated()
      .and()
      .exceptionHandling().authenticationEntryPoint(entryPoint)
      .and()
      .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);

    httpSecurity.addFilterBefore(authenticationFilter(), UsernamePasswordAuthenticationFilter.class);
    httpSecurity.requestCache();
  }
}
