package exercicios_data;

import java.time.LocalDate;
import java.time.Period;

public class CalculadoradeIdade {

	public static void main(String[] args) {
		
		LocalDate d1 = LocalDate.parse("1996-05-28");
		
		LocalDate d2 = LocalDate.now();
		
		Period p1 = Period.between(d1, d2);
		System.out.println("Você tem " + p1.getYears() + " anos, " + p1.getMonths() + " meses e " + p1.getDays() + " dias.");

	}

}
