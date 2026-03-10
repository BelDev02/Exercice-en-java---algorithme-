package exercice7;

public class Exercice7 {

	public static void main(String[] args) {
		// implement Interface class 
		Payable frais = new facture();
		Payable frais1 = new Inscription();
		frais.payer(2000);
		frais.payer(2500);
		frais1.payer(5000);
		impot frais2= new impot();
		frais2.payer(4000); 
		// implement abstract class 
		
		Forme[] formes=new Forme[3];
		Forme c= new circle(5);
		formes[0] = c;
		Forme r= new rectangle(10, 3);
		formes[1] = r;
		Forme t= new Triangle(5, 2);
		formes[2]= t;
		
		for( Forme f : formes) {
			
			System.out.println("l'aire est:"+f.aire());
			
		}

	}

}
