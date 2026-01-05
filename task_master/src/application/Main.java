package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Tarefa;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Tarefa> lista = new ArrayList<>();
		
		System.out.println(" --- TASK MASTER ---");

		while(true) {
			System.out.println("1. Nova Tarefa");
			System.out.println("2. Listar Tarefas");
			System.out.println("3. Concluir Tarefa");
			System.out.println("4. Remover Tarefa");
			System.out.println("5. Sair");
			int opc = sc.nextInt();
			sc.nextLine();
			
			if (opc == 1) {
				System.out.print("Descrição: ");
				String descricao = sc.nextLine();
				lista.add(new Tarefa(descricao));
				
				esperarEnter(sc);
			
				}
			
			else if (opc == 2) {
				
				System.out.println("LISTA:");
				for(int i = 0; i < lista.size(); i++) {
					System.out.print(i + ". " + lista.get(i));
					System.out.println();
					
				}
				esperarEnter(sc);
			}
			else if (opc == 3) {
				System.out.print("Qual número: ");
				int n = sc.nextInt();
				if (n >= 0 && n < lista.size()) {
				Tarefa tar = lista.get(n);
				tar.marcarComoConcluida();
				}
				else { 
					System.out.println("O número não contém na lista");
				}
				
				
			
			} else if (opc == 4) {
				System.out.print("Qual número: ");
				int n = sc.nextInt();
				if (n >= 0 && n < lista.size()) {
					lista.remove(n);
					}
					else { 
						System.out.println("O número não contém na lista");
					}
					
				
			
			} else {
				break;
			}
			
			
			
			
			
			
			
			
		}
		

		
		
		
		
		
		
		
	}
	
	public static void esperarEnter(Scanner sc) {
		System.out.println();
	    System.out.println("Pressione ENTER para voltar ao menu...");
	    sc.nextLine(); 
	}

}
