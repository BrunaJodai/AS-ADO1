/*
Crie uma classe no padrão Singleton chamada de UserPreferences. Ela deve armazenar 
informações da sessão atual, tal como nome de usuário, senha, timestamp da última 
entrada no sistema e perfil de usuário (administrador ou operador). Um método 
estático deve retornar todas as informações sobre a sessão.
 */
package Singleton;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class MainSingleton {

    public static void main(String[] args) {

        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        String data = new SimpleDateFormat("dd/MM/yyyy").format(timestamp.getTime());

        UserPreferences.nome = "José";
        UserPreferences.senha = "1234";
        UserPreferences.dataUltimaEntrada = data;
        UserPreferences.perfil = "operador";

        UserPreferences.imprimeDados();
    }

}
