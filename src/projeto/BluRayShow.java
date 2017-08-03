package projeto;

public class BluRayShow extends BluRay{
	private int numeroFaixas;
	private String artista;
	public BluRayShow(double preco, String nomeItem, int duracao,String classificacao, int numeroFaixas, String artista){
		super(preco, nomeItem, duracao, classificacao);
		this.numeroFaixas = numeroFaixas;
		this.artista = artista;
		
	}

}
