package set.Pesquisa;

public class Tarefa {
    // atributos
    private String descricao;
    private Boolean concluida;
    
    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.concluida = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public Boolean isConcluida() {
        return concluida;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setConcluida(Boolean concluida) {
        this.concluida = concluida;
    }

    @Override
    public String toString() {
        return "Tarefa [descricao=" + descricao + ", concluida=" + concluida + "]";
    }
}
