import java.util.ArrayList;
import java.util.List;


public class Solution {

	private int num;
	private List<Tache> taches = new ArrayList<Tache>();
	
	public Solution(int num, ArrayList<Tache> taches){
		this.num=num;
		this.taches=taches;
	}
	
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public List<Tache> getTaches() {
		return taches;
	}
	public void setTaches(List<Tache> taches) {
		this.taches = taches;
	}
	
	
	
}
