package tt;

public class BluRayFilme extends BluRay {
	protected String genero;
	protected int anoLancamento;

	public BluRayFilme(double preco, String nomeItem, int duracao, String classificacao, String genero, int anoLancamento) {
		super(preco, nomeItem, duracao, classificacao);
		this.genero = genero;
		this.anoLancamento = anoLancamento;
	}

}
