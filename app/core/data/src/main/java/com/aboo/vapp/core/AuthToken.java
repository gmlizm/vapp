package com.aboo.vapp.core;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.aboo.vapp.core.model.Module;
import com.aboo.vapp.core.model.User;

/**
 * 在用户登录后被创建，包含用户信息,操作权限列表,菜单列表等信息，用于代表用户身份，保存在Session中。
 * 
 */
public class AuthToken implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 登陆用户 */
    private User user;

    /** 授权子系统 */
    private List<Module> modules = new ArrayList<Module>();

    /** 登陆的IP地址 */
    private String loginIP;

    public AuthToken() {
    }

    public User getUser() {
	return user;
    }

    public void setUser(User user) {
	this.user = user;
    }

    public String getLoginIP() {
	return loginIP;
    }

    public void setLoginIP(String loginIP) {
	this.loginIP = loginIP;
    }

    public List<Module> getModules() {
	return modules;
    }

    public void setModules(List<Module> modules) {
	if (modules == null) {
	    return;
	}
	this.modules = modules;
    }

}
