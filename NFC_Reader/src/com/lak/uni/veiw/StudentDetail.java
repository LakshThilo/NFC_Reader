package com.lak.uni.veiw;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import com.lak.uni.model.Student;


public class StudentDetail extends JFrame {

	private JPanel contentPane;
	
	private Student student;
	
	private JLabel stID_lbl ;
	private JLabel name_lbl; 
	private JLabel course_lbl;
	private JLabel batch_lbl;

	public StudentDetail(Student student) {
		
		this.student = student;
		init();
		settingUp();
		
	}
	public StudentDetail() {
		
	}

	private void cleanUp() {
		
		setVisible(true);
		
	}


	private void settingUp() {
		
		stID_lbl.setText(student.getStId());
		name_lbl.setText(student.getName());
		course_lbl.setText(student.getCourse());
		batch_lbl.setText(student.getBatch());
	
		
	}


	private void init() {
		
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 586, 387);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 619, 401);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(30, 144, 255));
		panel_1.setBounds(0, 0, 575, 84);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel label = new JLabel("Student Details");
		label.setForeground(Color.WHITE);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 28));
		label.setBackground(Color.WHITE);
		label.setBounds(10, 10, 513, 64);
		panel_1.add(label);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(UIManager.getColor("InternalFrame.borderLight"));
		panel_2.setBounds(0, 83, 575, 275);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel label_1 = new JLabel("Student Id :");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(UIManager.getColor("CheckBox.darkShadow"));
		label_1.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 16));
		label_1.setBackground(new Color(119, 136, 153));
		label_1.setBounds(28, 22, 189, 36);
		panel_2.add(label_1);
		
		JLabel label_2 = new JLabel("Name :");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(UIManager.getColor("CheckBox.darkShadow"));
		label_2.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 16));
		label_2.setBackground(new Color(119, 136, 153));
		label_2.setBounds(28, 79, 189, 36);
		panel_2.add(label_2);
		
		JLabel label_3 = new JLabel("Course :");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setForeground(UIManager.getColor("CheckBox.darkShadow"));
		label_3.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 16));
		label_3.setBackground(new Color(119, 136, 153));
		label_3.setBounds(28, 133, 189, 36);
		panel_2.add(label_3);
		
		JLabel label_4 = new JLabel("Batch :");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setForeground(UIManager.getColor("CheckBox.darkShadow"));
		label_4.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 16));
		label_4.setBackground(new Color(119, 136, 153));
		label_4.setBounds(28, 193, 189, 36);
		panel_2.add(label_4);
		
		batch_lbl = new JLabel("");
		batch_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		batch_lbl.setForeground(Color.BLACK);
		batch_lbl.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 16));
		batch_lbl.setBackground(new Color(119, 136, 153));
		batch_lbl.setBounds(299, 193, 189, 36);
		panel_2.add(batch_lbl);
		
		course_lbl = new JLabel("");
		course_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		course_lbl.setForeground(Color.BLACK);
		course_lbl.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 16));
		course_lbl.setBackground(new Color(119, 136, 153));
		course_lbl.setBounds(299, 133, 189, 36);
		panel_2.add(course_lbl);
		
		name_lbl = new JLabel("");
		name_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		name_lbl.setForeground(Color.BLACK);
		name_lbl.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 16));
		name_lbl.setBackground(new Color(119, 136, 153));
		name_lbl.setBounds(299, 79, 189, 36);
		panel_2.add(name_lbl);
		
		stID_lbl = new JLabel("");
		stID_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		stID_lbl.setForeground(Color.BLACK);
		stID_lbl.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 16));
		stID_lbl.setBackground(new Color(119, 136, 153));
		stID_lbl.setBounds(299, 22, 189, 36);
		panel_2.add(stID_lbl);
		
		setVisible(true);
	}
}
