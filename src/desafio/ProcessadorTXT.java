package desafio;

import java.util.List;

public class ProcessadorTXT implements Processador<String> {
    @Override
    public void processarDados(List<String> dados) {
        System.out.println("Processando dados do arquivo TXT");

        System.out.println("---- Dados processados ----");

        dados.forEach(System.out::println);
    }
}