

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class TelaCompras1 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblQuantidade;
	private JTextField textField_2;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCompras1 window = new TelaCompras1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public TelaCompras1() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblProduto = new JLabel("Produto:");
		lblProduto.setBounds(53, 24, 70, 15);
		frame.getContentPane().add(lblProduto);
		
		textField = new JTextField();
		textField.setBounds(127, 22, 114, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblValorUnitrio = new JLabel("Valor Unitário:");
		lblValorUnitrio.setBounds(13, 58, 110, 15);
		frame.getContentPane().add(lblValorUnitrio);
		
		textField_1 = new JTextField();
		textField_1.setBounds(127, 57, 114, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		lblQuantidade = new JLabel("Quantidade:");
		lblQuantidade.setBounds(28, 90, 90, 15);
		frame.getContentPane().add(lblQuantidade);
		
		textField_2 = new JTextField();
		textField_2.setBounds(127, 90, 114, 19);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnC = new JButton("Cadastrar");
		btnC.setBounds(300, 22, 117, 25);
		frame.getContentPane().add(btnC);
	}
}
