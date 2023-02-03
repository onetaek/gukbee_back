package sample_news.dto;

import java.util.Date;

public class NewsDTO {
	private int aid;
	private String title;
	private String img;
	private Date date;
	private String content;
	
	public NewsDTO() {}
	
	public NewsDTO(int aid, String title, Date date) {
		this.aid = aid;
		this.title = title;
		this.date = date;
	}
	public NewsDTO(int aid, String title, String img, Date date, String content) {
		this.aid = aid;
		this.title = title;
		this.img = img;
		this.date = date;
		this.content = content;
	}
	

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "NewsDTO [aid=" + aid + ", title=" + title + ", img=" + img + ", date=" + date + ", content=" + content
				+ "]";
	}
	
	
}
