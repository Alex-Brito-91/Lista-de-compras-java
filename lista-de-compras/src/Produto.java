import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Produto {

	int numero;
	String nome;
	double preco;
	int quantidade;
	String opcao = "";

	public static List<Produto> produtos = new ArrayList<>();

	public Produto(String nome, double preco, int quantidade) {
		
	}


	public void cadastra() {

		while (!"N".equalsIgnoreCase(opcao)) {

			Scanner scanner = new Scanner(System.in);

			System.out.print("Digite o nome do produto: ");
			nome = scanner.next();

			System.out.print("Digite o valor: ");
			preco = scanner.nextDouble();

			System.out.print("Digite a quantidade: ");
			quantidade = scanner.nextInt();

			Produto produto = new Produto(nome, preco, quantidade);
			produtos.add(produto);

			System.out.println("Deseja continuar cadastrando? Digite [S] para continuar ou [N] para encerrar");
			opcao = scanner.next();

		}
		
		for (Produto i : produtos) {
			System.out.println(i);
		}

	}
	

//	public void imprime(List<Produto> produtos) {
//		for (Produto i : produtos) {
//			System.out.println(i);
//		}
//	}

	@Override
	public String toString() {
		return "|   Produto nº: [" + numero + "]   Nome: " + nome + "     |   Preço: " + preco + "     |   Quant: "
				+ quantidade + "     |";
	}

}
