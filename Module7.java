/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package module.pkg7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Module7 extends JFrame implements ActionListener {

  
    private JLabel nameLabel, emailLabel, passwordLabel, confirmPasswordLabel;
    private JTextField nameField, emailField;
    private JPasswordField passwordField, confirmPasswordField;
    private JButton submitButton, clearButton;

   
    public Module7(){
        setTitle("User Registration Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2, 10, 10)); 

        nameLabel = new JLabel("Name:");
        emailLabel = new JLabel("Email:");
        passwordLabel = new JLabel("Password:");
        confirmPasswordLabel = new JLabel("Confirm Password:");

        nameField = new JTextField();
        emailField = new JTextField();
        passwordField = new JPasswordField();
        confirmPasswordField = new JPasswordField();

        
        submitButton = new JButton("Submit");
        clearButton = new JButton("Clear");

       
        submitButton.addActionListener(this);
        clearButton.addActionListener(this);

      
        add(nameLabel);
        add(nameField);
        add(emailLabel);
        add(emailField);
        add(passwordLabel);
        add(passwordField);
        add(confirmPasswordLabel);
        add(confirmPasswordField);
        add(submitButton);
        add(clearButton);

      
        setSize(400, 300);
        setLocationRelativeTo(null); 
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
         
            String name = nameField.getText();
            String email = emailField.getText();
            String password = new String(passwordField.getPassword());
            String confirmPassword = new String(confirmPasswordField.getPassword());

            
            if (name.isEmpty() || email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
                JOptionPane.showMessageDialog(this, "All fields must be filled out", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (!password.equals(confirmPassword)) {
                JOptionPane.showMessageDialog(this, "Passwords do not match", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
              
                JOptionPane.showMessageDialog(this, "Registration Successful!\nName: " + name + "\nEmail: " + email,
                        "Success", JOptionPane.INFORMATION_MESSAGE);
            }
        }

        if (e.getSource() == clearButton) {
            
            nameField.setText("");
            emailField.setText("");
            passwordField.setText("");
            confirmPasswordField.setText("");
        }
    }

    
    public static void main(String[] args) {
        new Module7();
    }
}

    
    

