package alura.com.example.screenmatch_quotes.repository;

import alura.com.example.screenmatch_quotes.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SerieRepository extends JpaRepository<Serie, Long> {
}
