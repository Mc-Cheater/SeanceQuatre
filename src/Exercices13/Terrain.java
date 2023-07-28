package Exercices13;

public class Terrain extends Carte{
	private char couleur;
	private static final char[] AUTHORIZED={'B','b','n','r','v'};
	public Terrain(char c) {
		super();
		couleur=(!AUTHORIZED.toString().chars().anyMatch(value ->value==c ))?c:'b';
		
	}

}
