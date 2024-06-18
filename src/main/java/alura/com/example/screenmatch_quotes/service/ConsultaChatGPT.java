package alura.com.example.screenmatch_quotes.service;

import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.service.OpenAiService;

public class ConsultaChatGPT {
    public static String obterCitacao(String titulo, String personagem) {
        OpenAiService service = new OpenAiService(System.getenv("OPENIA_APIKEY"));

        CompletionRequest requisicao = CompletionRequest.builder()
                .model("gpt-3.5-turbo-instruct")
                .prompt("Crie uma citação do personagem : " + personagem + "da série/filme: " + titulo)
                .maxTokens(1000)
                .temperature(0.7)
                .build();

        var resposta = service.createCompletion(requisicao);
        return resposta.getChoices().get(0).getText();
    }
}
