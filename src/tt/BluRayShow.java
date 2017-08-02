package tt;

public class BluRayShow extends BluRay{
	protected int numeroFaixas;
	protected String artista;
	public BluRayShow(double preco, String nomeItem, int duracao,String classificacao, int numeroFaixas, String artista){
		super(preco, nomeItem, duracao, classificacao);
		this.numeroFaixas = numeroFaixas;
		this.artista = artista;
		
	}

}
