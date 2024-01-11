package com.example.demo;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.UserDto;
import com.example.demo.mapper.UserMapper;

@Service
public class SampleService {

	@Autowired
	private UserMapper um;
	
	public ArrayList<UserDto> getUserList() {
		
		System.out.println("서비스 실행");
		
		ArrayList<UserDto> dtoList = um.selectList();
		
		return dtoList;
	}
}
