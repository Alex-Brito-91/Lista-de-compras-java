import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Produto {

	int numero;
	String nome;
	double preco;
	int quantidade;

	public static List<Produto> produtos = new ArrayList<>();

	public List<Produto> cadastra() {

		String opcao = "";
		int geraCodigo = 0;

		while (!"N".equalsIgnoreCase(opcao)) {

			Produto p = new Produto();
			p.numero = ++geraCodigo;

			Scanner scanner = new Scanner(System.in);

			System.out.print("Digite o nome do produto: ");
			p.nome = scanner.next();

			System.out.print("Digite o valor: ");
			p.preco = scanner.nextDouble();

			System.out.print("Digite a quantidade: ");
			p.quantidade = scanner.nextInt();

			produtos.add(p);

			System.out.println("Deseja continuar cadastrando? Digite [S] para continuar ou [N] para encerrar");
			opcao = scanner.next();

		}

		return produtos;

	}

	public void excluir() {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o número do item que deseja excluir: ");
		int excluir = scanner.nextInt();
		Produto produtoParaRemover = produtos.stream().filter(produto -> produto.numero == excluir).findFirst().get();
		produtos.remove(produtoParaRemover);
		System.out.println("removido com sucesso");

	}

	public void limparLista() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Deseja limpar a lista? Digite: [S] para continuar e [N] para cancelar");
		String limpar = scanner.next();
		if ("S".equalsIgnoreCase(limpar)) {
			produtos.clear();
		}
	}

	public void imprimir() {
		for (Produto i : produtos) {
			System.out.println(i);
		}
	}

	@Override
	public String toString() {
		return "|   Produto nº: [" + numero + "]   Nome: " + nome + "     |   Preço: " + preco + "     |   Quant: "
				+ quantidade + "     |";
	}

}
