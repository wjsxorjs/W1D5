package testEx1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 시작하면 
		 	"검색할 도서명: " 출력
		 	책 제목 / 출판사 / 책위치(A-102) / 대여가능여부(가능/불가)
		 	예시)
		 		검색할 도서명: 자바
		 		이것이 자바다 | 한빛미디어 | A-102 | 대여가능
		 		자바 바이블	  | 한빛아카데미 | A-07 | 대여중
		 
		 */
		Library lib1 = new Library();
		
		lib1.init();
		
		Scanner scanKW = new Scanner(System.in);
		
		System.out.print("검색할 도서명: ");
		String searchKW = scanKW.nextLine();
		
		System.out.println("\n---------------- Library에서 바로 출력 -------------------");
		lib1.searchBook(searchKW);
		

		System.out.println("\n------------- Library에서 반환받아서 출력 ----------------");
		String searchResult = lib1.searchBookRT(searchKW);
		
		System.out.println(searchResult);
		
	}

}
