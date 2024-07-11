package exercicio04;

public class Dispositivo {
    private String nome;
    private String tipo;

    public Dispositivo(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public void enviarDados(Dispositivo dispositivoDestino) {
        System.out.println("Dados enviados para " + dispositivoDestino.getNome());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
