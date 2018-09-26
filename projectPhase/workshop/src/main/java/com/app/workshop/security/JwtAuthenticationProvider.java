package com.app.workshop.security;

import com.app.workshop.models.JwtAuthenticationToken;
import com.app.workshop.models.JwtUtil;
import com.app.workshop.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.AbstractUserDetailsAuthenticationProvider;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;

public class JwtAuthenticationProvider extends AbstractUserDetailsAuthenticationProvider {

//  In this class, we are using Spring’s default AuthenticationManager, but we inject it with
//  our own AuthenticationProvider that does the actual authentication process. To implement this,
//  we extend the AbstractUserDetailsAuthenticationProvider, which requires us only to return UserDetails
//  based on the authentication request, in our case, the JWT token wrapped in the JwtAuthenticationToken class.
//  If the token is not valid, we throw an exception. However, if it is valid and decryption by JwtUtil
//  is successful, we extract the user details (we will see exactly how in the JwtUtil class),
//  without accessing the database at all. All the information about the user, including his or her
//  roles, is contained in the token itself.

  @Autowired
  private JwtUtil jwtUtil;

  @Override
  public boolean supports(Class<?> authentication) {
    return (JwtAuthenticationToken.class.isAssignableFrom(authentication));
  }

  @Override
  protected void additionalAuthenticationChecks(UserDetails userDetails, UsernamePasswordAuthenticationToken authentication) throws AuthenticationException {
  }

  @Override
  protected UserDetails retrieveUser(String username, UsernamePasswordAuthenticationToken authentication) throws AuthenticationException {

    JwtAuthenticationToken jwtAuthenticationToken = (JwtAuthenticationToken) authentication;
    String token = jwtAuthenticationToken.getToken();
    User parsedUser = jwtUtil.parseToken(token);

//    if (parsedUser == null) {
//      throw new JwtTokenMalformedException("JWT token is not valid");
//    }

    List<GrantedAuthority> authorityList = AuthorityUtils.commaSeparatedStringToAuthorityList(parsedUser.getRole());
    return new AuthenticatedUser(parsedUser.getId(), parsedUser.getUsername(), token, authorityList);
  }
}
