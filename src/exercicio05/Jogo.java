package exercicio05;

import java.util.ArrayList;
import java.util.List;

public class Jogo<H, V, A> {
    private List<H> superHerois;
    private List<V> viloes;
    private List<A> ajudantes;

    public Jogo() {
        this.superHerois = new ArrayList<>();
        this.viloes = new ArrayList<>();
        this.ajudantes = new ArrayList<>();
    }

    public Jogo(List<H> superHerois, List<V> viloes, List<A> ajudantes) {
        this.superHerois = superHerois;
        this.viloes = viloes;
        this.ajudantes = ajudantes;
    }

    public void listarPersonagens() {
        System.out.println("------- Super-Heróis -------");
        this.getSuperHerois().forEach(System.out::println);

        System.out.println("---------- Vilões ----------");
        this.getViloes().forEach(System.out::println);

        System.out.println("-------- Ajudantes ---------");
        this.getAjudantes().forEach(System.out::println);
    }

    public void adicionarHeroi(H heroi) {
        this.getSuperHerois().add(heroi);
    }

    public void adicionarVilao(V vilao) {
        this.getViloes().add(vilao);
    }

    public void adicionarAjudante(A ajudante) {
        this.getAjudantes().add(ajudante);
    }

    public List<H> getSuperHerois() {
        return superHerois;
    }

    public void setSuperHerois(List<H> superHerois) {
        this.superHerois = superHerois;
    }

    public List<V> getViloes() {
        return viloes;
    }

    public void setViloes(List<V> viloes) {
        this.viloes = viloes;
    }

    public List<A> getAjudantes() {
        return ajudantes;
    }

    public void setAjudantes(List<A> ajudantes) {
        this.ajudantes = ajudantes;
    }
}
