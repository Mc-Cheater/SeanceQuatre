package Exercices17;

public abstract class RelationClient extends Employe{
	public RelationClient(String Nom, String Prenom, int Age, String DateRecrutement,double chiffreAffaire) {
		super(Nom, Prenom, Age, DateRecrutement);
		this.chiffreAffaire=chiffreAffaire;
		// TODO Auto-generated constructor stub
	}
	private double chiffreAffaire;
	
	public double getChiffreAffaire() {return chiffreAffaire;}
	public abstract double getFixe();
}
