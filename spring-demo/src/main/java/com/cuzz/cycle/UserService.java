package com.cuzz.cycle;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author cuzz@douyu.tv
 * @date 2019/12/12 16:44
 */
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
