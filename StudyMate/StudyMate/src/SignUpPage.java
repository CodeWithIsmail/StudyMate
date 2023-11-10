import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SignUpPage implements ActionListener {

    JFrame frame = new JFrame();
    JButton signUpButton = new JButton("Sign Up");

    JTextField f_name_field = new JTextField();
    JTextField l_name_field = new JTextField();
    JTextField u_name_field = new JTextField();
    JTextField email_field = new JTextField();
    JPasswordField password_field = new JPasswordField();

    JLabel f_name_label = new JLabel("First Name:");
    JLabel l_name_label = new JLabel("Last Name:");
    JLabel u_name_label = new JLabel("Username:");
    JLabel email_label = new JLabel("Email:");
    JLabel password_label = new JLabel("Password:");
    JLabel message_label = new JLabel();

    SignUpPage() {
        f_name_label.setBounds(100, 100, 100, 50);
        l_name_label.setBounds(100, 200, 100, 50);
        u_name_label.setBounds(100, 300, 100, 50);
        email_label.setBounds(100, 400, 100, 50);
        password_label.setBounds(100, 500, 100, 50);
        message_label.setBounds(200, 650, 200, 50);

        f_name_label.setFont(new Font(null, Font.BOLD, 15));
        l_name_label.setFont(new Font(null, Font.BOLD, 15));
        u_name_label.setFont(new Font(null, Font.BOLD, 15));
        email_label.setFont(new Font(null, Font.BOLD, 15));
        password_label.setFont(new Font(null, Font.BOLD, 15));
        message_label.setFont(new Font(null, Font.BOLD, 15));

        f_name_field.setBounds(200, 100, 300, 50);
        l_name_field.setBounds(200, 200, 300, 50);
        u_name_field.setBounds(200, 300, 300, 50);
        email_field.setBounds(200, 400, 300, 50);
        password_field.setBounds(200, 500, 300, 50);

        f_name_field.setFont(new Font(null, Font.BOLD, 15));
        l_name_field.setFont(new Font(null, Font.BOLD, 15));
        u_name_field.setFont(new Font(null, Font.BOLD, 15));
        email_field.setFont(new Font(null, Font.BOLD, 15));
        password_field.setFont(new Font(null, Font.BOLD, 15));

        signUpButton.setBounds(250, 600, 170, 50);
        signUpButton.setBackground(Color.green);
        signUpButton.setForeground(Color.BLACK);
        signUpButton.setFont(new Font(null, Font.BOLD, 20));
        signUpButton.setFocusable(false);
        signUpButton.addActionListener(this);

        frame.add(f_name_label);
        frame.add(l_name_label);
        frame.add(u_name_label);
        frame.add(email_label);
        frame.add(password_label);
        frame.add(message_label);

        frame.add(f_name_field);
        frame.add(l_name_field);
        frame.add(u_name_field);
        frame.add(email_field);
        frame.add(password_field);

        frame.add(signUpButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(700, 800);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == signUpButton) {
            String filename = "User.txt";
            String pass = String.valueOf(password_field.getText());
            String content = f_name_field.getText() + "," + l_name_field.getText() + "," + u_name_field.getText() + "," + email_field.getText() + "," + pass + "\n";

            boolean usernameFind = false, usermailFind = false;
            try {
                FileReader fileReader = new FileReader(filename);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String line = "";
                while ((line = bufferedReader.readLine()) != null) {
                    String[] info = line.split(",");
                    if (info[2].equals(u_name_field.getText())) {
                        usernameFind = true;
                    }
                    if (info[3].equals(email_field.getText())) {
                        usermailFind = true;
                    }
                }
                bufferedReader.close();
                fileReader.close();

            } catch (Exception ex) {
                //   JOptionPane.showMessageDialog(null, ex.getMessage());
            }
            if (usernameFind) {
                JOptionPane.showMessageDialog(null, "Username already exists! Try a new username.");
                u_name_field.setText("");
                usernameFind=false;
            } else if (usermailFind) {
                JOptionPane.showMessageDialog(null, "This mail has already an account!");
                email_field.setText("");
                usermailFind=false;
            } else {
                try {
                    FileWriter fileWriter = new FileWriter(filename, true);
                    fileWriter.write(content);
                    fileWriter.close();
                    JOptionPane.showMessageDialog(null,"SignUp Successful!");
                    frame.dispose();
                    new LogInPage().login();
                } catch (IOException exception) {
//                    exception.printStackTrace();
                }
            }
        }
    }
}
