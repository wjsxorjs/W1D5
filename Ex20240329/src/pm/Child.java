package pm;

public class Child extends Parent{
	// Object부터 자신까지 모든 parents를 불러오기 때문에 메모리가 무거워지고 느려진다.
	// POJO = Plain Old JAVA Object. < 간단한 자바 객체
	// Spring이 각광을 받는 이유 (상속을 배제해준다.)
	
	public void test() {
		System.out.println("TEST");
	}
}
