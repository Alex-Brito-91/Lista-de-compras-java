import java.math.BigDecimal;

public class Produto {

	private int numero;
	private String nome;
	private int quantidade;
	private BigDecimal valorUnitario;
	private BigDecimal valorTotal;
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(BigDecimal valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

	@Override
	public String toString() {
		return "|   Produto nº: ["+numero+"]   "
				+ "Nome: "+nome+"   |   "
				+ "Quant: "+quantidade+"   |   "
				+ "Valor Un: R$"+valorUnitario+"   |   "
				+ "Valor Total: R$"+valorTotal+"   |";
	}

}
