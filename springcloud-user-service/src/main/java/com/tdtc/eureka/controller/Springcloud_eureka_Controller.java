package com.tdtc.eureka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tdtc.eureka.feign.FindAllClient;

@RestController
public class Springcloud_eureka_Controller {
	@Autowired
	FindAllClient findAllClient;
	
	@RequestMapping(value = "/listPage", method = RequestMethod.GET)
	public String getUserAll() {
		return findAllClient.findAll();
	}
}
