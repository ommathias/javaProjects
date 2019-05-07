package enum_composition;

import java.util.Date;
import java.util.Locale;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		

		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
		
		System.out.println("Entre com departamento: ");
		String departmentName = sc.nextLine();
		
		System.out.println("Entre com os dados do trabalhador");
		System.out.print("Nome: ");		
		String name = sc.nextLine();
		System.out.println("Level: ");
		String workerLevel = sc.nextLine();
		System.out.println("Salario Base: ");
		Double salarioBase = sc.nextDouble();
		
		//Construtor Workercom dados informados
		//WorkerLevel é o tipo Enum (value of 'variável que recebeu a string')
		//Departamento é um tipo, new department construtor (nome)
		Worker worker = new Worker(name, WorkerLevel.valueOf(workerLevel), salarioBase,new Department(departmentName));
		
		System.out.println(worker.getName()+ " "+ worker.getBaseSalary()+  " "+ worker.getDepartment().getName() + " "+ worker.getLevel());
		
		
		System.out.println("Quantos Contratos? ");
		int n = sc.nextInt();
		
		for (int i = 1; i<=n; i++)
		{
			System.out.println("Entre com os dados do contrato "+ i);
			System.out.print("Data: (dd/mm/aaaa) ");
			Date contractDate = sdf.parse(sc.next());
			System.out.println("Valor por hora: ");
			double valorHora = sc.nextDouble();
			
			System.out.println("Duraçao do contrato: ");
			int hours = sc.nextInt();
			
			HourContract contract = new HourContract(contractDate, valorHora, hours);
			
			worker.addContract(contract);
			
		}
		
		
		
		System.out.println("Entre com um mês e ano pra saber a renda: ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year =  Integer.parseInt(monthAndYear.substring(3));
		
		System.out.println("Name: "+ worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Renda em " + monthAndYear + ": "+ worker.income(year, month));
		
		sc.close();
		
	}

}
