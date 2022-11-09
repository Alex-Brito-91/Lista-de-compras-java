import java.util.List;
import java.util.Scanner;

public class MenuLista {
	
	public static void textBlocksMenu() {
		
		String query = """
				
				LISTA DE COMPRAS
				
				MENU DE OPÇÕES: [1]CADASTRAR ITENS | [2]IMPRIMIR LISTA | [3]EXIBIR TOTAL DA COMPRA | [4]EXCLUIR ITEM | [5]LIMPAR LISTA | [6]SAIR
														
				DIGITE A OPÇÃO DESEJADA:
				
				""";
		System.out.println(query);
	}
	
	public static void criarMenu() {
		
		Produto produto = new Produto();
		List<Produto> listaProdutos;
		int sair = 0;
		int opcaoMenu = 0;
		Scanner scanner = new Scanner(System.in);
		
		do {
			
			textBlocksMenu();
			
			opcaoMenu = scanner.nextInt();
			
			switch (opcaoMenu) {
			
			case 1:
				listaProdutos = FuncaoLista.cadastrar();
				break;
			case 2:
				FuncaoLista.imprimir(produto);
				break;
			case 3:
				FuncaoLista.totalCompra();
				break;
			case 4:
				FuncaoLista.excluir();
				break;
			case 5:
				FuncaoLista.limparLista();
				break;
			case 6:
				System.out.println("SAINDO DA LISTA DE COMPRAS");
				sair = 6;
				break;
			default:
				System.out.println("OPÇÃO INVALIDA");
				
			}
			
		} while (sair != 6);
		
	}
	

}

