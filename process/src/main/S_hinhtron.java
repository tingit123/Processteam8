package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class S_hinhtron extends JFrame {

    private JTextField txtBanKinh;
    private JLabel lblKetQua;

    public S_hinhtron() {
        setTitle("Tính Diện Tích Hình Tròn");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(3, 2, 10, 10));

        txtBanKinh = new JTextField();
        lblKetQua = new JLabel("Diện tích: ");

        JButton btnTinh = new JButton("Tính");

        add(new JLabel("Bán kính:"));
        add(txtBanKinh);
        add(btnTinh);
        add(lblKetQua);

        btnTinh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double r = Double.parseDouble(txtBanKinh.getText());
                    double s = Math.PI * r * r;
                    lblKetQua.setText("Diện tích: " + s);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập số hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new S_hinhtron().setVisible(true));
    }
}

