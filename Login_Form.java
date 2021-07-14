package com.codeWithMoh;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//We created a class Login_Form but implemented the actionListener to activate the Login button.
public class Login_Form implements ActionListener {
    private  static JLabel userLabel;
    private  static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton button;
    private static JLabel success;

    public static void main(String[] args){
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();

        //set dimensions of the frame
        frame.setSize(500,500);

        //exit operation close window
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setVisible(true);
         frame.add(panel);

         panel.setLayout(null);

         userLabel = new JLabel("User");
         userLabel.setBounds(10,20,80,25);
         panel.setBackground(Color.cyan);
         panel.add( userLabel);

         //creates a new textfield initialized with a specific text
         userText = new JTextField(20);
         //set boundaries in four dimensions the x and y axis and width and height.
         userText.setBounds(100,20,165,25);
         panel.add(userText);

         //JLabel-creates a specific instance with a specified text.
          passwordLabel = new JLabel("password");
         passwordLabel.setBounds(10,50,80,25);
         panel.add(passwordLabel);

         //constructs a new password with specific number of fields
         passwordText = new JPasswordField(20);
         passwordText.setBounds(100,50,165,25);
         panel.add(passwordText);

         button = new JButton("Login");
         button.setBounds(10,80,80,25);
         button .addActionListener(new Login_Form() );
         panel.add(button);

         success = new JLabel("");
         success.setBounds(10,110,300,25);
         panel.add(success);
         success.setText("");
         frame.setVisible(true);






    }
//created after implementing the actionListner in the Login_Form.
    @Override
    public void actionPerformed(ActionEvent e) {
    String user = userText.getText();
    String password = passwordText.getText();
        System.out.println(user + " " + password);

        //I have limited my input to user:Moh and Password:moh
        if (user.equals("Moh") && password.equals("moh")){
            success.setText("Login successful");
        }

    }
}
