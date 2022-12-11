import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.util.HashMap;

public class Main {
    static HashMap<String, String> loginInfo = new HashMap<String, String>();
    public static void main(String[] args) {
        // Create Icon Image
        ImageIcon image = new ImageIcon("C:\\Users\\Sami\\OneDrive - Kantonsschule Hottingen\\Sami\\Jahr_2\\Semester_1\\Coding\\Java\\JavaLoginGUI\\assets\\images\\PROMPT.png"); // Create Image icon

        loginInfo.put("Sami", "1234");

        /*Login System in Javax.swing*/
        JFrame frame = new JFrame();
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Login System");
        frame.setIconImage(image.getImage()); // Change icon
        frame.getContentPane().setBackground(new Color(0xFFFFFF)); // Change color of background
        frame.setLayout(null);

        JLabel userLabel = new JLabel("User");
        userLabel.setBounds(10, 20, 80, 25);
        frame.add(userLabel);

        JTextField userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        frame.add(userText);

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 50, 80, 25);
        frame.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100, 50, 165, 25);
        frame.add(passwordText);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(10, 80, 80, 25);
        loginButton.addActionListener(e -> {
            String username = userText.getText();
            String password = passwordText.getText();

            if(login(username, password)) {
                JOptionPane.showMessageDialog(frame, "Login Successful");
                userText.setText("");
                passwordText.setText("");
            } else {
                JOptionPane.showMessageDialog(frame, "Login Failed");
            }
        });
        frame.add(loginButton);

        JButton registerButton = new JButton("Register");
        registerButton.setBounds(180, 80, 80, 25);
        registerButton.addActionListener(e -> {
            String username = userText.getText();
            String password = passwordText.getText();
            if(register(username, password)) {
                userText.setText("");
                passwordText.setText("");
            }
        });
        frame.add(registerButton);

        frame.setVisible(true);
    }

    public static boolean login(String username, String password) {
        if (loginInfo.containsKey(username)) {
            return loginInfo.get(username).equals(password);
        }
        return false;
    }

    public static boolean register(String username, String password) {
        if(loginInfo.get(username) != null) {
            JOptionPane.showMessageDialog(null, "Username already exists");
            return false;
        } else {
            loginInfo.put(username, password);
            JOptionPane.showMessageDialog(null, "Registration Successful");
            return true;
        }
    }
}