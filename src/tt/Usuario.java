package tt;

import java.util.ArrayList;

public class Usuario {
	private String nome;
	private String telefone;
	private String email;
	private ArrayList<Item> itens;	
	
	public Usuario(String nome, String telefone, String email){
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.itens = new ArrayList<Item>();
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

	public ArrayList<Item> getItens() {
		return itens;
	}

	public void setItens(ArrayList<Item> itens) {
		this.itens = itens;
	}
	
	@Override
	public String toString(){
		return nome + ", " + email + ", " + telefone;
	}
	
	
}
