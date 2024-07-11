package desafio;

import java.util.List;

public interface Processador<T> {
    void processarDados(List<T> dados);
}
