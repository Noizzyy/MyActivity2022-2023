import java.awt.EventQueue;
import java.io.*;
import java.nio.file.*;
import java.util.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Desktop;

import javax.swing.JButton;
import java.awt.Button;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;

public class LoginWindow {

	private JFrame frame;
	private JTextField login_user;

	private static String email = System.getProperty("user.dir") + "\\src\\email.txt";
	private static String full = System.getProperty("user.dir") + "\\src\\fullname.txt";
	private static String user = System.getProperty("user.dir") + "\\src\\usernames.txt";
	private static String pass = System.getProperty("user.dir") + "\\src\\passwords.txt";
	private static String regWin = System.getProperty("user.dir") + "\\src\\RegisterWindow.java";
	private static String forWin = System.getProperty("user.dir") + "\\src\\ForgotWindow.java";
	private static String disEnr = System.getProperty("user.dir") + "\\src\\disEnrollment.java";
	
	static boolean loginSuccess = false;
	private JPasswordField login_password;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginWindow window = new LoginWindow();
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
	public LoginWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 795, 501);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Panel panel = new Panel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(220, 54, 346, 350);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		Label label = new Label("OR");
		label.setBounds(158, 220, 29, 22);
		panel.add(label);
		label.setForeground(new Color(192, 192, 192));
		
		JLabel lblNewLabel = new JLabel("Instagram");
		lblNewLabel.setBounds(97, 18, 149, 34);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 28));
		
		login_user = new JTextField();
		login_user.setBounds(55, 72, 231, 34);
		panel.add(login_user);
		login_user.setForeground(new Color(192, 192, 192));
		login_user.setText("Phone number, Username, or email");
		login_user.setColumns(10);
		
		Button login_button = new Button("Log In");
		login_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					BufferedReader reader = new BufferedReader(new FileReader(email));
					String line;			
					
					for (int counter = 0;(line = reader.readLine()) != null; counter++) {
						if (line.equals(login_user.getText())) {
							String linePass = Files.readAllLines(Paths.get(pass)).get(counter);
							if (linePass.equals(login_password.getText())) {
								loginSuccess = true;
							}
						}
					}
					
					if (loginSuccess) {
						JOptionPane.showMessageDialog(null, "Log In Success");
						try {
							File Signup = new File(disEnr);
							Desktop.getDesktop().open(Signup);
							System.exit(0);
						} catch (IOException e2) {
							e2.printStackTrace();
						}
					} else {
						JOptionPane.showMessageDialog(null, "Email or password is incorrect!");
					}
					
					loginSuccess = false;
					
					reader.close();

				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		login_button.setBounds(53, 188, 231, 22);
		panel.add(login_button);
		login_button.setForeground(new Color(255, 255, 255));
		login_button.setBackground(new Color(16, 184, 248));
		
		Label label_1 = new Label("________________");
		label_1.setBounds(53, 216, 126, 22);
		panel.add(label_1);
		label_1.setForeground(new Color(192, 192, 192));
		
		Label label_1_1 = new Label("________________");
		label_1_1.setBounds(185, 215, 126, 22);
		panel.add(label_1_1);
		label_1_1.setForeground(Color.LIGHT_GRAY);
		
		Label label_2 = new Label("Log in with Facebook");
		label_2.setBounds(100, 248, 143, 22);
		panel.add(label_2);
		label_2.setFont(new Font("Dialog", Font.BOLD, 13));
		label_2.setForeground(new Color(1, 50, 177));
		
		Label login_forgot = new Label("Forgot password?");
		login_forgot.setBackground(new Color(255, 255, 255));
		login_forgot.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					File Signup = new File(forWin);
					Desktop.getDesktop().open(Signup);
					System.exit(0);
				} catch (IOException e2) {
					e2.printStackTrace();
				}
			}
		});
		login_forgot.setBounds(123, 275, 143, 22);
		panel.add(login_forgot);
		login_forgot.setForeground(new Color(0, 120, 179));
		login_forgot.setFont(new Font("Dialog", Font.PLAIN, 11));
		
		JLabel lblNewLabel_1 = new JLabel("Don't have an account?");
		lblNewLabel_1.setBounds(92, 309, 115, 14);
		panel.add(lblNewLabel_1);
		
		JLabel login_register = new JLabel("Sign Up");
		login_register.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					File Signup = new File(regWin);
					Desktop.getDesktop().open(Signup);
					System.exit(0);
				} catch (IOException e2) {
					e2.printStackTrace();
				}
			}
		});
		login_register.setForeground(new Color(0, 163, 240));
		login_register.setBounds(210, 309, 42, 14);
		panel.add(login_register);
		
		login_password = new JPasswordField();
		login_password.setForeground(new Color(192, 192, 192));
		login_password.setBounds(55, 117, 231, 34);
		panel.add(login_password);
		
		JCheckBox login_showPass = new JCheckBox("Show Password");
		login_showPass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (login_showPass.isSelected()) {
					login_password.setEchoChar((char)0);
				} else {
					login_password.setEchoChar('*');
				}
			}
		});
		login_showPass.setBounds(186, 158, 101, 23);
		panel.add(login_showPass);
	}
}
