package com.example.demo.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.SampleService;
import com.example.demo.dto.SampleDto;

@RestController
public class SampleController {
	
	@Autowired
	private SampleService ss;

	@PostMapping("/userList")
	public Map<String, Object> userList(){
		Map<String, Object> result = new HashMap<String, Object>();
		
		result.put("dlt_list", ss.getUserList());
		System.out.println(result);
		return result;
	}
	
	@PostMapping("/testJson")
	public Map<String, Object> testJson(){
		Map<String, Object> result = new HashMap<String, Object>();
		ArrayList<SampleDto> sampleList = new ArrayList();
		
		sampleList.add(SampleDto.builder()
				.id("001")
				.name("사용자 1")
				.phone("010 1100 0011")
				.build());
		
		sampleList.add(SampleDto.builder()
				.id("002")
				.name("사용자 2")
				.phone("010 2200 0022")
				.build());
		
		result.put("sm_list", sampleList);
		System.out.println(result);
		return result;
	}
}
