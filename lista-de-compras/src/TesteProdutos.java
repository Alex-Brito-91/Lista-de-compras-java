import java.math.BigDecimal;
import java.util.Arrays;

public class TesteProdutos {
	
	public static void main(String[] args) {
		
		ListaProdutos lista = new ListaProdutos();
		
		lista.produto.add(new String("arroz"));
		lista.produto.add(new String("feijao"));
		lista.produto.add(new String("oleo"));
		lista.produto.add(new String("leite"));
		lista.produto.add(new String("pao"));
		lista.produto.add(new String("macarrao"));
		
		lista.preco.add(new BigDecimal(22.50));
		lista.preco.add(new BigDecimal(6.50));
		lista.preco.add(new BigDecimal(7.50));
		lista.preco.add(new BigDecimal(4.50));
		lista.preco.add(new BigDecimal(8.50));
		lista.preco.add(new BigDecimal(3.50));
		
		lista.quantidade.add(1);
		lista.quantidade.add(2);
		lista.quantidade.add(2);
		lista.quantidade.add(6);
		lista.quantidade.add(1);
		lista.quantidade.add(4);
		
		Arrays.toString(lista.produto.toArray());
		Arrays.toString(lista.preco.toArray());
		Arrays.toString(lista.quantidade.toArray());
		
		System.out.println(Arrays.toString(lista.produto.toArray()));
		System.out.println(Arrays.toString(lista.preco.toArray()));
		System.out.println(Arrays.toString(lista.quantidade.toArray()));
		
		System.out.println(lista.produto.contains("pao"));
		
		boolean removido = lista.produto.remove("pao");
		
		System.out.println(removido);
		System.out.println(lista.produto.contains("pao"));
		
		
	}

}
