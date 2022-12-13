import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;

public class TelaLista {

	private JFrame frame;
	private JTable tableLista;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLista window = new TelaLista();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public TelaLista() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Object [][] dados = {
				{"arroz", "1", "21,50"},
				{"feijao", "2", "6,80"},
				{"leite", "6", "4,99"}
		};
		
		String [] colunas = {"Produto", "Quant.", "ValorUN"};
		
		tableLista = new JTable(dados, colunas);
		tableLista.setBounds(49, 34, 350, 200);
		frame.getContentPane().add(tableLista);
		
	}

}
