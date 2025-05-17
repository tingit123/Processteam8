package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TinhTien extends JFrame {
    private JTextField txtSoLuong, txtDonGia, txtThanhTien;
    private JButton btnTinh;

    public TinhTien() {
        setTitle("Tính thành tiền");
        setSize(350, 220);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // căn giữa màn hình

        // Khởi tạo các thành phần
        JLabel lblSoLuong = new JLabel("Số lượng:");
        JLabel lblDonGia = new JLabel("Đơn giá:");
        JLabel lblThanhTien = new JLabel("Thành tiền:");

        txtSoLuong = new JTextField(10);
        txtDonGia = new JTextField(10);
        txtThanhTien = new JTextField(10);
        txtThanhTien.setEditable(false); // không cho sửa kết quả

        btnTinh = new JButton("Tính tiền");

        // Gắn sự kiện cho nút
        btnTinh.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int soLuong = Integer.parseInt(txtSoLuong.getText());
                    double donGia = Double.parseDouble(txtDonGia.getText());
                    double thanhTien = soLuong * donGia;
                    txtThanhTien.setText(String.valueOf(thanhTien));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập số hợp lệ", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Thiết kế giao diện
        setLayout(new GridLayout(4, 2, 10, 10));
        add(lblSoLuong); add(txtSoLuong);
        add(lblDonGia); add(txtDonGia);
        add(lblThanhTien); add(txtThanhTien);
        add(new JLabel()); add(btnTinh); // để căn nút

        setVisible(true);
    }

    public static void main(String[] args) {
        new TinhTien();
    }
}
