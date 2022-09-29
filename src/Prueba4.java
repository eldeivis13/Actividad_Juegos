import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JEditorPane;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class Prueba4 extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_4;
	private JTable table_1;
	private JTable table_2;
	private JTable table_3;
	private JTable table_5;
	private JTable table_6;
	private JTable table_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prueba4 frame = new Prueba4();
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
	public Prueba4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(47, 79, 79));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel(".");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_3.setBounds(392, 117, 16, 32);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel(".");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(79, 117, 16, 32);
		contentPane.add(lblNewLabel);
		
		JLabel lbPrueba4 = new JLabel("\u00BFQue puerta crees que es la correcta?");
		lbPrueba4.setForeground(new Color(0, 0, 0));
		lbPrueba4.setBackground(SystemColor.desktop);
		lbPrueba4.setHorizontalAlignment(SwingConstants.CENTER);
		lbPrueba4.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lbPrueba4.setBounds(10, 10, 398, 39);
		contentPane.add(lbPrueba4);
		
		table_4 = new JTable();
		table_4.setBackground(new Color(128, 0, 0));
		table_4.setBounds(39, 94, 45, 84);
		contentPane.add(table_4);
		
		table = new JTable();
		table.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		table.setBackground(new Color(139, 69, 19));
		table.setBounds(28, 84, 67, 106);
		contentPane.add(table);
		
		JLabel lblNewLabel_1 = new JLabel(".");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(185, 117, 16, 32);
		contentPane.add(lblNewLabel_1);
		
		table_2 = new JTable();
		table_2.setBackground(new Color(128, 0, 0));
		table_2.setBounds(145, 94, 45, 84);
		contentPane.add(table_2);
		
		table_1 = new JTable();
		table_1.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		table_1.setBackground(new Color(139, 69, 19));
		table_1.setBounds(134, 84, 67, 106);
		contentPane.add(table_1);
		
		JLabel lblNewLabel_2 = new JLabel(".");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_2.setBounds(295, 117, 16, 32);
		contentPane.add(lblNewLabel_2);
		
		table_7 = new JTable();
		table_7.setBackground(new Color(128, 0, 0));
		table_7.setBounds(352, 94, 45, 84);
		contentPane.add(table_7);
		
		table_5 = new JTable();
		table_5.setBackground(new Color(128, 0, 0));
		table_5.setBounds(255, 94, 45, 84);
		contentPane.add(table_5);
		
		table_3 = new JTable();
		table_3.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		table_3.setBackground(new Color(139, 69, 19));
		table_3.setBounds(244, 84, 67, 106);
		contentPane.add(table_3);
		
		table_6 = new JTable();
		table_6.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		table_6.setBackground(new Color(139, 69, 19));
		table_6.setBounds(341, 84, 67, 106);
		contentPane.add(table_6);
		
		JButton BotonPuerta_1 = new JButton("1");
		BotonPuerta_1.setBackground(SystemColor.activeCaption);
		BotonPuerta_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int R = (int)(1+Math.random()*2);
				
				if(R == 1) {
					Final abrir = new Final();
					abrir.setVisible(true);
				}else {
					Perder abrir = new Perder();
					abrir.setVisible(true);
				}
			}
		});
		BotonPuerta_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		BotonPuerta_1.setBounds(28, 200, 67, 21);
		contentPane.add(BotonPuerta_1);
		
		JButton BotonPuerta_2 = new JButton("2");
		BotonPuerta_2.setBackground(SystemColor.activeCaption);
		BotonPuerta_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int R = (int)(1+Math.random()*2);
				
				if(R == 1) {
					Final abrir = new Final();
					abrir.setVisible(true);
				}else {
					Perder abrir = new Perder();
					abrir.setVisible(true);
				}
			}
		});
		BotonPuerta_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		BotonPuerta_2.setBounds(134, 200, 67, 21);
		contentPane.add(BotonPuerta_2);
		
		JButton BotonPuerta_3 = new JButton("3");
		BotonPuerta_3.setBackground(SystemColor.activeCaption);
		BotonPuerta_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int R = (int)(1+Math.random()*2);
				
				if(R == 1) {
					Final abrir = new Final();
					abrir.setVisible(true);
				}else {
					Perder abrir = new Perder();
					abrir.setVisible(true);
				}
			}
		});
		BotonPuerta_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		BotonPuerta_3.setBounds(244, 200, 67, 21);
		contentPane.add(BotonPuerta_3);
		
		JButton BotonPuerta_4 = new JButton("4");
		BotonPuerta_4.setBackground(SystemColor.activeCaption);
		BotonPuerta_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int R = (int)(1+Math.random()*2);
				
				if(R == 1) {
					Final abrir = new Final();
					abrir.setVisible(true);
				}else {
					Perder abrir = new Perder();
					abrir.setVisible(true);
				}
			}
		});
		BotonPuerta_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		BotonPuerta_4.setBounds(341, 200, 67, 21);
		contentPane.add(BotonPuerta_4);
		
	}
}
