/*
Monte um modelo de classes em padrão Composite no qual auxilia a montagem de projetos 
de equipamentos eletrônicos. Os mesmos podem ser formados por diferentes componentes 
(chip, resistor, capacitor, indutor) e também por outras placas, no qual estas podem 
agregar outros componentes
 */
package Composite;

public class MainComposite {

    public static void main(String[] args) {

        EquipamentoEletronico equip = new EquipamentoEletronico("teste");

        equip.getComponentes().add(new Chip("Chip01", "A"));
        equip.getComponentes().add(new Resistor("Res02", "B"));
        equip.getComponentes().add(new Capacitor("Cap03", "C"));
        equip.getComponentes().add(new Indutor("Ind04", "D"));

        //placa a parte com os componentes
        Placa placa = new Placa("placa001");
        placa.getComponentes().add(new Resistor("ResP005", "E"));
        placa.getComponentes().add(new Resistor("ResP006", "F"));

        //add placa no equipamento eletronico
        equip.getComponentes().add(placa);

        equip.getInfo();

    }
}
