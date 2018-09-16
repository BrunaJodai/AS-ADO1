package Builder;

import java.util.ArrayList;

/**
 *
 * @author bruna.ssjodai
 */
public class EquipBuilder {

    public static enum CatComp {
        CHIP,
        RESISTOR,
        CAPACITOR,
        INDUTOR,
        PLACA
    }

    public static Chip geraChip(String nomePlaca, String tipoPlaca) {
        return new Chip(nomePlaca, tipoPlaca);
    }

    public static Resistor geraResistor(String nomePlaca, String tipoResistor) {

        String nPlaca, tPlaca;

        if (nomePlaca.equals("")) {
            nPlaca = "nomePadrao";
        } else {
            nPlaca = nomePlaca;
        }

        if (tipoResistor.equals("")) {
            tPlaca = "tipoPadrao";
        } else {
            tPlaca = nomePlaca;
        }

        return new Resistor(nPlaca, tPlaca);
    }

    public static Capacitor geraCapacitor(String nomePlaca, String tipoPlaca) {
        return new Capacitor(nomePlaca, tipoPlaca);
    }

    public static Indutor geraIndutor(String nomePlaca, String tipoPlaca) {
        return new Indutor(nomePlaca, tipoPlaca);
    }

    public static Placa geraPlaca(String nomePlaca, ArrayList<IComponente> componentes) {
        if (componentes == null || componentes.isEmpty()) {
            return new Placa(nomePlaca);
        } else {
            Placa p = new Placa(nomePlaca);
            p.setComponentes(componentes);
            return p;
        }
    }

    public static IComponente geraComponente(CatComp catComp, String nomeComp, String tipoComp) {
        switch (catComp) {
            case CHIP:
                return geraChip(nomeComp, tipoComp);
            case RESISTOR:
                return geraResistor(nomeComp, tipoComp);
            case CAPACITOR:
                return geraCapacitor(nomeComp, tipoComp);
            case INDUTOR:
                return geraIndutor(nomeComp, tipoComp);
            case PLACA:
                return geraPlaca(nomeComp, null);
            default:
                return null;
        }
    }
}
