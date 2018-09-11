/*
Crie uma classe no padrão Singleton chamada de UserPreferences. Ela deve armazenar 
informações da sessão atual, tal como nome de usuário, senha, timestamp da última 
entrada no sistema e perfil de usuário (administrador ou operador). Um método 
estático deve retornar todas as informações sobre a sessão.
*/
package Singleton;

public class MainSingleton {

    public static void main(String[] args) {
        UserPreferences.nome = "José";
        UserPreferences.senha = "1234";
        UserPreferences.dataUltimaEntrada = "11/09/2018";
        UserPreferences.perfil = "operador";
        
        UserPreferences.imprimeDados();
    }

}
