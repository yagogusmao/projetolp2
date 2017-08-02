package tt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class UserController {
	private Map<UsuarioId, Usuario> usuarios;

	public UserController() {
		this.usuarios = new HashMap<UsuarioId, Usuario>();
	}

	public void cadastrarUsuario(String nome, String telefone, String email) {
		if (!usuarios.containsKey(new UsuarioId(nome, telefone))) 
			usuarios.put(new UsuarioId(nome, telefone), new Usuario(nome, telefone, email));
		else
			throw new IllegalArgumentException("Usuario existente");

	}

	public void removerUsuario(String nome, String telefone) {
		if (usuarios.containsKey(new UsuarioId(nome, telefone))) 
			usuarios.remove(new UsuarioId(nome, telefone));
		else
			throw new IllegalArgumentException("Usuario invalido");
	}

	public void atualizarUsuario(String nome, String telefone, String atributo, String valor) {
		UsuarioId userid = new UsuarioId(nome,telefone);
		if (usuarios.containsKey(userid)){
			Usuario usuario1 = usuarios.get(new UsuarioId(nome, telefone));
			if(atributo.toLowerCase().equals("nome")){
				usuarios.remove(new UsuarioId(nome, telefone));
				usuario1.setNome(valor);
				usuarios.put(new UsuarioId(valor, telefone), usuario1);
				
			}
			else if(atributo.toLowerCase().equals("telefone")){
				usuarios.remove(new UsuarioId(nome, telefone));
				usuario1.setTelefone(valor);
				usuarios.put(new UsuarioId(nome, valor), usuario1);
			}
			else if(atributo.toLowerCase().equals("email")){
				usuarios.remove(new UsuarioId(nome, telefone));
				usuario1.setEmail(valor);
				usuarios.put(new UsuarioId(nome, telefone), usuario1);
			}
		}
		else
			throw new IllegalArgumentException("Usuario invalido");
		
	}
	public void userExiste(String nome, String telefone){
		UsuarioId userid = new UsuarioId(nome,telefone);
		if(usuarios.containsKey(userid)){
			System.out.println("sim");
		}
		else
			System.out.println("nao");
	}
	
	@Override 
	public String toString(){
		String str = "";
		for(UsuarioId usuarioid : usuarios.keySet()){
			str += usuarios.get(usuarioid).toString()+ "\n";
		}
		return str;
	}
	
	

}
