package pm;

public class Main {

	public static void main(String[] args) {
		
		
		
		// Child c2 = new Parent(); 이거는 불가능 한데
		
		
		Object o1 = new Child(); 	// 이것도 가능하다.
		Parent p1 = new Child(); 	// 이게 가능하네.
		Child  c1 = new Child();
				

		System.out.print("c1's value: ");
		System.out.println(c1.getValue());
		System.out.println("c1.setValue(150)");
		c1.setValue(150);
		System.out.print("c1's value: ");
		System.out.println(c1.getValue());
		System.out.print("p1's value: ");
		System.out.println(p1.getValue());
		System.out.print("o1's class: ");
		System.out.println(o1.getClass());

	}

}
