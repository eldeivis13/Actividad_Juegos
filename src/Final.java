import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Final extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Final frame = new Final();
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
	public Final() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 738, 666);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbFinal = new JLabel("\u00A1\u00A1\u00A1ENORABUENA !!!");
		lbFinal.setHorizontalAlignment(SwingConstants.CENTER);
		lbFinal.setFont(new Font("OCR A Extended", Font.BOLD, 30));
		lbFinal.setBounds(10, 197, 714, 72);
		contentPane.add(lbFinal);
		
		JLabel lblNewLabel = new JLabel("HAS PASADO TODAS LAS PRUEBAS");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("OCR A Extended", Font.BOLD, 30));
		lblNewLabel.setBounds(10, 325, 714, 97);
		contentPane.add(lblNewLabel);
	}

}
