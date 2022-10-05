import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import javax.swing.JEditorPane;
import javax.swing.border.LineBorder;
import javax.swing.Icon;
import javax.swing.ImageIcon;

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
		JLabel lblMaquina = new JLabel("MAQ");
		lblMaquina.setBounds(82, 349, 85, 53);
		contentPane.add(lblMaquina);
		
		JLabel lblPersona = new JLabel("TU");
		lblPersona.setBounds(364, 349, 85, 64);
		contentPane.add(lblPersona);	
		
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
		
		JButton Inicio = new JButton("INICIAR JUEGO ");
		Inicio.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 46));
		Inicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int almaquina=0;
				almaquina = (int)(2 + Math.random()*12);
				
				int alpersona=0;
				alpersona =(int)(2 + Math.random()*12);
				
				/*if (alpersona<almaquina) {
					//String letra = String.valueOf(almaquina);
					//lblMaquina.setText(letra);
					JOptionPane.showMessageDialog(null, ("tu has sacado " + alpersona));
					Perder pr = new Perder();
					pr.setVisible(true);
				}else if (alpersona>almaquina) {
					JOptionPane.showMessageDialog(null, ("la maquina ha sacado " + almaquina));
					JOptionPane.showMessageDialog(null, ("tu has sacado " + alpersona));
					JOptionPane.showMessageDialog(null, "Siguiente prueba");
					Prueba4 pru = new Prueba4();
					pru.setVisible(true);
				}else if(alpersona==almaquina) {
					Prueba3 pf = new Prueba3();
					pf.setVisible(true);
				}*/
			}
		});
		Inicio.setBounds(151, 138, 378, 73);
		contentPane.add(Inicio);	
		
		
		
		
		
	}
}
