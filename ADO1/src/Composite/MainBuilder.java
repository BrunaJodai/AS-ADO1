package Composite;

/**
 *
 * @author bruna.ssjodai
 */
public class MainBuilder {

    public static enum CatComp {
        CHIP,
        RESISTOR,
        CAPACITOR,
        INDUTOR,
        PLACA
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
