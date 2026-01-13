package exercicios_data;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class AgendamentoDePagamento {

	public static void main(String[] args) {
		
		
		LocalDate d01 = LocalDate.now();
		
		System.out.println("O pagamento será em: " + d01.with(TemporalAdjusters.lastDayOfMonth()));
		System.out.println("O Happy Hour será em " + d01.with(TemporalAdjusters.next(DayOfWeek.FRIDAY)));

	}

}
