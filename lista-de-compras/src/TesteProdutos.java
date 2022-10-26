import java.util.Arrays;
import java.util.Scanner;

public class TesteProdutos {
	
	public static void main(String[] args) {
		
		ListaProdutos lista = new ListaProdutos();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira um produto: ");
		lista.produto.add(entrada.nextLine());

		System.out.print("Insira o valor: ");
		lista.preco.add(entrada.nextBigDecimal());
		
		System.out.print("Insira a quantidade: ");
		lista.quantidade.add(entrada.nextInt());
		
		Arrays.toString(lista.produto.toArray());
		Arrays.toString(lista.preco.toArray());
		Arrays.toString(lista.quantidade.toArray());
		
		System.out.println(Arrays.toString(lista.produto.toArray()));
		System.out.println(Arrays.toString(lista.preco.toArray()));
		System.out.println(Arrays.toString(lista.quantidade.toArray()));
		
		System.out.println(lista.produto.contains("arroz"));
		
	}

}
