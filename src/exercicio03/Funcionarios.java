package exercicio03;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class Funcionarios<I, F> {
    private Map<I, F> funcionarios;

    public Funcionarios() {
        this.funcionarios = new HashMap<>();
    }

    public void adicionarFuncionario(I id, F funcionario) {
        funcionarios.put(id, funcionario);
    }

    public void removerFuncionario(I id) {
        this.procurarFuncionario(id);

        funcionarios.remove(id);
    }

    public void listarFuncionarios() {
        for (Map.Entry<I, F> entry : funcionarios.entrySet()) {
            System.out.println("Id: " + entry.getKey() + ", Funcionário: " + entry.getValue());
        }
    }

    public I obterIdFuncionario(String nome) {
        for (Map.Entry<I, F> entry : funcionarios.entrySet()) {
            if (entry.getValue().toString().equalsIgnoreCase(nome)) {
                return entry.getKey();
            }
        }

        throw new NoSuchElementException("Não foi possível encontrar o funcionário");
    }

    private void procurarFuncionario(I id) {
        if (!funcionarios.containsKey(id)) {
            throw new NoSuchElementException("Não foi possível encontrar o funcionário");
        }
    }
}