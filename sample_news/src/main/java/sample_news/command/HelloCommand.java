package sample_news.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sample_news.View.View;

public class HelloCommand implements Command{

	@Override
	public View execute(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println("Hello Command");
		return null;
	}
	
}
