package Ex01;

public class Carro {
    
    private String cor;
    private String  nome;
    public Carro(String cor, String nome) {
        this.nome = nome;
        this.cor = cor;
    }
    
    public  void andar(float velocidade){
        System.out.println(nome +" " + cor + " que anda = " + velocidade + "km" );

    }


    


       
    }


//static possibilita visibilidade da classe ou metodo dentro do packge.
// public static seria o metodo ou contrutor e aceita somente oq e defindo dentro dos ()
// Os parametros vem aonde o objeto está sendo estanciado 