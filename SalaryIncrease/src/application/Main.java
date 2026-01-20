package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entitites.Employee;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos funcionários ? \n>> ");
		int n = sc.nextInt();
		
		List<Employee> list = new ArrayList<>();
		
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Funcionário #" + i);
			System.out.print("id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Nome: ");
			String name = sc.nextLine();
			
			System.out.print("Salário: ");
			Double salario = sc.nextDouble();
			Employee employee = new Employee(id, name, salario);
			list.add(employee);
			
		}
		
		Employee empEncontrado = null;
		System.out.println("Entre com o ID que vai ter aumento. \n>> ");
		int idProcurado = sc.nextInt();
		
		for (Employee e: list) {
			if (e.getId() == idProcurado) {
				empEncontrado = e;
				break;
				}
			}
			if(empEncontrado != null) {
				System.out.print("Entra com a porcentagem para aumento de salário. \n>> ");
				Double porcentagem = sc.nextDouble();
				empEncontrado.increaseSalary(porcentagem);
				
			}else {
				System.out.println("ID não encontrado.");
			}
			
			System.out.println("--- Lista de Funcionários --- ");
			
			for(Employee e: list) {
				System.out.println(e);
			}
			
			
			sc.close();
		}
		

	}


