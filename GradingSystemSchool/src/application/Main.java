package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos: ");
		int n = sc.nextInt();
		
		List<Student> list = new ArrayList<>();
		
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Aluno #" + i);
			sc.nextLine();
			System.out.print("Nome: ");
			String name = sc.nextLine();
		
			System.out.print("Nota 1: ");
			Double n1 = sc.nextDouble();
			
			System.out.print("Nota 2: ");
			Double n2 = sc.nextDouble();
			
			System.out.print("Nota 3: ");
			Double n3 = sc.nextDouble();
			
			Student student = new Student(name, n1, n2, n3);
			list.add(student);
			
		}
		System.out.println();
		
		System.out.println("--- RELATÓRIO FINAL ---");
		for (Student s: list) {
			System.out.println(s);
			
		}
		System.out.println(" --- APENAS APROVADOS ---");
		
		for (Student s: list) {
			if(s.isApproved()) {
				System.out.println(s.getName());
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
