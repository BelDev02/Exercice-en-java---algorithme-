package exercice7;

public class Triangle extends Forme {
	double hauteur; double base;
	public Triangle(double hauteur, double base) {
		
		this.base = base;
		this.hauteur = hauteur;
	
	}
	
	public double aire() {
		return (this.base*this.hauteur)/2;
	}

}
