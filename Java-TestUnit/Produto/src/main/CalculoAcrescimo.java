package QA.Produto;

public class CalculoAcrescimo {
	private double valorProduto;
	private double produtoAcrescido;
	private double porcentagem = .10;
	
	public CalculoAcrescimo () {}
	
	public CalculoAcrescimo (double produto) {
		this.valorProduto = produto;
		this.produtoAcrescido = valorProduto+(valorProduto * this.porcentagem);
		
	}
	
	public double acrescimo (double valorProduto) {
		
		if (valorProduto > 0) {
			return this.produtoAcrescido = valorProduto+(valorProduto * this.porcentagem); 
		}
		else 
			throw new RuntimeException("Número inválido, tente novamente.");
	}

	public double getValorProduto() {
		return valorProduto;
	}

	public void setValorProduto(double valorProduto) {
		this.valorProduto = valorProduto;
	}

	public double getProdutoAcrescido() {
		return produtoAcrescido;
	}

	public void setProdutoAcrescido(double produtoAcrescido) {
		this.produtoAcrescido = produtoAcrescido;
	}

	public double getPorcentagem() {
		return porcentagem;
	}

	public void setPorcentagem(double porcentagem) {
		this.porcentagem = porcentagem;
	}

	
}
