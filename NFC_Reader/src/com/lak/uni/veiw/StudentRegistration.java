package com.lak.uni.veiw;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.lak.uni.model.DbConnector;
import com.lak.uni.model.Student;

import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class StudentRegistration extends JFrame {

	private JPanel contentPane;
	private JTextField st_id;
	private JTextField st_name;
	private JTextField st_course;
	private JTextField st_batch;
	private JTextField textField_4;
	private String UID;
	private  Student student;
	private JButton submit_btn;
	private Connection connection = null;

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
		
		 run();
	}
	
	
	public StudentRegistration(String s) {
		
		UID = s;
		student = new Student();
		connection = DbConnector.getDbConnector();
		
		run();
	}

	private void run() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 806, 641);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(UIManager.getColor("ToolBar.background"));
		panel.setBounds(0, 65, 792, 539);
		contentPane.add(panel);
		panel.setLayout(null);
		
		submit_btn = new JButton("Submit");
		submit_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int rowsAffected = 0;
				student.setUID(UID);
				student.setStId(st_id.getText());  
				student.setName(st_name.getText());
				student.setBatch(st_batch.getText());
				student.setCourse(st_course.getText());

				System.out.println(student);


				try {

					PreparedStatement st = null; st = connection.prepareStatement("INSERT INTO Students(st_UID,st_Id,st_Name,st_course,st_batch) VALUES (?, ?, ?, ?, ?)");
					st.setString(1, student.getUID());
					st.setString(2, student.getStId());
					st.setString(3, student.getName()); 
					st.setString(4, student.getCourse());
					st.setString(5, student.getBatch()); 
					
					rowsAffected = st.executeUpdate();
					System.out.println(rowsAffected);
				} 
				catch (Exception e1) { 
					System.out.println("Connection Fail");
					e1.printStackTrace();
				}
				finally {
				
				}

			}
		});
		submit_btn.setBackground(SystemColor.textHighlight);
		submit_btn.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 18));
		submit_btn.setBounds(375, 452, 363, 47);
		panel.add(submit_btn);
		
		st_id = new JTextField();
		st_id.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 18));
		st_id.setBounds(375, 42, 370, 47);
		panel.add(st_id);
		st_id.setColumns(10);
		
		st_name = new JTextField();
		st_name.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 18));
		st_name.setColumns(10);
		st_name.setBounds(375, 116, 370, 47);
		panel.add(st_name);
		
		st_course = new JTextField();
		st_course.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 18));
		st_course.setColumns(10);
		st_course.setBounds(375, 193, 370, 47);
		panel.add(st_course);
		
		st_batch = new JTextField();
		st_batch.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 18));
		st_batch.setColumns(10);
		st_batch.setBounds(375, 269, 370, 47);
		panel.add(st_batch);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 18));
		textField_4.setColumns(10);
		textField_4.setBounds(375, 346, 370, 47);
		panel.add(textField_4);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 0, 353, 539);
		panel.add(panel_2);
		panel_2.setLayout(null);
	
		
		JLabel lblNewLabel_1 = new JLabel("Student ID :");
		lblNewLabel_1.setForeground(UIManager.getColor("ToggleButton.highlight"));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 20));
		lblNewLabel_1.setBounds(107, 42, 216, 42);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblStudentName = new JLabel("Student Name :");
		lblStudentName.setForeground(UIManager.getColor("ToggleButton.highlight"));
		lblStudentName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblStudentName.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 20));
		lblStudentName.setBounds(107, 120, 216, 42);
		panel_2.add(lblStudentName);
		
		JLabel lblCourse = new JLabel("Course :");
		lblCourse.setForeground(UIManager.getColor("ToggleButton.highlight"));
		lblCourse.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCourse.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 20));
		lblCourse.setBounds(107, 196, 216, 42);
		panel_2.add(lblCourse);
		
		JLabel lblBatch = new JLabel("Batch :");
		lblBatch.setForeground(UIManager.getColor("ToggleButton.highlight"));
		lblBatch.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBatch.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 20));
		lblBatch.setBounds(107, 272, 216, 42);
		panel_2.add(lblBatch);
		
		JLabel lblYear = new JLabel("Year :");
		lblYear.setForeground(UIManager.getColor("ToggleButton.highlight"));
		lblYear.setHorizontalAlignment(SwingConstants.RIGHT);
		lblYear.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 20));
		lblYear.setBounds(107, 352, 216, 42);
		panel_2.add(lblYear);
		
		JLabel lblNewLabel_2 = new JLabel("");
		Image image = new ImageIcon(this.getClass().getResource("/images/list.jpg")).getImage().getScaledInstance(328, 539, Image.SCALE_DEFAULT);
		lblNewLabel_2.setIcon(new ImageIcon(image));
		lblNewLabel_2.setBounds(0, 0, 330, 539);
		panel_2.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(UIManager.getColor("ToggleButton.shadow"));
		panel_1.setBounds(0, 0, 792, 67);
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
