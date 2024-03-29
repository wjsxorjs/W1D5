package homework;

public class Vending {
	
	Drink[] drinkArr = new Drink[4]; //멤버변수로 객체가 사라지기 전까지는 살아있다.
	
	// 배열에 음료객체들 4개를 생성하여
	// 초기화하는 기능
	public void init() {
/*
		Drink drk1 = new Drink();
		drk1.setName("레츠비");
		drk1.setPrice(500);
		
		Drink drk2 = new Drink();
		drk2.setName("사이다");
		drk2.setPrice(700);
		
		Drink drk3 = new Drink();
		drk3.setName("콜라");
		drk3.setPrice(700);
		
		Drink drk4 = new Drink();
		drk4.setName("웰치스");
		drk4.setPrice(1000);
		
		drinkArr[0] = drk1;
		drinkArr[1] = drk2;
		drinkArr[2] = drk3;
		drinkArr[3] = drk4;
*/
		drinkArr[0] = new Drink();
		drinkArr[0].setName("레츠비");
		drinkArr[0].setPrice(500);
		
		drinkArr[1] = new Drink();
		drinkArr[1].setName("사이다");
		drinkArr[1].setPrice(700);
		
		drinkArr[2] = new Drink();
		drinkArr[2].setName("콜라");
		drinkArr[2].setPrice(700);
		
		drinkArr[3] = new Drink();
		drinkArr[3].setName("웰치스");
		drinkArr[3].setPrice(1000);
		
		
	} // 초기화 기능을 가진 init 함수의 끝
	  // 주석에 있는 변수 drk1~4는 해당 함수의 지역변수로 여기서 소멸된다.
	  // 하지만 주석 하단의 멤버변수인 drinkArr이 해당 지역변수가 참조하던 객체를 참조하는 주소값을 저장해두고 있기에
	  // 만들어진 객체는 소멸되지않는다.
	
	public StringBuffer apndSB(StringBuffer tarSB, int num, String name) {
		tarSB.append(" ");
		tarSB.append(num);
		tarSB.append(". ");
		tarSB.append(name);
		return tarSB;
	}
	
	
	// 금액을 하나 받아서 해당 금액에 선택가능한
	// 음료의 이름을 전달하는 기능 : 반환형이 있다는 뜻.
	public String insertCoin(int money) {
		// 배열에 저장된 각 음료의 가격과 인자로 받은 money를 비교하여
		// money가 크거나 같다면 해당 음료의 이름을 문자열로 조합하여 반환하는 기능
		
		StringBuffer result = new StringBuffer();
		StringBuffer result2 = new StringBuffer();
		
		for(int i=0; i<drinkArr.length; i++) {
			if(money >= drinkArr[i].price) {
//				result.append(" ");
//				result.append(i+1);
//				result.append(". ");
//				result.append(drinkArr[i].name);
				// 위의 절차를 묶어서 하나의 함수로 빼냄
				apndSB(result,i+1,drinkArr[i].name);
//				result2.append(" ");
//				result2.append(drinkArr[i].name);
//				result2.append(",");
				
				
			}
		}
		
		/* 		[예제] 마지막 "," 를 삭제하고 싶다면
		 			마지막 ","의 위치값(index)를 알아내야하며:  int idx = result.lastIndexOf(",");
		 			result의 0번지부터 idx전까지 문자열 추출 :	String msg = result.substring(0, idx);
		 			해당 결과값은 String이므로 바로 반환 가능:	return msg;
		 			
		 */
		
//		int idx = result2.lastIndexOf(",");
//		String msg = result2.substring(0,idx);
		return result.toString();
//		return msg;
	} //insertCoin의 끝
	
/*	
	아래의 코드는 String을 수정하려할 때 계속 새로운 객체를 생성하므로
	퍼포먼스 리소스를 굉장히 많이 차지하게 되므로 안좋은 코드이다.

	public String insertCoin(int money) {
		
		String result = "";
		for(int i=0; i<drinkArr.length; i++) {
			if(money >= drinkArr[i].price) {
				result += (" "+(i+1)+". "+drinkArr[i].name);
			}
		}
		System.out.println(result);
		
		return result;
*/	
	
}


