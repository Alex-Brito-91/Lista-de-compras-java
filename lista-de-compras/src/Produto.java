
public class Produto {

	int numero;
	String nome;
	double preco;
	int quantidade;

	@Override
	public String toString() {
		return "|   Produto nº: [" + numero + "]   Nome: " + nome + "     |   Preço: " + preco + "     |   Quant: "
				+ quantidade + "     |";
	}

}
