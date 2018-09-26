package com.app.workshop.security;

import com.app.workshop.models.JwtAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class JwtAuthenticationFilter extends AbstractAuthenticationProcessingFilter {

//  This class is the entry point of our JWT authentication process; the filter extracts the JWT token
//  from the request headers and delegates authentication to the injected AuthenticationManager.
//  If the token is not found, an exception is thrown that stops the request from processing.
//  We also need an override for successful authentication because the default Spring flow would
//  stop the filter chain and proceed with a redirect.

//  We have to add this default constructor:

  public JwtAuthenticationFilter() {
    super("/**");
  }

//  Not mandatory:

  @Override
  protected boolean requiresAuthentication(HttpServletRequest request, HttpServletResponse response) {
    return true;
  }

//  Overriding was required after extending AbstractAuthenticationProcessingFilter:

  @Override
  public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException, IOException, ServletException {

    String header = request.getHeader("Authorization");

//    if (header == null || !header.startsWith("Bearer ")) {
//      throw new JwtTokenMissingException("No JWT token found in request headers");
//    }

    String authToken = header.substring(7);
    JwtAuthenticationToken authRequest = new JwtAuthenticationToken(authToken);

    return getAuthenticationManager().authenticate(authRequest);
  }

  @Override
  protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain, Authentication authResult)
    throws IOException, ServletException {
    super.successfulAuthentication(request, response, chain, authResult);

    // As this authentication is in HTTP header, after success we need to continue the request normally
    // and return the response as if the resource was not secured at all

    chain.doFilter(request, response);
  }
}
