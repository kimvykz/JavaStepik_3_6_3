import javax.swing.*;
import java.awt.*;

public class Program {

    public static void main(String[] args) {
        JFrame frame = new JFrame("JLabel");
        JLabel label = new JLabel("Jlabel object");
        frame.setSize(new Dimension(400, 250));
        label.setFont(new Font("Arial", Font.ITALIC, 50));
        label.setForeground(Color.ORANGE);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(label);
        frame.setVisible(true);
    }
}
