package itens;

public abstract class BluRay extends Item{
	protected int duracao;
	protected String classificacao;
	
	public BluRay(String nomeItem, double preco, int duracao,String classificacao){
		super(nomeItem, preco);
		this.duracao = duracao;
		this.classificacao = classificacao;
	}

}
