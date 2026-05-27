package aplication;

import java.util.Locale;
import java.util.Scanner;

public class SistemaDeAprovacao {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome do aluno: ");
		String aluno = sc.nextLine();
		
		System.out.println("Digite a nota do 1° Bimestre: ");
		double nota1 = sc.nextDouble();
		
		System.out.println("Digite a nota do 2° Bimestre: ");
		double nota2 = sc.nextDouble();
		
		System.out.println("Digite a nota do 3° Bimestre: ");
		double nota3 = sc.nextDouble();
		
		System.out.println("Digite a nota do 4° Bimestre: ");
		double nota4 = sc.nextDouble();
		
		double media = (nota1 + nota2 + nota3 + nota4) / 4.0;
		
		System.out.println();
		System.out.println("RESULTADOS");
		System.out.println();
		System.out.println("Aluno: " + aluno);
		System.out.printf("Média final: %.1f%n", media);
		
		if ( media >= 70 ) {
			System.out.println("APROVADO!");
		}
		else if ( media >= 40 ) {
			System.out.println("RECUPERAÇÃO!");
		}
		else {
			System.out.println("REPROVADO!");
		}	
		
		sc.close();
	}

}