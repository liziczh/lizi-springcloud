package com.liziczh.nacos.discovery.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhehao.chen
 */
@RestController
@RequestMapping("/consumer/")
public class NacosDiscoveryConsumerController {
	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	@Autowired
	private RestTemplate restTemplate;
	@GetMapping(value = "name/{name}")
	public String consumer(@PathVariable String name) {
		return restTemplate.getForObject("http://nacos-provider/provide/out/"+ name, String.class);
	}
}
