package Builder;

import java.util.ArrayList;

public class EquipamentoEletronico {

    private String nome;
    private final ArrayList<IComponente> componentes = new ArrayList<>();

    public EquipamentoEletronico(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<IComponente> getComponentes() {
        return componentes;
    }

    public void getInfo() {

        System.out.println("Equipamento Eletrônico: " + this.getNome());

        for (IComponente componente : componentes) {
            componente.getInfo();
        }
    }
}
