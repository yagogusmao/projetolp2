package tt;

import java.util.HashMap;

public class Usuario {
	private String nome;
	private String telefone;
	private String email;
	private ItemController itemcontroller;	
	
	public Usuario(String nome, String telefone, String email){
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.itemcontroller = new ItemController();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	@Override
	public String toString(){
		return nome + ", " + email + ", " + telefone;
	}
	
	
}
