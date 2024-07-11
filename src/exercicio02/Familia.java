package exercicio02;

import java.util.ArrayList;
import java.util.List;

public class Familia<P, F> {
    private P pai;
    private P mae;
    private List<F> filhos;

    public Familia(P pai, P mae) {
        this.pai = pai;
        this.mae = mae;
        this.filhos = new ArrayList<F>();
    }

    public void adicionarFilho(F filho) {
        this.getFilhos().add(filho);
    }

    public void removerFilho(F filho) {
        this.getFilhos().remove(filho);
    }

    public void listarFilhos() {
        this.getFilhos().forEach(System.out::println);
    }

    public P getPai() {
        return pai;
    }

    public void setPai(P pai) {
        this.pai = pai;
    }

    public P getMae() {
        return mae;
    }

    public void setMae(P mae) {
        this.mae = mae;
    }

    public List<F> getFilhos() {
        return filhos;
    }

    public void setFilhos(List<F> filhos) {
        this.filhos = filhos;
    }
}
