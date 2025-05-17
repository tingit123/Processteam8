package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KiemTraChiaHet extends JFrame {
    private JTextField txtA, txtB, txtKetQua;
    private JButton btnKiemTra;

    public KiemTraChiaHet() {
        setTitle("Kiểm tra a chia hết cho b");
        setSize(350, 220);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // căn giữa

        // Tạo các thành phần
        JLabel lblA = new JLabel("Nhập số a:");
        JLabel lblB = new JLabel("Nhập số b:");
        JLabel lblKetQua = new JLabel("Kết quả:");

        txtA = new JTextField(10);
        txtB = new JTextField(10);
        txtKetQua = new JTextField(10);
        txtKetQua.setEditable(false);

        btnKiemTra = new JButton("Kiểm tra");

        // Gắn sự kiện
        btnKiemTra.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int a = Integer.parseInt(txtA.getText());
                    int b = Integer.parseInt(txtB.getText());

                    if (b == 0) {
                        txtKetQua.setText("Không chia được cho 0");
                    } else if (a % b == 0) {
                        txtKetQua.setText("a chia hết cho b");
                    } else {
                        txtKetQua.setText("a không chia hết cho b");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập số nguyên hợp lệ", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Giao diện
        setLayout(new GridLayout(4, 2, 10, 10));
        add(lblA); add(txtA);
        add(lblB); add(txtB);
        add(lblKetQua); add(txtKetQua);
        add(new JLabel()); add(btnKiemTra);

        setVisible(true);
    }

    public static void main(String[] args) {
        new KiemTraChiaHet();
    }
}
