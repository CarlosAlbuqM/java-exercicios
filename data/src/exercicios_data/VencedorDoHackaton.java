package exercicios_data;


import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class VencedorDoHackaton {

	public static void main(String[] args) {
		
		DateTimeFormatter sdf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		
		ZonedDateTime devA = LocalDateTime.parse("2026-08-20T16:00:00").atZone(ZoneId.of("Europe/Berlin"));
		ZonedDateTime devB = LocalDateTime.parse("2026-08-20T11:15:00").atZone(ZoneId.of("America/Sao_Paulo"));
		
		Instant d01 = devA.toInstant();
		Instant d02 = devB.toInstant();
		
		ZonedDateTime utc1 = d01.atZone(ZoneId.of("UTC"));
		ZonedDateTime utc2 = d02.atZone(ZoneId.of("UTC"));
		
		
		if (devA.isBefore(devB)) {
			System.out.println("O desenvolvedor A entregou o projeto primeiro.");
		}
		
		System.out.println("Horário UTC DevA " + utc1.format(sdf2));
		System.out.println("Horário UTC DevB " + utc2.format(sdf2));
		
		
	}

}
