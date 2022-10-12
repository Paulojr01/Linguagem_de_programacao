package br_com_expizza_aula;

public class Cliente {

    private String  telefone;
    private String nome;
    
    public Cliente(String telefone, String nome) {
        this.telefone = telefone;
        this.nome = nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
