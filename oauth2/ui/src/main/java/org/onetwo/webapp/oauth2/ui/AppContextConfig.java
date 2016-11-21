package org.onetwo.webapp.oauth2.ui;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.oauth2.client.OAuth2ClientContext;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.resource.OAuth2ProtectedResourceDetails;


@Configuration
@EnableOAuth2Sso
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
				.antMatchers("/**")
			.and()
			.authorizeRequests()
				.anyRequest()
			.authenticated()
			;
	}

    @Bean
    OAuth2RestTemplate oauth2RestTemplate(OAuth2ClientContext oauth2ClientContext, OAuth2ProtectedResourceDetails details) {
        return new OAuth2RestTemplate(details, oauth2ClientContext);
    }
}
