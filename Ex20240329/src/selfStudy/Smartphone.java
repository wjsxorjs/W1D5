package selfStudy;

public class Smartphone extends Phone { // Phone 객체 상속받음 : Phone 객체의 멤버변수(model, color)
										//						 Phone 객체의 멤버함수 | bell(), sendVoice(String),
										//						 					   | receiveVoice(String), hangup()
										//						 들 모두 상속받았으며 모두 사용할 수 있음
	
	/*
		멤버변수:
			wifi - 와이파이 연결유무
	
		멤버함수:
			SmartPhone(String, String) - Smartphone 생성
			setWifi(boolean) - wifi 상태 변경
			internet() - 인터넷 연결
	
	
	 */
	
	 boolean wifi;
	 
	 public void SmartPhone(String newModel, String newColor){
		 model = newModel; // 해당 model은 Phone 객체에서 상속받은 model이다.
		 color = newColor; // 해당 color도 Phone 객체에서 상속받은 color이다.
	 }
	 
	 public void setWifi(boolean newWifi) {
		wifi = newWifi;
	}
	 
	 public void internet() {
		 if(wifi) {
			 System.out.println("인터넷에 연결합니다...");
		 } else {
			 System.out.println("WIFI에 접속해주세요!");
		 }
	}
}
