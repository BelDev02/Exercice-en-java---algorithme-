package exercice7;

public class circle extends Forme {
	double rayon;
	final double pie=3.14;
	public circle(double rayon) {
		
		this.rayon=rayon;
	}
	
	public double aire() {
		return pie*Math.pow(this.rayon,2);
	}

}
