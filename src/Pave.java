import java.util.Scanner;

public class Pave {	
	public static void main(String [] args) {
	Scanner scan = new Scanner(System.in);
	
	double profondeur = scan.nextDouble();
	if (profondeur<0) {
		println("Valeur négative!!!! " );
		double profondeur = scan.nextDouble();
}
	double largeur = scan.nextDouble();
	if (largeur<0) {
		println("Valeur négative!!!! " );
		double largeur = scan.nextDouble();
}
	double longueur = scan.nextDouble();
	if (longueur<0) {
		println("Valeur négative!!!! " );
		double longueur = scan.nextDouble();
}
	double volume = profondeur*largeur*longueur;
	System.out.println("Le volume est " + volume);
	
	}
}

