package itens;

public abstract class Item {
	protected double preco;
	protected String nome;
	
	public Item(double preco, String nome){
		this.preco = preco;
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	

}