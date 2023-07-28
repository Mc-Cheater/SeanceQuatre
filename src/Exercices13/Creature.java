package Exercices13;

public class Creature extends Carte{
private String name;
private int degats;
private int pointsDeVie;

	public Creature(int cout,String Name,int Degats,int PointDeVie) {
		super(cout);
		name=Name;
		degats=Degats;
		pointsDeVie=PointDeVie;
	}
	public String toString() {
		super.setSexe();
		return super.toString();
	}
}
