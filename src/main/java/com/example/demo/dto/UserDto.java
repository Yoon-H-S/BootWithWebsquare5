package com.example.demo.dto;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {
	private int EMP_CD;
	private String EMP_NM;
	private String GENDER_CD;
	private String JOIN_DATE;
	private String POSITION_CD;
	private String DUTY_CD;
	private String ROLE_CD;
	private String ASSIGNED_TASK;
	private String EMAIL;
	private String ZIP_CD;
	private String ADDRESS1;
	private String ADDRESS2;
	private String IMAGE_PATH;
	private Date CREATED_DATE;
	private Date updateDate;
}
