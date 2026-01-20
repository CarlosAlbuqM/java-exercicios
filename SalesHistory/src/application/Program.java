package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Sale;
import entities.Seller;
import entities.Store;
import entities.enums.SellerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter Store's name: ");
		String storeName = sc.nextLine();
		
		System.out.println("--- Enter seller Data ---");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Base Salary: ");
		Double baseSalary = sc.nextDouble();
		System.out.print("Level: ");
		String level = sc.next();
		Seller seller = new Seller(name, email, baseSalary, SellerLevel.valueOf(level), new Store(storeName));	
		
		System.out.println("How many sales to this seller?");
		int n = sc.nextInt();
		
		for (int i=1;i<=n;i++) {
			System.out.println("Enter sale # " + i + " data:");
			System.out.print("Date (DD/MM/YYYY): ");
			Date saleDate = sdf.parse(sc.next());
			System.out.print("Amount: ");
			Double amount = sc.nextDouble();
			
			Sale sale = new Sale(saleDate, amount);
			seller.addSale(sale);
			
		}
		
		
		System.out.println();
		System.out.println("Enter month and year to calculate total sales (MM/YYYY)");
		
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		
		System.out.println("Name: " + seller.getName());
		System.out.println("Store: " + seller.getStore().getName());
		System.out.println("Total sales in " + monthAndYear + ": " + seller.totalSales(year, month));
		
		
		
		
		
		

		sc.close();
	}

}
