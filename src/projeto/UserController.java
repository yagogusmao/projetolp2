package projeto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 * Controllador de usuario
 * 
 * @author Hugo
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
	
	public void cadastrarUsuario(String nome, String telefone, String email) {
		
		if(this.existeUsuario(nome, telefone))
			throw new IllegalArgumentException("Usuario ja cadastrado");
		
		this.usuarios.put(new UsuarioId(nome, telefone), new Usuario(nome, telefone, email));
	}

	public void removerUsuario(String nome, String telefone) {
		
		if(!this.existeUsuario(nome, telefone))
			throw new IllegalArgumentException("Usuario invalido");
		
		this.usuarios.remove(new UsuarioId(nome, telefone));
	}

	public void atualizarUsuario(String nome, String telefone, String atributo, String valor) {
		
		if(!this.existeUsuario(nome, telefone))
			throw new IllegalArgumentException("Usuario invalido");
		
		Usuario usuario1 = usuarios.get(new UsuarioId(nome, telefone));
		usuarios.remove(new UsuarioId(nome, telefone));

		if (atributo.toLowerCase().equals("nome")) {
			
			usuario1.setNome(valor);
			usuarios.put(new UsuarioId(valor, telefone), usuario1);

		} else if (atributo.toLowerCase().equals("telefone")) {
			
			usuario1.setTelefone(valor);
			usuarios.put(new UsuarioId(nome, valor), usuario1);
		
		} else if (atributo.toLowerCase().equals("email")) {
			
			usuario1.setEmail(valor);
			usuarios.put(new UsuarioId(nome, telefone), usuario1);
		
		}

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
