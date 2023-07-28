package Exercices17;

public class Vendeur extends RelationClient {
double chiffreAffaire;
	
	public Vendeur(String Nom, String Prenom, int Age, String DateRecrutement, double chiffreAffaire) {
		super(Nom, Prenom, Age, DateRecrutement, chiffreAffaire);
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getFixe() {
		// TODO Auto-generated method stub
		return 400d;
	}

	@Override
	public double calculerSalaire() {
		// TODO Auto-generated method stub
		return 0.2 * getChiffreAffaire() +getFixe();
	}

	/*public String getNom() {
		return super.getNom();//+" gagne " + calculerSalaire();
	}*/
}
