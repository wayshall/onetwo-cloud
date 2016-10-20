package org.onetwo.cloud.ms.consumer.client;

import java.util.List;

import org.onetwo.cloud.ms.consumer.vo.AdminUser;
import org.onetwo.cloud.ms.consumer.vo.PageParams;
import org.onetwo.common.data.AbstractDataResult.SimpleDataResult;
import org.onetwo.common.exception.ServiceException;
import org.onetwo.common.spring.rest.RestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserRestClient {

	@Autowired
	private RestTemplate restTemplate;
	
	public List<AdminUser> list(PageParams page){
		ResponseEntity<SimpleDataResult<List<AdminUser>>> res = this.restTemplate.exchange("http://user-service/user.json", HttpMethod.GET, RestUtils.createFormEntity(page), new ParameterizedTypeReference<SimpleDataResult<List<AdminUser>>>(){});
		if(res.getBody().isError()){
			throw new ServiceException(res.getBody().getMessage());
		}
		return res.getBody().getData();
	}
}
