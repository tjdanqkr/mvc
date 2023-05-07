package io.playdata.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.playdata.board.dto.BoardDTO;
import io.playdata.board.repository.BoardRepository;


@Service
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	private BoardRepository boardRepository;

	@Override
	public int insert(BoardDTO dto) {
		return boardRepository.insert(dto);
	}

	@Override
	public List<BoardDTO> findAll() {
		return boardRepository.findAll();
	}

	@Override
	public BoardDTO findOneById(Integer id) {
		return boardRepository.findOneById(id);
	}

	@Override
	public Integer deleteById(Integer id) {
		return boardRepository.deleteById(id);
	}

	@Override
	public Integer updateById(BoardDTO dto) {
		return boardRepository.updateById(dto);
	}
	
	public Integer viewCount(BoardDTO dto) {
		BoardDTO findOne = boardRepository.findOneById(dto.getId());
//		findOne.setViewCount(findOne.getViewCount()+1);
		boardRepository.updateById(findOne);
		return boardRepository.updateById(dto);
	}

}
