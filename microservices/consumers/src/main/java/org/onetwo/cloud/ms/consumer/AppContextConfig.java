package org.onetwo.cloud.ms.consumer;

import org.onetwo.common.spring.rest.ExtRestTemplate;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppContextConfig {
	
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate(){
		ExtRestTemplate restTemplate = new ExtRestTemplate(new HttpComponentsClientHttpRequestFactory());
		return restTemplate;
	}

}
