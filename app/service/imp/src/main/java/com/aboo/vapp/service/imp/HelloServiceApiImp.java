package com.aboo.vapp.service.imp;

import org.springframework.web.bind.annotation.RestController;

import com.aboo.vapp.service.api.HelloServiceApi;

import io.swagger.annotations.ApiOperation;

@RestController
public class HelloServiceApiImp implements HelloServiceApi {

	@Override
	@ApiOperation(value="/hello", notes="hello-service-api")
//	@PreAuthorize("hasAuthority('auth_user')")
	public String hello(String name) {
		return "hello => "+name;
	}

}
