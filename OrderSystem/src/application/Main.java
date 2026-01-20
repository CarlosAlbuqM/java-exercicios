package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;



public class Main {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		System.out.println("--- Enter client Data --- ");
		System.out.print("Name:");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth Date (DD/MM/YYYY): ");
		Date birthD = sdf.parse(sc.next());
		
		Client client = new Client(name, email, birthD);
		
	
		System.out.println(" ---- ENTER ORDER DATA ----");
		
		System.out.print("Status: ");
		String status = sc.next();
		Order order = new Order(new Date(), OrderStatus.valueOf(status), client);
		
		System.out.print("How many items to this order?: ");
		int n = sc.nextInt();
		
		for (int i = 1; i<=n; i++) {
			System.out.print("Product name: ");
			String productName = sc.next();
			
			System.out.print("Product Price: ");
			Double productPrice = sc.nextDouble();
			
			Product product = new Product(productName, productPrice);
			
			System.out.print("Quantity: ");
			Integer quantity = sc.nextInt();
			
			OrderItem orderItem = new OrderItem(quantity, productPrice, product);
			order.addItem(orderItem);
		}
		
		System.out.println(order);
		
		
		

		
		
		sc.close();
	}
	
	
	
}
