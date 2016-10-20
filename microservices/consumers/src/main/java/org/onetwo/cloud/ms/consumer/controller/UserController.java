package org.onetwo.cloud.ms.consumer.controller;

import java.util.List;

import org.onetwo.cloud.ms.consumer.client.UserFeignClient;
import org.onetwo.cloud.ms.consumer.client.UserRestClient;
import org.onetwo.cloud.ms.consumer.vo.AdminUser;
import org.onetwo.cloud.ms.consumer.vo.PageParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {
	
	@Autowired
	private UserFeignClient userFeignClient;
	
	@Autowired
	private UserRestClient userRestClient;
	
	@GetMapping
	public List<AdminUser> index(){
		List<AdminUser> users = userFeignClient.list();
		return users;
	}
	
	@GetMapping("list")
	public List<AdminUser> list(PageParams page){
		List<AdminUser> users = userRestClient.list(page);
		return users;
	}

}
