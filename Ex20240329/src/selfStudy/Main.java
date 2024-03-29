package selfStudy;

public class Main {

	public static void main(String[] args) {
		/*
				Smartphone 생성
				
				생성된 Smartphone 정보 확인(상속받은 변수)
				
				Smartphone wifi 상태 확인(자신만의 변수)
				
				Smartphone 전화(상속받은 함수)
		
				Smartphone wifi 접속 후 인터넷 연결 (자신만의 함수)
		
		*/
		
		Smartphone sp1 = new Smartphone(); // Phone을 상속받은 Smartphone 객체를 생성했지만
										   // 메모리에는 Object부터 Phone, Smartphone까지 상속으로 연관된 상위객체들이 모두 들어있다.
		
//		Phone sp1 = new Smartphone(); // 이렇게 한다면 Phone 객체에서 정의한 변수와 함수는 사용가능하지만
									  // Smartphone 객체에서 정의한 변수와 함수는 사용이 불가능하다.
		
		sp1.SmartPhone("아이폰 13","검은색");
		
		System.out.printf("Model: %s\r\nColor: %s\r\n\r\n",sp1.model,sp1.color); // Phone의 변수를 사용할 수 있으며
		
		System.out.printf("WIFI: %s\r\n\r\n",sp1.wifi); //Smartphone이 새롭게 정의한 변수도 사용할 수 있다.
		
		// 아래의 함수도 마찬가지인데.
		
		/*
			여기서 알 수 있는 것은
			자료형으로 주 객체를 정했다면
			해당 객체 상위의 객체가 가진 변수나 함수는 모두 사용이 가능하다.
			또한, 해당 객체에서 새롭게 정의한 변수나 함수는 당연하게도 사용이 가능하다.
			다만, 부모 객체에서 자식 개체가 정의한 함수나 변수는 사용하지 못한다.
			이는 범위라고 생각하면 되는데, 자료형으로 주 객체를 정하면 해당 객체"부터" 상위객체로 범위를 제한하기에
			부모 객체를 주 객체로 정의하면 메모리에 있음에도 불구하고 자신의 하위 객체를 접근하지 못하게 되는 것이라고 이해하면 된다.
			
		 */
		
		sp1.bell();
		sp1.sendVoices("여보세요?");
		sp1.receiveVoice("아니요, 뚱인데요?");
		sp1.hangup();
		
		System.out.println();
		
		System.out.println("인터넷 연결 시도");
		System.out.printf("WIFI 상태: %b\t", sp1.wifi);
		sp1.internet();
		System.out.println("\t-------------------------\r\n\t|sp1.setWifi(true) 수행!|\r\n\t-------------------------");
		sp1.setWifi(true);
		System.out.printf("WIFI 상태: %b\t\t", sp1.wifi);
		sp1.internet();
		
	}

}
