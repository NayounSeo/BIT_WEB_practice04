package prob3;

import java.util.Scanner;

public class BookShop {
	public static void main(String[] args) {
		
		Book[] books = new Book[10];
		books[0] = new Book( 1, "룬의 아이들", "전민희" );
		books[1] = new Book( 2,"하이큐!", "후루다테 하루이치" );
		books[2] = new Book( 3,"어스시의 마법사","어슐러 K.르귄");
		books[3] = new Book( 4,"Alice","루이스 캐럴");
		books[4] = new Book( 5,"드래곤라자","이영도");
		books[5] = new Book( 6,"월간순정 노자키군","이즈미 츠바키");
		books[6] = new Book( 7,"반지의 제왕","J.R.R.톨킨");
		books[7] = new Book( 8,"제인 에어","샬롯 브론테");
		books[8] = new Book( 9,"알고리즘 문제 해결 전략","구종만");
		books[9] = new Book( 10,"풀하우스","원수연");
		
		
		Scanner key = new Scanner(System.in);
		System.out.print("대여 하고 싶은 책의 번호를 입력하세요: ");
		int num = key.nextInt();
		books[num-1].rent();
		
		// 입력된 번호에 맞는 책을 찾아 대여 되었음(상태코드=0)을 체크 합니다.

		System.out.println("*****도서 정보 출력하기******");
		displayBookInfo(books);
	}
	
	public static void displayBookInfo(Book[] books) {
		for(Book b : books) {
			System.out.print("책 제목 : "+b.getTitle()+", 작가 : "+b.getAuthor()+", 대여 유무 : ");
			b.print();
		}
	}
}
