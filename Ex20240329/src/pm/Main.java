package pm;

public class Main {

	public static void main(String[] args) {
		
		Parent p1 = new Child(); // 이게 가능하네
		
		// Child c2 = new Parent(); 이거는 불가능 한데
		
		Child c1 = new Child();
		
		
		System.out.println(c1.getValue());
		c1.setValue(150);
		System.out.println(c1.getValue());
//		p1.test();

	}

}
