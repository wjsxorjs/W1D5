package selfStudy;

public class Phone {
	
	/*
		멤버변수: 
			model - 휴대폰 모델명
			color - 휴대폰 색상
			
		멤버함수:
			bell() - 벨소리 울리기
			sendVoice(String) - (통화중) 음성 발신
			receiveVoice(String) - (통화중) 음성 수신
			hangup() - 전화끊기
	*/

	String model, color;
	
	public void bell() {
		System.out.println("------- 벨소리 ! -------");
	}
	
	public void sendVoices(String msg) {
		System.out.printf("나: %s\r\n",msg);
	}
	
	public void receiveVoice(String msg) {
		System.out.printf("상대: %s\r\n",msg);
	}
	
	public void hangup() {
		System.out.println("------- 통화 종료 -------");
	}
	
	

}
