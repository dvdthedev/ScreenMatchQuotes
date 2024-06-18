package alura.com.example.screenmatch_quotes.service;

import alura.com.example.screenmatch_quotes.dto.SerieDTO;
import alura.com.example.screenmatch_quotes.model.Serie;
import alura.com.example.screenmatch_quotes.repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SerieService {
    @Autowired
    private SerieRepository repositorio;



}
