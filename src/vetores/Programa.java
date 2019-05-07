package vetores;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos moradores?");
		int n = sc.nextInt();
		
		Morador [] vet = new Morador[10];
		
		
		for (int i = 0; i < n; i++)
		{
			System.out.println("Qual quarto?");
			int quarto = sc.nextInt();
			sc.nextLine();
			System.out.println("Nome?");
			String nome = sc.nextLine();
			System.out.println("Email?");
			String mail = sc.nextLine();
			vet[quarto] = new Morador(nome,mail,quarto);
		}
		
		for (int i = 0; i<10; i++)
		{
			if(vet[i] != null)
			{
				System.out.println(i+ ": "+vet[i]);
			}
		}
		
		sc.close();

	}

}
