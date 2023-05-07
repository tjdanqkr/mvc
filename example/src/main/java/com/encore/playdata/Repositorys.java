package com.encore.playdata;


import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class Repositorys {
	@Autowired
	private SqlSessionTemplate sessionTemplate;
	public int insert(BoardDTO boardDTO) {
		return sessionTemplate.insert("board.insert", boardDTO);
	}
	
}
