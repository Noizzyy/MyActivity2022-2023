package longExampair2;

import java.awt.EventQueue;

import javax.swing.JFrame;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginWindow {

	private JFrame frame;
	private JTextField login_user;
	private JTextField login_password;

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
		frame.setBounds(100, 100, 915, 501);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Instagram");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblNewLabel.setBounds(360, 45, 156, 34);
		frame.getContentPane().add(lblNewLabel);
		
		login_user = new JTextField();
		login_user.setForeground(new Color(192, 192, 192));
		login_user.setText("Phone number, Username, or email");
		login_user.setBounds(328, 146, 231, 34);
		frame.getContentPane().add(login_user);
		login_user.setColumns(10);
		
		login_password = new JTextField();
		login_password.setText("Password");
		login_password.setForeground(Color.LIGHT_GRAY);
		login_password.setColumns(10);
		login_password.setBounds(328, 213, 231, 34);
		frame.getContentPane().add(login_password);
		
		Button button = new Button("New button");
		Button.BOTTOM_ALIGNMENT(center);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setBounds(116, 387, 224, 27);
		frame.getContentPane().add(button);
	}
}
