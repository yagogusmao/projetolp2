package itens;

public class BluRayShow extends BluRay{
	private int numeroFaixas;
	private String artista;
	public BluRayShow(String nomeItem, double preco, int duracao,String classificacao, int numeroFaixas, String artista){
		super(nomeItem, preco, duracao, classificacao);
		this.numeroFaixas = numeroFaixas;
		this.artista = artista;
		
	}

}
