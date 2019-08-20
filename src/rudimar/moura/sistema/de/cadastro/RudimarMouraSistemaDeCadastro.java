/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rudimar.moura.sistema.de.cadastro;

/**
 *
 * @author RKSCHARF
 */
public class RudimarMouraSistemaDeCadastro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ConexaoBanco banco = new ConexaoBanco();
        
        
            System.out.println(banco.getConexaoBanco());
            System.out.println(banco.getStatus());
     
        
        
    }

}
