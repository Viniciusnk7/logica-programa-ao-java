package aplication;

import java.util.Locale;
import java.util.Scanner;

public class simuladorEmprestimo {

	public static void main(String[] args) {

         Locale.setDefault(Locale.US);
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Digite o seu nome: ");
         String cliente = sc.nextLine();
         
         System.out.println("Digite o valor que voce deseja R$ : ");
         double valor = sc.nextDouble();
         
         System.out.println("Porcentagem da taxa de juros (%): ");
         Double taxa = sc.nextDouble();
         
         System.out.println("Digite a quantidade das parcelas que vc deseja: ");
         int parcelas = sc.nextInt();
         
         double juros = valor * (taxa / 100);
         double total = valor + juros;
         double parcela = valor / parcelas;
         
         System.out.println("Cliente: " + cliente);
         System.out.println("Valor do emprestimo : R$ " + valor);
         System.out.println("juros: R$ " + juros);
         System.out.println("total: R$ " + total);
         System.out.println("Quantidade de parcelas: " + parcelas );
         System.out.println("Valor das parcelas: R$ " + parcela);
         
         sc.close();
	}

}
