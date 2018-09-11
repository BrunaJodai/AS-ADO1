package Composite;

public class Indutor extends Componente {

    private String tipo;

    public Indutor(String nome, String tipo) {
        super(nome);
        this.tipo = tipo;
    }

    @Override
    public void getInfo() {
        System.out.println("Indutor: " + super.getNome() + " | " + this.tipo);
    }
}
