package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cong extends JFrame {

    private JTextField txtSo1, txtSo2;
    private JButton btnCong;
    private JLabel lblKetQua;

    public Cong() {
        setTitle("Phép Cộng");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 2, 10, 10));

        // Khởi tạo các thành phần
        txtSo1 = new JTextField();
        txtSo2 = new JTextField();
        btnCong = new JButton("Cộng");
        lblKetQua = new JLabel("Kết quả: ");

        // Thêm các thành phần vào cửa sổ
        add(new JLabel("Số thứ nhất:"));
        add(txtSo1);
        add(new JLabel("Số thứ hai:"));
        add(txtSo2);
        add(btnCong);
        add(lblKetQua);

        // Xử lý sự kiện khi nhấn nút Cộng
        btnCong.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double so1 = Double.parseDouble(txtSo1.getText());
                    double so2 = Double.parseDouble(txtSo2.getText());
                    double ketQua = so1 + so2;
                    lblKetQua.setText("Kết quả: " + ketQua);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập số hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Cong().setVisible(true);
        });
    }
}

