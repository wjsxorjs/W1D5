package TestEx;

public class Library {

	Book[] bkArr = new Book[10];
	StringBuffer resultLine = new StringBuffer();
	int bkArrIdx = 0;
	
	public void incIdx() {
		bkArrIdx++;
	}
	
	public void setBooks(String title, String publisher, String code, boolean cnb) {
		Book bk1 = new Book();
		bk1.setTitle(title);
		bk1.setPublisher(publisher);
		bk1.setCode(code);
		bk1.setCnB(cnb);
		bkArr[bkArrIdx] = bk1;
		incIdx();
	}
	
	public void init() {
		setBooks("이것이 자바다.","한빛미디어","A-100",true);
		setBooks("파이파이썬!","태양빛","A-101",true);
		setBooks("c++과 c언어","더하기빼기","A-102",true);
		setBooks("자바 바이블.","한빛아카데미","A-103",false);
		setBooks("프론트엔드인가? 프런트엔드인가?","깐깐한개발자들","A-104",false);
		setBooks("자바가 이거다.","미디어한빛","A-105",false);
		setBooks(".다바자 이것이","어디미빛한","A-106",true);
		setBooks("저것은 해로운 자바다.","참새짹짹","A-107",true);
		setBooks("C언어 다시보기","두빛미디어","A-108",false);
		setBooks("파이썬은 대체 무슨 썬일까?","맛간놈들","A-109",false);
	}
	
	public boolean containKW(String title, String keyword) {
		
		boolean kwCnt = title.indexOf(keyword.toUpperCase()) != -1 || title.indexOf(keyword.toLowerCase()) != -1;
		
		return kwCnt;
	}
	
	public void searchBook(String keyWord) {
		for(int i=0; i<bkArr.length; i++) {
			if(containKW(bkArr[i].title,keyWord)) {
				System.out.printf("%s | %s | %s | %s\n",bkArr[i].title,bkArr[i].publisher,bkArr[i].bkCode,bkArr[i].canBorrow);
			}
		}
	}
	
	public void resultLine(String title, String publisher, String bkCode, String canBorrow) {
		resultLine.append(title);
		resultLine.append(" | ");
		resultLine.append(publisher);
		resultLine.append(" | ");
		resultLine.append(bkCode);
		resultLine.append(" | ");
		resultLine.append(canBorrow);
		resultLine.append("\n");
		
	}
	
	
	public String searchBookRT(String keyWord) {

		for(int i=0; i<bkArr.length; i++) {
			if(containKW(bkArr[i].title,keyWord)) {
				resultLine(bkArr[i].title, bkArr[i].publisher, bkArr[i].bkCode, bkArr[i].canBorrow);
			}
		}
		
		return resultLine.toString();
	}
	
	
	
}
