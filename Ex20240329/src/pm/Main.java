package pm;

public class Main {

	public static void test(Parent n) {
//		n.test(); //parent 객체까지만 사용가능하므로 child 객체에서 정의된 test()는 사용하지 못한다.
		System.out.println(n.getValue());
	}
	
	
	public static void main(String[] args) {
		
		
		
		// Child c2 = new Parent(); 이거는 불가능 한데
		
		
		Object o1 = new Child1(); 	// 이것도 가능하다.
		Parent p1 = new Child1(); 	// 이게 가능하네.
		Child1  c1 = new Child1();
		Child2  c2 = new Child2();
		
		p1.value = 0;

		System.out.print("c1's value: ");
		System.out.println(c1.getValue());
		System.out.println("c1.setValue(150)");
		c1.setValue(150);
		System.out.print("c1's value: ");
		System.out.println(c1.getValue());
		
		System.out.println();
		System.out.print("p1's value: ");
		System.out.println(p1.getValue());
		System.out.print("o1's class: ");
		System.out.println(o1.getClass());
		System.out.println();

		System.out.println("c2.setValue(50)");
		c2.setValue(50);
		
		System.out.println();
		System.out.print("test(c1): ");
		test(c1);
		System.out.print("test(c2): ");
		test(c2);
		

	}

}
