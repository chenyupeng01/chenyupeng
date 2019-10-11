package com.bw.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bw.entity.Industry;
import com.bw.service.IndustryService;

@Controller
@RequestMapping("/industry")
public class IndustryController {
	@Resource
	private IndustryService service;
	
	@RequestMapping("/queryAll.do")
	@ResponseBody
	public List<Industry> list(Integer sid){
		List<Industry> list = service.queryAll(sid);
		System.out.println(list);
		return list;
	}
	
	
	@RequestMapping("/toList.do")
	public String tolist(){
		return "hello";
	}
}
