package Exercices17;

public class OuvrierARisque extends OuvrierProduction implements Risquant{

	public OuvrierARisque(String Nom, String Prenom, int Age, String DateRecrutement, int unites) {
		super(Nom, Prenom, Age, DateRecrutement, unites);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculerSalaire() {
		return super.calculerSalaire()+Risquant.super.calculerSalaire();
	
}



}
