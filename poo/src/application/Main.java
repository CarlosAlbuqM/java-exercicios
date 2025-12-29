package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product produtos = new Product();
		int x;
		int y;
		
		
		System.out.println("Qual o nome do produto: ");
		produtos.name = sc.nextLine();
		
		System.out.println("Qual a Quantidade: ");
		produtos.quantity = sc.nextInt();
		
		System.out.printf("Produto: " + produtos.name + "%n" + "Quantidade: " + produtos.quantity);
		System.out.println();
		
		
		System.out.println("Quantos produtos serão adiconados ao estoque: ");
		x = sc.nextInt();
		produtos.adicionar(x);
		
		System.out.printf("Produto: " + produtos.name + "%n" + "Quantidade: " + produtos.quantity);
		System.out.println();
		
		System.out.println("Quantos produtos serão removidos ao estoque: ");
		y = sc.nextInt();
		produtos.remover(y);
		
		
		System.out.printf("Produto: " + produtos.name + "%n" + "Quantidade: " + produtos.quantity);
		System.out.println();
		
		sc.close();
		

	}

}
