package com.lak.uni.veiw;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class StudentManagement extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentManagement frame = new StudentManagement();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public StudentManagement() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1265, 716);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 75, 222, 604);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBounds(0, 0, 222, 65);
		panel.add(panel_9);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBounds(0, 63, 222, 65);
		panel.add(panel_10);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBounds(0, 191, 222, 65);
		panel.add(panel_11);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBounds(0, 128, 222, 65);
		panel.add(panel_12);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(221, 75, 1030, 604);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(21, 27, 199, 139);
		panel_1.add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(280, 27, 199, 139);
		panel_1.add(panel_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(784, 27, 199, 139);
		panel_1.add(panel_5);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(531, 27, 199, 139);
		panel_1.add(panel_6);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBounds(21, 205, 971, 361);
		panel_1.add(panel_7);
		panel_7.setLayout(null);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBounds(0, 0, 971, 62);
		panel_7.add(panel_8);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 0, 1251, 76);
		contentPane.add(panel_2);
	}
}
