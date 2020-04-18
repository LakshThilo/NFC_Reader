package com.lak.uni.veiw;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.lak.uni.model.DbConnector;
import com.lak.uni.model.Student;

import net.proteanit.sql.DbUtils;

import java.awt.CardLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JList;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JTextField;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JScrollPane;

public class HomeWindow extends JFrame {

	private JPanel contentPane;
	private CardLayout cardLayout;
	private JTable table;
	private JTextField textField;
	private Connection connect = null;

	/**
	 * Launch the application.
	 */
	/*
	 * public static void main(String[] args) { EventQueue.invokeLater(new
	 * Runnable() { public void run() { try { HomeWindow frame = new HomeWindow();
	 * frame.setVisible(true); } catch (Exception e) { e.printStackTrace(); } } });
	 * }
	 */
	/**
	 * Create the frame.
	 */
	public HomeWindow() {
		

		connect = DbConnector.getDbConnector();
		DbConnector.deleteDBdata();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1028, 721);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		cardLayout =new CardLayout(0, 0);
		contentPane.setLayout(cardLayout);
		
		JPanel home_panel = new JPanel();
		contentPane.add(home_panel, "name_17851312619000");
		home_panel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.textHighlight);
		panel.setBounds(0, 0, 1014, 241);
		home_panel.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Attendance Monitaring System");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setForeground(UIManager.getColor("Button.highlight"));
		lblNewLabel.setBackground(UIManager.getColor("Button.disabledShadow"));
		lblNewLabel.setFont(new Font("Yu Gothic", Font.PLAIN, 40));
		lblNewLabel.setBounds(26, 52, 717, 116);
		panel.add(lblNewLabel);
		
		JLabel label_16 = new JLabel("File");
		label_16.setHorizontalAlignment(SwingConstants.CENTER);
		label_16.setForeground(Color.BLACK);
		label_16.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		label_16.setBounds(828, 12, 40, 24);
		panel.add(label_16);
		
		JLabel label_17 = new JLabel("Help");
		label_17.setHorizontalAlignment(SwingConstants.CENTER);
		label_17.setForeground(Color.BLACK);
		label_17.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		label_17.setBounds(874, 12, 46, 24);
		panel.add(label_17);
		
		JLabel label_19 = new JLabel("Admin");
		label_19.setHorizontalAlignment(SwingConstants.CENTER);
		label_19.setForeground(new Color(255, 99, 71));
		label_19.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		label_19.setBounds(930, 12, 54, 24);
		panel.add(label_19);
		
		JPanel panel_4 = new JPanel();
		panel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				cardLayout.show(contentPane, "name_17879101138500");
			}
		});
		panel_4.setBackground(UIManager.getColor("Button.light"));
		panel_4.setBounds(231, 284, 170, 154);
		home_panel.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(contentPane, "name_17879101138500");
				
			}
		});
		Image image = new ImageIcon(this.getClass().getResource("/images/home.png")).getImage().getScaledInstance(100, 80, Image.SCALE_DEFAULT);
		lblNewLabel_1.setIcon(new ImageIcon(image));
		lblNewLabel_1.setBounds(32, 37, 107, 87);
		panel_4.add(lblNewLabel_1);
		
		
		JPanel panel_5 = new JPanel();
		panel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(contentPane, "name_17882053464800");
			}
		});
		panel_5.setBackground(UIManager.getColor("Button.light"));
		panel_5.setBounds(420, 284, 170, 154);
		home_panel.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel label = new JLabel("");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(contentPane, "name_17882053464800");
			}
		});
		Image image1 = new ImageIcon(this.getClass().getResource("/images/person1.png")).getImage().getScaledInstance(107, 77, Image.SCALE_DEFAULT);
		label.setIcon(new ImageIcon(image1));
		label.setBounds(34, 32, 107, 87);
		panel_5.add(label);
	
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(UIManager.getColor("Button.light"));
		panel_6.setBounds(607, 284, 170, 157);
		home_panel.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel label_1 = new JLabel("");
		Image image2 = new ImageIcon(this.getClass().getResource("/images/team.png")).getImage().getScaledInstance(107, 87, Image.SCALE_DEFAULT);
		label_1.setIcon(new ImageIcon(image2));
		label_1.setBounds(37, 32, 107, 87);
		panel_6.add(label_1);
		
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(UIManager.getColor("Button.light"));
		panel_7.setBounds(231, 451, 170, 157);
		home_panel.add(panel_7);
		panel_7.setLayout(null);
		
		JLabel label_2 = new JLabel("");
		Image image3 = new ImageIcon(this.getClass().getResource("/images/calendar.png")).getImage().getScaledInstance(107, 87, Image.SCALE_DEFAULT);
		label_2.setIcon(new ImageIcon(image3));
		label_2.setBounds(31, 31, 107, 87);
		panel_7.add(label_2);
		


		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(UIManager.getColor("Button.light"));
		panel_8.setBounds(420, 451, 170, 157);
		home_panel.add(panel_8);
		panel_8.setLayout(null);
		
		JLabel label_3 = new JLabel("");
		Image image4 = new ImageIcon(this.getClass().getResource("/images/mail2.png")).getImage().getScaledInstance(107, 80, Image.SCALE_DEFAULT);
		label_3.setIcon(new ImageIcon(image4));
		label_3.setBounds(29, 32, 107, 87);
		panel_8.add(label_3);
		
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(UIManager.getColor("Button.light"));
		panel_9.setBounds(607, 454, 170, 154);
		home_panel.add(panel_9);
		panel_9.setLayout(null);
		
		JLabel label_4 = new JLabel("");
		Image image5 = new ImageIcon(this.getClass().getResource("/images/setting1.png")).getImage().getScaledInstance(107, 80, Image.SCALE_DEFAULT);
		label_4.setIcon(new ImageIcon(image5));
		label_4.setBounds(32, 31, 107, 87);
		panel_9.add(label_4);
		
		JPanel dashboard_panel = new JPanel();
		contentPane.add(dashboard_panel, "name_17879101138500");
		dashboard_panel.setLayout(null);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(new Color(40, 53, 147));
		panel_10.setBounds(0, 0, 203, 674);
		dashboard_panel.add(panel_10);
		panel_10.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Dashboard");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 24));
		lblNewLabel_2.setBounds(10, 31, 173, 36);
		panel_10.add(lblNewLabel_2);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBackground(new Color(0, 25, 112));
		panel_12.setBounds(0, 208, 203, 54);
		panel_10.add(panel_12);
		panel_12.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Student Details");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				try {
					
					String query = "select * from students";
					PreparedStatement pst = connect.prepareStatement(query);
					ResultSet rs = pst.executeQuery();
					/*
					 * while (rs.next()) { Student student = new
					 * Student(rs.getString("st_UID"),rs.getString("st_ID"),rs.getString("st_Name"),
					 * rs.getString("st_course"),rs.getString("st_batch"));
					 * System.out.println(student);
					 * 
					 * }
					 */
					
					table.setModel(DbUtils.resultSetToTableModel(rs));
					
				} catch (Exception e2) {


				}
				
				
				
			}
		});
		lblNewLabel_3.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(66, 10, 127, 34);
		panel_12.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(10, 10, 45, 34);
		panel_12.add(lblNewLabel_4);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBackground(new Color(65, 105, 225));
		panel_13.setBounds(0, 264, 203, 54);
		panel_10.add(panel_13);
		panel_13.setLayout(null);
		
		JLabel lblCourseDetails = new JLabel("Attendance\r\n");
		lblCourseDetails.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				try {
					String query = "select * from attendance";
					PreparedStatement pst;
					pst = connect.prepareStatement(query);
					ResultSet rs = pst.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		lblCourseDetails.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourseDetails.setForeground(new Color(255, 255, 255));
		lblCourseDetails.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		lblCourseDetails.setBounds(66, 10, 127, 34);
		panel_13.add(lblCourseDetails);
		
		JLabel label_6 = new JLabel("");
		label_6.setBounds(11, 10, 45, 34);
		panel_13.add(label_6);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBackground(new Color(65, 105, 225));
		panel_14.setBounds(0, 378, 203, 54);
		panel_10.add(panel_14);
		panel_14.setLayout(null);
		
		JLabel lblMarks = new JLabel("Course Details");
		lblMarks.setForeground(new Color(255, 255, 255));
		lblMarks.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		lblMarks.setHorizontalAlignment(SwingConstants.CENTER);
		lblMarks.setBounds(66, 10, 127, 34);
		panel_14.add(lblMarks);
		
		JLabel label_10 = new JLabel("");
		label_10.setBounds(10, 10, 45, 34);
		panel_14.add(label_10);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBackground(new Color(65, 105, 225));
		panel_15.setBounds(0, 321, 203, 54);
		panel_10.add(panel_15);
		panel_15.setLayout(null);
		
		JLabel lblAttendance = new JLabel("Absence");
		lblAttendance.setForeground(new Color(255, 255, 255));
		lblAttendance.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		lblAttendance.setHorizontalAlignment(SwingConstants.CENTER);
		lblAttendance.setBounds(66, 10, 127, 34);
		panel_15.add(lblAttendance);
		
		JLabel label_8 = new JLabel("");
		label_8.setBounds(10, 10, 45, 34);
		panel_15.add(label_8);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(65, 105, 225));
		panel_1.setBounds(0, 151, 203, 54);
		panel_10.add(panel_1);
		
		JLabel lblHome = new JLabel("Home");
		lblHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(contentPane, "name_17851312619000");
			}
		});
		lblHome.setHorizontalAlignment(SwingConstants.CENTER);
		lblHome.setForeground(new Color(255, 99, 71));
		lblHome.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 20));
		lblHome.setBounds(66, 10, 127, 34);
		panel_1.add(lblHome);
		
		JLabel label_7 = new JLabel("");
		label_7.setBounds(10, 10, 45, 34);
		panel_1.add(label_7);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBackground(new Color(65, 105, 225));
		panel_11.setBounds(201, 53, 803, 182);
		dashboard_panel.add(panel_11);
		panel_11.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("Student Attendance System");
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 40));
		lblNewLabel_5.setBounds(41, 33, 637, 95);
		panel_11.add(lblNewLabel_5);
		
		JPanel panel_16 = new JPanel();
		panel_16.setBackground(UIManager.getColor("Button.light"));
		panel_16.setBounds(201, 0, 803, 54);
		dashboard_panel.add(panel_16);
		panel_16.setLayout(null);
		
		JLabel label_14 = new JLabel("University of Wolverhampton");
		label_14.setHorizontalAlignment(SwingConstants.CENTER);
		label_14.setForeground(SystemColor.textInactiveText);
		label_14.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 20));
		label_14.setBounds(10, 10, 340, 24);
		panel_16.add(label_14);
		
		JLabel lblNewLabel_9 = new JLabel("Admin");
		lblNewLabel_9.setForeground(new Color(255, 99, 71));
		lblNewLabel_9.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setBounds(733, 12, 60, 24);
		panel_16.add(lblNewLabel_9);
		
		JLabel lblFile = new JLabel("Help");
		lblFile.setHorizontalAlignment(SwingConstants.CENTER);
		lblFile.setForeground(new Color(0, 0, 0));
		lblFile.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		lblFile.setBounds(689, 12, 46, 24);
		panel_16.add(lblFile);
		
		JLabel label_15 = new JLabel("File");
		label_15.setHorizontalAlignment(SwingConstants.CENTER);
		label_15.setForeground(Color.BLACK);
		label_15.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		label_15.setBounds(650, 12, 40, 24);
		panel_16.add(label_15);
		
		JPanel panel_17 = new JPanel();
		panel_17.setBounds(201, 237, 803, 437);
		dashboard_panel.add(panel_17);
		panel_17.setLayout(new CardLayout(0, 0));
		
		JPanel panel_18 = new JPanel();
		panel_17.add(panel_18, "name_25213413806800");
		panel_18.setLayout(null);
		
		JPanel panel_41 = new JPanel();
		panel_41.setBackground(SystemColor.textHighlight);
		panel_41.setBounds(27, 21, 751, 22);
		panel_18.add(panel_41);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(71, 98, 674, 317);
		panel_18.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JPanel panel_42 = new JPanel();
		panel_42.setBackground(new Color(128, 128, 128));
		panel_42.setBounds(71, 70, 674, 28);
		panel_18.add(panel_42);
		panel_42.setLayout(null);
		
		JLabel lblNewLabel_10 = new JLabel("U I D");
		lblNewLabel_10.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 10));
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10.setBounds(0, 0, 110, 28);
		panel_42.add(lblNewLabel_10);
		
		JLabel lblCourse = new JLabel("I D");
		lblCourse.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourse.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 10));
		lblCourse.setBounds(136, 0, 110, 28);
		panel_42.add(lblCourse);
		
		JLabel lblCourse_1 = new JLabel("NAME");
		lblCourse_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourse_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 10));
		lblCourse_1.setBounds(268, 0, 110, 28);
		panel_42.add(lblCourse_1);
		
		JLabel lblYear = new JLabel("COURSE");
		lblYear.setHorizontalAlignment(SwingConstants.CENTER);
		lblYear.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 10));
		lblYear.setBounds(408, 0, 110, 28);
		panel_42.add(lblYear);
		
		JLabel lblBatch = new JLabel("BATCH");
		lblBatch.setHorizontalAlignment(SwingConstants.CENTER);
		lblBatch.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 10));
		lblBatch.setBounds(564, 0, 110, 28);
		panel_42.add(lblBatch);
		
		JPanel panel_19 = new JPanel();
		panel_17.add(panel_19, "name_25216298040500");
		panel_19.setLayout(null);
		
		JPanel student_panel = new JPanel();
		contentPane.add(student_panel, "name_17882053464800");
		student_panel.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(0, 0, 1004, 674);
		student_panel.add(panel_2);
		
		JPanel panel_20 = new JPanel();
		panel_20.setLayout(null);
		panel_20.setBackground(new Color(98, 0, 234));
		panel_20.setBounds(0, 0, 203, 674);
		panel_2.add(panel_20);
		
		JLabel label_5 = new JLabel("Dashboard");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setForeground(Color.WHITE);
		label_5.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 24));
		label_5.setBounds(10, 31, 173, 36);
		panel_20.add(label_5);
		
		JPanel panel_21 = new JPanel();
		panel_21.setLayout(null);
		panel_21.setBackground(new Color(49, 27, 146));
		panel_21.setBounds(0, 208, 203, 54);
		panel_20.add(panel_21);
		
		JLabel lblAddNewStudent = new JLabel("Find student Details");
		lblAddNewStudent.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddNewStudent.setForeground(Color.WHITE);
		lblAddNewStudent.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		lblAddNewStudent.setBounds(10, 10, 183, 34);
		panel_21.add(lblAddNewStudent);
		
		JPanel panel_22 = new JPanel();
		panel_22.setLayout(null);
		panel_22.setBackground(new Color(124, 77, 255));
		panel_22.setBounds(0, 264, 203, 54);
		panel_20.add(panel_22);
		
		JLabel lblSearchStudentDetals = new JLabel("Add Student ");
		lblSearchStudentDetals.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				new StudentRegistration();
			}
		});
		lblSearchStudentDetals.setHorizontalAlignment(SwingConstants.CENTER);
		lblSearchStudentDetals.setForeground(Color.WHITE);
		lblSearchStudentDetals.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		lblSearchStudentDetals.setBounds(93, 10, 100, 34);
		panel_22.add(lblSearchStudentDetals);
		
		JPanel panel_23 = new JPanel();
		panel_23.setLayout(null);
		panel_23.setBackground(new Color(124, 77, 255));
		panel_23.setBounds(0, 378, 203, 54);
		panel_20.add(panel_23);
		
		JLabel lblUpdateStudent = new JLabel("Update Student");
		lblUpdateStudent.setHorizontalAlignment(SwingConstants.CENTER);
		lblUpdateStudent.setForeground(Color.WHITE);
		lblUpdateStudent.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		lblUpdateStudent.setBounds(66, 10, 127, 34);
		panel_23.add(lblUpdateStudent);
		
		JPanel panel_24 = new JPanel();
		panel_24.setLayout(null);
		panel_24.setBackground(new Color(124, 77, 255));
		panel_24.setBounds(0, 321, 203, 54);
		panel_20.add(panel_24);
		
		JLabel lblDeleteStudent = new JLabel("Delete Student");
		lblDeleteStudent.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeleteStudent.setForeground(Color.WHITE);
		lblDeleteStudent.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		lblDeleteStudent.setBounds(66, 10, 127, 34);
		panel_24.add(lblDeleteStudent);
		
		JPanel panel_25 = new JPanel();
		panel_25.setLayout(null);
		panel_25.setBackground(new Color(124, 77, 255));
		panel_25.setBounds(0, 151, 203, 54);
		panel_20.add(panel_25);
		
		JLabel label_18 = new JLabel("Home");
		label_18.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(contentPane, "name_17851312619000");
			}
		});
		label_18.setHorizontalAlignment(SwingConstants.CENTER);
		label_18.setForeground(new Color(255, 99, 71));
		label_18.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 20));
		label_18.setBounds(66, 10, 127, 34);
		panel_25.add(label_18);
		
		JPanel panel_26 = new JPanel();
		panel_26.setLayout(null);
		panel_26.setBackground(new Color(124, 77, 255));
		panel_26.setBounds(201, 53, 803, 182);
		panel_2.add(panel_26);
		
		JLabel label_20 = new JLabel("Student Attendance System");
		label_20.setForeground(Color.WHITE);
		label_20.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 40));
		label_20.setBounds(41, 27, 637, 95);
		panel_26.add(label_20);
		
		JPanel panel_27 = new JPanel();
		panel_27.setBackground(SystemColor.scrollbar);
		panel_27.setBounds(201, 0, 803, 54);
		panel_2.add(panel_27);
		panel_27.setLayout(null);
		
		
		JLabel lblNewLabel_8 = new JLabel("University of Wolverhampton");
		lblNewLabel_8.setForeground(SystemColor.textInactiveText);
		lblNewLabel_8.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 20));
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setBounds(23, 14, 340, 24);
		panel_27.add(lblNewLabel_8);
		
		JLabel label_22 = new JLabel("File");
		label_22.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
			}
		});
		label_22.setHorizontalAlignment(SwingConstants.CENTER);
		label_22.setForeground(Color.BLACK);
		label_22.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		label_22.setBounds(650, 14, 40, 24);
		panel_27.add(label_22);
		
		JLabel label_23 = new JLabel("Help");
		label_23.setHorizontalAlignment(SwingConstants.CENTER);
		label_23.setForeground(Color.BLACK);
		label_23.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		label_23.setBounds(689, 14, 46, 24);
		panel_27.add(label_23);
		
		JLabel label_24 = new JLabel("Admin");
		label_24.setHorizontalAlignment(SwingConstants.CENTER);
		label_24.setForeground(new Color(255, 99, 71));
		label_24.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		label_24.setBounds(733, 14, 60, 24);
		panel_27.add(label_24);
		
		JPanel panel_28 = new JPanel();
		panel_28.setBounds(201, 237, 803, 437);
		panel_2.add(panel_28);
		panel_28.setLayout(null);
		
		JPanel panel_29 = new JPanel();
		panel_29.setBackground(SystemColor.textHighlightText);
		panel_29.setBounds(54, 48, 266, 252);
		panel_28.add(panel_29);
		panel_29.setLayout(null);
		
		JPanel panel_36 = new JPanel();
		panel_36.setLayout(null);
		panel_36.setBackground(new Color(49, 27, 146));
		panel_36.setBounds(0, 0, 266, 52);
		panel_29.add(panel_36);
		
		JLabel label_9 = new JLabel("Number of Students");
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setForeground(Color.WHITE);
		label_9.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 18));
		label_9.setBackground(new Color(169, 169, 169));
		label_9.setBounds(41, 10, 178, 40);
		panel_36.add(label_9);
		
		JPanel panel_37 = new JPanel();
		panel_37.setBackground(SystemColor.controlHighlight);
		panel_37.setBounds(0, 54, 266, 198);
		panel_29.add(panel_37);
		panel_37.setLayout(null);
		
		JPanel panel_39 = new JPanel();
		panel_39.setBackground(SystemColor.textInactiveText);
		panel_39.setBounds(129, 24, 4, 146);
		panel_37.add(panel_39);
		
		JLabel lblNewLabel_7 = new JLabel("45");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 25));
		lblNewLabel_7.setBounds(22, 55, 82, 70);
		panel_37.add(lblNewLabel_7);
		
		JLabel label_11 = new JLabel("30");
		label_11.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 42));
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setBounds(143, 55, 82, 70);
		panel_37.add(label_11);
		
		JPanel panel_30 = new JPanel();
		panel_30.setBackground(new Color(124, 77, 255));
		panel_30.setBounds(65, 48, 255, 6);
		panel_28.add(panel_30);
		
		JPanel panel_31 = new JPanel();
		panel_31.setBackground(new Color(124, 77, 255));
		panel_31.setBounds(321, 48, 6, 252);
		panel_28.add(panel_31);
		
		JPanel panel_33 = new JPanel();
		panel_33.setBackground(Color.WHITE);
		panel_33.setBounds(447, 129, 283, 252);
		panel_28.add(panel_33);
		panel_33.setLayout(null);
		
		JPanel panel_35 = new JPanel();
		panel_35.setBackground(new Color(49, 27, 146));
		panel_35.setBounds(0, 0, 294, 52);
		panel_33.add(panel_35);
		panel_35.setLayout(null);
		
		JLabel lblNumberOfStudents = new JLabel("Marks %");
		lblNumberOfStudents.setForeground(new Color(255, 255, 255));
		lblNumberOfStudents.setBounds(44, 10, 178, 40);
		panel_35.add(lblNumberOfStudents);
		lblNumberOfStudents.setBackground(new Color(169, 169, 169));
		lblNumberOfStudents.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumberOfStudents.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 18));
		
		JPanel panel_38 = new JPanel();
		panel_38.setBackground(SystemColor.controlHighlight);
		panel_38.setBounds(0, 53, 283, 199);
		panel_33.add(panel_38);
		panel_38.setLayout(null);
		
		JPanel panel_40 = new JPanel();
		panel_40.setBackground(SystemColor.textInactiveText);
		panel_40.setBounds(135, 29, 4, 146);
		panel_38.add(panel_40);
		
		JLabel label_12 = new JLabel("95%");
		label_12.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 25));
		label_12.setHorizontalAlignment(SwingConstants.CENTER);
		label_12.setBounds(26, 53, 82, 70);
		panel_38.add(label_12);
		
		JLabel label_13 = new JLabel("70%");
		label_13.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 38));
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setBounds(162, 47, 82, 70);
		panel_38.add(label_13);
		
		JPanel panel_34 = new JPanel();
		panel_34.setBackground(new Color(124, 77, 255));
		panel_34.setBounds(443, 129, 6, 252);
		panel_28.add(panel_34);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBackground(new Color(255, 255, 255));
		textField.setBounds(371, 10, 325, 34);
		panel_28.add(textField);
		
		JLabel label_21 = new JLabel("");
		Image image6 = new ImageIcon(this.getClass().getResource("/images/search6.png")).getImage().getScaledInstance(28, 24, Image.SCALE_DEFAULT);
		label_21.setIcon(new ImageIcon(image6));
		label_21.setBackground(SystemColor.activeCaptionBorder);
		label_21.setBounds(704, 10, 38, 34);
		panel_28.add(label_21);
		
		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3, "name_17888642815600");
		panel_3.setLayout(null);
		
		JLabel lblPanel_2 = new JLabel("Panel 4");
		lblPanel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblPanel_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblPanel_2.setBounds(418, 259, 137, 60);
		panel_3.add(lblPanel_2);
		
		setVisible(true);
	}
}
