import java.awt.Dimension;
import java.awt.EventQueue;

import java.io.*;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ForgotWindow {
	
	private static String icn = System.getProperty("user.dir") + "\\src\\icon.png";

	private JFrame frame;
	private JTextField forget_email;
	
	private static String email = System.getProperty("user.dir") + "\\src\\email.txt";
	private static String full = System.getProperty("user.dir") + "\\src\\fullname.txt";
	private static String user = System.getProperty("user.dir") + "\\src\\usernames.txt";
	private static String pass = System.getProperty("user.dir") + "\\src\\passwords.txt";
	private static String passTR = System.getProperty("user.dir") + "\\src\\passwordToReset.txt";
	private static String resWin = System.getProperty("user.dir") + "\\src\\ResetWindow.java";
	
	private static int counter = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ForgotWindow window = new ForgotWindow();
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
	public ForgotWindow() {
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
		panel.setBounds(266, 11, 301, 441);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		ImageIcon icon = new ImageIcon(icn);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(91, 36, 113, 116);
		panel.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("C:\\School Files\\1st year_2ndSemester\\CCPRGG2L_PROGRAM\\Examfinalproject\\src\\icon.png"));
		lblNewLabel.setPreferredSize(new Dimension(95, 95));
		lblNewLabel.setMaximumSize(new Dimension(800, 800));
		
		JLabel lblNewLabel_1 = new JLabel("Trouble logging in?");
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		lblNewLabel_1.setBounds(92, 157, 120, 20);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("<html>Enter your email, phone, or username and we'll<br>    send you a link to get back into your account.</html>");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(new Color(192, 192, 192));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1.setBounds(0, 188, 299, 63);
		panel.add(lblNewLabel_1_1);
		
		forget_email = new JTextField();
		forget_email.setForeground(new Color(192, 192, 192));
		forget_email.setText("Enter Email. Phone or Username");
		forget_email.setBounds(33, 267, 235, 35);
		panel.add(forget_email);
		forget_email.setColumns(10);
		
		JPanel forget_send = new JPanel();
		forget_send.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					BufferedReader reader = new BufferedReader(new FileReader(email));
					String line;			
					
					while ((line = reader.readLine()) != null) {
						if (line.equals(forget_email.getText())) {
							BufferedWriter bw = new BufferedWriter(new FileWriter(passTR));
							
							bw.write(Integer.toString(counter));
							bw.close();
						} else {
							counter++;
						}
					}
					
					reader.close();

				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
				try {
					File Signup = new File(resWin);
					Desktop.getDesktop().open(Signup);
					System.exit(0);
				} catch (IOException e2) {
					e2.printStackTrace();
				}
			}
		});
		forget_send.setBackground(new Color(133, 201, 252));
		forget_send.setBounds(62, 313, 184, 35);
		panel.add(forget_send);
		forget_send.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Send login link");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(50, 12, 100, 14);
		forget_send.add(lblNewLabel_2);
		
		
	}

}
