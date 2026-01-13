package exercicios_data;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class AssinanteFiel {

	public static void main(String[] args) {
		
		
		LocalDate d01 = LocalDate.parse("2023-02-15");
	
		LocalDate d02 = LocalDate.now();
		
		Period p01 = Period.between(d01, d02);
		
	System.out.println("O tempo de assinatura foi de: " + p01.getYears() + " anos " + p01.getMonths() + " meses " + p01.getDays() + " dias.");
	
	long daysBetween = ChronoUnit.DAYS.between(d01, d02);
	
	System.out.println(daysBetween); 

	}

}
