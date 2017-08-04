package projeto;

import java.util.HashMap;
import java.util.Map;

import itens.BluRayFilme;
import itens.BluRaySerie;
import itens.BluRayShow;
import itens.Item;
import itens.JogoEletronico;
import itens.JogoTabuleiro;

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

		if (this.existeUsuario(nome, telefone)) // verificar se usuario ja esta
												// cadastrado
			throw new IllegalArgumentException("Usuario ja cadastrado");

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

		if (!this.existeUsuario(nome, telefone)) // verificar se usuario nao foi
													// cadastrado
			throw new IllegalArgumentException("Usuario invalido");

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

		if (!this.existeUsuario(nome, telefone)) // verificar se usuario existe
			throw new IllegalArgumentException("Usuario invalido");

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
		if (!this.existeUsuario(nome, telefone))
			throw new IllegalArgumentException("Usuario invalido");
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
		if (!this.existeUsuario(nome, telefone))
			throw new IllegalArgumentException("Usuario invalido");
		return this.usuarios.get(new UsuarioId(nome, telefone)).getAtributo(atributo);
	}

	public boolean cadastrarEletronico(String nomeUsuario, String telefoneUsuario, String nomeItem, double preco,
			String plataforma) {
		if (preco < 0){
			throw new IllegalArgumentException("Preco invalido");
		}
		if (!existeUsuario(nomeUsuario, telefoneUsuario)){
			throw new IllegalArgumentException("Usuario invalido");
		}
		return usuarios.get(new UsuarioId(nomeUsuario, telefoneUsuario)).cadastraItem(new JogoEletronico(preco, nomeItem, plataforma));
		

	}

	public boolean cadastrarTabuleiro(String nomeUsuario, String telefoneUsuario, String nomeItem, double preco) {
		if (preco < 0){
			throw new IllegalArgumentException("Preco invalido");
		}
		if (!existeUsuario(nomeUsuario, telefoneUsuario)){
			throw new IllegalArgumentException("Usuario invalido");
		}
		return usuarios.get(new UsuarioId(nomeUsuario, telefoneUsuario)).cadastraItem(new JogoTabuleiro(preco, nomeItem));
		
	}

	public boolean cadastrarBluRaySerie(String nomeUsuario, String telefoneUsuario, double preco, String nomeItem,
			int duracao, String classificacao, String genero, int temporada) {
		if (preco < 0){
			throw new IllegalArgumentException("Preco invalido");
		}
		if (!existeUsuario(nomeUsuario, telefoneUsuario)){
			throw new IllegalArgumentException("Usuario invalido");
		}

		return usuarios.get(new UsuarioId(nomeUsuario, telefoneUsuario)).cadastraItem(new BluRaySerie(preco, nomeItem, duracao, classificacao, genero, temporada));
		

	}

	public boolean cadastrarBluRayShow(String nomeUsuario, String telefoneUsuario, double preco, String nomeItem,
			int duracao, String classificacao, int numeroFaixas, String artista) {
		if (preco < 0){
			throw new IllegalArgumentException("Preco invalido");
		}
		if (!existeUsuario(nomeUsuario, telefoneUsuario)){
			throw new IllegalArgumentException("Usuario invalido");
		}
		return usuarios.get(new UsuarioId(nomeUsuario, telefoneUsuario)).cadastraItem(new BluRayShow(preco, nomeItem, duracao, classificacao, numeroFaixas, artista));
		

	}

	public boolean cadastrarBluRayFilme(String nomeUsuario, String telefoneUsuario, double preco, String nomeItem,
			int duracao, String classificacao, String genero, int anoLancamento) {
		if (preco < 0){
			throw new IllegalArgumentException("Preco invalido");
		}
		if (!existeUsuario(nomeUsuario, telefoneUsuario)){
			throw new IllegalArgumentException("Usuario invalido");
		}
		return usuarios.get(new UsuarioId(nomeUsuario, telefoneUsuario)).cadastraItem(new BluRayFilme(preco, nomeItem, duracao, classificacao, genero, anoLancamento));
		

	}

	public String getInfoItem(String nome, String telefone, String nomeItem, String atributo) {
		if (!existeUsuario(nome, telefone)){
			throw new IllegalArgumentException("Usuario invalido");
		}
		return usuarios.get(new UsuarioId(nome, telefone)).getInfoItem(nomeItem, atributo);
	
	}
	
	public boolean adicionarPecaPerdida(String nome, String telefone, String nomeItem, String peca){
		if (!existeUsuario(nome, telefone)){
			throw new IllegalArgumentException("Usuario invalido");
		}
		return usuarios.get(new UsuarioId(nome, telefone)).adicionarPecaPerdida(nomeItem, peca);
		
	}

	public boolean removerItem(String nome, String telefone, String nomeItem) {
		
		if (!existeUsuario(nome, telefone)){
			throw new IllegalArgumentException("Usuario invalido");
		}
		return usuarios.get(new UsuarioId(nome, telefone)).removerItem(nomeItem);
		
		
	}

	public void atualizarItem(String nome, String telefone, String nomeItem, String atributo, String valor) {
		if (!existeUsuario(nome, telefone)){
			throw new IllegalArgumentException("Usuario invalido");
		}
		usuarios.get(new UsuarioId(nome, telefone)).atualizarItem(nomeItem, atributo, valor);
		
	}
	
	

}