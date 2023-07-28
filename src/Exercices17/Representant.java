package Exercices17;

public class Representant extends RelationClient{

	public Representant(String Nom, String Prenom, int Age, String DateRecrutement, double chiffreAffaire) {
		super(Nom, Prenom, Age, DateRecrutement, chiffreAffaire);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getFixe() {
		// TODO Auto-generated method stub
		return 800;
	}

	@Override
	public double calculerSalaire() {
		// TODO Auto-generated method stub
		return 0.2*getChiffreAffaire() +getFixe();
	}

}
