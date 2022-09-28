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

public class Prueba1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prueba1 frame = new Prueba1();
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
	public Prueba1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbPrueba1 = new JLabel("Prueba 1");
		lbPrueba1.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		lbPrueba1.setBounds(10, 10, 177, 28);
		contentPane.add(lbPrueba1);
		
		JButton BotonAvanzar = new JButton("Avanzar");
		BotonAvanzar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Prueba2 abrir = new Prueba2();
				abrir.setVisible(true);
			}
		});
		BotonAvanzar.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		BotonAvanzar.setBounds(341, 232, 85, 21);
		contentPane.add(BotonAvanzar);
	}

}
