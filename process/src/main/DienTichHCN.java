package main;

import javax.swing.*;
import java.awt.event.*;

public class DienTichHCN extends JFrame {
    private JTextField txtLength, txtWidth, txtResult;
    private JButton btnCalculate, btnClear;

    public DienTichHCN() {
        setTitle("Tính diện tích hình chữ nhật");
        setSize(350, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lblLength = new JLabel("Chiều dài:");
        lblLength.setBounds(30, 30, 100, 25);
        add(lblLength);

        txtLength = new JTextField();
        txtLength.setBounds(130, 30, 150, 25);
        add(txtLength);

        JLabel lblWidth = new JLabel("Chiều rộng:");
        lblWidth.setBounds(30, 70, 100, 25);
        add(lblWidth);

        txtWidth = new JTextField();
        txtWidth.setBounds(130, 70, 150, 25);
        add(txtWidth);

        btnCalculate = new JButton("Tính diện tích");
        btnCalculate.setBounds(30, 110, 120, 30);
        add(btnCalculate);

        btnClear = new JButton("Xóa");
        btnClear.setBounds(160, 110, 120, 30);
        add(btnClear);

        JLabel lblResult = new JLabel("Diện tích:");
        lblResult.setBounds(30, 160, 100, 25);
        add(lblResult);

        txtResult = new JTextField();
        txtResult.setBounds(130, 160, 150, 25);
        txtResult.setEditable(false);
        add(txtResult);

        // Xử lý sự kiện nút tính
        btnCalculate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double length = Double.parseDouble(txtLength.getText());
                    double width = Double.parseDouble(txtWidth.getText());

                    if (length <= 0 || width <= 0) {
                        JOptionPane.showMessageDialog(null, "Chiều dài và chiều rộng phải lớn hơn 0");
                        return;
                    }

                    double area = length * width;
                    txtResult.setText(String.format("%.2f", area));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập số hợp lệ!");
                }
            }
        });

        // Xử lý nút xóa
        btnClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txtLength.setText("");
                txtWidth.setText("");
                txtResult.setText("");
            }
        });
    }

    public static void main(String[] args) {
        new DienTichHCN().setVisible(true);
    }
}
