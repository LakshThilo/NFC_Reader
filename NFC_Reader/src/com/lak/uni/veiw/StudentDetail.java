package com.lak.uni.veiw;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.lak.uni.controller.Controller;
import com.lak.uni.controller.Student;

public class StudentDetail extends JFrame {

	private JPanel contentPane;
	
	private Student student;

	public StudentDetail(Student student) {
		
		this.student = student;
	}
	
	public StudentDetail() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setVisible(true);
	}

}
