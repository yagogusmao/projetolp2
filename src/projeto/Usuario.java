package projeto;

import java.util.HashMap;

/**
 * Usuario 
 * representado por :
 * 		Nome
 * 		Telefone
 * 		Email
 * 		Conjunto de itens;
 * @author Hugo
 * 
 */
public class Usuario {
	
	private String nome;
	private String telefone;
	private String email;
	private ItemController itemcontroller;
	
	/**
	 * Validando  o nome do usuario
	 * @param nome
	 * 		Nome do usuario
	 */
	private void valideNome(String nome){
		
		if(nome == null || nome.trim().equals(""))
			throw new IllegalArgumentException("Nome de usuario invalido");
		
	}

	/**
	 * Validando telefone do usuario
	 * @param telefone
	 * 		Telefone do usuario
	 */
	private void valideTelefone(String telefone){
		
		if(telefone == null || telefone.trim().equals(""))
			throw new IllegalArgumentException("Telefone de usuario invalido");
	
	}
	
	/**
	 * Validando email do usuario
	 * @param email
	 * 		Email do usuario
	 */
	private void valideEmail(String email){
	
		if(email == null || email.trim().equals(""))
			throw new IllegalArgumentException("Email de usuario invalido");
	
	}
	
	public Usuario(String nome, String telefone, String email) {
	
		this.valideNome(nome);
		this.valideTelefone(telefone);
		this.valideEmail(email);
		
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.itemcontroller = new ItemController();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.valideNome(nome);
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.valideTelefone(telefone);
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.valideEmail(email);
		this.email = email;
	}

	@Override
	public String toString() {
		return nome + ", " + email + ", " + telefone;
	}

	public String getAtributo(String atributo) {
		if(atributo.toLowerCase().equals("nome"))
			return this.getNome();
		if(atributo.toLowerCase().equals("telefone"))
			return this.getTelefone();
		if(atributo.toLowerCase().equals("email"))
			return this.getEmail();
		throw new IllegalArgumentException("Atributo de usuario invalido");
	}

}
