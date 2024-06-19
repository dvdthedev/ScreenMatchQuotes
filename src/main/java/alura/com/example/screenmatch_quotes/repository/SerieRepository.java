package alura.com.example.screenmatch_quotes.repository;


import alura.com.example.screenmatch_quotes.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SerieRepository extends JpaRepository<Serie, Long> {
    @Query("SELECT s FROM Serie s ORDER BY RANDOM() LIMIT 1")
    Serie obterFraseAleatoria();
}
