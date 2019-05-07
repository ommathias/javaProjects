package lista_enum_sb;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;
import java.util.Date;



public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/YYYY");
		Locale.setDefault(Locale.US);

		
		Scanner sc = new Scanner (System.in);
		
			System.out.println("Enter client data: ");
			System.out.println("Name: ");
			String name = sc.nextLine();
			System.out.println("Email: ");
			String email = sc.next();
			System.out.println("Birth date:(DD/MM/YYYY) ");
			Date birthDate = sdf.parse(sc.next());
			
			Client client = new Client(name,email,birthDate);
			
			System.out.println("Enter order data: ");
			OrderStatus orderStatus = OrderStatus.valueOf(sc.next());
			
			Order order = new Order(new Date(), orderStatus, client);
					
			System.out.println("How many itens to this order?");
			int n = sc.nextInt();

			for (int i = 1; i <=n; i++)
			{
				System.out.println("Enter product #"+i+ "data: ");
				System.out.println("Product name: ");
				String nameItem = sc.next();
				System.out.println("Product price: ");
				Double price = sc.nextDouble();
				System.out.println("Quantity: ");
				int quantity = sc.nextInt();
				
				Product product = new Product(nameItem, price);
				OrderItem item = new OrderItem(quantity, price, product);
				
				order.addItem(item);
				
			}
			
			System.out.println();
			System.out.println("ORDER SUMMARY: ");
			System.out.println(order);
			
			sc.close();
	}

}
