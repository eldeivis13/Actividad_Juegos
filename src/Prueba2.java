import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JProgressBar;
import javax.swing.JToggleButton;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.JTextPane;
import javax.swing.JList;
import javax.swing.JTree;
import javax.swing.JScrollBar;
import java.awt.Choice;
import java.awt.Canvas;
import java.awt.Checkbox;
import javax.swing.JMenu;
import javax.swing.SwingConstants;
import javax.swing.JTable;

public class Prueba2 extends JFrame {

	private JPanel contentPane;
	
	JButton boton [] = new JButton[9];
	int contador = 9;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prueba2 frame = new Prueba2();
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
	public Prueba2() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 517, 431);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbPrueba2 = new JLabel("Prueba 2");
		lbPrueba2.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		lbPrueba2.setBounds(10, 10, 190, 42);
		contentPane.add(lbPrueba2);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 139));
		panel.setBounds(46, 48, 398, 336);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton Boton1 = new JButton("");
		Boton1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		Boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Boton1.getText().equals("")) {
					Boton1.setText("X");
					if(contador >= 1) {
						//Boton1.setText("X");
						contador--;
						turnoMaquina();
					}
				}
			}
		});
		Boton1.setBackground(Color.WHITE);
		Boton1.setBounds(0, 10, 115, 90);
		panel.add(Boton1);
		
		JButton Boton2 = new JButton("");
		Boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Boton2.getText().equals("")) {
					Boton2.setText("X");
					contador--;
					if(contador >= 1) {
						turnoMaquina();
					}
				}
			}
		});
		Boton2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		Boton2.setBackground(Color.WHITE);
		Boton2.setBounds(140, 10, 115, 90);
		panel.add(Boton2);
		
		JButton Boton3 = new JButton("");
		Boton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Boton3.getText().equals("")) {
					Boton3.setText("X");
					contador--;
					if(contador >= 1) {
						turnoMaquina();
					}
				}
			}
		});
		Boton3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		Boton3.setBackground(Color.WHITE);
		Boton3.setBounds(285, 10, 115, 90);
		panel.add(Boton3);
		
		JButton Boton4 = new JButton("");
		Boton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Boton4.getText().equals("")) {
					Boton4.setText("X");
					contador--;
					if(contador >= 1) {
						turnoMaquina();
					}
				}
			}
		});
		Boton4.setFont(new Font("Tahoma", Font.PLAIN, 30));
		Boton4.setBackground(Color.WHITE);
		Boton4.setBounds(0, 119, 115, 90);
		panel.add(Boton4);
		
		JButton Boton5 = new JButton("");
		Boton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Boton5.getText().equals("")) {
					Boton5.setText("X");
					contador--;
					if(contador >= 1) {
						turnoMaquina();
					}
				}
			}
		});
		Boton5.setFont(new Font("Tahoma", Font.PLAIN, 30));
		Boton5.setBackground(Color.WHITE);
		Boton5.setBounds(140, 119, 115, 90);
		panel.add(Boton5);
		
		JButton Boton6 = new JButton("");
		Boton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Boton6.getText().equals("")) {
					Boton6.setText("X");
					contador--;
					if(contador >= 1) {
						turnoMaquina();
					}
				}
			}
		});
		Boton6.setFont(new Font("Tahoma", Font.PLAIN, 30));
		Boton6.setBackground(Color.WHITE);
		Boton6.setBounds(285, 119, 115, 90);
		panel.add(Boton6);
		
		JButton Boton7 = new JButton("");
		Boton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Boton7.getText().equals("")) {
					Boton7.setText("X");
					contador--;
					if(contador >= 1) {
						turnoMaquina();
					}
				}
			}
		});
		Boton7.setFont(new Font("Tahoma", Font.PLAIN, 30));
		Boton7.setBackground(Color.WHITE);
		Boton7.setBounds(0, 236, 115, 90);
		panel.add(Boton7);
		
		JButton Boton8 = new JButton("");
		Boton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Boton8.getText().equals("")) {
					Boton8.setText("X");
					contador--;
					if(contador >= 1) {
						turnoMaquina();
					}
				}
			}
		});
		Boton8.setFont(new Font("Tahoma", Font.PLAIN, 30));
		Boton8.setBackground(Color.WHITE);
		Boton8.setBounds(140, 236, 115, 90);
		panel.add(Boton8);
		
		JButton Boton9 = new JButton("");
		Boton9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Boton9.getText().equals("")) {
					Boton9.setText("X");
					contador--;
					if(contador >= 1) {
						turnoMaquina();
					}
				}
			}
		});
		Boton9.setFont(new Font("Tahoma", Font.PLAIN, 30));
		Boton9.setBackground(Color.WHITE);
		Boton9.setBounds(285, 236, 115, 90);
		panel.add(Boton9);
		
		boton[0] = Boton1;
		boton[1] = Boton2;
		boton[2] = Boton3;
		boton[3] = Boton4;
		boton[4] = Boton5;
		boton[5] = Boton6;
		boton[6] = Boton7;
		boton[7] = Boton8;
		boton[8] = Boton9;
	}
	
	public void turnoMaquina() {
		int C = 0;
		do {
			int c = (int)(0+Math.random()*8);
			if(boton[c].getText().equals("")) {
				if(contador >= 1) {
					boton[c].setText("O");
					C++;
					contador--;
				}
			}
		}while(C == 0);
	}
}
