package com.imsystem.controller.order;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/order")
public class OrderController {

	@RequestMapping("/show")
	public String show() {
		return "wjh/allot";
	}
	
}
