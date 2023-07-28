package Exercices17;

import java.util.Date;

public abstract class Employe {
	private String nom;
	private String prenom;
	private int age;
	private String dateRecrutement;
	
	public abstract double calculerSalaire();
	
	public Employe(String Nom,String Prenom, int Age,String DateRecrutement) {
		nom=Nom;
		prenom=Prenom;
		age=Age;
		dateRecrutement=DateRecrutement;
		
	}
	public  String getNom() {return getClass().getSimpleName() +" "+ nom +" "+prenom +" gagne: "+calculerSalaire();}
}
