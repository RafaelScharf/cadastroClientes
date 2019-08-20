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
public class Clientes {

    private final int id;
    private final String nomeCompleto;
    private final String email;
    private final String telefone;
    private final String tipoPessoa;
    private final String documento;
    private final String cidade;
    private final String estado;
    private final String pais;
    private final String rua;
    private String numero;
    
    public Clientes(Integer id, String nomeCompleto, String email, String telefone, String tipoPessoa, String cidade, String estado, String pais, String rua, String documento, String numero) {
        this.id = id;
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.telefone = telefone;
        this.tipoPessoa = tipoPessoa;
        this.documento = documento;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.rua = rua;
        this.numero = numero;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        
    }

}
