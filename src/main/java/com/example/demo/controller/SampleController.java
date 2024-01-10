package com.example.demo.controller;

import java.util.*;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.UserDto;

@RestController
public class SampleController {

	@PostMapping("/testJson")
	public Map<String, Object> testJson(@RequestBody Map<String, Object> param){
		Map<String, Object> result = new HashMap<String, Object>();
		List<UserDto> useList = new ArrayList<UserDto>();
		
		useList.add(UserDto.builder()
				.id("I001")
				.name("사용자 1")
				.tel("010-1000-0011")
				.build());
		
		useList.add(UserDto.builder()
				.id("I002")
				.name("사용자 2")
				.tel("010-2000-0022")
				.build());
		
		result.put("dlt_list", useList);
		return result;
	}
}
