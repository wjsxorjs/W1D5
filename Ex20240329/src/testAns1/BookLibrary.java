package testAns1;

public class BookLibrary {
	BookVO[] bkArr = new BookVO[5];
	
	//책들을 생성하여 배열에 저장하는 기능
	public void init() {
		BookVO bk1 = new BookVO();
		bk1.setName("이것이 자바다.");
		bk1.setPress("한빛미디어");
		bk1.setPos("A-102");
		bk1.setRent(false);
		
		BookVO bk2 = new BookVO();
		bk2.setName("메타버스");
		bk2.setPress("모름출판사");
		bk2.setPos("B-51");
		bk2.setRent(false);
		
		BookVO bk3 = new BookVO();
		bk3.setName("자바바이블");
		bk3.setPress("한빛아카데미");
		bk3.setPos("A-2");
		bk3.setRent(true);
		
		BookVO bk4 = new BookVO();
		bk4.setName("이것이 우분투 리눅스다.");
		bk4.setPress("한빛미디어");
		bk4.setPos("C-222");
		bk4.setRent(true);
		
		BookVO bk5 = new BookVO();
		bk5.setName("스프링부트");
		bk5.setPress("두빛미디어");
		bk5.setPos("D-122");
		bk5.setRent(true);
		
		bkArr[0] = bk1;
		bkArr[1] = bk2;
		bkArr[2] = bk3;
		bkArr[3] = bk4;
		bkArr[4] = bk5;
		
	}
	
	//인자로 단어를 받아 검색하는 동작(반환값은 개발자가 정함)
	public String serachBook(String keyWord) {
		
		StringBuffer sb = new StringBuffer();
		
		for(int i=0;i<bkArr.length;i++) {
			BookVO tmpBk = bkArr[i];
			
			tmpBk.name.indexOf(keyWord);
			if(tmpBk.name.contains(keyWord)) {
				sb.append(tmpBk.name);
				sb.append("|");
				sb.append(tmpBk.press);
				sb.append("|");
				sb.append(tmpBk.pos);
				sb.append("|");
				if(tmpBk.rent) {
					sb.append("대여중");
				} else {
					sb.append("대여 가능");
				}
				sb.append("\r\n");
			}
		}
		
		return sb.toString();
		
	}

}
