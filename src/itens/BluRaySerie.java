package itens;

public class BluRaySerie extends BluRay {
	private String genero;
	private int temporada;

	public BluRaySerie(double preco, String nomeItem, int duracao, String classificacao, String genero, int temporada) {
		super(preco, nomeItem, duracao, classificacao);
		this.genero = genero;
		this.temporada = temporada;

	}
}
