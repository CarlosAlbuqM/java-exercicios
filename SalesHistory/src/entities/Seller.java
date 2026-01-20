package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.SellerLevel;

public class Seller {
	
	private String name;
	private String email;
	private Double baseSalary;
	private SellerLevel level;
	private Store store;
	private List<Sale> sales = new ArrayList<>();

	
	public Seller() {
		
		
	}

	public Seller(String name, String email, Double baseSalary, SellerLevel level, Store store) {
		this.name = name;
		this.email = email;
		this.baseSalary = baseSalary;
		this.level = level;
		this.store = store;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Double getBaseSalary() {
		return baseSalary;
	}


	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}


	public SellerLevel getLevel() {
		return level;
	}


	public void setLevel(SellerLevel level) {
		this.level = level;
	}


	public Store getStore() {
		return store;
	}


	public void setStore(Store store) {
		this.store = store;
	}


	public List<Sale> getSales() {
		return sales;
	}


	public void addSale(Sale sale) {
		sales.add(sale);
		
	}
	
	public void removeSale(Sale sale) {
		sales.remove(sale);
		
	}
	
	public double totalSales(int year, int month) {
		double sum = 0;
		Calendar cal = Calendar.getInstance();
		for (Sale s: sales) {
			cal.setTime(s.getDate());
			int s_year = cal.get(Calendar.YEAR);
			int s_month = 1 + cal.get(Calendar.MONTH);
			if (year == s_year && month == s_month) {
				sum += s.getAmount();
			}
			
		}
		return sum;
	}
	
}
