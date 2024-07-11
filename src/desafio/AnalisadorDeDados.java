package desafio;

import java.util.List;

public class AnalisadorDeDados<T> {
    private final LeitorArquivo<T> leitorArquivo;
    private final Processador<T> processadorDados;

    public AnalisadorDeDados(LeitorArquivo<T> leitorArquivo, Processador<T> processadorDados) {
        this.leitorArquivo = leitorArquivo;
        this.processadorDados = processadorDados;
    }

    public void analisarArquivo(String caminhoArquivo) {
        try {
            List<T> dados = leitorArquivo.lerArquivo(caminhoArquivo);

            processadorDados.processarDados(dados);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
