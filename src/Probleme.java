import java.util.ArrayList;
import java.util.List;


public class Probleme {

	private List<Tache> taches = new ArrayList<Tache>();
	private List<Integer> machines = new ArrayList<Integer>();
	private List<Solution> solutions = new ArrayList<Solution>();
	
	public Probleme (ArrayList<Integer> machines){
		this.machines=machines;
	}
	
	
	public void addTache( Tache tache){
		this.taches.add(tache);
	}
	
	public void removeMachine(int machine){
		this.machines.remove(machine);
	}
	
	
	//Reslotion v1
	public void Resolution(int compteur){
		boolean verif;
		if(compteur<this.taches.size()){
			
			for (int i=0;i<this.machines.size();++i){
				verif=this.taches.get(compteur).setValue(this.machines.get(i));	// verif regarde si l'attribution est valide
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public List<Tache> getTaches() {
		return taches;
	}
	public void setTaches(List<Tache> taches) {
		this.taches = taches;
	}
	public List<Integer> getMachines() {
		return machines;
	}
	public void setMachines(List<Integer> machine) {
		this.machines = machine;
	}
	public List<Solution> getSolutions() {
		return solutions;
	}
	public void setSolutions(List<Solution> solutions) {
		this.solutions = solutions;
	}
	
	
}
