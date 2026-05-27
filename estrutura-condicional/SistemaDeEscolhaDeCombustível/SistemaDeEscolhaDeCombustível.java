package aplication;

import java.util.Locale;
import java.util.Scanner;

public class SistemaDeEscolhaDeCombustível {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o preco da Gasolina: ");
		double gasolina = sc.nextDouble();
		
		System.out.println("Digite o preco do Etanol: ");
		double etanol = sc.nextDouble();
		
		if ( etanol / gasolina <= 0.70 ) {
			System.out.println("etanol compensa");
		}
		else {
			System.out.println("gasolina compensa");
		}
		
		
		sc.close();
	}

}
