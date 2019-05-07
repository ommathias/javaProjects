package ex_herança_poli;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");

		
		List<Product> list = new ArrayList<>();
		
		System.out.println("Enter the number of products: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++)
		{
			System.out.println("Common, used or imported (c/u/i)?");
			char ch = sc.next().charAt(0);
			
			if(ch == 'c') 
			{
				System.out.println("Product #" + i + " data");
				System.out.print("Name: ");
				String name = sc.next();
				System.out.println("Price: ");
				double price = sc.nextDouble();
				System.out.println();
				
				list.add(new Product (name,price));
				
			}
			else if (ch == 'u')
			{
				System.out.println("Product #" + i + " data");
				System.out.print("Name: ");
				String name = sc.next();
				System.out.println("Price: ");
				double price = sc.nextDouble();
				System.out.println();
				System.out.println("Manucafture date (DD/MM/YYYY): ");
				String date = sc.next();
				
				list.add(new UsedProduct(name,price,sdf.parse(date)));
				
			}
			
			else if(ch == 'i')
			{
				System.out.println("Product #" + i + " data");
				System.out.print("Name: ");
				String name = sc.next();
				System.out.println("Price: ");
				double price = sc.nextDouble();
				System.out.println("Customs fee: ");
				double customsFee = sc.nextDouble();
				
				list.add(new ImportedProduct(name, price, customsFee));
			}
			
		}
			
			sc.close();
			
			System.out.println("PRICE TAGS: ");
			for (Product p : list)
			{
				System.out.println(p.getName());
				System.out.println(" $"+p.priceTag());
			}
		

	}

}
