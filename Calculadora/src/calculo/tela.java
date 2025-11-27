package calculo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class tela {

	private JFrame frmCalculadora;
	private JTextField txtField;
	double numero1;
	double numero2;
	double resultado;
	String operacao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tela window = new tela();
					window.frmCalculadora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public tela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadora = new JFrame();
		frmCalculadora.setIconImage(Toolkit.getDefaultToolkit().getImage(tela.class.getResource("/imagem/png-clipart-windows-calculator-windows-7-windows-aero-window-electronics-furniture-thumbnail.png")));
		frmCalculadora.setTitle("Calculadora");
		frmCalculadora.getContentPane().setBackground(new Color(0, 0, 0));
		frmCalculadora.setBounds(100, 100, 355, 360);
		frmCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadora.getContentPane().setLayout(null);
		
		txtField = new JTextField();
		txtField.setHorizontalAlignment(SwingConstants.TRAILING);
		txtField.setFont(new Font("Arial Black", Font.PLAIN, 18));
		txtField.setBounds(28, 11, 283, 40);
		frmCalculadora.getContentPane().add(txtField);
		txtField.setColumns(10);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText("");
				txtField.grabFocus();
			}
		});
		btnC.setFont(new Font("Arial Black", Font.PLAIN, 18));
		btnC.setBounds(248, 56, 63, 40);
		frmCalculadora.getContentPane().add(btnC);
		
		JButton btnsoma = new JButton("+");
		btnsoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao = "+";
				txtField.grabFocus();
			}
		});
		btnsoma.setFont(new Font("Arial Black", Font.PLAIN, 18));
		btnsoma.setBounds(248, 107, 63, 40);
		frmCalculadora.getContentPane().add(btnsoma);
		
		JButton btnsub = new JButton("-");
		btnsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao = "-";
				txtField.grabFocus();
			}
		});
		btnsub.setFont(new Font("Arial Black", Font.PLAIN, 18));
		btnsub.setBounds(248, 158, 63, 40);
		frmCalculadora.getContentPane().add(btnsub);
		
		JButton btnmult = new JButton("x");
		btnmult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao = "x";
				txtField.grabFocus();
			}
		});
		btnmult.setFont(new Font("Arial Black", Font.PLAIN, 18));
		btnmult.setBounds(248, 209, 63, 40);
		frmCalculadora.getContentPane().add(btnmult);
		
		JButton btndiv = new JButton("/");
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao = "/";
				txtField.grabFocus();
			}
		});
		btndiv.setFont(new Font("Arial Black", Font.PLAIN, 18));
		btndiv.setBounds(248, 259, 63, 40);
		frmCalculadora.getContentPane().add(btndiv);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText() + btn9.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn9.setFont(new Font("Arial Black", Font.PLAIN, 18));
		btn9.setBounds(177, 107, 63, 40);
		frmCalculadora.getContentPane().add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText() + btn6.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn6.setFont(new Font("Arial Black", Font.PLAIN, 18));
		btn6.setBounds(175, 158, 63, 40);
		frmCalculadora.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText() + btn3.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn3.setFont(new Font("Arial Black", Font.PLAIN, 18));
		btn3.setBounds(177, 209, 63, 40);
		frmCalculadora.getContentPane().add(btn3);
		
		JButton btnresu = new JButton("=");
		btnresu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selecionar;
				numero2 = Double.parseDouble(txtField.getText());
				if(operacao.equals("+")) {
					resultado = numero1+numero2;
					txtField.setText(String.valueOf(resultado));
				} else if(operacao.equals("-")) {
					resultado = numero1-numero2;
					txtField.setText(String.valueOf(resultado));
				} else if(operacao.equals("x")) {
					resultado = numero1*numero2;
					txtField.setText(String.valueOf(resultado));
				} else if(operacao.equals("/")) {
					if(numero2 == 0) {
						JOptionPane.showMessageDialog(null,"Erro... Divisão por 0!","ERROR",JOptionPane.WARNING_MESSAGE);
						txtField.grabFocus();
						return;
					} else {
						resultado = numero1/numero2;
						txtField.setText(String.valueOf(resultado));
					}
				}
			}
		});
		btnresu.setFont(new Font("Arial Black", Font.PLAIN, 18));
		btnresu.setBounds(175, 259, 63, 40);
		frmCalculadora.getContentPane().add(btnresu);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText() + btn8.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn8.setFont(new Font("Arial Black", Font.PLAIN, 18));
		btn8.setBounds(104, 107, 63, 40);
		frmCalculadora.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText() + btn5.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn5.setFont(new Font("Arial Black", Font.PLAIN, 18));
		btn5.setBounds(104, 158, 63, 40);
		frmCalculadora.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText() + btn2.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn2.setFont(new Font("Arial Black", Font.PLAIN, 18));
		btn2.setBounds(104, 209, 63, 40);
		frmCalculadora.getContentPane().add(btn2);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText() + btn0.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn0.setFont(new Font("Arial Black", Font.PLAIN, 18));
		btn0.setBounds(102, 259, 63, 40);
		frmCalculadora.getContentPane().add(btn0);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText() + btn7.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn7.setFont(new Font("Arial Black", Font.PLAIN, 18));
		btn7.setBounds(31, 107, 63, 40);
		frmCalculadora.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText() + btn4.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn4.setFont(new Font("Arial Black", Font.PLAIN, 18));
		btn4.setBounds(31, 158, 63, 40);
		frmCalculadora.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText() + btn1.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn1.setFont(new Font("Arial Black", Font.PLAIN, 18));
		btn1.setBounds(31, 209, 63, 40);
		frmCalculadora.getContentPane().add(btn1);
		
		JButton btnVirgula = new JButton(",");
		btnVirgula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ponto = ".";
				String IngressarNumero = txtField.getText() + ponto;
				txtField.setText(IngressarNumero);
			}
		});
		btnVirgula.setFont(new Font("Arial Black", Font.PLAIN, 18));
		btnVirgula.setBounds(31, 259, 63, 40);
		frmCalculadora.getContentPane().add(btnVirgula);
	}
}
