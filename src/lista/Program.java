package lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos funcionários?");
		int n = sc.nextInt();
		
		Integer[] vet = new Integer[n];
		
		List<Employee> list = new ArrayList<>();
				
		for (int i = 0; i< n ; i++)
		{
			System.out.println("id: ");
			Integer id = sc.nextInt();
			
			for(Integer obj: vet)
			{
				if(id == obj)
				{
					System.out.println("id repetido");
				}
			}
			
			vet[i] = id;
			sc.nextLine();
			System.out.println("Nome: ");
			String name = sc.nextLine();
			System.out.println("Salario: ");
			Double salary = sc.nextDouble();
			list.add(new Employee(id,name,salary));
			
		}
		
		for (Employee bla: list)
		{
			System.out.println(bla);
		}
		
		System.out.println("id do empregado que vai ter aumento: ");
		Integer x = sc.nextInt();
	
		System.out.println("Porcentagem: ");
		Double percentage = sc.nextDouble();
		
	
		
		
		
		for (Employee aux : list) {
			if (aux.getId() == x)
			{
				aux.increaseSalary(percentage);
			}
		}
		
		for (Employee obj: list)
		{
			System.out.println(obj);
		}
		
	}

}
