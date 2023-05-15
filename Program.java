import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class Program {

    public static void main(String[] args) {
        JFrame frame = new JFrame("JLabel");
        JLabel label = new JLabel("Jlabel object");
        JSlider slider = new JSlider(10, 100, 50);
        frame.setSize(new Dimension(600, 250));
        frame.setLayout(new BorderLayout());
        label.setFont(new Font("Arial", Font.ITALIC, 50));
        label.setForeground(Color.ORANGE);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        slider.setPaintTicks(true);
        slider.setMajorTickSpacing(10);
        slider.setPaintLabels(true);
        slider.setLabelTable(slider.createStandardLabels(20));
        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int size = slider.getValue();
                label.setFont(new Font("Arial", Font.ITALIC, size));
            }
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(label, BorderLayout.CENTER);
        frame.getContentPane().add(slider, BorderLayout.SOUTH);
        frame.setVisible(true);
    }
}
