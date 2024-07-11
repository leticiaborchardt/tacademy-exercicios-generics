package exercicio04;

public class SimuladorDeRede {
    public static void simularRede() {
        Rede<Dispositivo> rede = new Rede<>();
        rede.setNome("Rede 01");

        Roteador roteador = new Roteador("Roteador 01", "Roteador", "65645843");
        Computador computador = new Computador("Computador 01", "Computador", "Windows", "111111111");

        rede.adicionarDispositivo(computador);
        rede.adicionarDispositivo(roteador);

        rede.estabelecerConexao();

        roteador.enviarDados(computador);
    }
}
