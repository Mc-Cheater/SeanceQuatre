package Exercice10;

public class RectangleColore extends Rectangle{
	private String couleur;
	
	
	public RectangleColore(double d, double e, String string) {
		super(d,e);
		couleur=string;
	}
	public String toString() {
		return  (super.toString()+" couleur = " + couleur +"\n").replace(super.getClass().getSimpleName(), getClass().getSimpleName());
	
}
	
	public boolean equals(Object other) {
		return super.equals(other) && couleur.equals(((RectangleColore)other).couleur);
	}
}