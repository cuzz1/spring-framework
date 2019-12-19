package com.cuzz.cycle;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;


@Component
public class UserService {

	@Resource
	private IndexService indexService;

	public UserService() {
		System.out.println("Constructor from userService");
	}

	public void getIndexService() {
		System.out.println(indexService);
	}
}
