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
		setBounds(100, 100, 738, 666);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbPrueba1 = new JLabel("Prueba 1");
		lbPrueba1.setForeground(Color.GREEN);
		lbPrueba1.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		lbPrueba1.setBounds(10, 10, 177, 28);
		contentPane.add(lbPrueba1);
		
		JButton letraA = new JButton("A");
		letraA.setBounds(10, 210, 39, 37);
		contentPane.add(letraA);
		
		JButton letraB = new JButton("B");
		letraB.setBounds(67, 210, 39, 37);
		contentPane.add(letraB);
		
		JButton letraC = new JButton("C");
		letraC.setBounds(123, 210, 39, 37);
		contentPane.add(letraC);
		
		JButton letraD = new JButton("D");
		letraD.setBounds(177, 210, 39, 37);
		contentPane.add(letraD);
		
		JButton letraE = new JButton("E");
		letraE.setBounds(234, 210, 39, 37);
		contentPane.add(letraE);
		
		JButton letraF = new JButton("F");
		letraF.setBounds(10, 267, 39, 37);
		contentPane.add(letraF);
		
		JButton letraG = new JButton("G");
		letraG.setBounds(67, 267, 39, 37);
		contentPane.add(letraG);
		
		JButton letraH = new JButton("H");
		letraH.setBounds(123, 267, 39, 37);
		contentPane.add(letraH);
		
		JButton letraI = new JButton("I");
		letraI.setBounds(177, 267, 39, 37);
		contentPane.add(letraI);
		
		JButton letraJ = new JButton("J");
		letraJ.setBounds(234, 267, 39, 37);
		contentPane.add(letraJ);
		
		JButton letraK = new JButton("K");
		letraK.setBounds(10, 328, 39, 37);
		contentPane.add(letraK);
		
		JButton letraQ = new JButton("Q");
		letraQ.setBounds(123, 392, 39, 37);
		contentPane.add(letraQ);
		
		JButton letra— = new JButton("\u00D1");
		letra—.setBounds(234, 328, 39, 37);
		contentPane.add(letra—);
		
		JButton letraL = new JButton("L");
		letraL.setBounds(67, 328, 39, 37);
		contentPane.add(letraL);
		
		JButton letraM = new JButton("M");
		letraM.setBounds(123, 328, 41, 37);
		contentPane.add(letraM);
		
		JButton letraO = new JButton("O");
		letraO.setBounds(10, 392, 39, 37);
		contentPane.add(letraO);
		
		JButton letraP = new JButton("P");
		letraP.setBounds(67, 392, 39, 37);
		contentPane.add(letraP);
		
		JButton letraR = new JButton("R");
		letraR.setBounds(177, 392, 39, 37);
		contentPane.add(letraR);
		
		JButton letraS = new JButton("S");
		letraS.setBounds(234, 392, 39, 37);
		contentPane.add(letraS);
		
		JButton letraT = new JButton("T");
		letraT.setBounds(10, 460, 39, 37);
		contentPane.add(letraT);
		
		JButton letraU = new JButton("U");
		letraU.setBounds(67, 460, 39, 37);
		contentPane.add(letraU);
		
		JButton letraY = new JButton("Y");
		letraY.setBounds(67, 517, 39, 37);
		contentPane.add(letraY);
		
		JButton letraX = new JButton("X");
		letraX.setBounds(234, 460, 39, 37);
		contentPane.add(letraX);
		
		JButton letraV = new JButton("V");
		letraV.setBounds(123, 460, 39, 37);
		contentPane.add(letraV);
		
		JButton letraN = new JButton("N");
		letraN.setBounds(177, 328, 41, 37);
		contentPane.add(letraN);
		
		JButton letraZ = new JButton("Z");
		letraZ.setBounds(177, 517, 39, 37);
		contentPane.add(letraZ);
		
		JButton letraW = new JButton("W");
		letraW.setBounds(177, 460, 43, 37);
		contentPane.add(letraW);
		
		JButton INICIAR = new JButton("INICIAR JUEGO");
		INICIAR.setForeground(Color.BLUE);
		INICIAR.setBounds(20, 43, 167, 28);
		contentPane.add(INICIAR);
	}
}
