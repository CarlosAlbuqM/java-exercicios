package exercicios_data;

import java.time.Duration;
import java.time.Instant;

public class MedidordePerformance {

	public static void main(String[] args) {
		
		Instant s1 = Instant.now();
		
		for(long i = 0; i < 100000000000000L; i++) {
			
		}
		
		Instant s2 = Instant.now();
		
		Duration t1 = Duration.between(s1, s2);
		
		System.out.println("O loop demorou: " + t1.toMillis() + " Milisegundos");

	}

}
