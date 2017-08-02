package tt;

public class BluRaySerie extends BluRay {
	protected String genero;
	protected int temporada;

	public BluRaySerie(double preco, String nomeItem, int duracao, String classificacao, String genero, int temporada) {
		super(preco, nomeItem, duracao, classificacao);
		this.genero = genero;
		this.temporada = temporada;

	}
}
