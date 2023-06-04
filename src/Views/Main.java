package Views;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    private JPanel MainPanel;
    public Main(){
        setContentPane(MainPanel);
        setTitle("Màn hình chính");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setMinimumSize(new Dimension(800,600));
        setLocationRelativeTo(null);
    }
}
