package Exercices17;

public class Manutentionnaire extends Employe {
	private double heureTravaille;

	public Manutentionnaire(String Nom, String Prenom, int Age, String DateRecrutement,double heuretravail) {
		super(Nom, Prenom, Age, DateRecrutement);
		heureTravaille=heuretravail;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculerSalaire() {
		// TODO Auto-generated method stub
		return heureTravaille*65;
	}

}
