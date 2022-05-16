package fr.isika.ProcessusContrat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

//@EnableFeignClients pour intancier toutes nos classes automatiquement
@EnableFeignClients("fr.isika.ProcessusContrat")
@SpringBootApplication
public class ProcessusContratApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProcessusContratApplication.class, args);
	}

}
