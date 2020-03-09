package com.lak.uni.veiw;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import com.lak.uni.controller.Student;

public class StudentDetail extends JFrame {
	private StudentDetail mainFrame;
	
	private Student student;
	
	private JPanel mainPanel;
	private JPanel mainPanel2;
	private JPanel cardPanel;
	private JPanel homePanel;
	private JLabel studentName;
	private JLabel lblName;
	private JLabel lblCourse;
	private JLabel lblBatch;
	private JLabel stId_lbl;
	private JLabel stName_lbl;
	private JLabel course_lbl;
	private JLabel batch_lbl;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	
	public StudentDetail(Student student) {
		
		this.student = student;
		
		this.setVisible(false);
		openSeconWindow();
		settingUpStDetails();
		
	
	}

	public StudentDetail() {
		
		init();
		
		
	}

	private void init() {
		
		setBounds(100, 100, 950, 580);
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		
		mainPanel = new JPanel();
		mainPanel.setBounds(0, 0, 944, 552);
		getContentPane().add(mainPanel);
		mainPanel.setLayout(null);
		
		cardPanel = new JPanel();
		cardPanel.setBounds(0, 0, 944, 552);
		mainPanel.add(cardPanel);
		cardPanel.setLayout(null);
		
		homePanel = new JPanel();
		homePanel.setBounds(0, 0, 944, 552);
		homePanel.setBackground(new Color(128, 128, 128));
		cardPanel.add(homePanel);
		homePanel.setLayout(null);
		
		studentName = new JLabel("Student Id :");
		studentName.setForeground(Color.WHITE);
		studentName.setFont(new Font("Tahoma", Font.BOLD, 17));
		studentName.setHorizontalAlignment(SwingConstants.RIGHT);
		studentName.setBounds(70, 177, 202, 47);
		homePanel.add(studentName);
		
		lblName = new JLabel("Name :");
		lblName.setForeground(Color.WHITE);
		lblName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblName.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblName.setBounds(70, 250, 202, 47);
		homePanel.add(lblName);
		
		lblCourse = new JLabel("Course :");
		lblCourse.setForeground(Color.WHITE);
		lblCourse.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCourse.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblCourse.setBounds(70, 336, 202, 47);
		homePanel.add(lblCourse);
		
		lblBatch = new JLabel("Batch :");
		lblBatch.setForeground(Color.WHITE);
		lblBatch.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBatch.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblBatch.setBounds(70, 412, 202, 47);
		homePanel.add(lblBatch);
		
		stId_lbl = new JLabel("");
		stId_lbl.setForeground(Color.WHITE);
		stId_lbl.setHorizontalAlignment(SwingConstants.LEFT);
		stId_lbl.setFont(new Font("Tahoma", Font.BOLD, 17));
		stId_lbl.setBounds(388, 177, 202, 47);
		homePanel.add(stId_lbl);
		
		stName_lbl = new JLabel("");
		stName_lbl.setForeground(Color.WHITE);
		stName_lbl.setHorizontalAlignment(SwingConstants.LEFT);
		stName_lbl.setFont(new Font("Tahoma", Font.BOLD, 17));
		stName_lbl.setBounds(388, 250, 202, 47);
		homePanel.add(stName_lbl);
		
		course_lbl = new JLabel("");
		course_lbl.setForeground(Color.WHITE);
		course_lbl.setHorizontalAlignment(SwingConstants.LEFT);
		course_lbl.setFont(new Font("Tahoma", Font.BOLD, 17));
		course_lbl.setBounds(388, 336, 202, 47);
		homePanel.add(course_lbl);
		
		batch_lbl = new JLabel("");
		batch_lbl.setForeground(Color.WHITE);
		batch_lbl.setHorizontalAlignment(SwingConstants.LEFT);
		batch_lbl.setFont(new Font("Tahoma", Font.BOLD, 17));
		batch_lbl.setBounds(388, 412, 202, 47);
		homePanel.add(batch_lbl);
		
		lblNewLabel = new JLabel("");
		Image image = new ImageIcon(this.getClass().getResource("/images/right.jpg")).getImage().getScaledInstance(268, 265, Image.SCALE_DEFAULT);
		lblNewLabel.setIcon(new ImageIcon(image));
		lblNewLabel.setBounds(648, 177, 268, 265);
		homePanel.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Student Details");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Malgun Gothic Semilight", Font.BOLD, 34));
		lblNewLabel_1.setBounds(50, 28, 830, 82);
		homePanel.add(lblNewLabel_1);
		lblNewLabel.setVisible(false);
		
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		
		setVisible(true);


	
		
	}

	private void openSeconWindow() {
		
		
		setBounds(100, 100, 950, 700);
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		
		mainPanel2 = new JPanel();
		mainPanel2.setBounds(0, 0, 944, 665);
		getContentPane().add(mainPanel2);
		mainPanel2.setLayout(null);
	
		
		homePanel = new JPanel();
		homePanel.setBackground(SystemColor.activeCaption);
		cardPanel.add(homePanel, "home");
		homePanel.setLayout(null);
		
		studentName = new JLabel("Student Id :");
		studentName.setFont(new Font("Tahoma", Font.BOLD, 17));
		studentName.setHorizontalAlignment(SwingConstants.RIGHT);
		studentName.setBounds(39, 44, 202, 47);
		homePanel.add(studentName);
		
		lblName = new JLabel("Name :");
		lblName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblName.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblName.setBounds(39, 117, 202, 47);
		homePanel.add(lblName);
		
		lblCourse = new JLabel("Course :");
		lblCourse.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCourse.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblCourse.setBounds(39, 203, 202, 47);
		homePanel.add(lblCourse);
		
		lblBatch = new JLabel("Batch :");
		lblBatch.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBatch.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblBatch.setBounds(39, 279, 202, 47);
		homePanel.add(lblBatch);
		
		stId_lbl = new JLabel("");
		stId_lbl.setHorizontalAlignment(SwingConstants.LEFT);
		stId_lbl.setFont(new Font("Tahoma", Font.BOLD, 17));
		stId_lbl.setBounds(357, 44, 202, 47);
		homePanel.add(stId_lbl);
		
		stName_lbl = new JLabel("");
		stName_lbl.setHorizontalAlignment(SwingConstants.LEFT);
		stName_lbl.setFont(new Font("Tahoma", Font.BOLD, 17));
		stName_lbl.setBounds(357, 117, 202, 47);
		homePanel.add(stName_lbl);
		
		course_lbl = new JLabel("");
		course_lbl.setHorizontalAlignment(SwingConstants.LEFT);
		course_lbl.setFont(new Font("Tahoma", Font.BOLD, 17));
		course_lbl.setBounds(357, 203, 202, 47);
		homePanel.add(course_lbl);
		
		batch_lbl = new JLabel("");
		batch_lbl.setHorizontalAlignment(SwingConstants.LEFT);
		batch_lbl.setFont(new Font("Tahoma", Font.BOLD, 17));
		batch_lbl.setBounds(357, 279, 202, 47);
		homePanel.add(batch_lbl);
		
		lblNewLabel = new JLabel("");
		Image image = new ImageIcon(this.getClass().getResource("/images/present.jpg")).getImage().getScaledInstance(250, 200, Image.SCALE_DEFAULT);
		lblNewLabel.setIcon(new ImageIcon(image));
		lblNewLabel.setBounds(634, 61, 268, 265);
		homePanel.add(lblNewLabel);
		lblNewLabel.setVisible(false);
		
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		
		setVisible(true);
	}



	private void settingUpStDetails() {
	
		
	
		String stId = student.getStId();
		String stName = student.getName();
		String course = student.getCourse();
		String batch = student.getBatch();
		
		System.out.println(stId);
		stId_lbl.setText(stId);
		stName_lbl.setText(stName);
		course_lbl.setText(course);
		batch_lbl.setText(batch);
		
		lblNewLabel.setVisible(true);

		
	}
}
