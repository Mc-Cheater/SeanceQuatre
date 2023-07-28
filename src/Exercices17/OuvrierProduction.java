package Exercices17;

public class OuvrierProduction extends Employe{
	public int uniteProduites;
	public OuvrierProduction(String Nom, String Prenom, int Age, String DateRecrutement,int unites) {
		super(Nom, Prenom, Age, DateRecrutement);
		// TODO Auto-generated constructor stub
		uniteProduites=unites;
	}
	@Override
	public double calculerSalaire() {
		// TODO Auto-generated method stub
		return uniteProduites*5;
	}

}
