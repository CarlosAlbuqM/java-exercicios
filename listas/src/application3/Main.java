package application3;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entitites3.Account;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Account> conta = new ArrayList<>();

		System.out.println("Quantas contas: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			
			System.out.print("Conta #" + i + ":");
			System.out.println();
			
			System.out.print("Conta: ");
			Integer number = sc.nextInt();
			
			System.out.print("Titular: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Saldo Inicial: ");
			Double balance = sc.nextDouble();
			
			Account cont = new Account(number, name, balance);
			conta.add(cont);
			
		}
		
		System.out.println("--- DEPÓSITO ---");
		System.out.print("Informe o número da conta para o depósito: ");
		int contDeposit = sc.nextInt();
		
		Account result = conta.stream()
				.filter(cont -> cont.getNumber() == contDeposit)
				.findFirst()
				.orElse(null);
		
		if (result != null) {
			
			System.out.print("Digite o valor do depósito: ");
			Double depositValue = sc.nextDouble();
			
			result.deposit(depositValue);
		} else {
			System.out.println("Conta inexistente");
		}
		
		
		System.out.println("--- SAQUE ---");
		System.out.print("Informe o número da conta para o saque: ");
		int contRemove = sc.nextInt();
		
		Account result2 = conta.stream()
				.filter(cont -> cont.getNumber() == contRemove)
				.findFirst()
				.orElse(null);
		
		if (result2 != null) {
			System.out.print("Digite o valor do saque: ");
			Double withdrawValue = sc.nextDouble();
			
			result2.withdraw(withdrawValue);
		} else {
			System.out.println("Conta inexistente");
		}
		
		System.out.println("--- LISTA DE CONTAS --- ");
		
		for (Account x: conta) {
			System.out.println(x);
		}
		
		

		
		
		
		sc.close();
	}

}
