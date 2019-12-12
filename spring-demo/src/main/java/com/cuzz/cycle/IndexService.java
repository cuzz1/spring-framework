package com.cuzz.cycle;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author cuzz@douyu.tv
 * @date 2019/12/12 16:44
 */
@Component
public class IndexService {

	@Resource
	private UserService userService;

	public IndexService () {
		System.out.println("Constructor from indexService");
	}
}
