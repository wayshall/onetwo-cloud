package org.onetwo.webapp.oauth2.resource;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;


@Configuration
@EnableResourceServer
public class AppContextConfig extends WebSecurityConfigurerAdapter{

	
	/*public AppContextConfig(ApplicationContext applicationContext, OAuth2SsoProperties sso) {
		super(applicationContext, sso);
	}*/

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.httpBasic()
			.disable()
			.requestMatchers()
				.antMatchers("/article**")
			.and()
			.authorizeRequests()
				.anyRequest()
			.authenticated()
			;
	}

}
