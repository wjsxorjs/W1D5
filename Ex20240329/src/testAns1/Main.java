package testAns1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.print("검색할 도서명: ");
		Scanner scanKeyword = new Scanner(System.in);
		String keyword = scanKeyword.nextLine();
		

		// 도서관 객체 생성
		BookLibrary bkLib = new BookLibrary();
		
		// 도서관에 책 넣기 (도서관 초기화)
		bkLib.init();
		
		// 검색된 도서들을 문자열로 받는다.
		String searchResult = bkLib.serachBook(keyword);
		
		System.out.println(searchResult);

	}

}
