package com.lak.uni.veiw;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

public class Connect_new extends JFrame {

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
	public Connect_new() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Button.disabledForeground"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Start");
		btnNewButton.setBackground(SystemColor.windowBorder);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				mt = new MultiThreading();
				mt.start();
				//new MainFrame();
				new WelcomePage();
				frame.setVisible(false);
			
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(132, 88, 207, 56);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Welcome ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(47, 13, 362, 62);
		contentPane.add(lblNewLabel);
		
		JButton btnStop = new JButton("Stop");
		btnStop.setBackground(SystemColor.windowBorder);
		btnStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				mt.setRunning(false);
				System.out.println("Programme Terminated....");
				System.exit(0);
				
				
			}
		});
		btnStop.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnStop.setBounds(132, 157, 207, 56);
		contentPane.add(btnStop);
	}

}