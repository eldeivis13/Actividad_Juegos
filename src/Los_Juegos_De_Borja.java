import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.JTable;
import javax.swing.JInternalFrame;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class Los_Juegos_De_Borja extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Los_Juegos_De_Borja frame = new Los_Juegos_De_Borja();
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
	public Los_Juegos_De_Borja() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 738, 666);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.windowBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton BotonSi = new JButton("Si");
		BotonSi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Prueba1 abrir = new Prueba1();
				abrir.setVisible(true);
			}
		});
		BotonSi.setBackground(new Color(165, 42, 42));
		BotonSi.setFont(new Font("Tahoma", Font.PLAIN, 15));
		BotonSi.setBounds(27, 493, 245, 80);
		contentPane.add(BotonSi);
		
		JButton BotonNo = new JButton("No");
		BotonNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Prueba1 abrir = new Prueba1();
				abrir.setVisible(true);
			}
		});
		BotonNo.setBackground(new Color(165, 42, 42));
		BotonNo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		BotonNo.setBounds(441, 493, 260, 80);
		contentPane.add(BotonNo);
		
		JLabel lbJuegosBorja = new JLabel("LOS JUEGOS DE BORJA");
		lbJuegosBorja.setForeground(new Color(128, 0, 0));
		lbJuegosBorja.setBackground(UIManager.getColor("CheckBox.foreground"));
		lbJuegosBorja.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 30));
		lbJuegosBorja.setHorizontalAlignment(SwingConstants.CENTER);
		lbJuegosBorja.setBounds(105, 83, 482, 140);
		contentPane.add(lbJuegosBorja);
		
		table = new JTable();
		table.setBackground(Color.BLACK);
		table.setBounds(105, 83, 482, 140);
		contentPane.add(table);
		
		JLabel lbEmpezar = new JLabel("\u00BFEstas listo para empezar?");
		lbEmpezar.setForeground(Color.BLACK);
		lbEmpezar.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lbEmpezar.setHorizontalAlignment(SwingConstants.CENTER);
		lbEmpezar.setBounds(105, 260, 482, 80);
		contentPane.add(lbEmpezar);
	}
}
