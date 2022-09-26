package Ex02;

import java.util.Scanner;


public class teste {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System. in);

        int n = ler.nextInt();
        double [] vet = new double [n];

        for (int i = 0; i < n; i++){
            vet [i] = ler.nextDouble ();

        }
        for (int i = 0; i <n; i++){
            System.out.printf("%.2f%n", vet[i]);
            
        }

        }
    }
    
