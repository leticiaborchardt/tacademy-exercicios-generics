package exercicio04;

public class Computador extends Dispositivo {
    private String sistemaOperacional;
    private String enderecoIp;

    public Computador(String nome, String tipo, String sistemaOperacional, String enderecoIp) {
        super(nome, tipo);
        this.sistemaOperacional = sistemaOperacional;
        this.enderecoIp = enderecoIp;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public String getEnderecoIp() {
        return enderecoIp;
    }

    public void setEnderecoIp(String enderecoIp) {
        this.enderecoIp = enderecoIp;
    }
}
