import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;

public class ListaProdutos extends JFrame {

	private JPanel painelLista;
	private JTable tableLista;

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
					ListaProdutos frame = new ListaProdutos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ListaProdutos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		painelLista = new JPanel();
		painelLista.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(painelLista);
		painelLista.setLayout(null);
		
		Object [][] dados = {
				{"arroz", "1", "21,50"},
				{"feijao", "2", "6,80"},
				{"leite", "6", "4,99"}
		};
		
		String [] colunas = {"Produto", "Quant.", "ValorUN"};
		
		tableLista = new JTable(dados, colunas);
		tableLista.setBounds(27, 19, 393, 230);
		painelLista.add(tableLista);
	}
}
