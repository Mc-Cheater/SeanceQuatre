package Exercices13;

import java.util.ArrayList;
import java.util.Iterator;

public class Jeu {
	private Carte[] deck;
	private int index=0;
	public Jeu(int i) {
		deck=new Carte[i];
		System.out.println("On change de Main");
	}

	public void piocher(Carte carte) {
		if(index==10) {System.out.println("Jeu vide");return;}
		deck[index++]=carte;
	}

	public void afficher() {
		for (int i=0;i<index;i++) {
			System.out.println(deck[i]);
		}
	}

	public void joue() {
		// TODO Auto-generated method stub
		if(index<=0) {System.out.println("main vide piocher une carte");return;}
		index--;
		System.out.println(deck[index]);
		deck[index]=null;
		
	}

}
