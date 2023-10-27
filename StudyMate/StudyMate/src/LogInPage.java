import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LogInPage implements ActionListener {
    JFrame frame = new JFrame();

    JButton loginButton = new JButton("Log In");
    JButton signUpButton = new JButton("Create New Account");

    JTextField userIdField = new JTextField();
    JPasswordField userPassField = new JPasswordField();

    JLabel userIdLabel = new JLabel("Email:");
    JLabel userPassLabel = new JLabel("Password:");
    JLabel messageLabel = new JLabel();

    LogInPage() {

        userIdLabel.setBounds(100, 200, 100, 50);
        userPassLabel.setBounds(100, 300, 100, 50);
        messageLabel.setBounds(150, 500, 300, 50);

        userIdLabel.setFont(new Font(null, Font.BOLD, 15));
        userPassLabel.setFont(new Font(null, Font.BOLD, 15));
        messageLabel.setFont(new Font(null, Font.BOLD, 15));

        userIdField.setBounds(200, 200, 300, 50);
        userPassField.setBounds(200, 300, 300, 50);

        userIdField.setFont(new Font(null, Font.BOLD, 15));
        userPassField.setFont(new Font(null, Font.BOLD, 15));

        loginButton.setBounds(250, 400, 170, 50);
        loginButton.setBackground(Color.CYAN);
        loginButton.setForeground(Color.BLACK);
        loginButton.setFont(new Font(null, Font.BOLD, 20));
        loginButton.setFocusable(false);
        loginButton.addActionListener(this);

        signUpButton.setBounds(200, 600, 300, 50);
        signUpButton.setBackground(Color.green);
        signUpButton.setForeground(Color.BLACK);
        signUpButton.setFont(new Font(null, Font.BOLD, 20));
        signUpButton.setFocusable(false);
        signUpButton.addActionListener(this);


        frame.add(userIdLabel);
        frame.add(userPassLabel);
        frame.add(messageLabel);

        frame.add(userIdField);
        frame.add(userPassField);

        frame.add(loginButton);
        frame.add(signUpButton);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 800);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == loginButton) {
            String userMail = userIdField.getText();
            String password = String.valueOf(userPassField.getText());

            boolean check = false;
            String file_name = "User.txt";
            String user_name="";

            try {
                FileReader fileReader = new FileReader(file_name);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    String[] info = line.split(",");
                    // 3 = mail 4 = pass
                    if (info[3].equals(userMail) && info[4].equals(password)) {
                        user_name=info[2];
                        check = true;
                        break;
                    }
                }
                bufferedReader.close();
                fileReader.close();
            } catch (IOException exception) {
                exception.printStackTrace();
            }
            if (check) {
                messageLabel.setForeground(Color.blue);
                messageLabel.setText("LogIn successfull.");
                frame.dispose();

Assignment assignment1=new Assignment();
assignment1.assignment();
            //    EnrolledCourse enrolledCourse=new EnrolledCourse();
              //  enrolledCourse.enrolledcourse();
             //   ToDoApp toDoApp=new ToDoApp();
             //   toDoApp.todolist();
//                HomePage homePage=  new HomePage();
//                homePage.show_user_info(user_name);
//                new ToDoListGUI();
            } else {
                userIdField.setText("");
                userPassField.setText("");
                messageLabel.setForeground(Color.RED);
                messageLabel.setText("Email or Password mismatch!\n Try again.");
            }
        }
        if(e.getSource()==signUpButton)
        {
            new SignUpPage();
        }
    }
}
