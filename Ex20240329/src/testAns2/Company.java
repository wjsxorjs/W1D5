package testAns2;

public class Company {

	EmpVO[] ar = new EmpVO[4];
	
	public void init() {
		EmpVO e1 = new EmpVO();
		e1.setEmpno("120");
		e1.setEName("일지매");
		e1.setPosition("사원");
		e1.setDept("개발1팀");
		
		EmpVO e2 = new EmpVO();
		e2.setEmpno("222");
		e2.setEName("마루치");
		e2.setPosition("팀장");
		e2.setDept("기획팀");
		
		EmpVO e3 = new EmpVO();
		e3.setEmpno("122");
		e3.setEName("아라치");
		e3.setPosition("사원");
		e3.setDept("개발1팀");
		
		EmpVO e4 = new EmpVO();
		e4.setEmpno("308");
		e4.setEName("나치미");
		e4.setPosition("과장");
		e4.setDept("개발2팀");
		
		ar[0] = e1;
		ar[1] = e2;
		ar[2] = e3;
		ar[3] = e4;
		
	}
	
	public String searchName(String name) {
		
		//인자인 name이 null이거나 공백일 경우에는 null을 반환하자!
		if(name == null || name.trim().length() == 0) { //trim() 무의미한 공백제거
			return null; // 호출한 곳으로 null을 반환하면서 돌아간다.
		}
		
		StringBuffer sb = new StringBuffer();
		
		for(int i=0; i<ar.length; i++) {
			// 배열에 저장된 사원객체를 하나 얻어낸다.
			EmpVO e = ar[i];
			
			// 얻어낸 사원 객체의 이름안에 인자로 받은 name의 값이
			// 포함되었다면 sb에 적재한다.
			
			if(e.ename.contains(name)) {
				sb.append(e.empno);
				sb.append(" | ");
				sb.append(e.ename);
				sb.append(" | ");
				sb.append(e.position);
				sb.append(" | ");
				sb.append(e.dept);
				sb.append("\r\n");
			}
			
		}
		
		return sb.toString();
		
	}
	
	
	
}
