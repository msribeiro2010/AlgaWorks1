import java.awt.*;
import javax.swing.*;

public class Formulario {
  public static void main(String[] args) {
    // Cria um novo JFrame
    JFrame frame = new JFrame("Formulário");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300, 150);

    // Cria um painel e adiciona os campos e rótulos
    JPanel panel = new JPanel();
    panel.setLayout(new GridLayout(2, 2));
    panel.add(new JLabel("Nome:"));
    panel.add(new JTextField());
    panel.add(new JLabel("Endereço:"));
    panel.add(new JTextField());

    // Adiciona o painel ao frame e exibe o frame
    frame.add(panel);
    frame.setVisible(true);
  }
}
