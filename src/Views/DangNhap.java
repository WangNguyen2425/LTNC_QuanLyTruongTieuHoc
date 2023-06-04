package Views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DangNhap extends JFrame{
    private JPanel  mainPanel;
    private JTextField tf_taiKhoan;
    private JTextField tf_matKhau;
    private JButton btn_dangNhap;
    private JButton btn_huy;
    private JTextPane quênMậtKhẩuTextPane;
    private JRadioButton quảnTrịViênRadioButton;
    private JRadioButton giáoViênRadioButton;
    private JRadioButton nhânViênRadioButton;


    public DangNhap() {
        setContentPane(mainPanel);
        setTitle("Đăng Nhập");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setMinimumSize(new Dimension(800,600));
        setLocationRelativeTo(null);
        setVisible(true);

        btn_dangNhap.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main main = new Main();
                main.setVisible(true);
                setVisible(false);
            }
        });

        // on click hủy
        btn_huy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        new DangNhap();
    }

}
