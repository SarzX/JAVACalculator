package calc;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Toolkit;

public class Calc extends JFrame {

	/**
	 * UI calculator 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Cdisplay;
	
	//Initialized our variables for calculations
	double num1;
	double num2;
	double result;
	String operation;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc frame = new Calc();
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
	public Calc() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\maxim\\Desktop\\ICON.png"));
		setTitle("MAX CALCULATIONS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 493, 727);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setForeground(Color.BLACK);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		Cdisplay = new JTextField();
		Cdisplay.setEditable(false);
		Cdisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		Cdisplay.setFont(new Font("Arial", Font.BOLD, 40));
		Cdisplay.setBounds(12, 13, 441, 80);
		panel.add(Cdisplay);
		Cdisplay.setColumns(10);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String inputNum = Cdisplay.getText() + btn4.getText();
				Cdisplay.setText(inputNum);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 32));
		btn4.setBounds(33, 239, 90, 90);
		panel.add(btn4);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String inputNum = Cdisplay.getText() + btn2.getText();
				Cdisplay.setText(inputNum);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 32));
		btn2.setBounds(135, 136, 90, 90);
		panel.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String inputNum = Cdisplay.getText() + btn3.getText();
				Cdisplay.setText(inputNum);
				
			}
		});
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 32));
		btn3.setBounds(237, 136, 90, 90);
		panel.add(btn3);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String inputNum = Cdisplay.getText() + btn5.getText();
				Cdisplay.setText(inputNum);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 32));
		btn5.setBounds(135, 239, 90, 90);
		panel.add(btn5);
		
		JButton btn1 = new JButton("1");
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 32));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String inputNum = Cdisplay.getText() + btn1.getText();
				Cdisplay.setText(inputNum);
			}
		});
		btn1.setBounds(33, 136, 90, 90);
		panel.add(btn1);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String inputNum = Cdisplay.getText() + btn6.getText();
				Cdisplay.setText(inputNum);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 32));
		btn6.setBounds(237, 239, 90, 90);
		panel.add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String inputNum = Cdisplay.getText() + btn7.getText();
				Cdisplay.setText(inputNum);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 32));
		btn7.setBounds(33, 342, 90, 90);
		panel.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String inputNum = Cdisplay.getText() + btn8.getText();
				Cdisplay.setText(inputNum);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 32));
		btn8.setBounds(135, 342, 90, 90);
		panel.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String inputNum = Cdisplay.getText() + btn9.getText();
				Cdisplay.setText(inputNum);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 32));
		btn9.setBounds(237, 342, 90, 90);
		panel.add(btn9);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num1 = Double.parseDouble(Cdisplay.getText());
				Cdisplay.setText("");
				operation = "+";
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.PLAIN, 32));
		btnPlus.setBounds(339, 136, 90, 90);
		panel.add(btnPlus);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num1 = Double.parseDouble(Cdisplay.getText());
				Cdisplay.setText("");
				operation = "-";
			}
		});
		btnMinus.setFont(new Font("Tahoma", Font.PLAIN, 32));
		btnMinus.setBounds(339, 239, 90, 90);
		panel.add(btnMinus);
		
		JButton btnMultiple = new JButton("*");
		btnMultiple.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num1 = Double.parseDouble(Cdisplay.getText());
				Cdisplay.setText("");
				operation = "*";
			}
		});
		btnMultiple.setFont(new Font("Tahoma", Font.PLAIN, 32));
		btnMultiple.setBounds(339, 342, 90, 90);
		panel.add(btnMultiple);
		
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num1 = Double.parseDouble(Cdisplay.getText());
				Cdisplay.setText("");
				operation = "/";
			}
		});
		btnDivide.setFont(new Font("Tahoma", Font.PLAIN, 32));
		btnDivide.setBounds(339, 447, 90, 90);
		panel.add(btnDivide);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String input = Cdisplay.getText();
				char [] checkDots = input.toCharArray();
				int dots = 0;
				
				for (char a : checkDots)
				{
					if (a == '.')
					{
					dots++;	
					}
				}
				if (dots == 0)
				{
					String inputNum = input + btnDot.getText();
					Cdisplay.setText(inputNum);
				}
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.PLAIN, 32));
		btnDot.setBounds(237, 447, 90, 90);
		panel.add(btnDot);
		
		JButton btnZero = new JButton("0");
		btnZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String inputNum = Cdisplay.getText() + btnZero.getText();
				Cdisplay.setText(inputNum);
			}
		});
		btnZero.setFont(new Font("Tahoma", Font.PLAIN, 32));
		btnZero.setBounds(135, 447, 90, 90);
		panel.add(btnZero);
		
		JButton btnPlusMinus = new JButton("+/-");
		btnPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double plusminus = Double.parseDouble(String.valueOf(Cdisplay.getText()));
				plusminus = plusminus * (-1); 
				Cdisplay.setText(String.valueOf(plusminus));
			}
		});
		btnPlusMinus.setFont(new Font("Tahoma", Font.PLAIN, 32));
		btnPlusMinus.setBounds(33, 447, 90, 90);
		panel.add(btnPlusMinus);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num2 = Double.parseDouble(Cdisplay.getText());
				String total;
				
				if (operation == "+")
				{
					result = num1 + num2;
//					total = String.format("%.2f", result);
//					Cdisplay.setText(total);
				}
				
				else if (operation == "-")
				{
					result = num1 - num2;
//					total = String.format("%.2f", result);
//					Cdisplay.setText(total);
				}
				else if (operation == "*")
				{
					result = num1 * num2;
//					total = String.format("%.2f", result);
//					Cdisplay.setText(total);
				}
				else if (operation == "/")
				{
					result = num1 / num2;
//					total = String.format("%.2f", result);
//					Cdisplay.setText(total);
				}
				total = String.format("%.2f", result);
				Cdisplay.setText(total);
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.PLAIN, 32));
		btnEqual.setBounds(33, 550, 294, 90);
		panel.add(btnEqual);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Cdisplay.setText("");
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 32));
		btnClear.setBounds(339, 550, 90, 90);
		panel.add(btnClear);
	}
}
