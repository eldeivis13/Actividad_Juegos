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
import javax.swing.JToggleButton;
import javax.swing.JEditorPane;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;

public class Prueba1 extends javax.swing.JFrame {
	
	
	//visor de las imagenes
	
	String imagenes[] = {
			
			
			"C:\\icon\\ahorcado_0.jpg",
			"C:\\icon\\ahorcado_1.jpg",
			"C:\\icon\\ahorcado_2.jpg",
			"C:\\icon\\ahorcado_3.jpg",
			"C:\\icon\\ahorcado_4.jpg",
			"C:\\icon\\ahorcado_5.jpg",
			"C:\\icon\\ahorcado_6.jpg",
			"C:\\icon\\ahorcado_7.jpg"

	
	};
	
	int indice = 0;

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
		setBounds(100, 100, 738, 666);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEtiqueta8 = new JLabel("N");
		lblEtiqueta8.setForeground(Color.WHITE);
		lblEtiqueta8.setBounds(159, 141, 45, 13);
		contentPane.add(lblEtiqueta8);
		
		JLabel lblEtiqueta7 = new JLabel("A");
		lblEtiqueta7.setForeground(Color.WHITE);
		lblEtiqueta7.setBounds(140, 141, 45, 13);
		contentPane.add(lblEtiqueta7);
		
		JLabel lblEtiqueta6 = new JLabel("I");
		lblEtiqueta6.setForeground(Color.WHITE);
		lblEtiqueta6.setBounds(123, 141, 45, 13);
		contentPane.add(lblEtiqueta6);
		
		JLabel lblEtiqueta5 = new JLabel("T");
		lblEtiqueta5.setForeground(Color.WHITE);
		lblEtiqueta5.setBounds(104, 141, 45, 13);
		contentPane.add(lblEtiqueta5);
		
		JLabel lblEtiqueta4 = new JLabel("S");
		lblEtiqueta4.setForeground(Color.WHITE);
		lblEtiqueta4.setBounds(85, 141, 28, 13);
		contentPane.add(lblEtiqueta4);
		
		JLabel lblEtiqueta3 = new JLabel("I");
		lblEtiqueta3.setForeground(Color.WHITE);
		lblEtiqueta3.setBounds(73, 141, 21, 13);
		contentPane.add(lblEtiqueta3);
		
		JLabel lblEtiqueta2 = new JLabel("R");
		lblEtiqueta2.setForeground(Color.WHITE);
		lblEtiqueta2.setBounds(54, 141, 15, 13);
		contentPane.add(lblEtiqueta2);
		
		JLabel lblEtiqueta1 = new JLabel("C");
		lblEtiqueta1.setForeground(Color.WHITE);
		lblEtiqueta1.setBounds(39, 141, 45, 13);
		contentPane.add(lblEtiqueta1);
		
		JLabel lbPrueba1 = new JLabel("Prueba 1");
		lbPrueba1.setForeground(Color.BLACK);
		lbPrueba1.setFont(new Font("Wide Latin", Font.PLAIN, 20));
		lbPrueba1.setBounds(10, 10, 177, 28);
		contentPane.add(lbPrueba1);
		
		JButton letraA = new JButton("A");
		letraA.setBounds(10, 210, 46, 37);
		contentPane.add(letraA);
		
		JButton letraB = new JButton("B");
		letraB.setBounds(67, 210, 46, 37);
		contentPane.add(letraB);
		
		JButton letraC = new JButton("C");
		letraC.setBounds(123, 210, 46, 37);
		contentPane.add(letraC);
		
		JButton letraD = new JButton("D");
		letraD.setBounds(177, 210, 46, 37);
		contentPane.add(letraD);
		
		JButton letraE = new JButton("E");
		letraE.setBounds(234, 210, 46, 37);
		contentPane.add(letraE);
		
		JButton letraF = new JButton("F");
		letraF.setBounds(10, 267, 46, 37);
		contentPane.add(letraF);
		
		JButton letraG = new JButton("G");
		letraG.setBounds(67, 267, 46, 37);
		contentPane.add(letraG);
		
		JButton letraH = new JButton("H");
		letraH.setBounds(123, 267, 46, 37);
		contentPane.add(letraH);
		
		JButton letraI = new JButton("I");
		letraI.setBounds(177, 267, 46, 37);
		contentPane.add(letraI);
		
		JButton letraJ = new JButton("J");
		letraJ.setBounds(234, 267, 46, 37);
		contentPane.add(letraJ);
		
