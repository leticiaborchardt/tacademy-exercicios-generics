package exercicio04;

public class Roteador extends Dispositivo {
    private String enderecoMAC;

    public Roteador(String nome, String tipo, String enderecoMAC) {
        super(nome, tipo);
        this.enderecoMAC = enderecoMAC;
    }

    public String getEnderecoMAC() {
        return enderecoMAC;
    }

    public void setEnderecoMAC(String enderecoMAC) {
        this.enderecoMAC = enderecoMAC;
    }
}
