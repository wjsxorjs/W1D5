package testEx2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/* 
		 
			검색할 사원명: 지매
		
			사원번호(120) | 이름(일지매) | 직책(사원) | 팀(개발1팀)
			사원번호(222) | 이름(지매일) | 직책(대리) | 팀(기획팀)
		 
		 */
		
		
		Management mng = new Management();
		
		mng.init();
		
		System.out.print("검색할 사원명: ");
		
		Scanner scanKW = new Scanner(System.in);
		
		String searchKW = scanKW.nextLine();
		
		String searchResult = mng.serachEmp(searchKW);
		
		System.out.println(searchResult);
	}

}
