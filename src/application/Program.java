package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		
	
		
		System.out.println("Digite os dados do primeiro campeao:");
		System.out.print("Nome: ");
        String name = sc.nextLine();
		System.out.print("Vida inicial: ");
		int life = sc.nextInt();
		System.out.print("Ataque: ");
		int attack = sc.nextInt();
		System.out.print("Armadura: ");
		int armor = sc.nextInt();
		System.out.println();
		System.out.println("Digite os dados do segundo campeao:");
		System.out.print("Nome: ");
		
		System.out.print("Vida inicial: ");
		
		System.out.print("Ataque: ");
		
		System.out.print("Armadura: ");
		
		System.out.println();
		System.out.print("Quantos turnos voce deseja executar? ");
		System.out.println();
		System.out.print("Resultado do turno 1");
		
		
		sc.close();
	}

}
