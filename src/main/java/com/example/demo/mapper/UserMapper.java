package com.example.demo.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.dto.UserDto;

@Mapper
public interface UserMapper {
	@Select("select * from SP_MEMBER")
	ArrayList<UserDto> selectList();
}
