package view;
import javax.swing.JFrame;

public class MinhaJanela extends JFrame {
    public MinhaJanela() {
        // Defina o título da janela
        setTitle("Minha Janela");

        // Defina o tamanho da janela (largura x altura)
        setSize(400, 300);

        // Defina a operação padrão de fechamento da janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Tornar a janela visível
        setVisible(true);
    }

    public static void main(String[] args) {
        // Crie uma instância da sua classe de janela
        MinhaJanela janela = new MinhaJanela();
    }
}
