package aplicacao;

import java.util.Scanner;

import entitites.Hospedes;

public class Programa {

	public static void main(String[] args) {
		
		
		Scanner tec = new Scanner(System.in);
		
        Hospedes[] client = new Hospedes[10];

		System.out.print("Quantos quartos serão reservados? ");
		int n = tec.nextInt();

				for(int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Quarto: #" + i + ":");
			
			System.out.print("Nome: ");
			tec.nextLine();
			String nome = tec.nextLine();
			
			System.out.print("Email: ");
			String email = tec.next();
			
			System.out.print("Numero do Quarto? ");
			int quarto = tec.nextInt();
			client[quarto] = new Hospedes(nome, email);	
		}
		
		System.out.println();
		System.out.println("Quartos Alugados: ");
		
		for(int i = 0; i < 10; i++) {
			if(client[i] != null) {
			System.out.println(i+": "+ client[i]);
			}
		}
	

		tec.close();

	}

}
