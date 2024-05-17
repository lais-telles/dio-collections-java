package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    // atributos
    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaParaRemover = null;
        if (!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaParaRemover = t;
                    break;
                }
            }
            tarefaSet.remove(tarefaParaRemover);
        } else {
            System.out.println("O conjunto está vazio");
        }

        if (tarefaParaRemover == null) {
            System.out.println("Tarefa não encontrada");
        }
    }

    public void exibirTarefas() {
        if (!tarefaSet.isEmpty()) {
            System.out.println(tarefaSet);
        } else{
            System.out.println("O conjunto está vazio");
        }
    }

    public int contarTarefas() {
        return tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluida = new HashSet<>();
        for (Tarefa t : tarefaSet) {
            if (t.isConcluida()) {
                tarefasConcluida.add(t);
            }
        }
        return tarefasConcluida;
    }
}
