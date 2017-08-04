
package projeto;

public class Facade {
	private UserController controladorDeUsuarios;

	public Facade() {

	}

	public void iniciarSistema() {
		this.controladorDeUsuarios = new UserController();
	}

	public void cadastrarUsuario(String nome, String telefone, String email) {
		this.controladorDeUsuarios.cadastrarUsuario(nome, telefone, email);
	}

	public String getInfoUsuario(String nome, String telefone, String atributo) {
		return this.controladorDeUsuarios.getInfoUsuario(nome, telefone, atributo);
	}

	public void removerUsuario(String nome, String telefone) {
		this.controladorDeUsuarios.removerUsuario(nome, telefone);
	}

	public void atualizarUsuario(String nome, String telefone, String atributo, String valor) {
		this.controladorDeUsuarios.atualizarUsuario(nome, telefone, atributo, valor);
	}

	public void cadastrarEletronico(String nome, String telefone, String nomeItem, double preco, String plataforma) {
		this.controladorDeUsuarios.cadastrarEletronico(nome, telefone, nomeItem, preco, plataforma);
	}

	public String getInfoItem(String nome, String telefone, String nomeItem, String atributo) {
		return this.controladorDeUsuarios.getInfoItem(nome, telefone, nomeItem, atributo);

	}

	public void cadastrarJogoTabuleiro(String nome, String telefone, String nomeItem, double preco) {
		this.controladorDeUsuarios.cadastrarTabuleiro(nome, telefone, nomeItem, preco);
	}

	public void adicionarPecaPerdida(String nome, String telefone, String nomeItem, String nomePeca) {
		this.controladorDeUsuarios.adicionarPecaPerdida(nome, telefone, nomeItem, nomePeca);
	}

	public void cadastrarBluRayFilme(String nome, String telefone, String nomeItem, double preco, int duracao,
			String genero, String classificacao, int anoLancamento) {
		this.controladorDeUsuarios.cadastrarBluRayFilme(nome, telefone, nomeItem, preco, duracao, classificacao, genero,
				anoLancamento);
	}

	public void cadastrarBluRayShow(String nome, String telefone, String nomeItem, double preco, int duracao,
			int numeroFaixas, String artista, String classificacao) {
		this.controladorDeUsuarios.cadastrarBluRayShow(nome, telefone, nomeItem, preco, duracao, classificacao,
				numeroFaixas, artista);
	}

	public void cadastrarBluRaySerie(String nome, String telefone, String nomeItem, double preco, String descricao,
			int duracao, String classificacao, String genero, int temporada) {
		this.controladorDeUsuarios.cadastrarBluRaySerie(nome, telefone, nomeItem, preco, duracao, classificacao, genero,
				temporada);
	}

	public void removerItem(String nome, String telefone, String nomeItem) {
		this.controladorDeUsuarios.removerItem(nome, telefone, nomeItem);
	}

	public void atualizarItem(String nome, String telefone, String nomeItem, String atributo, String valor) {
		this.controladorDeUsuarios.atualizarItem(nome, telefone, nomeItem, atributo, valor);
	}

	public void fecharSistema() {

	}
}