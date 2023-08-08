package secondloginbutton;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

public class secondLogin {

	private JFrame frame;
	private JTextField jUser;
	private JTextField jPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					secondLogin window = new secondLogin();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public secondLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 1021, 678);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(497, 0, 510, 641);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("User Login");
		lblNewLabel.setBounds(129, 121, 257, 59);
		panel_1.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 35));
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setBounds(129, 190, 150, 13);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		jUser = new JTextField();
		jUser.setBounds(129, 225, 257, 30);
		panel_1.add(jUser);
		jUser.setForeground(new Color(128, 128, 128));
		jUser.setFont(new Font("Tahoma", Font.PLAIN, 16));
		jUser.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("User Password");
		lblNewLabel_1_1.setBounds(129, 265, 150, 13);
		panel_1.add(lblNewLabel_1_1);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		jPassword = new JTextField();
		jPassword.setBounds(129, 290, 257, 30);
		panel_1.add(jPassword);
		jPassword.setForeground(Color.GRAY);
		jPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
		jPassword.setColumns(10);
		
		JButton bLogin = new JButton("Login");
		bLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (jUser.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Please fill out username");
				}else if (jPassword.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Please fill out password");
				}else if (!(jUser.getText().equals("Andrew") && jPassword.getText().equals("password1") || jUser.getText().equals("Rovic") && jPassword.getText().equals("password2"))) {
					JOptionPane.showMessageDialog(null, "Wrong User or Password");
				}else if (jUser.getText().equals("Andrew") && jPassword.getText().equals("password1") || jUser.getText().equals("Rovic") && jPassword.getText().equals("password2")) {
					JOptionPane.showMessageDialog(null, "Welcome User");
				}
			}
		});
		bLogin.setFont(new Font("Tahoma", Font.BOLD, 17));
		bLogin.setBounds(213, 427, 107, 40);
		panel_1.add(bLogin);
		
		JCheckBox jShowPassword = new JCheckBox("Show Password");
		jShowPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (jShowPassword.isSelected()) {

				}
			}
		});
		jShowPassword.setBackground(new Color(255, 255, 255));
		jShowPassword.setFont(new Font("Tahoma", Font.PLAIN, 12));
		jShowPassword.setBounds(279, 339, 107, 21);
		panel_1.add(jShowPassword);
	}
}
