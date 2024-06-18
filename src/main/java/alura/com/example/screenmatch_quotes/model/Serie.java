package alura.com.example.screenmatch_quotes.model;

import alura.com.example.screenmatch_quotes.service.ConsultaChatGPT;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Serie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String poster;
    private String personagem;
    private String frase;

    public Serie(DadosSerie dados, String personagem) {
        this.titulo = dados.titulo();
        this.poster = dados.poster();
        this.personagem = personagem;
        this.frase = ConsultaChatGPT.obterCitacao(titulo, personagem).trim();

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getPersonagem() {
        return personagem;
    }

    public void setPersonagem(String personagem) {
        this.personagem = personagem;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    @Override
    public String toString() {
        return
                "titulo='" + titulo + '\'' +
                ", personagem='" + personagem + '\'' +
                ", frase='" + frase + '\'';
    }
}
