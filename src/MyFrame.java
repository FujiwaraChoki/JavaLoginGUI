import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame(String title) {
        this.setTitle(title); // Sets title of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit out of application
        this.setResizable(false); // Prevent frame from being resizable
        this.setSize(550, 600); // Sets x and y dimensions of frame
        this.setVisible(true); // Makes frame visible

        ImageIcon icon = new ImageIcon("C:\\Users\\Sami\\OneDrive - Kantonsschule Hottingen\\Sami\\Jahr_2\\Semester_1\\Coding\\Java\\JavaLoginGUI\\assets\\images\\icon.png"); // Create Image icon
        this.setIconImage(icon.getImage()); // Change icon

        // Dark blue: 0x123456
        this.getContentPane().setBackground(new Color(0xFFFFFF)); // Change color of background
    }
}
