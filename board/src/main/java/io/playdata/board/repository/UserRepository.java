package io.playdata.board.repository;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import io.playdata.board.dto.UserDTO;

@Repository
public class UserRepository {
	@Autowired
	private SqlSessionTemplate sessionTemplate;
//	public UserRepository() {	}
//	public UserRepository(SqlSessionTemplate sessionTemplate) {
//		this.sessionTemplate = sessionTemplate;
//	}
	
	public UserDTO login(UserDTO dto) {
		return sessionTemplate.selectOne("user.login", dto);
//		return null;
	}
	
	

}
