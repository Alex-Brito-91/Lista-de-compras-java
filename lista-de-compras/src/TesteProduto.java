import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteProduto {

	public static void main(String[] args) {

		List<Produto> produtos = new ArrayList<>();
		Scanner entrada = new Scanner(System.in);

		String exit = "";

		while (!"N".equalsIgnoreCase(exit)) {

			System.out.print("Digite o nome do Produto: ");
			String nome = entrada.next();

			System.out.print("Digite o Preço: ");
			BigDecimal preco = entrada.nextBigDecimal();

			System.out.print("Digite a quantidade: ");
			int quantidade = entrada.nextInt();

			Produto lista = new Produto(nome, preco, quantidade);
			produtos.add(lista);

			System.out.println("Deseja continuar cadastrando? Digite: [S] para continuar e [N] para encerrar");
			exit = entrada.next();

		}

		for (Produto s : produtos) {
			System.out.println(s);

		}

	}

}
