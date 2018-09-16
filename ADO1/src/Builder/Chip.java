package Builder;

public class Chip extends Componente {

    private String tipo;

    public Chip(String nome, String tipo) {
        super(nome);
        this.tipo = tipo;
    }

    @Override
    public void getInfo() {
        System.out.println("Chip: " + super.getNome() + " | " + this.tipo);
    }

}
