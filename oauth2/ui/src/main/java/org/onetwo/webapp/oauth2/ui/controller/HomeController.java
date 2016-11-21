package org.onetwo.webapp.oauth2.ui.controller;

import java.security.Principal;

import org.onetwo.common.data.AbstractDataResult.SimpleDataResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {
	
    @Autowired
    private OAuth2RestTemplate restTemplate;
    @Value("${api-server:http://localhost:9080}/article")
    private String articleUrl;
	
	@RequestMapping(method=RequestMethod.GET)
	public SimpleDataResult<?> list(Principal principal){
		return restTemplate.getForObject(articleUrl, SimpleDataResult.class);
	}

}
