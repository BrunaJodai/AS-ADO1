package Composite;

public class Resistor extends Componente {

    private String tipo;

    public Resistor(String nome, String tipo) {
        super(nome);
        this.tipo = tipo;
    }

    @Override
    public void getInfo() {
        System.out.println("Resistor: " + super.getNome() + " | " + this.tipo);
    }

}
