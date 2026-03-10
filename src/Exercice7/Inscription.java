package exercice7;

public class Inscription implements Payable {
	public void payer(double payer) {
		System.out.println( "reduction= "+ payer * 0.12);
	}

}
