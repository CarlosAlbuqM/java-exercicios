package exercicios_data;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;


public class VooInternacional {

	public static void main(String[] args) {
		
		ZonedDateTime d01 = LocalDateTime.parse("2022-07-20T10:30:00").atZone(ZoneId.of("America/Sao_Paulo"));
		
		ZonedDateTime d02 = LocalDateTime.parse("2022-07-20T18:50:00").atZone(ZoneId.of("America/New_York"));
		

		
		Instant d03 = d01.toInstant();
		Instant d04 = d02.toInstant();
		
		Duration t1 = Duration.between(d03, d04);
		
		System.out.println("Duração do voo: " + t1.toHours() + " Horas e " + t1.toMinutesPart() +  " minutos.");
		
		
		
	}

}
