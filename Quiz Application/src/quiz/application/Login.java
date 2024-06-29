package quiz.application; // Define the package name

import javax.swing.*; // Import Swing components for GUI or JFrame,javax is used as Swing package is present in extended package of java
import java.awt.*; // Import AWT classes for graphical components, has Color class or component
import java.awt.event.*; // Import AWT event classes for event handling

// Define the Login class which extends JFrame and implements ActionListener
public class Login extends JFrame implements ActionListener {

    JButton rules, back; // Declare globally JButton variables for "Rules" and "Back"
    JTextField tfname; // Declare globally a JTextField variable for the name input

    // Constructor for the Login class
    Login() { 
        getContentPane().setBackground(Color.WHITE); // getContentPane helps you access whole frame, Set the background color(Color is a class in AWT package) of the content pane to white
        setLayout(null); // Use null layout to tell swing that we will use our own layout instead of default layouts (like border layout, box layout, grid layout, flow layout) using setBounds()
        
        // Load and set an image icon for the login window,ImageIcon is class in JFrame,Classloader class helps bring image from filedirectory which has static method getSystemResource()
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg")); 
        JLabel image = new JLabel(i1); // Create a JLabel to hold the image icon
        image.setBounds(0, 0, 600, 500); // Set the bounds of the image label on the frame (from left, from top, length of image, width of image)
        add(image); // Add the image label to the frame,you can't write add(i1) directly, you need to use JLabel object
        
        // Create and configure a heading label
        JLabel heading = new JLabel("Simple Minds"); 
        heading.setBounds(750, 60, 300, 45); // Set the bounds of the heading label
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 40)); // Set the font of the heading label, arguments are (font family,font type,font size)
        heading.setForeground(new Color(30, 144, 254)); // Set the text color of the heading label,(r,g,b)
        add(heading); // Add the heading label to the frame
        
        // Create and configure a label for the name input
        JLabel name = new JLabel("Enter your name"); 
        name.setBounds(810, 150, 300, 20); // Set the bounds of the name label
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 18)); // Set the font of the name label
        name.setForeground(new Color(30, 144, 254)); // Set the text color of the name label
        add(name); // Add the name label to the frame
        
        // Create and configure the text field for name input
        tfname = new JTextField(); 
        tfname.setBounds(735, 200, 300, 25); // Set the bounds of the text field
        tfname.setFont(new Font("Times New Roman", Font.BOLD, 20)); // Set the font of the text field
        add(tfname); // Add the text field to the frame
        
        // Create and configure the "Rules" button
        rules = new JButton("Rules"); 
        rules.setBounds(735, 270, 120, 25); // Set the bounds of the "Rules" button
        rules.setBackground(new Color(30, 144, 254)); // Set the background color of the button
        rules.setForeground(Color.WHITE); // Set the text color of the button
        rules.addActionListener(this); // Add an action listener to the button
        add(rules); // Add the button to the frame
        
        // Create and configure the "Back" button
        back = new JButton("Back"); 
        back.setBounds(915, 270, 120, 25); // Set the bounds of the "Back" button
        back.setBackground(new Color(30, 144, 254)); // Set the background color of the button
        back.setForeground(Color.WHITE); // Set the text color of the button
        back.addActionListener(this); // Add an action listener to the button
        add(back); // Add the button to the frame
        
        // Configure the frame size, location, and visibility
        setSize(1200, 500); // Set the size of the frame (length, width)
        setLocation(200, 150); // Set the location of the frame on the screen (from left, from top)
        setVisible(true); // Make the frame visible
    }
    
    // Override the actionPerformed method to handle button click events
    public void actionPerformed(ActionEvent ae) {
        // Check if the "Rules" button was clicked
        if (ae.getSource() == rules) {
            String name = tfname.getText(); // Get the text entered in the text field
            setVisible(false); // Hide the current frame
            new Rules(name); // Create and show the Rules frame, passing the entered name
        } else if (ae.getSource() == back) { // Check if the "Back" button was clicked
            setVisible(false); // Hide the current frame
        }
    }
    
    // Main method to create an instance of the Login class
    public static void main(String[] args) {
        new Login(); // Create a new instance of the Login class, which calls the constructor
    }
}
