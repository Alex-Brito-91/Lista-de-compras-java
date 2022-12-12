
import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JSpinner;

public class TelaCadastro {

	private JFrame frameCadastro;
	private JTextField textProduto;
	private JTextField textValorUn;
	private JLabel lblQuantidade;
	private JSpinner spinner;

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
					TelaCadastro window = new TelaCadastro();
					window.frameCadastro.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public TelaCadastro() {
		initialize();
	}

	private void initialize() {
		frameCadastro = new JFrame();
		frameCadastro.setBounds(100, 100, 450, 300);
		frameCadastro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameCadastro.getContentPane().setLayout(null);

		JLabel lblProduto = new JLabel("Produto:");
		lblProduto.setBounds(48, 24, 70, 15);
		frameCadastro.getContentPane().add(lblProduto);

		textProduto = new JTextField();
		textProduto.setBounds(112, 19, 114, 25);
		frameCadastro.getContentPane().add(textProduto);
		textProduto.setColumns(10);

		JLabel lblValorUnitrio = new JLabel("Valor Unitário:");
		lblValorUnitrio.setBounds(7, 58, 110, 15);
		frameCadastro.getContentPane().add(lblValorUnitrio);

		textValorUn = new JTextField();
		textValorUn.setBounds(112, 51, 114, 25);
		frameCadastro.getContentPane().add(textValorUn);
		textValorUn.setColumns(10);

		lblQuantidade = new JLabel("Quantidade:");
		lblQuantidade.setBounds(23, 90, 90, 15);
		frameCadastro.getContentPane().add(lblQuantidade);
		
		SpinnerModel sm = new SpinnerNumberModel(1,1,20,1);
		spinner = new JSpinner(sm);
		spinner.setBounds(112, 84, 41, 26);
		frameCadastro.getContentPane().add(spinner);

		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				int geraCodigo = 0;
				Produto p = new Produto();

				p.setId(++geraCodigo);

				String nome = textProduto.getText();
				Integer quantidade = Integer.parseInt(spinner.getValue().toString());
				BigDecimal valorUnitario = new BigDecimal(textValorUn.getText());
				BigDecimal valorTotal = valorUnitario.multiply(BigDecimal.valueOf(quantidade));

				p.setNome(nome);
				p.setQuantidade(quantidade);
				p.setValorUnitario(valorUnitario);
				p.setValorTotal(valorTotal);

				produtos.add(p);

				JOptionPane.showMessageDialog(null, "Produto " + textProduto.getText() + " cadastrado com sucesso!");

			}

		});
		btnCadastrar.setBounds(300, 22, 117, 25);
		frameCadastro.getContentPane().add(btnCadastrar);
		
		JButton btnListaButton = new JButton("exibir lista");
		
		btnListaButton.setBounds(162, 196, 125, 25);
		frameCadastro.getContentPane().add(btnListaButton);

	}
}
