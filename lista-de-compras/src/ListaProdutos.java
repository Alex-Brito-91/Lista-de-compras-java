import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;

public class ListaProdutos extends JFrame {

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
		setSize(400, 400);

		JTable tabela = new JTable();

		String[][] objetos = { { "01", "arroz", "2", "21,50", "43,00" }, { "02", "feijão", "2", "6,50", "13,00" },
				{ "03", "leite", "4", "5,00", "20,00" } };
		String[] colunas = { "ID", "Produto", "Quant", "Valor UN", "Valor Total" };

		DefaultTableModel modelo = (new DefaultTableModel(objetos, colunas) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		});
		tabela.setModel(modelo);

		JScrollPane scroll = new JScrollPane(tabela);

		getContentPane().add(scroll);
		setVisible(true);
	}
}
