package mvc.model;

import java.sql.Date;

public class RippleDTO {
	private int rippleId;
	private String boardName;
	private int boardNum;
	private String memberId;
	private String name;
	private String content;
	private Date insertDate;
	private String ip;
	
	public RippleDTO() {
		super();
	}
	public RippleDTO(int rippleId, String boardName, int boardNum, String memberId, String name, String content,
			Date insertDate, String ip) {
		super();
		this.rippleId = rippleId;
		this.boardName = boardName;
		this.boardNum = boardNum;
		this.memberId = memberId;
		this.name = name;
		this.content = content;
		this.insertDate = insertDate;
		this.ip = ip;
	}
	public int getRippleId() {
		return rippleId;
	}
	public void setRippleId(int rippleId) {
		this.rippleId = rippleId;
	}
	public String getBoardName() {
		return boardName;
	}
	public void setBoardName(String boardName) {
		this.boardName = boardName;
	}
	public int getBoardNum() {
		return boardNum;
	}
	public void setBoardNum(int boardNum) {
		this.boardNum = boardNum;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getInsertDate() {
		return insertDate;
	}
	public void setInsertDate(Date insertDate) {
		this.insertDate = insertDate;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	
	
}
