package testEx2;

public class Management {
	
	
	Employee[] empArr = new Employee[6];
	StringBuffer searchResult = new StringBuffer();
	
	public void addEmp(String name,String post,String team,String id,int idx) {
		empArr[idx] = new Employee(); // <-- 이거 필수다! 중요중요! 이거 까먹고 안했다가 오류났다.
									  //     그 이유는 Employee 객체를 만들어주지 않았기 때문이다.
		empArr[idx].setName(name);
		empArr[idx].setPost(post);
		empArr[idx].setTeam(team);
		empArr[idx].setId(id);
	}
	
	
	public void init(){
		addEmp("일지매","사원","개발1팀","120",0);
		addEmp("지매일","대리","기획팀","222",1);
		addEmp("지일매","부장","홍보팀","324",2);
		addEmp("매일지","차장","개발2팀","426",3);
		addEmp("매지일","과장","인사팀","528",4);
		addEmp("일매지","팀장","보안팀","630",5);
		
				
	}
	
	public void addSearchResult(String id, String name, String post, String team) {
		searchResult.append(id);
		searchResult.append(" | ");
		searchResult.append(name);
		searchResult.append(" | ");
		searchResult.append(post);
		searchResult.append(" | ");
		searchResult.append(team);
		searchResult.append("\r\n");
		
	}
	
	public String serachEmp(String keyword){
		
		for(int i=0; i<empArr.length; i++) {
			if(empArr[i].name.contains(keyword)) {
				addSearchResult(empArr[i].id,empArr[i].name,empArr[i].post,empArr[i].team);
			}
		}
		
		return searchResult.toString()
;		
	}
	

}
