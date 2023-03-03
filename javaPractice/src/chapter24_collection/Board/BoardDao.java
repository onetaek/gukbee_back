package chapter24_collection.Board;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	List<Board> getBoardList() {
		List<Board> boardList = new ArrayList<Board>();
		boardList.add(new Board("재목1","내용1"));
		boardList.add(new Board("재목2","내용2"));
		boardList.add(new Board("재목3","내용3"));
		return boardList;
	}
}
