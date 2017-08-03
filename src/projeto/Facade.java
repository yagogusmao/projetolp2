package projeto;

public class Facade {
	private UserController controladorDeUsuarios;
	
	public Facade(){
		
	}
	
	public void iniciarSistema(){
		this.controladorDeUsuarios = new UserController();
	}
	
	public void cadastrarUsuario(String nome, String telefone, String email){
		this.controladorDeUsuarios.cadastrarUsuario(nome, telefone, email);
	}
	
	public String getInfoUsuario(String nome, String telefone, String atributo){
		return this.controladorDeUsuarios.getInfoUsuario(nome, telefone, atributo);
	}
	
	public void removerUsuario(String nome, String telefone){
		this.controladorDeUsuarios.removerUsuario(nome, telefone);
	}
	
	public void atualizarUsuario(String nome, String telefone, String atributo, String valor){
		this.controladorDeUsuarios.atualizarUsuario(nome, telefone, atributo, valor);
	}
	
	public void fecharSistema(){
		
	}
}
