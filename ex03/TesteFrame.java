package ex03;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TesteFrame {
    public static void main(String[] args) {
    JFrame janela = new JFrame("Interface Gráfica");
    JButton botao = new JButton("Botão do Swing");
    JLabel texto = new  JLabel("Número de clicks: 0");
    JPanel painel = new JPanel( );
    painel.add(botao);
    painel.add(texto);
    janela.getContentPane( ).add(painel);
    janela.setSize(300,200);
    janela.setVisible(true);
    }
}