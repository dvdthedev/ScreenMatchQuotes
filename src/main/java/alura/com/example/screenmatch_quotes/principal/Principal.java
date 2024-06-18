package alura.com.example.screenmatch_quotes.principal;

import alura.com.example.screenmatch_quotes.model.DadosSerie;
import alura.com.example.screenmatch_quotes.model.Serie;
import alura.com.example.screenmatch_quotes.repository.SerieRepository;
import alura.com.example.screenmatch_quotes.service.ConsumoApi;
import alura.com.example.screenmatch_quotes.service.ConverteDados;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Principal {
    private Scanner leitura = new Scanner(System.in);
    private ConsumoApi consumo = new ConsumoApi();
    private ConverteDados conversor = new ConverteDados();
    private final String ENDERECO = "https://www.omdbapi.com/?t=";
    private final String API_KEY = "&apikey=d8dd1ed2";
    private List<DadosSerie> dadosSeries = new ArrayList<>();

    private List<Serie> series = new ArrayList<>();
    private Optional<Serie> serieBusca;
    private SerieRepository repositorio;

    public Principal(SerieRepository repositorio) {
        this.repositorio = repositorio;
    }


    public void exibeMenu(){
    var opcao = -1;
    while (opcao != 0){
        var menu = """
                1- Buscar Série
                0 - Sair
                """;
        System.out.println(menu);
        opcao = leitura.nextInt();
        leitura.nextLine();

        switch(opcao){
            case 1:
            buscarSerieWeb();
            break;
            case 0:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
    }

    private void buscarSerieWeb() {
        DadosSerie dados = getDadosSerie();
        System.out.println("Digite o nome de um personagem");
        var personagem = leitura.nextLine();
        Serie serie = new Serie(dados, personagem);
        repositorio.save(serie);
        System.out.println(serie);
    }

    private DadosSerie getDadosSerie() {
        System.out.println("Digite o nome da série para busca");
        var nomeSerie = leitura.nextLine();
        var json = consumo.obterDados(ENDERECO + nomeSerie.replace(" ", "+") + API_KEY);
        DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
        return dados;
    }
}
