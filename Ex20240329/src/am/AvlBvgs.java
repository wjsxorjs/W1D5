package am;

public class AvlBvgs {

	StringBuffer avlBvgs = new StringBuffer("");
	int maxChs;
	

	public void resetAvlBvgs() {
		avlBvgs.delete(0,avlBvgs.length());
	}
	
	
	public void appendAvlBvgs(String addStr, int idx) {
		avlBvgs.append(idx+"."+addStr+" ");
	}
	
	public void incMaxChs(){
		maxChs++;
	}
	
	
}
