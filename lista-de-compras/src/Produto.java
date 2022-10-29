import java.math.BigDecimal;

public class Produto {

	int numero;
	String nome;
	BigDecimal preco;
	int quantidade;

	public Produto(int numero, String nome, BigDecimal preco, int quantidade) {

		this.numero = numero;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;

	}

	@Override
	public String toString() {
		return "|   Produto nº: [" + numero + "]   Nome: " + nome + "     |   Preço: " + preco + "     |   Quant: " + quantidade + "     |";
	}


}
