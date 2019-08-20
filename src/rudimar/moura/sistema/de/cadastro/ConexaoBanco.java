/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rudimar.moura.sistema.de.cadastro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author RKSCHARF
 */
public class ConexaoBanco {
    
    public static String status = "Não conectou...";
 
public ConexaoBanco() {
 
    }
 
public static java.sql.Connection getConexaoBanco() {
 

Connection connection = null;          //atributo do tipo Connection
 
  
 
try {
 
// Carregando o JDBC Driver padrão
 
String driverName = "org.apache.derby.jdbc.ClientDriver";                        
 
Class.forName(driverName);
 
  
 
// Configurando a conexão com um banco de dados//
        String server = "localhost:1527";   
        String bancoDados ="banco_clientes";        
        String url = "jdbc:derby://" + server + "/" + bancoDados;
        String usuario = "root";       
        String senha = "root";     
        //conectando no banco
        connection = DriverManager.getConnection(url, usuario, senha);
        //Testar a conexão//  
        if (connection != null) {
            status = ("STATUS--->Conectado com sucesso!");
        } else {
 
            status = ("STATUS--->Não foi possivel realizar conexão");
 
        }
        return connection;
 
        } catch (ClassNotFoundException e) {  //Driver não encontrado
 
            System.out.println("O driver expecificado nao foi encontrado.");
 
            return null;
 
        } catch (SQLException e) {
 
        //Não conseguindo se conectar ao banco

            System.out.println("Nao foi possivel conectar ao Banco de Dados." + e);
 
            return null;
 
        }

    }
 
  //retornar status da conexão//
    public static String getStatus() {
 
        return status;
 
    }

    public static boolean FecharConexao() {
        try {
            
            ConexaoBanco.getConexaoBanco().close();
 
            return true;
        } catch (SQLException e) {
 
            return false;
 
        }
    }
 
   //Reiniciar conexão//
    public static java.sql.Connection ReiniciarConexao() {
 
        FecharConexao();
        return ConexaoBanco.getConexaoBanco();
 
    }
 
}
