

import java.util.Locale;
import java.util.Scanner;

public class SistemaConsumoCombustivel {
    
	public static void main(String[] args) {
	    
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a distância percorrida: ");
		double distancia = sc.nextDouble();
		
		System.out.println("Quantidade de combustível gasto: ");
		double combustivel = sc.nextDouble();
		
		double consumo = distancia / combustivel;
		
		System.out.println("Consumo médio: " + consumo + " km/l");
		System.out.println("Combustivel gasto: litros " + combustivel);
		
		sc.close();
	}

}
