package Command;

import java.util.ArrayList;

/**
 *
 * @author Bruna
 */
public class MainCommand {

    public static void main(String[] args) {

        Seila a = new Seila();
        a.setBla("aaaa");

        Seila b = new Seila();
        b.setBla("bbbb");

        Seila c = new Seila();
        c.setBla("cccc");

        ArrayList<ISeila> slas = new ArrayList<>();

        slas.add(a);
        slas.add(b);

        for (ISeila seila : slas) {
            System.out.println(seila.imprimir());
            System.out.println(seila.limpar());
            System.out.println(seila.imprimir());
        }
    }
}
