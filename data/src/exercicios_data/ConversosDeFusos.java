package exercicios_data;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class ConversosDeFusos {

	public static void main(String[] args) {
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		Instant d01 = Instant.parse("2026-07-20T14:00:00Z");
		
		LocalDateTime s1 = LocalDateTime.ofInstant(d01, ZoneId.of("America/Sao_Paulo"));
		LocalDateTime s2 = LocalDateTime.ofInstant(d01, ZoneId.of("Europe/Lisbon"));
		LocalDateTime s3 = LocalDateTime.ofInstant(d01, ZoneId.of("Asia/Tokyo"));
		
		System.out.println(s1.format(fmt1));
		System.out.println(s2.format(fmt1));
		System.out.println(s3.format(fmt1));
				
				

	}

}
