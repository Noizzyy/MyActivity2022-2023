import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Desktop;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class ResetWindow {

	private JFrame frame;
	private JPasswordField reset_password;
	private JPasswordField reset_confirm;

	
	private static String email = System.getProperty("user.dir") + "\\src\\email.txt";
	private static String full = System.getProperty("user.dir") + "\\src\\fullname.txt";
	private static String user = System.getProperty("user.dir") + "\\src\\usernames.txt";
	private static String pass = System.getProperty("user.dir") + "\\src\\passwords.txt";
	private static String passTR = System.getProperty("user.dir") + "\\src\\passwordToReset.txt";
	private static String logWin = System.getProperty("user.dir") + "\\src\\LoginWindow.java";
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ResetWindow window = new ResetWindow();
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
	public ResetWindow() {
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
		panel.setBounds(252, 11, 309, 425);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Instagram");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 29));
		lblNewLabel.setBounds(40, 65, 195, 84);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("_____________");
		lblNewLabel_1.setForeground(new Color(192, 192, 192));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 29));
		lblNewLabel_1.setBounds(38, 76, 275, 84);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewPassword = new JLabel("New Password:");
		lblNewPassword.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewPassword.setBounds(40, 160, 211, 14);
		panel.add(lblNewPassword);
		
		reset_password = new JPasswordField();
		reset_password.setBounds(40, 185, 211, 30);
		panel.add(reset_password);
		
		JLabel lblNewPasswordConfirmation = new JLabel("New Password Confirmation:");
		lblNewPasswordConfirmation.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewPasswordConfirmation.setBounds(40, 231, 228, 14);
		panel.add(lblNewPasswordConfirmation);
		
		reset_confirm = new JPasswordField();
		reset_confirm.setBounds(40, 256, 211, 30);
		panel.add(reset_confirm);
		
		JPanel reset_submit = new JPanel();
		reset_submit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
		            File file = new File(passTR);
		            Scanner scanner = new Scanner(file);
		            int number = scanner.nextInt();
		            scanner.close();
		            
		            try {
			            if (reset_password.getText().equals(reset_confirm.getText()) && reset_password.getText() != "") {
			            	List<String> lines = new ArrayList<>();											// Created new arraylist in which the old java file will be temporarily saved and copied onto the new java file.
			    			BufferedReader reader = new BufferedReader(new FileReader(pass));		// Reads the java file line by line. FileReader reads letter by letter, Buffered reader reads in chunks.
			    			String line;
			    			
			    			while ((line = reader.readLine()) != null) {									// The while loop will keep iterating as long as the reader still has lines to read.
			    				lines.add(line);															// The reader reads the file line by line and temporarily saves it onto line which is then accumulated on lines
			    			}
			    			reader.close();
			    			
			    			lines.set(number, reset_password.getText());												// then replaces the specified line with newLine.
			    			
			    			BufferedWriter writer = new BufferedWriter(new FileWriter(pass));		// Instantiated new BufferedWriter
			    			for (String s : lines) {														// Reads the accumulated contents on lines and add it to s which is then printed to the java file.
			    				writer.write(s);
			    				writer.newLine();
			    			}
			    			writer.close();
			    			
			    			try {
								File Signup = new File(logWin);
								Desktop.getDesktop().open(Signup);
								System.exit(0);
							} catch (IOException e2) {
								e2.printStackTrace();
							}
			    			
			            } else {
			            	JOptionPane.showMessageDialog(null, "Password does not match");
			            }
		            } catch (IOException e2) {
		            	e2.printStackTrace();
		            }
		        } catch (FileNotFoundException e1) {
		            e1.printStackTrace();
		        }
			}
		});
		reset_submit.setBounds(39, 307, 136, 35);
		panel.add(reset_submit);
		reset_submit.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Reset Password");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(17, 9, 117, 14);
		reset_submit.add(lblNewLabel_2);
	}
}
