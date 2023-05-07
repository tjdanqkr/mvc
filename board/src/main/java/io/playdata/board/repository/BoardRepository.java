package io.playdata.board.repository;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import io.playdata.board.dto.BoardDTO;

@Repository
public class BoardRepository {
	
	@Autowired
	private SqlSessionTemplate sessionTemplate;
//	public BoardRepository(SqlSessionTemplate sessionTemplate) {
//		this.sessionTemplate = sessionTemplate;
//	}
	
	public int insert(BoardDTO dto) {
		return sessionTemplate.insert("board.12344", dto);
	}
	
	public List<BoardDTO> findAll() {
		return sessionTemplate.selectList("board.findAll");
	}
	
	public BoardDTO findOneById(Integer id) {
		return sessionTemplate.selectOne("board.findOneById", id);
	}
	
	public Integer deleteById(Integer id) {
		return sessionTemplate.delete("board.deleteById", id);
	}
	
	public Integer updateById(BoardDTO dto) {
		return sessionTemplate.update("board.updateById", dto);
	}

}
