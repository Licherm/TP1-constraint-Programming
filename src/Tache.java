import java.util.ArrayList;
import java.util.List;


public class Tache {
	
	private int value;
	private List<Integer> interditValue=new ArrayList<Integer>();
	
	public Tache (ArrayList<Integer> interditValue){
		this.value=-1;
		this.interditValue=interditValue;
		
	}
	
	public void addInterditValue(int value){
		this.interditValue.add(value);
	}
	
	// retourne true si tache assigné càd value != -1
	public boolean assigne(){
	
		return (this.value!=-1);
		
	}
	
	public int getValue(){
		return this.value;
	}
	
	public boolean setValue(int newValue){
		boolean resultat = true;
		
		for (int i=0;i<this.interditValue.size();++i){
			if ( newValue==this.interditValue.get(i)){
				resultat=false;
			}
		}
		
		if (resultat){
			this.value=newValue;
		}
		return resultat;
	}
	
	public List<Integer> getInterditValue(){
		return this.interditValue;
	}
	
	public String toString(){
		return "attribuer à la machine "+value+"\n";
	}

}
