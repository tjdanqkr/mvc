package io.playdata.board.exception;

public class ErrorCode {
	private String[] errMsg = new String[] {"", "ã�� ������ ����"};
	public String get(String errCode) {
		try {
			return errMsg[Integer.parseInt(errCode)];
		}catch(Exception e){
			return "";
		}
	}
}
