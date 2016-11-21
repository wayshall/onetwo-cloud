package org.onetwo.webapp.oauth2.authorization;

import org.onetwo.boot.module.security.url.EnableJFishUrlSecurity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerEndpointsConfiguration;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.provider.endpoint.FrameworkEndpointHandlerMapping;

@Configuration
//@EnableOAuth2Client
@EnableAuthorizationServer
@EnableJFishUrlSecurity
public class AppContextConfig{
	
	/*@Configuration
    @Order(-20)
	static class OAuth2ServerConfigurer extends WebSecurityConfigurerAdapter {

		@Autowired
		private AuthorizationServerEndpointsConfiguration endpoints;
		
		@Override
		public void configure(HttpSecurity http)
				throws Exception {
			FrameworkEndpointHandlerMapping handlerMapping = endpoints.oauth2EndpointHandlerMapping();
			http
				.authorizeRequests()
				.antMatchers(handlerMapping.getServletPath("/oauth/authorize"), handlerMapping.getServletPath("/oauth/confirm_access"))
				.authenticated();
		}

	}*/
	
}
