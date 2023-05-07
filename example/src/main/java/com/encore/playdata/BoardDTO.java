package com.encore.playdata;

public class BoardDTO {
	private Integer board_id;
	private String title;
	private String content;
	private String username;
	
	@Override
	public String toString() {
		return "BoardDTO [board_id=" + board_id + ", title=" + title + ", content=" + content + ", user=" + username + "]";
	}

	public Integer getBoard_id() {
		return board_id;
	}
	
	public void setBoard_id(Integer board_id) {
		this.board_id = board_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getUser() {
		return username;
	}
	public void setUser(String user) {
		this.username = user;
	}
	
	public BoardDTO(Integer board_id, String title, String content, String user) {
		super();
		this.board_id = board_id;
		this.title = title;
		this.content = content;
		this.username = user;
	}
	public BoardDTO(String title, String content, String user) {
		super();
		this.title = title;
		this.content = content;
		this.username = user;
	}
	public BoardDTO() {
		super();
	}
}