		JButton letraK = new JButton("K");
		letraK.setBounds(10, 328, 46, 37);
		contentPane.add(letraK);
		
		JButton letraQ = new JButton("Q");
		letraQ.setBounds(123, 392, 46, 37);
		contentPane.add(letraQ);
		
		JButton letra� = new JButton("\u00D1");
		letra�.setBounds(234, 328, 46, 37);
		contentPane.add(letra�);
		
		JButton letraL = new JButton("L");
		letraL.setBounds(67, 328, 46, 37);
		contentPane.add(letraL);
		
		JButton letraM = new JButton("M");
		letraM.setBounds(123, 328, 46, 37);
		contentPane.add(letraM);
		
		JButton letraO = new JButton("O");
		letraO.setBounds(10, 392, 46, 37);
		contentPane.add(letraO);
		
		JButton letraP = new JButton("P");
		letraP.setBounds(67, 392, 46, 37);
		contentPane.add(letraP);
		
		JButton letraR = new JButton("R");
		letraR.setBounds(177, 392, 46, 37);
		contentPane.add(letraR);
		
		JButton letraS = new JButton("S");
		letraS.setBounds(234, 392, 46, 37);
		contentPane.add(letraS);
		
		JButton letraT = new JButton("T");
		letraT.setBounds(10, 453, 46, 37);
		contentPane.add(letraT);
		
		JButton letraU = new JButton("U");
		letraU.setBounds(67, 453, 46, 37);
		contentPane.add(letraU);
		
		JButton letraY = new JButton("Y");
		letraY.setBounds(67, 517, 46, 37);
		contentPane.add(letraY);
		
		JButton letraX = new JButton("X");
		letraX.setBounds(234, 453, 46, 37);
		contentPane.add(letraX);
		
		JButton letraV = new JButton("V");
		letraV.setBounds(123, 453, 46, 37);
		contentPane.add(letraV);
		
		JButton letraN = new JButton("N");
		letraN.setBounds(177, 328, 47, 37);
		contentPane.add(letraN);
		
		JButton letraZ = new JButton("Z");
		letraZ.setBounds(177, 517, 46, 37);
		contentPane.add(letraZ);
		
		JButton letraW = new JButton("W");
		letraW.setBounds(177, 453, 46, 37);
		contentPane.add(letraW);
		
		JLabel LabelVisor = new JLabel("");
		ImageIcon imagen = new ImageIcon("C:\\icon\\ahorcado_6.jpg");
		LabelVisor.setIcon(imagen);
		LabelVisor.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		LabelVisor.setBounds(392, 10, 281, 509);
		contentPane.add(LabelVisor);
		
		
		JButton INICIAR = new JButton("INICIAR JUEGO");
		INICIAR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LetE = "";
				LetL = "";
				LetF = "";
				LetA = "";
				LetN = "";
				LetT = "";
				
				lblEtiqueta1.setText(""); 
				lblEtiqueta2.setText(""); 
				lblEtiqueta3.setText(""); 
				lblEtiqueta4.setText(""); 
				lblEtiqueta5.setText(""); 
				lblEtiqueta6.setText(""); 
				lblEtiqueta7.setText(""); 
				lblEtiqueta8.setText(""); 
				
				//LabelVisor.setIcon(imagen);
				indice = 0;
				intentosP=0;
				intentosN=0;
			}
		});
		INICIAR.setFont(new Font("Tahoma", Font.PLAIN, 19));
		INICIAR.setForeground(Color.BLUE);
		INICIAR.setBounds(20, 43, 167, 28);
		contentPane.add(INICIAR);
		
		
		
		JLabel lblRayas = new JLabel("_ _ _ _ _ _ _ _ ");
		lblRayas.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblRayas.setForeground(Color.WHITE);
		lblRayas.setBounds(39, 132, 187, 50);
		contentPane.add(lblRayas);
		
		JLabel lblLetras = new JLabel("TECLADO");
		lblLetras.setBackground(Color.BLACK);
		lblLetras.setIcon(new ImageIcon("C:\\Users\\borja\\Desktop\\grado\\segundo a\u00F1o\\interfaces\\icon\\etiqueta1.jpg"));
		lblLetras.setBounds(10, 104, 281, 78);
		contentPane.add(lblLetras);
	}
	
	int intentosP = 0, intentosN=0;
	
	String LetE="";
	String LetL="";
	String LetF="";
	String LetA="";
	String LetN="";
	String LetT="";

	
}
