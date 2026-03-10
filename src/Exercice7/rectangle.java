package exercice7;

public class rectangle extends Forme {
	double longueur; double largeur;
	public  rectangle (double  longueur,double largeur) {
		this.longueur = longueur;
		this.largeur= largeur; 
		}
	public double aire() {
		return this.longueur*this.largeur;
		}

}
