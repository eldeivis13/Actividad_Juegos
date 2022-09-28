import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Interfaz extends JFrame {

	private JPanel contentPane;
	private JTextField Num1;
	private JTextField Num2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz frame = new Interfaz();
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
	public Interfaz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 401, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Num1 = new JTextField();
		Num1.setHorizontalAlignment(SwingConstants.RIGHT);
		Num1.setBounds(22, 51, 58, 23);
		contentPane.add(Num1);
		Num1.setColumns(10);
		
		Num2 = new JTextField();
		Num2.setHorizontalAlignment(SwingConstants.RIGHT);
		Num2.setColumns(10);
		Num2.setBounds(116, 52, 58, 21);
		contentPane.add(Num2);
		
		JLabel SignoSuma = new JLabel("+");
		SignoSuma.setHorizontalAlignment(SwingConstants.CENTER);
		SignoSuma.setFont(new Font("Tahoma", Font.PLAIN, 15));
		SignoSuma.setBounds(78, 51, 36, 21);
		contentPane.add(SignoSuma);
		
		JLabel SignoIgual = new JLabel("=");
		SignoIgual.setHorizontalAlignment(SwingConstants.CENTER);
		SignoIgual.setFont(new Font("Tahoma", Font.PLAIN, 15));
		SignoIgual.setBounds(184, 48, 36, 27);
		contentPane.add(SignoIgual);
		
		JLabel Resultado = new JLabel("Resultado");
		Resultado.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Resultado.setBounds(230, 47, 85, 34);
		contentPane.add(Resultado);
		
		JButton BotonSumar = new JButton("Sumar");
		BotonSumar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		BotonSumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1, num2, res;
				num1 = Double.parseDouble(Num1.getText());
				num2 = Double.parseDouble(Num2.getText());
				res = num1 + num2;
				Resultado.setText(String.valueOf(res));
			}
		});
		BotonSumar.setBounds(292, 91, 85, 21);
		contentPane.add(BotonSumar);
	}
}
