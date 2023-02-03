package sample_news.restapicontroller;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import sample_news.dao.NewsDAO;
import sample_news.dto.NewsDTO;

@Path("/news")
public class NewsAPIService {
	sample_news.dao.NewsDAO dao;
	
	public NewsAPIService() {
		dao = new NewsDAO();
	}
	
	// 뉴스 등록
	@POST
	@Consumes(MediaType.APPLICATION_JSON) // 클라이언트 요청에 포함된 미디어 타입을 지정. JSON을 사용,
	public String addNews(NewsDTO news) {
		try {
			dao.addNews(news); // @Consumes 설정에 따라 HTTP Body에 포함된 JSON문자열이 자동으로 News로 변환.
			// 이를 위해서 JSON 문자열의 키와 News 객체의 멤버 변수명이 동일해야 함.
		} catch (Exception e) {
			e.printStackTrace();
			return "News API: 뉴스 등록 실패!!";
		}
		return "News API: 뉴스 등록됨!!";
	}
	
	//뉴스상세보기
	@GET
	@Path("{aid}")
	@Produces(MediaType.APPLICATION_JSON)
	public NewsDTO getNews(@PathParam("aid") int aid) {
		NewsDTO news = null;
		
		try {
			news = dao.getNews(aid);
		} catch (Exception e) {
			System.out.println("해당하는 aid값이 존재하지않습니다!");
			e.printStackTrace();
		}
		return news;
	}
	
	//뉴스삭제하기
	@DELETE
	@Path("{aid}")
	@Consumes(MediaType.APPLICATION_JSON)
	public String delNews(@PathParam("aid") int aid) {
		try {
			dao.delNews(aid);
		} catch (Exception e) {
			System.out.println("해당하는 aid값이 존재하지않습니다!");
			e.printStackTrace();
		}
		return "삭제 완료";
	}
	
	//뉴스목록보기
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<NewsDTO> getAll(){
		List<NewsDTO> newsList = new ArrayList<>();
		try {
			newsList = dao.getAll();
		} catch (Exception e) {
			System.out.println("뉴스목록을 불러오는데 실패하였습니다");
			e.printStackTrace();
		}
		return newsList;
	}
	
	
} //NewsAPIService end
