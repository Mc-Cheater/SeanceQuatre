package Exercices13;

public abstract class Carte {
	private int cout;
	private boolean sexe;
	
	public Carte() {
		
	}
	public Carte(int cout) {
		this.cout=cout;
	}
	public String toString() {
		return sexe?"UneNouvelle ":"UnNouveau "+getClass()
.getSimpleName();	}
	protected void setSexe() {
		sexe=!sexe;
	}
		
}
