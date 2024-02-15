package com.study.jsp.model;

import java.sql.Date;
/*
 * java.util.Date - 날짜시간 저장
 * java.sql.Date - 날짜만 저장
 */

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class BoardDTO {
		
	private int seq;
	private String title;
	private String nickname;
	private String content;
	private Date regdate;
	private int cnt;
	private String userid;
	
}
