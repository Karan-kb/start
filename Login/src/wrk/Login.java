package wrk;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Main extends JFrame implements ActionListener {

    // public class Login extends Frame{
    JLabel lbluser, lblpass;
    JTextField txtuser, txtpass;
    JButton btnlogin;

    public Main() {
        // setLayout(new FlowLayout());
        setLayout(null);
        lbluser = new JLabel("Username");
        lblpass = new JLabel("Password");

        txtuser = new JTextField(20);
        txtpass = new JTextField(20);

        btnlogin = new JButton("Login");

        add(lbluser);
        lbluser.setBounds(50, 50, 100, 25);
        add(txtuser);
        txtuser.setBounds(150, 50, 100, 25);
        add(lblpass);
        lblpass.setBounds(50, 100, 100, 25);
        add(txtpass);
        txtpass.setBounds(150, 100, 100, 25);
        add(btnlogin);
        btnlogin.addActionListener(this);
        btnlogin.setBounds(150, 150, 100, 25);

        setSize(400, 300);
        setResizable(false); // can't change size of frame
        setLocation(500, 300);
        setTitle("Login Page"); // title of frame
        setVisible(true);
    }

    // }

    public static void main(String[] args) {
        Main L = new Main();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String uname = "Alex";
        String pwd = "Alex123";
        if ((uname.equals(txtuser.getText().toString())) && (pwd.equals(txtpass.getText().toString()))) {
            JOptionPane.showMessageDialog(null, "Login Successful");
        } else {
            JOptionPane.showMessageDialog(null, "Login Unsuccessful");
        }
    }
}