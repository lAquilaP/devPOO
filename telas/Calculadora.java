package telas;

import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.event.ActionListener;	
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JFrame;


public class Calculadora {
	
	
	private JFrame janela = new JFrame();
	private JTextField display = new JTextField();
	
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
	
	private JButton btn0 = new JButton("0");
	private JButton btnPonto = new JButton(".");
	private JButton btnTrocaValor = new JButton("+/-");
	private JButton btnDivisao = new JButton("/");
	
	private JButton btnIgual = new JButton("=");

	private Font fonte1 = new Font("Arial", Font.BOLD, 26);
	private Font fonte2 = new Font("Arial", Font.BOLD, 10);



	
	public Calculadora() {
		
		this.janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.janela.setTitle("Calculadora");
		this.janela.setBounds(500, 500, 240, 375);
		this.janela.setLayout(null);
		
		this.display.setBounds(5, 5, 215, 40);
		this.display.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if(!(Character.isDigit(c) || c == '+' || c == '-' || c == '/' || c == '=')) {
					e.consume();
				}
				
			}
		});
		this.btn7.setBounds(5, 55, 50, 50);
		this.btn7.setFont(fonte1);
		this.btn7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + "7");
			}
		});
		this.btn8.setBounds(60, 55, 50, 50);
		this.btn8.setFont(fonte1);
		this.btn8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + "8");
			}
		});
		this.btn9.setBounds(115, 55, 50, 50);
		this.btn9.setFont(fonte1);
		this.btn9.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + "9");
			}
		});
		
		this.btnMais.setBounds(170, 55, 50, 50);
		this.btnMais.setFont(fonte1);
		this.btnMais.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String texto = display.getText();
				if(!texto.isEmpty() && !texto.endsWith("+") && !texto.endsWith("-") && !texto.endsWith("/") && !texto.endsWith("*")) {
					display.setText(display.getText() + "+");
				};
				
				
			}
		});
		
		this.btn4.setBounds(5, 110, 50, 50);
		this.btn4.setFont(fonte1);
		this.btn4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + "4");
			}
		});
		this.btn5.setBounds(60, 110, 50, 50);
		this.btn5.setFont(fonte1);
		this.btn5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + "5");
			}
		});
		this.btn6.setBounds(115, 110, 50, 50);
		this.btn6.setFont(fonte1);
		this.btn6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + "6");
			}
		});
		
		this.btnMenos.setBounds(170, 110, 50, 50);
		this.btnMenos.setFont(fonte1);
		this.btnMenos.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String texto = display.getText();
				if(!texto.isEmpty() && !texto.endsWith("-") && !texto.endsWith("+") && !texto.endsWith("/") && !texto.endsWith("*")) {
					display.setText(display.getText() + "-");
				};
			}
		});
		
		this.btn1.setBounds(5, 165, 50, 50);
		this.btn1.setFont(fonte1);
		this.btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + "1");
			}
		});
		this.btn2.setBounds(60, 165, 50, 50);
		this.btn2.setFont(fonte1);
		this.btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + "2");
			}
		});
		this.btn3.setBounds(115, 165, 50, 50);
		this.btn3.setFont(fonte1);
		this.btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + "3");
			}
		});
		
		this.btnMulti.setBounds(170, 165, 50, 50);
		this.btnMulti.setFont(fonte1);
		this.btnMulti.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String texto = display.getText();
				if(!texto.isEmpty() && !texto.endsWith("-") && !texto.endsWith("+") && !texto.endsWith("/") && !texto.endsWith("*")) {
					display.setText(display.getText() + "*");
				};
			}
		});
		
		
		this.btn0.setBounds(5, 220, 50, 50);
		this.btn0.setFont(fonte1);
		this.btn0.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + "0");
			}
		});
		this.btnPonto.setBounds(60, 220, 50, 50);
		this.btnPonto.setFont(fonte1);
		this.btnPonto.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + ".");
			}
		});
		this.btnTrocaValor.setBounds(115, 220, 50, 50);
		this.btnTrocaValor.setFont(fonte1);
		this.btnTrocaValor.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + "false");
			}
		});
		
		this.btnDivisao.setBounds(170, 220, 50, 50);
		this.btnDivisao.setFont(fonte1);
		this.btnDivisao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String texto = display.getText();
				if(!texto.isEmpty() && !texto.endsWith("-") && !texto.endsWith("+") && !texto.endsWith("/") && !texto.endsWith("*")) {
					display.setText(display.getText() + "/");
				};
			}
		});
		this.btnIgual.setBounds(5, 275, 215, 50);
		this.btnIgual.setFont(fonte1);
		this.btnIgual.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + "true");
			}
		});
		
		this.janela.add(display);
		this.janela.add(btn7);
		this.janela.add(btn8);
		this.janela.add(btn9);
		this.janela.add(btnMais);

		this.janela.add(btn4);
		this.janela.add(btn5);
		this.janela.add(btn6);
		this.janela.add(btnMenos);
		
		this.janela.add(btn1);
		this.janela.add(btn2);
		this.janela.add(btn3);
		this.janela.add(btnMulti);
		
		this.janela.add(btn0);
		this.janela.add(btnPonto);
		this.janela.add(btnTrocaValor);
		this.janela.add(btnDivisao);
		
		this.janela.add(btnIgual);

		this.janela.setVisible(true);
		
		
		
	}
}