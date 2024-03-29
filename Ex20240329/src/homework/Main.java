package homework;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 프로그램 시작부분
		
		// 자판기 객체 생성 : 아직 자판기와 그 안에 음료 배열을 만들었지만
		//					  음료 배열 안에 아직 음료는 저장되지않은 상태
		Vending vend1 = new Vending();
		
		// 자판기 초기화 : 각 음료를 음료수 배열에 저장
		//				   음료 배열에 저장되는 음료는 객체이며
		//				   음료.name과 음료.price를 멤버변수로 가지고
		//				   음료.setName과 음료.setPrice를 멤버메소드로 가진다.
		vend1.init();
		
		//투입할 금액을 키보드로부터 받아오기
		Scanner scanMoney = new Scanner(System.in);
		System.out.print("금액:  ");
		int inputMoney = scanMoney.nextInt();
		
		// 자판기에게 금액 투입 후
		// 구매 가능 음료의 이름들(문자열) 받아야 함
		String avlBvgs = vend1.insertCoin(inputMoney);
		
		// 함수로부터 반환받은 구매 가능 음료 문자열 출력
		System.out.println(avlBvgs);
		
	}

}
