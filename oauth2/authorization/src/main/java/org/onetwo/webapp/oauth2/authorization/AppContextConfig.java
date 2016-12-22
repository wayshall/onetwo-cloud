package org.onetwo.webapp.oauth2.authorization;

import org.onetwo.boot.module.security.url.EnableUrlSecurity;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@Configuration
//@EnableOAuth2Client
@EnableAuthorizationServer
@EnableUrlSecurity
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
