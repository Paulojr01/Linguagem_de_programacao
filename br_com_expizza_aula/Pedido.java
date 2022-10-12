package br_com_expizza_aula;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    private String numPedido;
    private Date data;
    private Cliente cliente;
    private List <Pizza> listaPizza = new ArrayList <Pizza>();

    public Pedido(String numPedido, Date data) {
        this.numPedido = numPedido;
        this.data = data;
    }
    public String getNumPedido() {
        return numPedido;
    }
    public void setNumPedido(String numPedido) {
        this.numPedido = numPedido;
    }
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }

    public Double valorPedido (){

        double valorTotalPedido = 0;

        for (int i = 0; i < listaPizza.size(); i++) {

            listaPizza.get(i).calcPizza();

            valorTotalPedido +=  listaPizza.get(i).calcPizza();  
        }

        return valorTotalPedido ; 
    }

    

}

