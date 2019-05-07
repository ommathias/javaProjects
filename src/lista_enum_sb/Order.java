package lista_enum_sb;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


	private Date moment;
	private OrderStatus orderStatus;
	private Client client; 
	
	private List<OrderItem> lista = new ArrayList<>();
	
	
	public Order()
	{
		
	}
	
	
	public Order(Date moment, OrderStatus orderStatus, Client client) {
		this.moment = moment;
		this.orderStatus = orderStatus;
		this.client = client;
	}



	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	} 
	
	
	public void addItem(OrderItem item)
	{
		lista.add(item);
	}
	
	public void removeItem(OrderItem item)
	{
		lista.remove(item);
	}


	public Client getClient() {
		return client;
	}

	
	public Double total()
	{
		double sum = 0;
		for (OrderItem item : lista)
		{
			sum += item.subTotal();
		}
		return sum;
	}
	
	public String toString()
	{
		StringBuilder s = new StringBuilder();
		s.append("Order moment: ");
		s.append(sdf.format(moment) + "\n" );
		s.append("Order Status: ");
		s.append(orderStatus +  "\n");
		s.append("Client: ");
		s.append(client +  "\n");
		s.append("Order items:   \n");
		for(OrderItem item: lista)
		{
			s.append(item +  "\n");
		}
		s.append("Total price");
		s.append(total());
		return s.toString();
		
	}
	
}
