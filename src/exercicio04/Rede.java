package exercicio04;

import java.util.ArrayList;
import java.util.List;

public class Rede<T extends Dispositivo> {
    private String nome;
    private List<T> dispositivos;

    public Rede() {
        this.dispositivos = new ArrayList<>();
    }

    public Rede(String nome, List<T> dispositivos) {
        this.nome = nome;
        this.dispositivos = dispositivos;
    }

    public void estabelecerConexao() {
        System.out.println("Estabelecendo conexão na rede " + this.getNome());

        System.out.println("---Dispositivos conectados---");
        this.listarDispositivos();
    }

    public void adicionarDispositivo(T dispositivo) {
        dispositivos.add(dispositivo);
    }

    public void removerDispositivo(T dispositivo) {
        dispositivos.remove(dispositivo);
    }

    public void listarDispositivos() {
        this.getDispositivos().forEach(dispositivo -> {
            System.out.println("Nome: " + dispositivo.getNome() + ", Tipo: " + dispositivo.getTipo());
        });
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<T> getDispositivos() {
        return dispositivos;
    }

    public void setDispositivos(List<T> dispositivos) {
        this.dispositivos = dispositivos;
    }
}
