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
		setBounds(100, 100, 738, 666);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbPrueba1 = new JLabel("Prueba 1");
		lbPrueba1.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		lbPrueba1.setBounds(10, 10, 177, 28);
		contentPane.add(lbPrueba1);
		
		JButton letraA = new JButton("A");
		letraA.setBounds(10, 210, 60, 37);
		contentPane.add(letraA);
		
		JButton letraB = new JButton("B");
		letraB.setBounds(95, 210, 60, 37);
		contentPane.add(letraB);
		
		JButton letraC = new JButton("C");
		letraC.setBounds(179, 210, 60, 37);
		contentPane.add(letraC);
		
		JButton letraD = new JButton("D");
		letraD.setBounds(262, 210, 60, 37);
		contentPane.add(letraD);
		
		JButton letraE = new JButton("E");
		letraE.setBounds(349, 210, 60, 37);
		contentPane.add(letraE);
		
		JButton letraF = new JButton("F");
		letraF.setBounds(10, 267, 60, 37);
		contentPane.add(letraF);
		
		JButton letraG = new JButton("G");
		letraG.setBounds(95, 267, 60, 37);
		contentPane.add(letraG);
		
		JButton letraH = new JButton("H");
		letraH.setBounds(179, 267, 60, 37);
		contentPane.add(letraH);
		
		JButton letraI = new JButton("I");
		letraI.setBounds(262, 267, 60, 37);
		contentPane.add(letraI);
		
		JButton letraJ = new JButton("J");
		letraJ.setBounds(349, 267, 60, 37);
		contentPane.add(letraJ);
		
		JButton letraK = new JButton("K");
		letraK.setBounds(10, 328, 60, 37);
		contentPane.add(letraK);
		
		JButton letraQ = new JButton("Q");
		letraQ.setBounds(10, 392, 60, 37);
		contentPane.add(letraQ);
		
		JButton letraA_12 = new JButton("A");
		letraA_12.setBounds(203, 522, 60, 37);
		contentPane.add(letraA_12);
		
		JButton letraL = new JButton("L");
		letraL.setBounds(95, 328, 60, 37);
		contentPane.add(letraL);
		
		JButton letraM = new JButton("M");
		letraM.setBounds(179, 328, 60, 37);
		contentPane.add(letraM);
		
		JButton letraO = new JButton("O");
		letraO.setBounds(262, 328, 60, 37);
		contentPane.add(letraO);
		
		JButton letraP = new JButton("P");
		letraP.setBounds(349, 328, 60, 37);
		contentPane.add(letraP);
		
		JButton letraR = new JButton("R");
		letraR.setBounds(95, 392, 60, 37);
		contentPane.add(letraR);
		
		JButton letraS = new JButton("S");
		letraS.setBounds(179, 392, 60, 37);
		contentPane.add(letraS);
		
		JButton letraT = new JButton("T");
		letraT.setBounds(10, 460, 60, 37);
		contentPane.add(letraT);
		
		JButton letraU = new JButton("U");
		letraU.setBounds(95, 460, 60, 37);
		contentPane.add(letraU);
		
		JButton letraA_21 = new JButton("A");
		letraA_21.setBounds(349, 460, 60, 37);
		contentPane.add(letraA_21);
		
		JButton letraA_22 = new JButton("A");
		letraA_22.setBounds(262, 460, 60, 37);
		contentPane.add(letraA_22);
		
		JButton letraA_23 = new JButton("A");
		letraA_23.setBounds(179, 460, 60, 37);
		contentPane.add(letraA_23);
		
		JButton letraA_24 = new JButton("A");
		letraA_24.setBounds(349, 537, 60, 37);
		contentPane.add(letraA_24);
		
		JButton letraA_25 = new JButton("A");
		letraA_25.setBounds(10, 522, 60, 37);
		contentPane.add(letraA_25);
		
		JButton letraA_26 = new JButton("A");
		letraA_26.setBounds(95, 522, 60, 37);
		contentPane.add(letraA_26);
		
		JButton INICIAR = new JButton("INICIAR JUEGO");
		INICIAR.setBounds(20, 43, 135, 21);
		contentPane.add(INICIAR);
	}
}
