package herença;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		List<Employee> lista = new ArrayList<>();
		
		
		for (int i=1 ; i<=n ; i++)
			
		{
			System.out.println("Outsourced? (y/n)");
			
			char c = sc.next().charAt(0);
			
			if ( c == 'y')
			{
				System.out.println("Name: ");
				String name = sc.next();
				System.out.print("hours: ");
				int hour = sc.nextInt();
				System.out.print("Value per Hour:  " );
				double valuePerHour = sc.nextDouble();
				System.out.println("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				
				lista.add(new OutSourcedEmployee(name,hour,valuePerHour,additionalCharge));

			}
			
			else
			{
				System.out.println("Name: ");
				String name = sc.next();
				System.out.print("hours: ");
				int hour = sc.nextInt();
				System.out.print("Value per Hour:  " );
				double valuePerHour = sc.nextDouble();
				
				lista.add(new Employee(name,hour,valuePerHour));


			}
		
		}
		
		
			for(Employee e : lista)
			{
				System.out.println("Name: "+ e.getName());

				System.out.println("Hour: " + e.getHour());
				System.out.println("Payment: " + e.payment());
			}
			
			sc.close();
		
	}

}
