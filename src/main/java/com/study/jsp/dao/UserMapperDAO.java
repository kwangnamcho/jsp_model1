package com.study.jsp.dao;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.study.jsp.model.UserVO;

public class UserMapperDAO implements UserMapper {

	SqlSession sqlSession;

	public UserMapperDAO(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	public UserMapper mp() {
		return sqlSession.getMapper(UserMapper.class);
	}

	@Override
	public UserVO getOne(Map<String, String> loginInfo) {
		// TODO Auto-generated method stub
		return null;
	}
}