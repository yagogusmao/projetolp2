package itens;

public class BluRaySerie extends BluRay {
	private String genero;
	private int temporada;

	public BluRaySerie(String nomeItem, double preco, int duracao, String classificacao, String genero, int temporada) {
		super(nomeItem, preco, duracao, classificacao);
		this.genero = genero;
		this.temporada = temporada;

	}
}
