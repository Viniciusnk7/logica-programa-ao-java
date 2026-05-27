package application;

import java.util.Locale;
import java.util.Scanner;

public class SistemaDeAprovaçãoDeEmpréstimo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		

		System.out.println("Digite o seu nome: ");
		String nome = sc.nextLine();
		
		System.out.println("Quanto e a sua renda mensalmente: ");
        double renda = sc.nextDouble();
        
		System.out.println("Qual o valor do emprestimo que voce deseja: ");
		double emprestimo = sc.nextDouble();
		
		System.out.println("Digite a quantidade de parcelas: ");
		int parcelas = sc.nextInt();
		
		double valorParcela = emprestimo / parcelas;
		double limite = renda * 0.30;
		
		if ( valorParcela <= limite ) {
			System.out.println("APROVADO!");
		}
		else {
			System.out.println("REPROVADO!");
		}
		
		System.out.println("");
		
		System.out.println("Cliente: " + nome);
		System.out.println("Renda: " + renda);
		System.out.println("Emprestimo: " + emprestimo);
		System.out.println("Parcelas: " + parcelas);
		System.out.println();
		System.out.println("Parcela mensal: " + valorParcela);
		System.out.println("Limite permitido: " + limite);
		
		sc.close();
	}
}
		
		