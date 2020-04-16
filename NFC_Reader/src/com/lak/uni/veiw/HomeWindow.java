package com.lak.uni.veiw;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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

public class HomeWindow extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private CardLayout cardLayout;

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
		panel_5.setBackground(UIManager.getColor("Button.light"));
		panel_5.setBounds(420, 284, 170, 154);
		home_panel.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel label = new JLabel("");
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
		
		JLabel lblCourseDetails = new JLabel("Course Details");
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
		
		JLabel lblMarks = new JLabel("Marks");
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
		
		JLabel lblAttendance = new JLabel("Attendance");
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
		
		JPanel panel_17 = new JPanel();
		panel_17.setBounds(201, 237, 803, 437);
		dashboard_panel.add(panel_17);
		panel_17.setLayout(new CardLayout(0, 0));
		
		JPanel panel_18 = new JPanel();
		panel_17.add(panel_18, "name_25213413806800");
		panel_18.setLayout(null);
		
		table = new JTable();
		table.setBackground(new Color(100, 149, 237));
		table.setBounds(41, 79, 725, 318);
		panel_18.add(table);
		
		JPanel panel_19 = new JPanel();
		panel_17.add(panel_19, "name_25216298040500");
		panel_19.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, "name_17882053464800");
		panel_2.setLayout(null);
		
		JLabel lblPanel_1 = new JLabel("Panel 3");
		lblPanel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPanel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblPanel_1.setBounds(470, 232, 137, 60);
		panel_2.add(lblPanel_1);
		
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
