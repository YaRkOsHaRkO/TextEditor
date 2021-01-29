import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame implements ActionListener {

    private static JLabel success;
    private static JButton loginButton;
    private static JPasswordField passwordField;
    private static JLabel passwordLabel;
    private static JTextField usernameField;
    private static JLabel usernameLabel;

    public static void create(String args[]) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        frame.setSize(245, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(1, 1, 345, 300);
        frame.setResizable(false);
        frame.add(panel);
        panel.setLayout(null);


        //Username Label

        usernameLabel = new JLabel("Username");
        usernameLabel.setBounds(10, 20, 80, 25);
        panel.add(usernameLabel);

        //Username input box

        usernameField = new JTextField();
        usernameField.setBounds(90, 20, 180, 25);
        panel.add(usernameField);
        frame.setVisible(true);

        //Password Label

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 80, 80, 25);
        panel.add(passwordLabel);

        //Password input box

        passwordField = new JPasswordField();
        passwordField.setBounds(90, 80, 180, 25);
        panel.add(passwordField);

        //Creating a "Login Button"

        loginButton = new JButton("Login");
        loginButton.setBounds(90, 120, 80, 25);
        loginButton.setVisible(true);
        loginButton.addActionListener(new LoginFrame());
        panel.add(loginButton);


        success = new JLabel("");
        success.setBounds(10, 110, 300, 25);
        panel.add(success);


        //Enabling visibility


        frame.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent ActionEvent) {
            String user = usernameField.getText();
            String password = passwordField.getText();
        System.out.println("Username: " + user + " Password: " + password);
    }
}
