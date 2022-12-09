
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class TelaCompras1 {

	private JFrame frame;
	private JTextField textProduto;
	private JTextField textValorUn;
	private JLabel lblQuantidade;
	private JTextField textQuantidade;

	public static List<Produto> produtos = new ArrayList<>();

	public static void main(String[] args) {

		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Metal".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}

		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| javax.swing.UnsupportedLookAndFeelException ex) {
			System.err.println(ex);
		}

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

		textProduto = new JTextField();
		textProduto.setBounds(127, 22, 114, 19);
		frame.getContentPane().add(textProduto);
		textProduto.setColumns(10);

		JLabel lblValorUnitrio = new JLabel("Valor Unitário:");
		lblValorUnitrio.setBounds(13, 58, 110, 15);
		frame.getContentPane().add(lblValorUnitrio);

		textValorUn = new JTextField();
		textValorUn.setBounds(127, 57, 114, 19);
		frame.getContentPane().add(textValorUn);
		textValorUn.setColumns(10);

		lblQuantidade = new JLabel("Quantidade:");
		lblQuantidade.setBounds(28, 90, 90, 15);
		frame.getContentPane().add(lblQuantidade);

		textQuantidade = new JTextField();
		textQuantidade.setBounds(127, 90, 114, 19);
		frame.getContentPane().add(textQuantidade);
		textQuantidade.setColumns(10);

		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					
				int geraCodigo = 0;
				Produto p = new Produto();
				
				String nome = textProduto.getText();
				Integer quantidade = Integer.parseInt(textQuantidade.getText());
				BigDecimal valorUnitario = new BigDecimal(textValorUn.getText());
				BigDecimal valorTotal = valorUnitario.multiply(BigDecimal.valueOf(quantidade));
				
				JOptionPane.showMessageDialog(null, "Produto " + textProduto.getText() + " cadastrado com sucesso!");

			}
			
		});btnCadastrar.setBounds(300,22,117,25);frame.getContentPane().add(btnCadastrar);
}
}
