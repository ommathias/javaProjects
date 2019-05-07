package exe_abstratos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc  = new Scanner(System.in);
		
		List<Pessoa> list = new ArrayList<>();
		
		System.out.println("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i = 1 ; i<= n; i++ )
		{
			System.out.println("Tax payer #"+ i+ " data:");
			System.out.print("Individual or company (i/c)? " );
			char ch = sc.next().charAt(0);
			
			if (ch == 'i')
			{
				System.out.println("Name: ");
				String name = sc.next();
				System.out.println("Anual income: ");
				double rendaAnual =  sc.nextDouble();
				System.out.println("Health expenditures: ");
				double gastoSaude = sc.nextDouble();
				
				list.add(new Fisica(name, rendaAnual, gastoSaude));
			}
			
			else if (ch == 'c')
			{
				System.out.println("Name: ");
				String nome = sc.next();
				System.out.println("Anual income: ");
				double rendaAnual =  sc.nextDouble();
				System.out.println("Number of employees ");
				int numeroFunc = sc.nextInt();
				
				list.add(new Juridica(nome, rendaAnual, numeroFunc));
			}
		}
		sc.close();
		
		System.out.println("TAXES PAID: ");
		for (Pessoa p : list)
		{
			System.out.print("Name: " + p.getNome()  );
			System.out.print(" $"+ p.tax());
		}
		
				
	}

}
