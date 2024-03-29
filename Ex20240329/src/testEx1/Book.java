package testEx1;

public class Book {
	String title;
	String publisher;
	String bkCode;
	String canBorrow;
	
	public void setTitle(String newTitle) {
		title = newTitle;
	}
	
	public void setPublisher(String newPublisher) {
		publisher = newPublisher;
	}
	
	public void setCode(String newCode) {
		bkCode = newCode;
	}
	
	public void setCnB(boolean newCnB) {
		String cnB = "대여 불가";
		if(newCnB) {
			cnB = "대여 가능";
		}
		canBorrow = cnB;
	}

}
