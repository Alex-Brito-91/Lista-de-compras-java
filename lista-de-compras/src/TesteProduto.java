import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteProduto {

	public static void main(String[] args) {

		List<Produto> produtos = new ArrayList<>();
		Scanner entrada = new Scanner(System.in);

		String exit = "";
		String limpar = "";
		int contador = 0;

		//Cadastrar itens na lista
		while (!"N".equalsIgnoreCase(exit)) {

			int numero = contador;
			numero++;

			System.out.print("Digite o nome do Produto: ");
			String nome = entrada.next();

			System.out.print("Digite o Preço: ");
			BigDecimal preco = entrada.nextBigDecimal();

			System.out.print("Digite a quantidade: ");
			int quantidade = entrada.nextInt();

			Produto lista = new Produto(numero, nome, preco, quantidade);
			produtos.add(lista);
			
			contador = numero;

			System.out.println("Deseja continuar cadastrando? Digite: [S] para continuar e [N] para encerrar");
			exit = entrada.next();
			
			//Exibir a lista
			for (Produto s : produtos) {
				System.out.println(s);

			}

		}

		

		//Excluir um item da lista
		System.out.print("Digite o número do item que deseja excluir: ");
		int excluir = entrada.nextInt();
		produtos.remove(excluir - 1);
		System.out.println("removido com sucesso");
		//Exibir a lista
		for (Produto s : produtos) {
			System.out.println(s);

		}
		

		//Limpar toda a lista
		System.out.println("Deseja limpar a lista? Digite: [S] para continuar e [N] para cancelar");
		limpar = entrada.next();
		if ("S".equalsIgnoreCase(limpar)) {
			produtos.removeAll(produtos);
			//Exibir a lista
			for (Produto s : produtos) {
				System.out.println(s);

			}

		}

	}

}
