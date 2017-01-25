package org.onetwo.webapp.oauth2.resource.utils;

import org.onetwo.ext.permission.PermissionConfigAdapter;
import org.onetwo.plugins.admin.entity.AdminPermission;
import org.springframework.stereotype.Component;

@Component
public class MenuConfig extends PermissionConfigAdapter<AdminPermission> {
	
	public MenuConfig(){
	}

	@Override
    public Class<?> getRootMenuClass() {
	    return Apps.class;
    }

	@Override
    public String[] getChildMenuPackages() {
	    return null;
    }

	@Override
    public Class<AdminPermission> getIPermissionClass() {
	    return AdminPermission.class;
    }
	
	

}
