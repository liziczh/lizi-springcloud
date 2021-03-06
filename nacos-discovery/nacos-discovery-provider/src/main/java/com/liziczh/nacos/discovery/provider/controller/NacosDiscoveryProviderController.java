package com.liziczh.nacos.discovery.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhehao.chen
 */
@RestController
@RequestMapping("/provide/")
public class NacosDiscoveryProviderController {
	@GetMapping(value = "name/{name}")
	public String name(@PathVariable String name) {
		return "My Name is " + name;
	}
}
