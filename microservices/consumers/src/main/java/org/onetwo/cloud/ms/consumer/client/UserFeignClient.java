package org.onetwo.cloud.ms.consumer.client;

import java.util.List;

import org.onetwo.cloud.ms.consumer.vo.AdminUser;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="user-service")
public interface UserFeignClient {

	@RequestMapping(value="/user", method = RequestMethod.GET)
	public List<AdminUser> list();
}
