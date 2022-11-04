import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FuncaoLista {

	public static List<Produto> produtos = new ArrayList<>();
	
	public static List<Produto> cadastrar() {
		String opcao = "";
		int geraCodigo = 0;
		while (!"N".equalsIgnoreCase(opcao)) {
			Produto p = new Produto();
			p.numero = ++geraCodigo;
			Scanner scanner = new Scanner(System.in);
			System.out.print("Digite o nome do produto: ");
			p.nome = scanner.next();
			System.out.print("Digite a quantidade: ");
			p.quantidade = scanner.nextInt();
			System.out.print("Digite o valor: ");
			p.valorUnitario = scanner.nextBigDecimal();
			p.valorTotal = p.valorUnitario.multiply(BigDecimal.valueOf(p.quantidade));
			produtos.add(p);
			System.out.println("Deseja continuar cadastrando? Digite [S] para continuar ou [N] para encerrar");
			opcao = scanner.next();
		}
		return produtos;

	}

	public static void excluir() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o número do item que deseja excluir: ");
		int excluir = scanner.nextInt();
		Produto produtoParaRemover = produtos.stream().filter(produto -> produto.numero == excluir).findFirst().get();
		produtos.remove(produtoParaRemover);
		System.out.println("removido com sucesso");
	}

	public static void limparLista() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Deseja limpar a lista? Digite: [S] para continuar e [N] para cancelar");
		String limpar = scanner.next();
		if ("S".equalsIgnoreCase(limpar)) {
			produtos.clear();
		}
	}
	
	public static void totalCompra() {
		BigDecimal total = new BigDecimal(0);
		for (Produto i : produtos) {
			total = total.add(i.valorTotal);
		}
		System.out.println("Valor total da compra: " + total);
	}

	public static void imprimir(Produto produto) {
		for (Produto i : produtos) {
			System.out.println(i);
		}
	}

}
