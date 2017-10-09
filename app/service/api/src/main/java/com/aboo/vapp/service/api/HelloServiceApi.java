package com.aboo.vapp.service.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public interface HelloServiceApi {
	
	/**
	 * hello接口测试
	 * @param name 名称参数
	 * @return
	 */
	@GetMapping(value = "/hello")
	public String hello(@RequestParam("name") String name);;
}
