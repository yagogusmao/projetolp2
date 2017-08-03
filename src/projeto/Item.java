package projeto;

public abstract class Item {
	protected double preco;
	protected String nome;
	
	public Item(double preco, String nome){
		this.preco = preco;
		this.nome = nome;
	}

}
