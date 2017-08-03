package projeto;

public class BluRayFilme extends BluRay {
	private String genero;
	private int anoLancamento;

	public BluRayFilme(double preco, String nomeItem, int duracao, String classificacao, String genero, int anoLancamento) {
		super(preco, nomeItem, duracao, classificacao);
		this.genero = genero;
		this.anoLancamento = anoLancamento;
	}

}
