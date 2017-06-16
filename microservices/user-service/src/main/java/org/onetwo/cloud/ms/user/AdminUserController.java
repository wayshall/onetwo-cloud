package org.onetwo.cloud.ms.user;

import java.util.List;
import java.util.Map;

import org.onetwo.common.db.spi.BaseEntityManager;
import org.onetwo.common.utils.Page;
import org.onetwo.common.web.utils.WebHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class AdminUserController {
	
	@Autowired
	private BaseEntityManager baseEntityManager;
	
	@GetMapping
	public List<AdminUser> list(PageParams page){
		Map map = WebHolder.getRequest().get().getParameterMap();
		System.out.println("map:"+map);
		Page<AdminUser> pageQuery = Page.create(page.getPage(), page.getSize());
		baseEntityManager.findPage(AdminUser.class, pageQuery);
		return pageQuery.getResult();
	}

}
