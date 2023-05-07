package io.playdata.board.dto;

public class UserDTO {
	
	private Integer id;
	private String memberId;
	private String memberPW;
	private String memberName;
	
	public UserDTO() {}
	
	public UserDTO(Integer id, String memberId, String memberPW, String memberName) {
		super();
		this.id = id;
		this.memberId = memberId;
		this.memberPW = memberPW;
		this.memberName = memberName;
	}
	
	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", memberId=" + memberId + ", memberPW=" + memberPW + ", memberName=" + memberName
				+ "]";
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberPW() {
		return memberPW;
	}
	public void setMemberPW(String memberPW) {
		this.memberPW = memberPW;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	

}
