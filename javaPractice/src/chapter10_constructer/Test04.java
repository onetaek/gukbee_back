package chapter10_constructer;

class Song{
	String title;
	String artiest;
	int length;
	
	Song(){}
	
	Song(String title){
		this();
		this.title = title;
	}
	
	Song(String title,String artiest){
		this(title);
		this.artiest = artiest;
	}
	
	Song(String title,String artiest, int length){
		this(title,artiest);
		this.length = length;
	}
	public String toString(){
		return "Song{title='"+title+"', artiest='"+artiest+"', length='"+length+"'}";
	}
	
}

public class Test04 {

	public static void main(String[] args) {
		Song s1 = new Song("Outward Bound","Nana",180);
		Song s2 = new Song("Jambalya","Carpenters");
		Song s3 = new Song("Yesterday");
		Song s4 = new Song();
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		System.out.println(s4.toString());

	}

}
