package org.onetwo.cloud.ms.user;

import java.util.List;

import org.onetwo.common.db.BaseEntityManager;
import org.onetwo.common.utils.Page;
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
		Page<AdminUser> pageQuery = Page.create(page.getPage(), page.getSize());
		baseEntityManager.findPage(AdminUser.class, pageQuery);
		return pageQuery.getResult();
	}

}
