package Exercices17;

import java.util.ArrayList;
import java.util.Iterator;

public class Salaires {
public static void main(String[] args) {
Personnel p = new Personnel();
p.ajouterEmploye(new Vendeur("Pierre", "Business", 45, "1995", 30000));
p.ajouterEmploye(new Representant("Léon", "Vendtout", 25, "2001", 20000));
p.ajouterEmploye(new OuvrierProduction("Yves", "Bosseur", 28, "1998", 1000));
p.ajouterEmploye(new Manutentionnaire("Jeanne", "Stocketout", 32, "1998", 45));
p.ajouterEmploye(new OuvrierARisque("Jean", "Flippe", 28, "2000", 1000));
p.ajouterEmploye(new ManutARisque("Al", "Abordage", 30, "2001", 45));
p.afficherSalaires();
System.out.println("Le salaire moyen dans l'entreprise est de " + p.salaireMoyen() + " francs.");
}
}

class Personnel{
	private ArrayList<Employe> stockage=new ArrayList<>();
	
	public void ajouterEmploye(Employe e) {
		stockage.add(e);
	}
	public void afficherSalaires() {
		for (Employe employe : stockage) {
			System.out.println(employe.getNom());
		}
	}
	
	public double salaireMoyen() {
		double sum=0.0d;
		 for (Employe employe : stockage) {
			sum+=employe.calculerSalaire();
		}
		 return sum/stockage.size();
		
	}
	
	
}