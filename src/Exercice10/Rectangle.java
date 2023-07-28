package Exercice10;

public class Rectangle {
	public Rectangle(double d, double e) {
		hauteur=e;
		largeur=d;
	}
	
	public String toString() {
		
		return this.getClass().getSimpleName() +" :\n" +" largeur= " +largeur +"\n"+" hauteur= " +hauteur +"\n";
	}
	
	public boolean equals(Object other) {
		if(other ==null) return false;
		if (getClass()!=other.getClass()) return false;
		Rectangle temp=(Rectangle)other;
		return temp.hauteur==hauteur && temp.largeur==largeur;
	}
	
	private double hauteur;
	private double largeur;
	
	
	
	
}
