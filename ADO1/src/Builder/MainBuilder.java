/*
Para o modelo do exercício 3, monte um classe builder geradora de componentes. 
Esta classe deve ter, pelo menos, um método que gere qualquer tipo de componente.
 */
package Builder;

public class MainBuilder {

    public static void main(String[] args) {

        EquipamentoEletronico equip = new EquipamentoEletronico("teste");

        equip.getComponentes().add(EquipBuilder.geraComponente(EquipBuilder.CatComp.CHIP, "Chip01", "A"));
        equip.getComponentes().add(EquipBuilder.geraComponente(EquipBuilder.CatComp.RESISTOR, "Res02", "B"));
        equip.getComponentes().add(EquipBuilder.geraComponente(EquipBuilder.CatComp.CAPACITOR, "Cap03", "C"));
        equip.getComponentes().add(EquipBuilder.geraComponente(EquipBuilder.CatComp.INDUTOR, "Ind04", "D"));

        //placa a parte com os componentes
        Placa placa = new Placa("placa001");
        placa.getComponentes().add(new Resistor("ResP005", "E"));
        placa.getComponentes().add(new Resistor("ResP006", "F"));

        //add placa no equipamento eletronico
        equip.getComponentes().add(placa);

        equip.getInfo();

    }
}
