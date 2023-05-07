package io.playdata.board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.playdata.board.dto.UserDTO;
import io.playdata.board.repository.UserRepository;

@Service
public class UserServiceImpl {
	@Autowired
	private UserRepository repository;
//	public UserServiceImpl() {	}
//	public UserServiceImpl(UserRepository repository) {
//		this.repository = repository;
//	}
	
	public UserDTO login(UserDTO dto) {
		UserDTO user = repository.login(dto);
		if(user == null) {
			throw new NullPointerException("000001");
		}
		return user; 
	}
	
	
	
}
