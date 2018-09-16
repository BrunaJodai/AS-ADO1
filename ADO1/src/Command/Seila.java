/*
Elabore uma classe que persista os dados referentes a um documento do tipo texto. 
Crie também um modelo de comando (command) que permita ao documento as seguintes 
ações: limpar e imprimir.
 */
package Command;

/**
 *
 * @author Bruna
 */
public class Seila implements ISeila {

    private String bla;

    public String getBla() {
        return bla;
    }

    public void setBla(String bla) {
        this.bla = bla;
    }

    @Override
    public String limpar() {
        this.bla = "";
        return "Limpo.";
    }

    @Override
    public String imprimir() {
        if (bla.equals("")) {
            return "VAZIO!";
        } else {
            return "~ " + this.bla + " ~";
        }
    }

}
