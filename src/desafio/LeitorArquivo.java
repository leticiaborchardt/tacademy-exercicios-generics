package desafio;

import java.util.List;

public interface LeitorArquivo<T> {
    List<T> lerArquivo(String caminhoArquivo) throws Exception;
}