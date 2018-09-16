package Builder;

public class Capacitor extends Componente {

    private String tipo;

    public Capacitor(String nome, String tipo) {
        super(nome);
        this.tipo = tipo;
    }

    @Override
    public void getInfo() {
        System.out.println("Capacitor: " + super.getNome() + " | " + this.tipo);
    }
}
