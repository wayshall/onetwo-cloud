package org.onetwo.cloud.ms.consumer;

import org.onetwo.common.spring.rest.JFishRestTemplate;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppContextConfig {
	
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate(){
		JFishRestTemplate restTemplate = new JFishRestTemplate();
		return restTemplate;
	}

}
