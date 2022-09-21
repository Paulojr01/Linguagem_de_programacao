
package ex03;
import javax.swing.JOptionPane;


public class Main {

    public static void main(String[] args) {
        
        String nome = JOptionPane.showInputDialog("Digite o nome: ");
        String sobreNome =  JOptionPane.showInputDialog("Digte o sobrenome");
        
         String nomeCompleto  = nome + " " + sobreNome;

         JOptionPane.showMessageDialog(null,"Nome completo:  " + nomeCompleto, "informação ", JOptionPane.PLAIN_MESSAGE );
    }
}