import java.util.List;

public class TesteProduto {

	public static void main(String[] args) {

		Produto produto = new Produto();
		List<Produto> listaProdutos = FuncaoLista.cadastra();
		FuncaoLista.imprimir(produto);
		FuncaoLista.excluir();
		FuncaoLista.imprimir(produto);

	}

}
