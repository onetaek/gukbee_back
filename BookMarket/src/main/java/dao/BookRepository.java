package dao;

import java.util.ArrayList;

import dto.Book;
import dto.Product;

public class BookRepository {
	private ArrayList<Book> listOfBooks = new ArrayList<Book>();
	private static BookRepository instance = new BookRepository();
	public static BookRepository getInstance() {
		return instance;
	}
	
	public BookRepository() {
		Book book1 = new Book("B1234", "만일 내가 인생을 다시 산다면", 15480);
		book1.setAuthor("김혜남");
		book1.setDescription("30년 동안 정신분석 전문의로 일해 온 김혜남이 벌써 마흔이 되고 당신에게 해주고 싶은말들을 담은 책이다.");
		book1.setPublisher("메이븐");
		book1.setCategory("자서전");
		book1.setUnitsInStock(214);
		book1.setTotalPages(364);
		book1.setReleaseDate("20221111");
		book1.setCondition("New");
		book1.setFilename("1.jpg");
		
		Book book2 = new Book("B2298", "트랜드 코리아2023", 17100);
		book2.setAuthor("김난도");
		book2.setDescription("세계화의 종말, 갈등과 분열, 그리고 전쟁. 수십년간 이어져 온 평화와 공전의 시대는 막을 내리고 엄청난 위기감 속에서 사람들은 다가올 미래를 두려워한다.");
		book2.setPublisher("미래의 창");
		book2.setCategory("경제/주식");
		book2.setUnitsInStock(108);
		book2.setTotalPages(245);
		book2.setReleaseDate("20221005");
		book2.setCondition("New");
		book2.setFilename("2.jpg");
		
		Book book3 = new Book("B4409", "불편한 편의점", 12600);
		book3.setAuthor("김호연");
		book3.setDescription("누적 판매 40만부 돌파, 2022년 가장 사랑받는 소설 ★★★전 서전 종합베스트 1위");
		book3.setPublisher("나무옆의자");
		book3.setCategory("소설");
		book3.setUnitsInStock(187);
		book3.setTotalPages(278);
		book3.setReleaseDate("20210420");
		book3.setCondition("Old");
		book3.setFilename("3.jpg");
		
		listOfBooks.add(book1);
		listOfBooks.add(book2);
		listOfBooks.add(book3);
	}
	
	public ArrayList<Book> getAllBooks(){
		return listOfBooks;
	}
	
	public Book getBookById(String bookId) {
		Book bookById =null;
		for(Book book:listOfBooks) {
			if(book != null && book.getBookId() != null && book.getBookId().equals(bookId)) {
				bookById = book;
				break;
			}
		}
		
		return bookById;
	}
	public void addBook(Book book) {
		listOfBooks.add(book);
	}
}
