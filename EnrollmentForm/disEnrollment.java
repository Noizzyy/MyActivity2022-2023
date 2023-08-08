package enrollmentform;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JCheckBox;

public class disEnrollment {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					disEnrollment window = new disEnrollment();
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
	public disEnrollment() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 936, 551);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enrollment Form");
		lblNewLabel.setFont(new Font("Stencil", Font.BOLD, 45));
		lblNewLabel.setBounds(58, 42, 569, 77);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblForCollegeStudents = new JLabel("For college Students");
		lblForCollegeStudents.setFont(new Font("SimSun-ExtB", Font.BOLD, 16));
		lblForCollegeStudents.setBounds(178, 91, 185, 54);
		frame.getContentPane().add(lblForCollegeStudents);
		
		JLabel lblForCollegeStudents_1 = new JLabel("____________________________________________");
		lblForCollegeStudents_1.setForeground(new Color(0, 0, 0));
		lblForCollegeStudents_1.setFont(new Font("SimSun-ExtB", Font.BOLD, 16));
		lblForCollegeStudents_1.setBounds(73, 59, 479, 77);
		frame.getContentPane().add(lblForCollegeStudents_1);
		
		JLabel lblNewLabel_1 = new JLabel("ID Number");
		lblNewLabel_1.setFont(new Font("Sitka Text", Font.PLAIN, 22));
		lblNewLabel_1.setBounds(245, 163, 148, 24);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(403, 165, 287, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Last Name");
		lblNewLabel_1_1.setFont(new Font("Sitka Text", Font.PLAIN, 22));
		lblNewLabel_1_1.setBounds(245, 231, 148, 24);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("First Name");
		lblNewLabel_1_2.setFont(new Font("Sitka Text", Font.PLAIN, 22));
		lblNewLabel_1_2.setBounds(245, 197, 148, 24);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(403, 199, 287, 19);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(403, 233, 287, 19);
		frame.getContentPane().add(textField_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Student Type");
		lblNewLabel_1_1_1.setFont(new Font("Sitka Text", Font.PLAIN, 22));
		lblNewLabel_1_1_1.setBounds(322, 265, 148, 24);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Discounted");
		rdbtnNewRadioButton.setFont(new Font("Sitka Text", Font.PLAIN, 20));
		rdbtnNewRadioButton.setBounds(122, 298, 148, 24);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("Walk-in");
		rdbtnNewRadioButton_1_1.setFont(new Font("Sitka Text", Font.PLAIN, 20));
		rdbtnNewRadioButton_1_1.setBounds(332, 299, 148, 24);
		frame.getContentPane().add(rdbtnNewRadioButton_1_1);
		
		JRadioButton rdbtnNewRadioButton_1_2 = new JRadioButton("Countinuing");
		rdbtnNewRadioButton_1_2.setFont(new Font("Sitka Text", Font.PLAIN, 20));
		rdbtnNewRadioButton_1_2.setBounds(515, 298, 222, 24);
		frame.getContentPane().add(rdbtnNewRadioButton_1_2);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Last Name");
		lblNewLabel_1_1_2.setFont(new Font("Sitka Text", Font.PLAIN, 22));
		lblNewLabel_1_1_2.setBounds(245, 345, 148, 24);
		frame.getContentPane().add(lblNewLabel_1_1_2);
		
		JList list = new JList();
		list.setBounds(627, 334, -138, 0);
		frame.getContentPane().add(list);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("TOURISM");
		chckbxNewCheckBox.setBounds(379, 346, 93, 21);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxComputerScience = new JCheckBox("COMPUTER SCIENCE");
		chckbxComputerScience.setBounds(379, 382, 128, 21);
		frame.getContentPane().add(chckbxComputerScience);
		
		JCheckBox chckbxEngineering = new JCheckBox("ENGINEERING");
		chckbxEngineering.setBounds(520, 346, 93, 21);
		frame.getContentPane().add(chckbxEngineering);
		
		JCheckBox chckbxNursing = new JCheckBox("NURSING");
		chckbxNursing.setBounds(520, 382, 93, 21);
		frame.getContentPane().add(chckbxNursing);
		
		JCheckBox chckbxArchitecture = new JCheckBox("ARCHITECTURE");
		chckbxArchitecture.setBounds(644, 359, 117, 21);
		frame.getContentPane().add(chckbxArchitecture);
		JComboBox.addItem("Tourism");
		
	}
}
