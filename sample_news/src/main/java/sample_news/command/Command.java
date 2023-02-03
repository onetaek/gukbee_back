package sample_news.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sample_news.View.View;

public interface Command {
	public View execute(HttpServletRequest req, HttpServletResponse resp);
}
