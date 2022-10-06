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
import javax.swing.border.BevelBorder;
import javax.swing.JTextPane;

public class Prueba3 extends JFrame {
	
	
	String Imagenees [] = {
			"dado1.png",
			"dado2.png",
			"dado3.png",
			"dado4.png",
			"dado5.png",
			"dado6.png"
			
	};
	
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
		
		
		JLabel lblM = new JLabel("");
		lblM.setIcon(new ImageIcon("C:\\icon\\dado6.png"));
		lblM.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblM.setBounds(43, 184, 264, 234);
		contentPane.add(lblM);
		
		JLabel lblH = new JLabel("");
		lblH.setIcon(new ImageIcon("C:\\icon\\dado6.png"));
		lblH.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblH.setBounds(388, 184, 264, 234);
		contentPane.add(lblH);
		
		JButton Inicio = new JButton("INICIAR JUEGO ");
		Inicio.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 46));
		Inicio.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				int indice=0;

				int almaquina=0;
				almaquina = (int)(1+ Math.random()*6);
				
				int alpersona=0;
				alpersona =(int)(1 + Math.random()*6);		
				
				//maquina
					if(almaquina==1) {
						
						ImageIcon Imagen = new ImageIcon(Imagenees[indice]);
						lblM.setIcon(Imagen);
						Inicio.setVisible(false);
					}else if(almaquina==2) {
						indice=2;
						ImageIcon Imagen = new ImageIcon(Imagenees[indice]);
						lblM.setIcon(Imagen);
						Inicio.setVisible(false);
					}else if(almaquina==3) {
						indice=3;
						ImageIcon Imagen = new ImageIcon(Imagenees[indice]);
						lblM.setIcon(Imagen);
						Inicio.setVisible(false);
					}else if(almaquina==4) {
						indice=4;
						ImageIcon Imagen = new ImageIcon(Imagenees[indice]);
						lblM.setIcon(Imagen);
						Inicio.setVisible(false);
					}else if(almaquina==5) {
						indice=5;
						ImageIcon Imagen = new ImageIcon(Imagenees[indice]);
						lblM.setIcon(Imagen);
						Inicio.setVisible(false);
					}else if(almaquina==6) {
						indice=6;
						ImageIcon Imagen = new ImageIcon(Imagenees[indice]);
						lblH.setIcon(Imagen);
						Inicio.setVisible(false);
					}
					//persona
					if(alpersona==1) {
						indice=1;
						ImageIcon Imagen = new ImageIcon(Imagenees[indice]);
						lblH.setIcon(Imagen);
						Inicio.setVisible(false);
					}else if(alpersona==2) {
						indice=2;
						ImageIcon Imagen = new ImageIcon(Imagenees[indice]);
						lblH.setIcon(Imagen);
						Inicio.setVisible(false);
					}else if(alpersona==3) {
						indice=3;
						ImageIcon Imagen = new ImageIcon(Imagenees[indice]);
						lblH.setIcon(Imagen);
						Inicio.setVisible(false);
					}else if(alpersona==4) {
						indice=4;
						ImageIcon Imagen = new ImageIcon(Imagenees[indice]);
						lblH.setIcon(Imagen);
						Inicio.setVisible(false);
					}else if(alpersona==5) {
						indice=5;
						ImageIcon Imagen = new ImageIcon(Imagenees[indice]);
						lblH.setIcon(Imagen);
						Inicio.setVisible(false);
					}else if(alpersona==6) {
						indice=6;
						ImageIcon Imagen = new ImageIcon(Imagenees[indice]);
						lblH.setIcon(Imagen);
						Inicio.setVisible(false);
					}
					if(almaquina>alpersona) {
						JOptionPane.showMessageDialog(null, " has perdido");
						comprobarGanador(almaquina,alpersona,Inicio);
					}else if(alpersona>almaquina) {
						JOptionPane.showMessageDialog(null, " has ganado");
						comprobarGanador(almaquina,alpersona,Inicio);
					}else {
						JOptionPane.showMessageDialog(null, "SE REPITE PRESIONA INICIAR JUEGO PORFAVOR ");
						comprobarGanador(almaquina,alpersona,Inicio);
					}
					
					
					
				}
		});
		Inicio.setBounds(150, 76, 378, 73);
		contentPane.add(Inicio);	
		
		JTextPane txtpnMaquina = new JTextPane();
		txtpnMaquina.setFont(new Font("Tahoma", Font.PLAIN, 34));
		txtpnMaquina.setText("maquina");
		txtpnMaquina.setBounds(103, 438, 143, 43);
		contentPane.add(txtpnMaquina);
		
		JTextPane txtpnHumano = new JTextPane();
		txtpnHumano.setText("humano");
		txtpnHumano.setFont(new Font("Tahoma", Font.PLAIN, 34));
		txtpnHumano.setBounds(455, 438, 143, 43);
		contentPane.add(txtpnHumano);
		
	}
	
	public void comprobarGanador(int almaquina,int alpersona, JButton Inicio) {
		if(almaquina>alpersona) {
			Perder pr = new Perder();
			pr.setVisible(true);
		}else if(almaquina<alpersona) {
			Prueba4 nf = new Prueba4();
			nf.setVisible(true);
		}else if(almaquina==alpersona) {
			Inicio.setVisible(true);
		}
	}
}
