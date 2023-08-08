import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Label;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.*;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class RegisterWindow {

	private JFrame frame;
	private JTextField register_email;
	private JTextField register_fullname;
	private JTextField register_username;
	
	private static String email = System.getProperty("user.dir") + "\\src\\email.txt";
	private static String full = System.getProperty("user.dir") + "\\src\\fullname.txt";
	private static String user = System.getProperty("user.dir") + "\\src\\usernames.txt";
	private static String pass = System.getProperty("user.dir") + "\\src\\passwords.txt";
	private static String logWin = System.getProperty("user.dir") + "\\src\\LoginWindow.java";
	private JPasswordField register_password;
	
	static void storeEmail(String str) {
		File storedUsernames = new File(email);
		if (!storedUsernames.exists()) {										// An if condition that checks if the specified file do exist.
			try {														// If not, then it will execute createNewFile method which will then create the file.
				storedUsernames.createNewFile();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		try {
			FileWriter fw = new FileWriter(storedUsernames, true);			// Instantiated a FileWriter object that has the historyLog File and parameter "true" to tell the FileWriter to go on append mode.
			BufferedWriter bw = new BufferedWriter(fw);					// Instantiated a bufferedWriter to optimized the writing operation.
			
			bw.write(str + "\n");
			bw.newLine();
			bw.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	static void storeFullname(String str) {
		File storedUsernames = new File(full);
		if (!storedUsernames.exists()) {										// An if condition that checks if the specified file do exist.
			try {														// If not, then it will execute createNewFile method which will then create the file.
				storedUsernames.createNewFile();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		try {
			FileWriter fw = new FileWriter(storedUsernames, true);			// Instantiated a FileWriter object that has the historyLog File and parameter "true" to tell the FileWriter to go on append mode.
			BufferedWriter bw = new BufferedWriter(fw);					// Instantiated a bufferedWriter to optimized the writing operation.
			
			bw.write(str + "\n");
			bw.newLine();
			bw.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	static void storeUsername(String str) {
		File storedUsernames = new File(user);
		if (!storedUsernames.exists()) {										// An if condition that checks if the specified file do exist.
			try {														// If not, then it will execute createNewFile method which will then create the file.
				storedUsernames.createNewFile();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		try {
			FileWriter fw = new FileWriter(storedUsernames, true);			// Instantiated a FileWriter object that has the historyLog File and parameter "true" to tell the FileWriter to go on append mode.
			BufferedWriter bw = new BufferedWriter(fw);					// Instantiated a bufferedWriter to optimized the writing operation.
			
			bw.write(str + "\n");
			bw.newLine();
			bw.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	static void storePassword(String str) {
		File storedUsernames = new File(pass);
		if (!storedUsernames.exists()) {										// An if condition that checks if the specified file do exist.
			try {														// If not, then it will execute createNewFile method which will then create the file.
				storedUsernames.createNewFile();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		try {
			FileWriter fw = new FileWriter(storedUsernames, true);			// Instantiated a FileWriter object that has the historyLog File and parameter "true" to tell the FileWriter to go on append mode.
			BufferedWriter bw = new BufferedWriter(fw);					// Instantiated a bufferedWriter to optimized the writing operation.
			
			bw.write(str + "\n");
			bw.newLine();
			bw.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterWindow window = new RegisterWindow();
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
	public RegisterWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 801, 502);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(229, 11, 308, 429);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Instagram");
		lblNewLabel.setBounds(79, 21, 149, 34);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 28));
		
		JPanel register_loginFacebook = new JPanel();
		register_loginFacebook.setBackground(new Color(0, 134, 198));
		register_loginFacebook.setBounds(36, 73, 234, 23);
		panel.add(register_loginFacebook);
		register_loginFacebook.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Log in with facebook");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(74, 4, 125, 14);
		register_loginFacebook.add(lblNewLabel_1);
		
		Label label_1 = new Label("________________");
		label_1.setBounds(41, 102, 105, 22);
		panel.add(label_1);
		label_1.setForeground(Color.LIGHT_GRAY);
		
		Label label = new Label("OR");
		label.setBounds(151, 107, 29, 22);
		panel.add(label);
		label.setForeground(Color.LIGHT_GRAY);
		
		Label label_1_1 = new Label("________________");
		label_1_1.setForeground(Color.LIGHT_GRAY);
		label_1_1.setBounds(165, 101, 110, 22);
		panel.add(label_1_1);
		
		register_email = new JTextField();
		register_email.setText("Mobile number or Email");
		register_email.setForeground(Color.LIGHT_GRAY);
		register_email.setColumns(10);
		register_email.setBounds(39, 134, 231, 34);
		panel.add(register_email);
		
		register_fullname = new JTextField();
		register_fullname.setText("Fullname");
		register_fullname.setForeground(Color.LIGHT_GRAY);
		register_fullname.setColumns(10);
		register_fullname.setBounds(39, 173, 231, 34);
		panel.add(register_fullname);
		
		register_username = new JTextField();
		register_username.setText("Username");
		register_username.setForeground(Color.LIGHT_GRAY);
		register_username.setColumns(10);
		register_username.setBounds(39, 211, 231, 34);
		panel.add(register_username);
		
		JPanel register_signup = new JPanel();
		register_signup.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (register_email.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter your email");
				} else if (register_fullname.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter your Full Name");
				} else if (register_username.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter your Username");
				} else if (register_email.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter email");
				} else if (register_password.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter Password");
				} else if (register_password.getText().length() < 8) {
					JOptionPane.showMessageDialog(null, "Please enter a password with 8 or more characters");
				} else {
					storeEmail(register_email.getText());
					storeFullname(register_fullname.getText());
					storeUsername(register_username.getText());
					storePassword(register_password.getText());
					JOptionPane.showMessageDialog(null, "Registration Complete");
					try {
						File Signup = new File(logWin);
						Desktop.getDesktop().open(Signup);
						System.exit(0);
					} catch (IOException e2) {
						e2.printStackTrace();
					}
					System.exit(0);
				}
			}
		});
		register_signup.setLayout(null);
		register_signup.setBackground(new Color(111, 177, 244));
		register_signup.setBounds(38, 329, 234, 34);
		panel.add(register_signup);
		
		JLabel lblNewLabel_1_1 = new JLabel("Sign Up");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1.setBounds(88, 10, 125, 14);
		register_signup.add(lblNewLabel_1_1);
		
		JCheckBox register_showPass = new JCheckBox("Show Password");
		register_showPass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (register_showPass.isSelected()) {
					register_password.setEchoChar((char)0);
				} else {
					register_password.setEchoChar('*');
				}
			}
		});
		register_showPass.setBounds(170, 288, 100, 23);
		panel.add(register_showPass);
		
		register_password = new JPasswordField();
		register_password.setBounds(40, 249, 231, 34);
		panel.add(register_password);
	}
}
