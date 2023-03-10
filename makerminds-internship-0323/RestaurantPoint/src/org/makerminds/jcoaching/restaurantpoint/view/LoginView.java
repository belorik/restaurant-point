package org.makerminds.jcoaching.restaurantpoint.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginView implements ActionListener {

	JFrame frame = new JFrame();
	JButton loginButton = new JButton("Login");
	JButton clearButton = new JButton("Clear");
	JTextField userIdField = new JTextField();
	// create password field so the characters that we type are not visible
	JPasswordField userPwdField = new JPasswordField();
	JLabel userIdLabel = new JLabel("Username");
	JLabel userPwdLabel = new JLabel("Password");
	JLabel messageLabel = new JLabel("Please type in your credentials to login!");
	HashMap<String, String> loginInfoData = new HashMap<String, String>();

	public LoginView(HashMap<String, String> loginData) {
		// transfer data from IdAndPasswords class to LoginPage class
		loginInfoData = loginData;

		// set the size of the labels (position x, position y, width, height)
		userIdLabel.setBounds(50, 100, 75, 25);
		userPwdLabel.setBounds(50, 150, 75, 25);
		messageLabel.setBounds(75, 250, 250, 35);

		// set the size of the fields (position x, position y, width, height)
		userIdField.setBounds(125, 100, 200, 25);
		userPwdField.setBounds(125, 150, 200, 25);

		// create login button
		loginButton.setBounds(125, 200, 100, 25);
		loginButton.setFocusable(false);
		loginButton.addActionListener(this);

		// create clear button
		clearButton.setBounds(225, 200, 100, 25);
		clearButton.setFocusable(false);
		clearButton.addActionListener(this);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		frame.setLayout(null);
		frame.setVisible(true);
		
		// add elements on JFrame so they show up on the window
		frame.add(userIdLabel);
		frame.add(userPwdLabel);
		frame.add(messageLabel);
		frame.add(userIdField);
		frame.add(userPwdField);
		frame.add(loginButton);
		frame.add(clearButton);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		// if clear button is clicked, then text is cleared from the fields
		if (e.getSource() == clearButton) {
			userIdField.setText("");
			userPwdField.setText("");
		}
		// if login button is clicked, then compare text to user data
		if (e.getSource().equals(loginButton)) {
			String userId = userIdField.getText();
			String userPwd = String.valueOf(userPwdField.getPassword());

			if (loginInfoData.containsKey(userId)) {

				if (loginInfoData.get(userId).equals(userPwd)) {
					messageLabel.setForeground(Color.black);
					messageLabel.setText("Login Successful");
				} 
				else {
					messageLabel.setForeground(Color.red);
					messageLabel.setText("Password is incorrect!");
				}
			} 
			else {
				messageLabel.setForeground(Color.red);
				messageLabel.setText("Username could not be found!");
			}
		}
	}
}