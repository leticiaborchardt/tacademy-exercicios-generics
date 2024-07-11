import exercicio01.Fila;
import exercicio02.Familia;
import exercicio02.Pessoa;
import exercicio03.Funcionarios;
import exercicio05.Jogo;
import exercicio05.Personagem;

public class Main {
    public static void main(String[] args) {
//        // Exercício 01
//        Fila<Integer> fila = new Fila<>();
//
//        System.out.println(fila.estaVazia());
//
//        fila.enfileirar(1);
//        fila.enfileirar(2);
//        fila.enfileirar(3);
//
//        fila.desenfileirar();
//        fila.getDados().forEach(System.out::println);

//        // Exercício 02
//        Familia<Pessoa, String> familia = new Familia<>(new Pessoa("João", 42), new Pessoa("Maria", 40));
//
//        familia.adicionarFilho("Amanda");
//        familia.adicionarFilho("Luis");
//        familia.adicionarFilho("Bianca");
//
//        System.out.println("Pai: " + familia.getPai().getNome());
//        System.out.println("Mãe: " + familia.getMae().getNome());
//
//        System.out.println("Filhos:");
//        familia.listarFilhos();
//
//        System.out.println("Removendo Amanda:");
//        familia.removerFilho("Amanda");
//        familia.listarFilhos();

//        // Exercício 03
//        Funcionarios<Integer, String> funcionarios = new Funcionarios<>();
//        funcionarios.adicionarFuncionario(1, "Alice");
//        funcionarios.adicionarFuncionario(2, "Maria");
//        funcionarios.adicionarFuncionario(3, "Charles");
//
//        System.out.println("Funcionários:");
//        funcionarios.listarFuncionarios();
//
//        try {
//            funcionarios.removerFuncionario(3);
//            System.out.println("Funcionários após remover Charles:");
//            funcionarios.listarFuncionarios();
//
//            System.out.println("id da maria: " + funcionarios.obterIdFuncionario("Maria"));
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }

        // Exercício 04


        // Exercício 05
        Jogo<Personagem, Personagem, Personagem> jogo = new Jogo<>();

        jogo.adicionarHeroi(new Personagem("Herói 01", 100, 500));
        jogo.adicionarHeroi(new Personagem("Herói 02", 150, 450));
        jogo.adicionarAjudante(new Personagem("Ajudante", 50, 90));
        jogo.adicionarVilao(new Personagem("Vilão", 1000, 200));

        jogo.listarPersonagens();
    }
}