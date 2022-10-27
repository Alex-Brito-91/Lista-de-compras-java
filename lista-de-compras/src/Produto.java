import java.math.BigDecimal;

public class Produto {

	String nome;
	BigDecimal preco;
	int quantidade;

	public Produto(String nome, BigDecimal preco, int quantidade) {

		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;

	}

	@Override
	public String toString() {
		return "|   Produto: " + nome + "     |   Preço: " + preco + "     |   Quant: " + quantidade + "     |";
	}

	public static Object format(String string, Produto i) {
		return null;
	} 

}
