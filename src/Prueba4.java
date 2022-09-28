import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class Prueba4 extends JFrame {

	private JPanel contentPane;

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
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbPrueba4 = new JLabel("Prueba 4");
		lbPrueba4.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		lbPrueba4.setBounds(10, 10, 191, 39);
		contentPane.add(lbPrueba4);
		
		JButton BotonAvanzar = new JButton("Avanzar");
		BotonAvanzar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		BotonAvanzar.setBounds(341, 232, 85, 21);
		contentPane.add(BotonAvanzar);
	}

}
