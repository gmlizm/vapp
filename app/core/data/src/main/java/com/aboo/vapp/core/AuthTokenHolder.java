package com.aboo.vapp.core;

import java.io.Serializable;

public class AuthTokenHolder implements Serializable {

	private static final long serialVersionUID = -4773001014048874162L;
	/**
     *  线程变量
     */
    private static final ThreadLocal<AuthToken> context          = new ThreadLocal<AuthToken>();

    /**
     * 获得当前上下文中的用户权限信息
     * 
     * @return 获取用户权限
     */
    public static AuthToken getAuthToken() {
        return (AuthToken) context.get();
    }

    /**
     * @param authToken 用户授权信息
     */
    public static void setAuthToken(AuthToken authToken) {
        context.set(authToken);
    }

}