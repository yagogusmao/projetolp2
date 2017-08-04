package itens;

public class BluRayFilme extends BluRay {
	private String genero;
	private int anoLancamento;

	public BluRayFilme(String nomeItem, double preco, int duracao, String classificacao, String genero, int anoLancamento) {
		super(nomeItem, preco, duracao, classificacao);
		this.genero = genero;
		this.anoLancamento = anoLancamento;
	}

}
