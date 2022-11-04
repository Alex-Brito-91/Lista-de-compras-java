import java.util.List;

public class TesteProduto {

	public static void main(String[] args) {

		Produto produto = new Produto();
		List<Produto> listaProdutos = FuncaoLista.cadastrar();
		FuncaoLista.imprimir(produto);
		FuncaoLista.excluir();
		FuncaoLista.imprimir(produto);
		
	}

}
