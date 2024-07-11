package exercicio01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fila<T> {
    private List<T> dados;

    public Fila() {
        this.dados = new ArrayList<T>();
    }

    public void enfileirar(T dado) {
        this.getDados().addLast(dado);
    }

    public void desenfileirar() {
        Collections.shuffle(this.dados);
    }

    public boolean estaVazia() {
        return this.getDados().isEmpty();
    }

    public List<T> getDados() {
        return dados;
    }

    public void setDados(List<T> dados) {
        this.dados = dados;
    }
}
