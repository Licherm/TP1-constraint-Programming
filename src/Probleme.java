import java.util.ArrayList;
import java.util.List;


public class Probleme {

	private List<Tache> taches = new ArrayList<Tache>();
	private List<Integer> machines = new ArrayList<Integer>();
	private List<Solution> solutions = new ArrayList<Solution>();
	
	public Probleme (List<Integer> machines){
		this.machines=machines;
	}
	
	public Probleme(List<Tache> taches,List<Integer> machines,List<Solution> solutions){
		this.taches=taches;
		this.machines=machines;
		this.solutions=solutions;
	}
	
	
	public void addTache( Tache tache){
		this.taches.add(tache);
	}
	
	public void removeMachine(int machine){
		this.machines.remove(machine);
	}
	
	public void addSolution( Solution solution){
		this.solutions.add(solution);
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
	
	
	
	//---------------------------------------------------------------------------------
	//---------------------------------------------------------------------------------
	//---------------------------------------------------------------------------------
		
		//Reslotion v1
	public void Resolution(int compteur,Probleme probleme){
		boolean verif;
		boolean verif2=true;
		ArrayList<Integer> listMachines= new ArrayList<Integer>();
		if(compteur<this.taches.size()){
				
			for (int i=0;i<this.machines.size();++i){
				verif=this.taches.get(compteur).setValue(this.machines.get(i));	// verif regarde si l'attribution est valide
				if (verif){
					for(int j=0;j<this.taches.size();j++){
						if(!(this.taches.get(i).assigne())){
							verif2=false; // False si au moins 1 des taches n'est pas encore assigner
						}
					}
					if(verif2){
						Solution solution = new Solution(this.solutions.size()+1,this.taches);
						probleme.addSolution(solution);
					}else{
						listMachines.addAll(this.machines);
						listMachines.remove(i);
						Probleme problemModifie= new Probleme(this.taches,listMachines,this.solutions);
						++compteur;
						// Recursivité
						problemModifie.Resolution(compteur,this);
					}
				}
				verif2=true;
			}
		}
	}

	
}
