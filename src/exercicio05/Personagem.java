package exercicio05;

public class Personagem {
    private String nome;
    private int totalVida;
    private int totalForca;

    public Personagem(String nome, int totalVida, int totalForca) {
        this.nome = nome;
        this.totalVida = totalVida;
        this.totalForca = totalForca;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                "\nVida: " + totalVida +
                "\nForça: " + totalForca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTotalVida() {
        return totalVida;
    }

    public void setTotalVida(int totalVida) {
        this.totalVida = totalVida;
    }

    public int getTotalForca() {
        return totalForca;
    }

    public void setTotalForca(int totalForca) {
        this.totalForca = totalForca;
    }
}
