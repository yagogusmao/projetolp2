package projeto;

public abstract class BluRay extends Item{
	protected int duracao;
	protected String classificacao;
	
	public BluRay(double preco, String nomeItem, int duracao,String classificacao){
		super(preco, nomeItem);
		this.duracao = duracao;
		this.classificacao = classificacao;
	}

}
