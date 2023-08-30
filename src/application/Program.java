package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Champion;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Champion c1 = new Champion();
		Champion c2 = new Champion();

		
		System.out.println("Digite os dados do primeiro campeao: ");
		
		System.out.print("Nome: ");
		sc.nextLine();
		c1.getName();
		System.out.print("Vida inicial: ");
		sc.nextLine();
		c1.getLife();
		
		System.out.print("Ataque: ");
		sc.nextLine();
		c1.getAttack();
		
		System.out.print("Armadura: ");
		sc.nextLine();
		c1.getArmor();
		
		System.out.println();

		System.out.println("Digite os dados dos segundo campeao: ");
		
		System.out.print("Nome: ");
		sc.nextLine();
		c2.getName();
		
		System.out.print("Vida inicial: ");
		sc.nextLine();
		c2.getLife();
		
		System.out.print("Ataque: ");
		sc.nextLine();
		c2.getAttack();
		
		System.out.print("Armadura: ");
		sc.nextLine();
		c2.getArmor();
		
		System.out.println();
		int N ;
		System.out.print("Quantos turnos voce deseja executar? ");
	    N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
		c1.takeDamage(c2);
		c2.takeDamage(c1);
			System.out.println("Resultado do turno " + (i + 1) + ":");
			
		
		System.out.println(c1.status());
		System.out.println(c2.status());
		
		}
		System.out.println("FIM DO COMBATE");
		sc.close();
	}
}

