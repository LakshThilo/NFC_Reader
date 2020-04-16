package com.lak.uni.veiw;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.lak.uni.controller.Controller;
import com.lak.uni.controller.MultiThreading;
import javax.swing.UIManager;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Connect extends JFrame {

	private JPanel contentPane;
	private static Connect frame; 

	private MultiThreading mt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new Connect();
					frame.setUndecorated(true);
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
	public Connect() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 572, 337);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(169, 169, 169));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Start");
		btnNewButton.setForeground(new Color(255, 99, 71));
		btnNewButton.setBackground(SystemColor.controlHighlight);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				mt = new MultiThreading();
				mt.start();
				//new WelcomePage();
				new HomeWindow(); 
				
				frame.setVisible(false);
			
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(298, 147, 207, 56);
		contentPane.add(btnNewButton);
		
		JButton btnStop = new JButton("Stop");
		btnStop.setBackground(SystemColor.controlHighlight);
		btnStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				mt.setRunning(false);
				System.out.println("Programme Terminated....");
				System.exit(0);
				
				
			}
		});
		btnStop.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnStop.setBounds(298, 216, 207, 56);
		contentPane.add(btnStop);
		
		
		JLabel lblNewLabel = new JLabel("Attendance M");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 26));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(0, 44, 248, 56);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("onitaring System");
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 26));
		lblNewLabel_2.setBounds(246, 44, 230, 56);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("");
		Image image = new ImageIcon(this.getClass().getResource("/images/book2.jpg")).getImage().getScaledInstance(258, 337, Image.SCALE_DEFAULT);
		lblNewLabel_1.setIcon(new ImageIcon(image));
		lblNewLabel_1.setBounds(0, 0, 248, 337);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("X");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
				
			}
		});
		lblNewLabel_3.setForeground(new Color(220, 20, 60));
		lblNewLabel_3.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 23));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(533, 10, 25, 19);
		contentPane.add(lblNewLabel_3);
		
		JLabel label = new JLabel("?");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 20));
		label.setBounds(509, 10, 25, 19);
		contentPane.add(label);
		
	}
}
