package desafio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LeitorTXT implements LeitorArquivo<String> {
    @Override
    public List<String> lerArquivo(String caminhoArquivo) throws Exception {
        List<String> dados = new ArrayList<>();

        InputStreamReader caminho = new InputStreamReader(Objects.requireNonNull(getClass().getResourceAsStream(caminhoArquivo)));

        try (BufferedReader br = new BufferedReader(caminho)) {
            String linha;

            while ((linha = br.readLine()) != null) {
                dados.add(linha);
            }
        } catch (Exception e) {
            throw new Exception("Não foi possível ler o arquivo.");
        }

        return dados;
    }
}