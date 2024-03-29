package am;

import java.util.Scanner;


public class BfTest {

	AvlBvgs bvrgAvail = new AvlBvgs();
	BeverageListEx7[] bvgLst = new BeverageListEx7[4];


	public int getMin(int[] intArr) {
		int min = intArr[0];
		
		for(int i=1; i<intArr.length; i++) {
			if(min>intArr[i]) {
				min = intArr[i];
			}
		}
		
		return min;
	};
	
	public void stockBvgs(String bvgNm, int bvgPrc, int lstIdx) {
		//BeverageListEx7형 bvg1 변수를 선언
		BeverageListEx7 bvg1 = new BeverageListEx7();
		
		bvg1.setName(bvgNm);
		bvg1.setPrice(bvgPrc);
		bvgLst[lstIdx] = bvg1;
	}
	
	public AvlBvgs setAvlBvgLst(BeverageListEx7[] bvgLst, int inputFnd, AvlBvgs bvrgAvail) {
		for(int i=0; i<bvgLst.length; i++) {
			if(bvgLst[i].price <= inputFnd) {
				bvrgAvail.appendAvlBvgs(bvgLst[i].name,i+1);
				bvrgAvail.incMaxChs();
			}
		}
		return bvrgAvail;
		
	}
	
	public void setVending(){
		
//		String[] bvgNmLst = {"레츠비", "사이다", "콜라", "웰치스"};
		int[] bvgPrcLst = {500, 700, 700, 1000};
//		
//		for(int i=0; i<bvgPrcLst.length;i++) {
//			stockBvgs(bvgNmLst[i], bvgPrcLst[i], i);
//		}
		
		stockBvgs("레츠비", 500, 0);
		stockBvgs("사이다", 700, 1);
		stockBvgs("콜라", 700, 2);
		stockBvgs("웰치스", 1000, 3);

		Scanner scanR = new Scanner(System.in);
		System.out.print("금액: ");
		int inputFnd = scanR.nextInt();
		int rmnFnd = 0;
		if(inputFnd<getMin(bvgPrcLst)) {
			System.out.println("...안녕히 가세요!");
		} else {
			while(true) {
				// 구매가능한 음료수 목록(StringBuffer)를 설정
				bvrgAvail = setAvlBvgLst(bvgLst, inputFnd, bvrgAvail);
				System.out.println(bvrgAvail.avlBvgs);
				
				// 구매하려는 음료 선택
				int inputChs = scanR.nextInt();
				
				// 선택이 범위를 벗어난 경우 프로그램 종료
				while(!(inputChs>0 && inputChs<=bvrgAvail.maxChs)) {
					System.out.println("제대로 입력해주세요.");
					inputChs = scanR.nextInt();
				}
				// 정상 선택 시 구입한 물품(구입 금액), 잔돈 출력
				System.out.printf("%s(%d원)을 구입하셨습니다. 잔돈은 %d원입니다.\n",bvgLst[inputChs-1].name,bvgLst[inputChs-1].price,(inputFnd-bvgLst[inputChs-1].price));
				
				// 잔돈 저장
				rmnFnd = (inputFnd-bvgLst[inputChs-1].price);
				
				// 잔돈으로 구매 가능 음료가 있다면 추가 구매 의사 질문
				if(rmnFnd>=getMin(bvgPrcLst)) {
					System.out.println("더 구매하시겠습니까?\n 1. 예  ||  2. 아니오");
					
					// 추가 구매 의사 있을 시 위의 절차 재진행
					// 절차 재진행시 최초 투입금액이 아닌 잔돈을 기준으로 진행해야한다.
					int reChoice = scanR.nextInt();
					while(!(reChoice == 1 || reChoice == 2)) {
						System.out.println("제대로 입력해주세요.");
						reChoice = scanR.nextInt();
					}
					if(reChoice==1) {
						inputFnd = rmnFnd; // 투입금액을 저장했던 변수에 잔돈을 저장해서 정상 진행이 되도록 함
						bvrgAvail.resetAvlBvgs();
						System.out.println(bvrgAvail.avlBvgs);
						continue;
					}
				}
				System.out.println("안녕히 가세요! 즐거운 하루 보내시고요!\n");
				break;
				
			}
		}
		
	}

	
	
	
	
	

}
