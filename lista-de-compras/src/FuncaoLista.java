import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class FuncaoLista {

	public static List<Produto> produtos = new ArrayList<>();
	
	public static List<Produto> cadastrar() {
		String opcao = "";
		int geraCodigo = 0;
		while (!"N".equalsIgnoreCase(opcao)) {
			Produto p = new Produto();
			p.setId(++geraCodigo);
			Scanner scanner = new Scanner(System.in);
			System.out.print("DIGITE O NOME DO PRODUTO: ");
			p.setNome(scanner.nextLine());
			System.out.print("DIGITE A QUANTIDADE: ");
			p.setQuantidade(scanner.nextInt());
			System.out.print("DIGITE O VALOR: ");
			p.setValorUnitario(scanner.nextBigDecimal());
			p.setValorTotal(p.getValorUnitario().multiply(BigDecimal.valueOf(p.getQuantidade())));
			produtos.add(p);
			System.out.println("DESEJA CONTINUAR CADASTRANDO? DIGITE [S] PARA CONTINUAR OU [N] PARA ENCERRAR");
			opcao = scanner.next();
		}
		return produtos;

	}
	
	public static void excluir() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("DIGITE O NÚMERO DO ITEM QUE DESEJA EXCLUIR: ");
		Integer id = scanner.nextInt();
		
		Iterator<Produto> it = produtos.iterator();
		
		while (it.hasNext()) {
			Produto p = it.next();
			
			if (p.getId() == id) {
				it.remove();
			}
		}
		System.out.println("REMOVIDO COM SUCESSO! \n");
	}

	public static void limparLista() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("DESEJA LIMPAR A LISTA? DIGITE: [S] PARA CONTINUAR E [N] PARA CANCELAR");
		String limpar = scanner.next();
		if ("S".equalsIgnoreCase(limpar)) {
			produtos.clear();
		}
		System.out.println("LISTA REMOVIDA! \n");
	}
	
	public static void totalCompra() {
		BigDecimal total = new BigDecimal(0);
		for (Produto i : produtos) {
			total = total.add(i.getValorTotal());
		}
		System.out.println("\n        VALOR TOTAL DA COMPRA: " +total+ "\n");
	}

	public static void exibirLista(Produto produto) {
		for (Produto i : produtos) {
			System.out.println(i);
		}
		BigDecimal total = new BigDecimal(0);
		for (Produto i : produtos) {
			total = total.add(i.getValorTotal());
		}
		System.out.println("\n        VALOR TOTAL DA COMPRA: " +total+ "\n");
	}

}
