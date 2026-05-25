package aplication;

import java.util.Locale;
import java.util.Scanner;

public class calculadora_desconto {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite  o nome do produto: ");
		String produto = sc.nextLine();
		
		System.out.println("Digite o preço original: ");
		double preco = sc.nextDouble();
		
		System.out.println("Digite a porcentagem de desconto (%): ");
		double porcentagem = sc.nextDouble();
		
	    double descontos = preco * porcentagem / 100;
	    double valorFinal = preco - descontos;
	    
	    System.out.println("nome do produto: " + produto);
	    System.out.println("valor original: R$ " + preco);
	    System.out.println("porcentagem de desconto: % " + porcentagem);
	    System.out.println("valor descontado: R$ " + descontos);
	    System.out.println("valor final: R$ " + valorFinal);
	    
	    sc.close();

	}

}
