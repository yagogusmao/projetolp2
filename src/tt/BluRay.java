package tt;

public abstract class BluRay extends Item{
	private int duracao;

	private String classificacao;
	
	public BluRay(double preco, String nomeItem, int duracao,String classificacao){
		super(preco, nomeItem);
		this.duracao = duracao;
		this.classificacao = classificacao;
	}

}
