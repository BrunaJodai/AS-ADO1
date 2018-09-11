package Composite;

public abstract class Componente implements IComponente {

    private String nome;

    public Componente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
