package exercicios_data;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CaculadoraParcelas {

	public static void main(String[] args) {
		
		LocalDate d01 = LocalDate.of(2026, 1, 31);
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDate p1 = d01.plusMonths(1);
		LocalDate p2 = d01.plusMonths(2);
		LocalDate p3 = d01.plusMonths(3);
		
		System.out.println("Compra: " + d01.format(fmt1));
		System.out.println("Parcela 1: " + p1.format(fmt1));
		System.out.println("Parcela 2: " + p2.format(fmt1));
		System.out.println("Parcela 3: " + p3.format(fmt1));
		

	}

}
