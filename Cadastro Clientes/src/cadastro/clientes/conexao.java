/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastro.clientes;

/**
 *
 * @author WBBERTOL
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexao {
    
    public static String status = "Falha ao conectar ao banco de dados";
 
//Método Construtor da Classe//
 
        public conexao() {
 
    }
 
  
 
//Método de Conexão//
 
public static java.sql.Connection getConnection() {

Connection connection = null;          //atributo do tipo Connection
 
try {
 
// Carregando o JDBC Driver padrão
 
String drive = "org.apache.derby.jdbc.ClientDriver";                        
 
Class.forName(drive);
 
  
 
// Configurando a nossa conexão com um banco de dados//
 
        String serverPort = "localhost:1527";    //caminho do servidor do BD
 
        String banco ="cadastros";        //nome do seu banco de dados
 
        String url = "jdbc:derby://" + serverPort + "/" + banco;

        String username = "root";        //nome de um usuário de seu BD      
 
        String password = "root";      //sua senha de acesso
 
        connection = DriverManager.getConnection(url, username, password);
 
 
 
        //Testar a conexão//  
        if (connection != null) {
            status = ("STATUS--->Conectado ao banco de dados com sucesso!");
        } else {
 
            status = ("STATUS--->Falha ao conectar com o banco de dados");
 
        }
        
        return connection;
 
        } catch (ClassNotFoundException e) {  //Driver não encontrado
 
            System.out.println("Erro no banco");
 
            return null;
 
        } catch (SQLException e) {
 
//Não conseguindo se conectar ao banco
 
            System.out.println("Nao foi possivel conectar ao Banco de Dados" + e);
 
            return null;
 
        }
 
  
 
    }
 
  //retornar status da conexão//
    public static String getStatus() {
 
        return status;
 
    }

   //Método que fecha sua conexão//
    public static boolean FecharConexao() {
        try {
            
            conexao.getConnection().close();
 
            return true;
        } catch (SQLException e) {
 
            return false;
 
        }
    }
 
   //Reiniciar conexão//
    public static java.sql.Connection RobootConection() {
 
        FecharConexao();
        return conexao.getConnection();
 
    }
 
}

