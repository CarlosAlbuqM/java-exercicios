package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Book;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Book livros;
		
		System.out.println("Enter the name of the book you would like to register: ");
		String nome = sc.nextLine();
		
		System.out.println("Enter the autor's name: ");
		String autor = sc.nextLine();
		
		System.out.println("Enter the price of the book: ");
		double preco = sc.nextDouble();
		
		livros = new Book(autor, nome, preco);
		
		System.out.println(livros);
		
		System.out.println();
		System.out.println("Enter the number of books you would like to add to your inventory: ");
		int estoque = sc.nextInt();
		livros.addBooks(estoque);
		
		System.out.println("Updated book data");
		System.out.println(livros);
		
		System.out.println();
		System.out.println("Enter the number of books you would like to remove to your inventory: ");
		int retirada = sc.nextInt();
		livros.removeBooks(retirada);
	
		System.out.println(livros);
		
			
		sc.close();
	}

}
