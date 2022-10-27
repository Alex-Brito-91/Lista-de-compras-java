import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TesteProdutos {

	public static void main(String[] args) {

		ArrayList<ListaProdutos> produto = new ArrayList<>();
		Scanner entrada = new Scanner(System.in);

		String exit = "";

		while ("não".equalsIgnoreCase(exit)) {

			System.out.print("Digite o nome do Produto: ");
			String nome = entrada.next();

			System.out.print("Digite o Preço: ");
			BigDecimal preco = entrada.nextBigDecimal();

			System.out.print("Digite a quantidade: ");
			int quantidade = entrada.nextInt();

			ListaProdutos lista = new ListaProdutos(nome, preco, quantidade);
			produto.add(lista);

			System.out.println("Deseja continuar cadastrando? Digite: [sim] para continuar e [não] para encerrar");
			exit = entrada.next();

		}

		Arrays.toString(produto.toArray());
		System.out.println(produto);

	}

}
