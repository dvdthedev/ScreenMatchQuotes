package alura.com.example.screenmatch_quotes.service;

import alura.com.example.screenmatch_quotes.dto.SerieDTO;
import alura.com.example.screenmatch_quotes.model.Serie;
import alura.com.example.screenmatch_quotes.repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SerieService {
    @Autowired
    private SerieRepository repositorio;


    public SerieDTO obterFrase() {
        Serie serie = repositorio.obterFraseAleatoria();

        return new SerieDTO(serie.getId(),serie.getTitulo(),serie.getPoster(),serie.getPersonagem(),serie.getFrase());

    }
}
