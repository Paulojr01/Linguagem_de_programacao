package Ex01;

// //1) Criar classe Carro;
// //Criar os atributos cor, nome.
// //Criar método andar, recebendo como parâmetro a velocidade;
// //2) Criar classe Principal com método main.
// //Criar objetos carros.
// //1) 1 Palio, branco que anda a 60 km.
// //     Chamar o método andar, 
//         passando a velocidade como parâmetro.
//    2) 1 Corsa, preto que anda a 70 km.
//       Chamar o método andar, 
//         passando a velocidade como parâmetro.
//    3) 1 Gol, verde que anda a 50km.
//       Chamar o método andar, 
//         passando a velocidade como parâmetro.

public class Ex01{
    public static void main(String[] args) {
        Carro palio = new Carro("Branco", "Palio");
        Carro corsa = new Carro("Preto", "Corsa");
        Carro gol = new Carro("Preto", "Corsa");

        palio.andar(60);
        corsa.andar(70);
        gol.andar(50);

        
    }


}