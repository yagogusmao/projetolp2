package projeto;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * Controlador de usuario
 * 
 * @author Hugo, Felipe Mota
 *
 */
public class UserController {

	/**
	 * 
	 */
	private Map<UsuarioId, Usuario> usuarios;

	public UserController() {
		this.usuarios = new HashMap<UsuarioId, Usuario>();
	}
	
	private void verificaUsuarioInvalido(String nome, String telefone){
		if (!this.existeUsuario(nome, telefone))
			throw new IllegalArgumentException("Usuario invalido");
	}
	
	private void verificaUsuarioJaCadastrado(String nome, String telefone){
		if (this.existeUsuario(nome, telefone)) 
			throw new IllegalArgumentException("Usuario ja cadastrado");
	}

	/**
	 * Cadastrar usuario
	 * 
	 * @param nome
	 *            Nome do usuario
	 * @param telefone
	 *            Telefone do usuario
	 * @param email
	 *            Email do usuario
	 */
	public void cadastrarUsuario(String nome, String telefone, String email) {

		this.verificaUsuarioJaCadastrado(nome, telefone);
		this.usuarios.put(new UsuarioId(nome, telefone), new Usuario(nome, telefone, email));
	}

	/**
	 * Remover usuario
	 * 
	 * @param nome
	 *            Nome do usuario
	 * @param telefone
	 *            Telefone do usuario
	 */
	public void removerUsuario(String nome, String telefone) {

		this.verificaUsuarioInvalido(nome, telefone);

		this.usuarios.remove(new UsuarioId(nome, telefone));
	}

	/**
	 * Atualizar atributo de usuario
	 * 
	 * @param nome
	 *            Nome do usuario
	 * @param telefone
	 *            Telefone do usuario
	 * @param atributo
	 *            Atributo do usuario que deve ser modificado
	 * @param valor
	 *            Novo valor que o atributo deve receber
	 */
	public void atualizarUsuario(String nome, String telefone, String atributo, String valor) {

		this.verificaUsuarioInvalido(nome, telefone);

		Usuario usuario = usuarios.get(new UsuarioId(nome, telefone)); // pegando
																		// o
																		// usuario
		usuarios.remove(new UsuarioId(nome, telefone)); // removendo o usuario
														// do Map
		usuario.mudaAtributo(atributo, valor); // alterando o atributo do
												// usuario
		nome = usuario.getNome(); // atualizando o valor do nome do usuario
		telefone = usuario.getTelefone(); // atualizando o valor do telefone do
											// usuario
		usuarios.put(new UsuarioId(nome, telefone), usuario); // inserindo o
																// usuario

	}

	public boolean existeUsuario(String nome, String telefone) {
		return usuarios.containsKey(new UsuarioId(nome, telefone));
	}

	public String listarUsuario(String nome, String telefone) {
		
		this.verificaUsuarioInvalido(nome, telefone);
		
		return this.usuarios.get(new UsuarioId(nome, telefone)).toString();
	}

	@Override
	public String toString() {
		String str = "";
		for (UsuarioId usuarioid : usuarios.keySet()) {
			str += usuarios.get(usuarioid).toString() + System.lineSeparator();
		}
		return str;
	}

	public String getInfoUsuario(String nome, String telefone, String atributo) {
		
		this.verificaUsuarioInvalido(nome, telefone);
		
		return this.usuarios.get(new UsuarioId(nome, telefone)).getAtributo(atributo);
	}

	public void cadastrarEletronico(String nomeUsuario, String telefoneUsuario, String nomeItem, double preco,
			String plataforma) {
		
		this.verificaUsuarioInvalido(nomeUsuario, telefoneUsuario);
		this.usuarios.get(new UsuarioId(nomeUsuario, telefoneUsuario)).cadastrarEletronico(nomeItem, preco, plataforma);
	}

	public void cadastrarTabuleiro(String nomeUsuario, String telefoneUsuario, String nomeItem, double preco) {
		
		this.verificaUsuarioInvalido(nomeUsuario, telefoneUsuario);
		
		this.usuarios.get(new UsuarioId(nomeUsuario, telefoneUsuario)).cadastrarTabuleiro(nomeItem, preco);
	}

	public void cadastrarBluRaySerie(String nomeUsuario, String telefoneUsuario, String nomeItem, double preco,
			int duracao, String classificacao, String genero, int temporada) {
		
		this.verificaUsuarioInvalido(nomeUsuario, telefoneUsuario);

		this.usuarios.get(new UsuarioId(nomeUsuario, telefoneUsuario)).cadastrarBluRaySerie(nomeItem, preco, duracao, classificacao, genero, temporada);
	}

	public void cadastrarBluRayShow(String nomeUsuario, String telefoneUsuario, String nomeItem, double preco,
			int duracao, String classificacao, int numeroFaixas, String artista) {
		
		this.verificaUsuarioInvalido(nomeUsuario, telefoneUsuario);
		
		this.usuarios.get(new UsuarioId(nomeUsuario, telefoneUsuario)).cadastrarBluRayShow(nomeItem, preco, duracao, classificacao, numeroFaixas, artista);
	}

	public void cadastrarBluRayFilme(String nomeUsuario, String telefoneUsuario, String nomeItem, double preco,
			int duracao, String classificacao, String genero, int anoLancamento) {
		
		this.verificaUsuarioInvalido(nomeUsuario, telefoneUsuario);
	
		this.usuarios.get(new UsuarioId(nomeUsuario, telefoneUsuario)).cadastrarBluRayFilme(nomeItem, preco, duracao, classificacao, genero, anoLancamento);
	
	}

	public String getInfoItem(String nome, String telefone, String nomeItem, String atributo) {
		
		this.verificaUsuarioInvalido(nome, telefone);
		
		return usuarios.get(new UsuarioId(nome, telefone)).getInfoItem(nomeItem, atributo);
	}
	
	public void adicionarPecaPerdida(String nome, String telefone, String nomeItem, String peca){
		
		this.verificaUsuarioInvalido(nome, telefone);
		
		usuarios.get(new UsuarioId(nome, telefone)).adicionarPecaPerdida(nomeItem, peca);
	}

	public void removerItem(String nome, String telefone, String nomeItem) {
		
		this.verificaUsuarioInvalido(nome, telefone);
		
		usuarios.get(new UsuarioId(nome, telefone)).removerItem(nomeItem);	
	}

	public void atualizarItem(String nome, String telefone, String nomeItem, String atributo, String valor) {
		
		this.verificaUsuarioInvalido(nome, telefone);
		
		usuarios.get(new UsuarioId(nome, telefone)).atualizarItem(nomeItem, atributo, valor);
	}
	
	

}