package alura.com.example.screenmatch_quotes.controller;

import alura.com.example.screenmatch_quotes.dto.SerieDTO;
import alura.com.example.screenmatch_quotes.service.SerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class SerieController {
    @Autowired
    private SerieService service;

@GetMapping("/series/frases")
    public SerieDTO obterFrase(){
    return service.obterFrase();
}


}
