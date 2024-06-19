package alura.com.example.screenmatch_quotes;

import alura.com.example.screenmatch_quotes.principal.Principal;
import alura.com.example.screenmatch_quotes.repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchQuotesApplication {
	@Autowired


	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchQuotesApplication.class, args);
	}


}
