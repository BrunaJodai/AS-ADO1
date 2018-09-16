package Builder;

import java.util.ArrayList;

/**
 *
 * @author bruna.ssjodai
 */
public class Placa extends Componente {

    private ArrayList<IComponente> componentes = new ArrayList<>();

    public Placa(String nome) {
        super(nome);
    }

    public ArrayList<IComponente> getComponentes() {
        return componentes;
    }

    public void setComponentes(ArrayList<IComponente> componentes) {
        this.componentes = componentes;
    }

    @Override
    public void getInfo() {
        System.out.println("Placa: " + super.getNome());

        for (IComponente componente : componentes) {
            componente.getInfo();
        }

    }

}
