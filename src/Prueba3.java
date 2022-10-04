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
import javax.swing.JScrollPane;
import javax.swing.JDesktopPane;

public class Prueba3 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prueba3 frame = new Prueba3();
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
	public Prueba3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 738, 666);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBackground(new Color(144, 238, 144));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbPrueba3 = new JLabel("PRUEBA 3");
		lbPrueba3.setForeground(new Color(205, 92, 92));
		lbPrueba3.setFont(new Font("Script MT Bold", Font.PLAIN, 31));
		lbPrueba3.setBounds(10, 10, 182, 43);
		contentPane.add(lbPrueba3);
		
		JButton BotonAvanzar = new JButton("Avanzar");
		BotonAvanzar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Prueba4 abrir = new Prueba4();
				abrir.setVisible(true);
			}
		});
		BotonAvanzar.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		BotonAvanzar.setBounds(606, 584, 85, 21);
		contentPane.add(BotonAvanzar);
	}
}
