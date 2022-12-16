import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class CadastroProdutos extends JFrame {

	private JPanel painelCadastro;
	private JTextField textProduto;
	private JTextField textValorUn;
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
					CadastroProdutos frame = new CadastroProdutos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public CadastroProdutos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		painelCadastro = new JPanel();
		painelCadastro.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(painelCadastro);
		painelCadastro.setLayout(null);
		
		JLabel lblProduto = new JLabel("Produto:");
		lblProduto.setBounds(48, 24, 70, 15);
		painelCadastro.add(lblProduto);
		
		textProduto = new JTextField();
		textProduto.setBounds(112, 19, 114, 25);
		painelCadastro.add(textProduto);
		textProduto.setColumns(10);
		
		JLabel lblQuantidade = new JLabel("Quantidade:");
		lblQuantidade.setBounds(23, 90, 90, 15);
		painelCadastro.add(lblQuantidade);
		
		SpinnerModel quant = new SpinnerNumberModel(1,1,20,1);
		JSpinner spinnerQuantidade = new JSpinner(quant);
		spinnerQuantidade.setBounds(112, 84, 41, 26);
		painelCadastro.add(spinnerQuantidade);
		
		JLabel lblValor = new JLabel("Valor Un:");
		lblValor.setBounds(45, 58, 110, 15);
		painelCadastro.add(lblValor);
		
		textValorUn = new JTextField();
		textValorUn.setBounds(112, 51, 114, 25);
		painelCadastro.add(textValorUn);
		textValorUn.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int geraCodigo = 0;
				Produto p = new Produto();

				p.setId(++geraCodigo);

				String nome = textProduto.getText();
				Integer quantidade = Integer.parseInt(spinnerQuantidade.getValue().toString());
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
		painelCadastro.add(btnCadastrar);
		
		JButton btnExibirLista = new JButton("exibir lista");
		btnExibirLista.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ListaProdutos lista = new ListaProdutos();
				lista.setVisible(true);
				dispose();
			}
		});
		btnExibirLista.setBounds(162, 196, 125, 25);
		painelCadastro.add(btnExibirLista);
		
	}
}
