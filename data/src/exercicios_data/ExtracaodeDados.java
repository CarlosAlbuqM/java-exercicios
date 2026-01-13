package exercicios_data;

import java.time.LocalDateTime;

public class ExtracaodeDados {

	public static void main(String[] args) {
		
		LocalDateTime d1 = LocalDateTime.parse("2026-08-14T14:30");
		
		System.out.println("Ano: " + d1.getYear());
		System.out.println("Mês: " + d1.getMonth());
		System.out.println("Dia do mês: " + d1.getDayOfMonth());
		System.out.println("Dia do Ano: " + d1.getDayOfYear());
		System.out.println("Dia da Semana: " + d1.getDayOfWeek());

	}

}
