import java.math.BigDecimal;

public class Produto {

	int numero;
	String nome;
	int quantidade;
	BigDecimal valorUnitario;
	BigDecimal valorTotal;

	@Override
	public String toString() {
		return "|   Produto nº: ["+numero+"]   "
				+ "Nome: "+nome+"   |   "
				+ "Quant: "+quantidade+"   |   "
				+ "Valor Un: R$"+valorUnitario+"   |   "
				+ "Valor Total: R$"+valorTotal+"   |";
	}

}
