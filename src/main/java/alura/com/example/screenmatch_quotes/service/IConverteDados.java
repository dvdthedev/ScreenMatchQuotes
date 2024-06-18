package alura.com.example.screenmatch_quotes.service;

public interface IConverteDados {
    <T> T  obterDados(String json, Class<T> classe);
}
