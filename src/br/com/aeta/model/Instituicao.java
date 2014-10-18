/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.aeta.model;

/**
 *
 * @author Guilherme
 */
public class Instituicao {
    private int id;
    private String instituicao;
    private int cid;
    private String endereco;
    private int cidade;
    private String cep;
    private String telefone1;
    private String telefone2;
    private String email;
    public String vetor[][] = new String[20][20];

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getCidade() {
        return cidade;
    }

    public void setCidade(int cidade) {
        this.cidade = cidade;
    }

   
    
    
    
   

    public String[][] getVetor() {
        return vetor;
    }

    public void setVetor(String[][] vetor) {
        this.vetor = vetor;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTelefone1() {
        return telefone1;
    }

    public void setTelefone1(String telefone1) {
        this.telefone1 = telefone1;
    }

    public String getTelefone2() {
        return telefone2;
    }

    public void setTelefone2(String telefone2) {
        this.telefone2 = telefone2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
    
}
