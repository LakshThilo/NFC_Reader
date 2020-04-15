package com.lak.uni.veiw;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;

public class StudentRegistration extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	/*
	 * public static void main(String[] args) { EventQueue.invokeLater(new
	 * Runnable() { public void run() { try { StudentRegistration frame = new
	 * StudentRegistration(); frame.setVisible(true); } catch (Exception e) {
	 * e.printStackTrace(); } } }); }
	 */

	/**
	 * Create the frame.
	 */
	public StudentRegistration() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 806, 641);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(UIManager.getColor("Button.shadow"));
		panel.setBounds(0, 65, 802, 539);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Student ID:");
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 18));
		lblNewLabel_1.setForeground(UIManager.getColor("Button.highlight"));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(63, 47, 212, 47);
		panel.add(lblNewLabel_1);
		
		JLabel lblStudentName = new JLabel("Student Name :");
		lblStudentName.setHorizontalAlignment(SwingConstants.CENTER);
		lblStudentName.setForeground(Color.WHITE);
		lblStudentName.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 18));
		lblStudentName.setBounds(63, 121, 212, 47);
		panel.add(lblStudentName);
		
		JLabel lblCourseId = new JLabel("Phone Number");
		lblCourseId.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourseId.setForeground(Color.WHITE);
		lblCourseId.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 18));
		lblCourseId.setBounds(63, 198, 212, 47);
		panel.add(lblCourseId);
		
		JLabel lblCourseName = new JLabel("Course Name");
		lblCourseName.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourseName.setForeground(Color.WHITE);
		lblCourseName.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 18));
		lblCourseName.setBounds(63, 274, 212, 47);
		panel.add(lblCourseName);
		
		JLabel lblYear = new JLabel("Year");
		lblYear.setHorizontalAlignment(SwingConstants.CENTER);
		lblYear.setForeground(Color.WHITE);
		lblYear.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 18));
		lblYear.setBounds(63, 351, 212, 47);
		panel.add(lblYear);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setBackground(new Color(239, 108, 0));
		btnNewButton.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 18));
		btnNewButton.setBounds(63, 459, 665, 47);
		panel.add(btnNewButton);
		
		textField = new JTextField();
		textField.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 18));
		textField.setBounds(320, 47, 408, 47);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 18));
		textField_1.setColumns(10);
		textField_1.setBounds(320, 121, 408, 47);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 18));
		textField_2.setColumns(10);
		textField_2.setBounds(320, 198, 408, 47);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 18));
		textField_3.setColumns(10);
		textField_3.setBounds(320, 274, 408, 47);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 18));
		textField_4.setColumns(10);
		textField_4.setBounds(320, 351, 408, 47);
		panel.add(textField_4);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(UIManager.getColor("Button.darkShadow"));
		panel_1.setBounds(0, 0, 802, 67);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Student Details");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 24));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(UIManager.getColor("Button.disabledShadow"));
		lblNewLabel.setBounds(80, 10, 620, 47);
		panel_1.add(lblNewLabel);
		
		setVisible(true);
	}
}
