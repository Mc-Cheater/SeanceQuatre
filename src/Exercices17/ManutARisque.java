package Exercices17;

public class ManutARisque extends Manutentionnaire implements Risquant {

	public ManutARisque(String Nom, String Prenom, int Age, String DateRecrutement, double heuretravail) {
		super(Nom, Prenom, Age, DateRecrutement, heuretravail);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculerSalaire() {
		return super.calculerSalaire()+Risquant.super.calculerSalaire();}
	
}
