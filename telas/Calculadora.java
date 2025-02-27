package telas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JFrame;


public class Calculadora {
	
	
	private JFrame janela = new JFrame();
	private JTextField display = new JTextField();
	//private Font fonte = new Font("Arial" Font.Bold, 20);
	
	private JButton btn7 = new JButton("7");
	private JButton btn8 = new JButton("8");
	private JButton btn9 = new JButton("9");
	private JButton btnMais = new JButton("+");



	private JButton btn4 = new JButton("4");
	private JButton btn5 = new JButton("5");
	private JButton btn6 = new JButton("6");
	private JButton btnMenos = new JButton("-");


	private JButton btn1 = new JButton("1");
	private JButton btn2 = new JButton("2");
	private JButton btn3 = new JButton("3");
	private JButton btnMulti = new JButton("*");
	


	
	public Calculadora() {
		
		this.janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.janela.setTitle("Calculadora");
		this.janela.setBounds(500, 500, 215, 215);
		this.janela.setLayout(null);
		
		this.display.setBounds(5, 5, 215, 40);
		this.btn7.setBounds(5, 55, 50, 50);
		this.btn7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + "7");
			}
		});
		this.btn8.setBounds(60, 55, 50, 50);
		this.btn9.setBounds(115, 55, 50, 50);
		this.btnMais.setBounds(170, 55, 50, 50);
		
		this.janela.add(display);
		this.janela.add(btn7);
		this.janela.add(btn8);
		this.janela.add(btn9);
		this.janela.add(btnMais);

		
		
		this.janela.setVisible(true);
		
	}
}