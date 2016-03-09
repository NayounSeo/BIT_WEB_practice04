package prob3;

public class Book {
	private int bookNO;
	private String title;
	private String author;
	private int stateCode;
	
	public int getBookNO() {
		return bookNO;
	}

	public void setBookNO(int bookNO) {
		this.bookNO = bookNO;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Book(int bookNo, String title, String author) {
		this.bookNO = bookNO;
		this.title = title;
		this.author = author;
		this.stateCode = 1;
	}
	
	public void rent() {
		stateCode = 0;
		System.out.println(title+"이(가) 대여 됐습니다.");
	}
	
	public void print() {
		if (stateCode == 1) {
			System.out.println("재고있음");
		} else {
			System.out.println("대여중");
		}	
	}
}
