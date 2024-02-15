package com.study.jsp.srv;

import java.util.Map;

import com.study.jsp.dao.UserMapper;
import com.study.jsp.model.UserDTO;
import com.study.jsp.model.UserVO;

public class UserServiceImpl implements UserService {
	
	private UserMapper userDao;
	
	public UserServiceImpl(UserMapper userDao) {
		this.userDao = userDao;
	}

	@Override
	public UserDTO getOne(Map<String, String> loginInfo) {
		
	    System.out.println(loginInfo.get("userid"));
	    System.out.println(loginInfo.get("password"));
		
	    UserVO vo = userDao.getOne(loginInfo);
	    
	    UserDTO dto = null;

	    if (vo != null) {

	        dto = new UserDTO(); 
	        dto.setName(vo.getName());
	        dto.setPassword(vo.getPassword()); 
	        dto.setUserid(vo.getUserid());
	        dto.setRole(vo.getRole());
	     }

	     return dto;
	    
	}

}
