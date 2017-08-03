package projeto;

import java.util.ArrayList;
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
	
	/**
	 * Cadastrar usuario
	 * @param nome
	 * 		Nome do usuario
	 * @param telefone
	 * 		Telefone do usuario
	 * @param email
	 * 		Email do usuario
	 */
	public void cadastrarUsuario(String nome, String telefone, String email) {
		
		if(this.existeUsuario(nome, telefone)) // verificar se usuario ja esta cadastrado
			throw new IllegalArgumentException("Usuario ja cadastrado");
		
		this.usuarios.put(new UsuarioId(nome, telefone), new Usuario(nome, telefone, email));
	}

	/**
	 * Remover usuario
	 * @param nome
	 * 		Nome do usuario
	 * @param telefone
	 * 		Telefone do usuario
	 */
	public void removerUsuario(String nome, String telefone) {
		
		if(!this.existeUsuario(nome, telefone)) // verificar se usuario nao foi cadastrado
			throw new IllegalArgumentException("Usuario invalido");
		
		this.usuarios.remove(new UsuarioId(nome, telefone));
	}

	/**
	 * Atualizar atributo de usuario
	 * @param nome
	 * 		Nome do usuario
	 * @param telefone
	 * 		Telefone do usuario
	 * @param atributo
	 * 		Atributo do usuario que deve ser modificado
	 * @param valor
	 * 		Novo valor que o atributo deve receber
	 */
	public void atualizarUsuario(String nome, String telefone, String atributo, String valor) {
		
		if(!this.existeUsuario(nome, telefone)) // verificar se usuario existe
			throw new IllegalArgumentException("Usuario invalido");
		
		Usuario usuario = usuarios.get(new UsuarioId(nome, telefone)); // pegando o usuario
		usuarios.remove(new UsuarioId(nome, telefone)); // removendo o usuario do Map
		usuario.mudaAtributo(atributo, valor); // alterando o atributo do usuario
		nome = usuario.getNome(); // atualizando o valor do nome do usuario
		telefone = usuario.getTelefone(); // atualizando o valor do telefone do usuario
		usuarios.put(new UsuarioId(nome, telefone), usuario); // inserindo o usuario

	}
	
	public boolean existeUsuario(String nome, String telefone){
		return usuarios.containsKey(new UsuarioId(nome, telefone));
	}
	
	public String listarUsuario(String nome, String telefone){
		if(!this.existeUsuario(nome, telefone))
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
		if(!this.existeUsuario(nome, telefone))
			throw new IllegalArgumentException("Usuario invalido");
		return this.usuarios.get(new UsuarioId(nome, telefone)).getAtributo(atributo);
	}

}
