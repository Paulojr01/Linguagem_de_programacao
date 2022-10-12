package br_com_expizza_aula;
import java.util.ArrayList;
import java.util.List;


public class Pizza {
    private String tamanho;
    private String nome;
    private double valor;
    private boolean possuiBordaRecheada;
    private List<Ingrediente> lista = new ArrayList<Ingrediente>();


    public String getTamanho() {
        return tamanho;
    }
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor2) {
        this.valor = valor2;
    }
    public boolean getPossuiBordaRecheada() {
        return possuiBordaRecheada;
    }
    public void setPossuiBordaRecheada(Boolean possuiBordaRecheada) {
        this.possuiBordaRecheada = possuiBordaRecheada;
    }
    
    public int quantidadeIngredientes(){
        return 0;
    }
    
    public void addIngredientes(String ingredientes){
            Ingrediente.add(ingredientes); 
    }
    

    public double calcPizza(){

        double valorPizza = 0 ;

        if (getTamanho().equals("G")) {
            valorPizza += 45;
        }
        else if (getTamanho().equals("M")){
            valorPizza += 30;
        }
        else {
            valorPizza += 20;
        }

        if (lista.size() > 5) {
            valorPizza += 5;
        }
        if (getPossuiBordaRecheada()){
            valorPizza += 8;
        }

        setValor(valorPizza);
        return getValor();
    }





}
