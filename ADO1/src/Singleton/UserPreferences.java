package Singleton;

public class UserPreferences {

    private UserPreferences() {

    }

    public static String nome;
    public static String senha;
    public static String dataUltimaEntrada;
    public static String perfil;

    public static void imprimeDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Senha: " + senha);
        System.out.println("Data Última Entrada: " + dataUltimaEntrada);
        System.out.println("Perfil: " + perfil);
    }
}
