package org.onetwo.webapp.oauth2.authorization.utils;

import org.onetwo.plugins.admin.AdminModule;




public interface Apps {
	String name = "系统权限";
	String appCode = Apps.class.getSimpleName();
	
	Class<?>[] children = new Class<?>[]{AdminModule.class};

}
