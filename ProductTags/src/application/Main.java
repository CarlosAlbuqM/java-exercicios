package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Main {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Product " + i + " data: ");
			System.out.print("Common, used or imported (c/u/i)? ");
			char op = sc.next().charAt(0);
			if (op == 'c') {
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				
				System.out.print("Price: ");
				Double price = sc.nextDouble();
				Product product = new Product(name, price);
				list.add(product);
				
			}
			else if (op == 'u') {
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				
				System.out.print("Price: ");
				Double price = sc.nextDouble();
				
				System.out.print("Manufacture Date:(DD/MM/YYYY): ");
				Date date = sdf.parse(sc.next());
				
				Product product = new UsedProduct(name, price, date);
				list.add(product);
				
			}
			else if (op == 'i') {
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				
				System.out.print("Price: ");
				Double price = sc.nextDouble();
				
				System.out.print("Customs fee: ");
				Double customsFee = sc.nextDouble();
				
				Product product = new ImportedProduct(name, price, customsFee);
				list.add(product);
	
		}
		

	}
		System.out.println("PRICE TAGS: ");
		for(Product proc: list) {
			System.out.println(proc.priceTag());
		}
		
		
		

		sc.close();
}

}