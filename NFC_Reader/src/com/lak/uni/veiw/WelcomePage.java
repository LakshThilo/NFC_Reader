package com.lak.uni.veiw;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;

public class WelcomePage extends JFrame {

	private JPanel contentPane;


	public WelcomePage() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1081, 862);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1081, 862);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(51, 153, 255));
		panel_1.setBounds(0, 0, 1071, 96);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Attendance Monitaring System");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Bell MT", Font.BOLD, 30));
		lblNewLabel_1.setBounds(181, 21, 783, 54);
		panel_1.add(lblNewLabel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.controlHighlight);
		panel_2.setBounds(0, 94, 1071, 68);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Admin");
		lblNewLabel.setBounds(933, 10, 97, 40);
		panel_2.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Sitka Small", Font.BOLD, 15));
		lblNewLabel.setForeground(Color.DARK_GRAY);
		
		JLabel lblHelp = new JLabel("Files");
		lblHelp.setBounds(183, 10, 63, 40);
		panel_2.add(lblHelp);
		lblHelp.setHorizontalAlignment(SwingConstants.CENTER);
		lblHelp.setForeground(Color.DARK_GRAY);
		lblHelp.setFont(new Font("Sitka Small", Font.BOLD, 15));
		
		JLabel lblInfo = new JLabel("Info");
		lblInfo.setBounds(100, 10, 63, 40);
		panel_2.add(lblInfo);
		lblInfo.setHorizontalAlignment(SwingConstants.CENTER);
		lblInfo.setForeground(Color.DARK_GRAY);
		lblInfo.setFont(new Font("Sitka Small", Font.BOLD, 15));
		
		JLabel lblHome = new JLabel("Home");
		lblHome.setBounds(27, 10, 63, 40);
		panel_2.add(lblHome);
		lblHome.setHorizontalAlignment(SwingConstants.CENTER);
		lblHome.setForeground(Color.DARK_GRAY);
		lblHome.setFont(new Font("Sitka Small", Font.BOLD, 15));
		
		JLabel label = new JLabel("Help");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.DARK_GRAY);
		label.setFont(new Font("Sitka Small", Font.BOLD, 15));
		label.setBounds(270, 10, 63, 40);
		panel_2.add(label);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 160, 1071, 672);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(UIManager.getColor("Button.light"));
		panel_4.setBounds(51, 42, 283, 247);
		panel_3.add(panel_4);
		panel_4.setLayout(null);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(new Color(51, 153, 255));
		panel_10.setBounds(0, 0, 283, 74);
		panel_4.add(panel_10);
		panel_10.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Mark Attendance");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Bell MT", Font.BOLD, 24));
		lblNewLabel_2.setBounds(41, 24, 210, 29);
		panel_10.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		Image image = new ImageIcon(this.getClass().getResource("/images/time.png")).getImage().getScaledInstance(283, 174, Image.SCALE_DEFAULT);
		lblNewLabel_3.setIcon(new ImageIcon(image));
		lblNewLabel_3.setBounds(0, 73, 283, 174);
		panel_4.add(lblNewLabel_3);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(UIManager.getColor("Button.light"));
		panel_5.setBounds(394, 42, 283, 247);
		panel_3.add(panel_5);
		panel_5.setLayout(null);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBackground(new Color(51, 153, 255));
		panel_11.setBounds(0, 0, 283, 74);
		panel_5.add(panel_11);
		panel_11.setLayout(null);
		
		JLabel lblStudentRegistration = new JLabel("Student Registration");
		lblStudentRegistration.setHorizontalAlignment(SwingConstants.CENTER);
		lblStudentRegistration.setForeground(Color.WHITE);
		lblStudentRegistration.setFont(new Font("Bell MT", Font.BOLD, 24));
		lblStudentRegistration.setBounds(22, 24, 238, 29);
		panel_11.add(lblStudentRegistration);
		
		JLabel lblNewLabel_4 = new JLabel("");
		Image image2 = new ImageIcon(this.getClass().getResource("/images/details.png")).getImage().getScaledInstance(283, 174, Image.SCALE_DEFAULT);
		lblNewLabel_4.setIcon(new ImageIcon(image2));
		//lblNewLabel_4.setIcon(new ImageIcon(WelcomePage.class.getResource("/images/details.png")));
		lblNewLabel_4.setBounds(0, 72, 283, 174);
		panel_5.add(lblNewLabel_4);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(UIManager.getColor("Button.light"));
		panel_6.setBounds(738, 42, 283, 247);
		panel_3.add(panel_6);
		panel_6.setLayout(null);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBackground(new Color(51, 153, 255));
		panel_12.setBounds(0, 0, 283, 74);
		panel_6.add(panel_12);
		panel_12.setLayout(null);
		
		JLabel label_1 = new JLabel("Student Details");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Bell MT", Font.BOLD, 24));
		label_1.setBounds(30, 20, 210, 29);
		panel_12.add(label_1);
		
		JLabel label_2 = new JLabel("");
		Image image3 = new ImageIcon(this.getClass().getResource("/images/students.png")).getImage().getScaledInstance(283, 174, Image.SCALE_DEFAULT);
		label_2.setIcon(new ImageIcon(image3));
		//label_2.setIcon(new ImageIcon(WelcomePage.class.getResource("/images/details.png")));
		label_2.setBounds(0, 72, 283, 175);
		panel_6.add(label_2);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(UIManager.getColor("Button.light"));
		panel_7.setBounds(51, 348, 283, 247);
		panel_3.add(panel_7);
		panel_7.setLayout(null);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBackground(new Color(51, 153, 255));
		panel_13.setBounds(0, 0, 283, 74);
		panel_7.add(panel_13);
		panel_13.setLayout(null);
		
		JLabel lblWhoIsIn = new JLabel("Who is In?");
		lblWhoIsIn.setHorizontalAlignment(SwingConstants.CENTER);
		lblWhoIsIn.setForeground(Color.WHITE);
		lblWhoIsIn.setFont(new Font("Bell MT", Font.BOLD, 24));
		lblWhoIsIn.setBounds(34, 22, 210, 29);
		panel_13.add(lblWhoIsIn);
		
		JLabel label_3 = new JLabel("");
		Image image4 = new ImageIcon(this.getClass().getResource("/images/details.png")).getImage().getScaledInstance(283, 174, Image.SCALE_DEFAULT);
		label_3.setIcon(new ImageIcon(image4));
		//label_3.setIcon(new ImageIcon(WelcomePage.class.getResource("/images/details.png")));
		label_3.setBounds(0, 72, 283, 175);
		panel_7.add(label_3);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(UIManager.getColor("Button.light"));
		panel_8.setBounds(394, 348, 283, 247);
		panel_3.add(panel_8);
		panel_8.setLayout(null);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBackground(new Color(51, 153, 255));
		panel_14.setBounds(0, 0, 283, 74);
		panel_8.add(panel_14);
		panel_14.setLayout(null);
		
		JLabel lblAdsentStudents = new JLabel("Adsent Students");
		lblAdsentStudents.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdsentStudents.setForeground(Color.WHITE);
		lblAdsentStudents.setFont(new Font("Bell MT", Font.BOLD, 24));
		lblAdsentStudents.setBounds(38, 23, 210, 29);
		panel_14.add(lblAdsentStudents);
		
		JLabel label_4 = new JLabel("");
		Image image5 = new ImageIcon(this.getClass().getResource("/images/absent.png")).getImage().getScaledInstance(283, 174, Image.SCALE_DEFAULT);
		label_4.setIcon(new ImageIcon(image5));
		//label_4.setIcon(new ImageIcon(WelcomePage.class.getResource("/images/details.png")));
		label_4.setBounds(0, 72, 283, 175);
		panel_8.add(label_4);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(UIManager.getColor("Button.light"));
		panel_9.setBounds(738, 348, 283, 247);
		panel_3.add(panel_9);
		panel_9.setLayout(null);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBackground(new Color(51, 153, 255));
		panel_15.setBounds(0, 0, 283, 74);
		panel_9.add(panel_15);
		panel_15.setLayout(null);
		
		JLabel lblMontlySummary = new JLabel("Montly Summary");
		lblMontlySummary.setHorizontalAlignment(SwingConstants.CENTER);
		lblMontlySummary.setForeground(Color.WHITE);
		lblMontlySummary.setFont(new Font("Bell MT", Font.BOLD, 24));
		lblMontlySummary.setBounds(44, 24, 210, 29);
		panel_15.add(lblMontlySummary);
		
		JLabel label_5 = new JLabel("");
		Image image6 = new ImageIcon(this.getClass().getResource("/images/details.png")).getImage().getScaledInstance(283, 174, Image.SCALE_DEFAULT);
		label_5.setIcon(new ImageIcon(image6));
		//label_5.setIcon(new ImageIcon(WelcomePage.class.getResource("/images/details.png")));
		label_5.setBounds(0, 72, 283, 175);
		panel_9.add(label_5);
		setVisible(true);
	}
}
