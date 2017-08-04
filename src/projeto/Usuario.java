
package projeto;

import java.util.HashMap;

import java.util.HashMap;
import java.util.Map;

import itens.Item;
import itens.JogoTabuleiro;

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
	private Map<String, Item> itens;
	
	public Usuario(String nome, String telefone, String email) {
		
		this.valideNome(nome);
		this.valideTelefone(telefone);
		this.valideEmail(email);
		
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.itens = new HashMap<String, Item>();
	}
	
	public boolean cadastraItem(Item item){
		itens.put(item.getNome(), item);
		return true;
			
		
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (telefone == null) {
			if (other.telefone != null)
				return false;
		} else if (!telefone.equals(other.telefone))
			return false;
		return true;
	}

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
		else if(atributo.toLowerCase().equals("telefone"))
			return this.getTelefone();
		else if(atributo.toLowerCase().equals("email"))
			return this.getEmail();
		else
			throw new IllegalArgumentException("Atributo de usuario invalido");
	}

	public void mudaAtributo(String atributo, String valor) {
		if(atributo.toLowerCase().equals("nome"))
			this.setNome(valor);
		else if(atributo.toLowerCase().equals("telefone"))
			this.setTelefone(valor);
		else if(atributo.toLowerCase().equals("email"))
			this.setEmail(valor);
		else
			throw new IllegalArgumentException("Atributo de usuario invalido");	
	}

	public String getInfoItem(String nomeItem, String atributo) {
		Item item = itens.get(nomeItem);
		if(!(itens.containsKey(nomeItem))){
			throw new IllegalArgumentException("Item nao encontrado");
		}
		if(atributo.toLowerCase().equals("preco")){
			return "" + item.getPreco(); 
		}
		else if(atributo.toLowerCase().equals("nome")){
			return "" + nomeItem;
		}
		else
			throw new IllegalArgumentException("Atributo Invalido");
		
		
	}

	public boolean adicionarPecaPerdida(String nomeItem, String peca) {
		if(!itens.containsKey(nomeItem)){
			throw new IllegalArgumentException("Item nao encontrado");
		}
		if (!(itens.get(nomeItem) instanceof JogoTabuleiro)){
			throw new IllegalArgumentException("Item selecionado nao e jogo de tabuleiro");
		}
		JogoTabuleiro item = (JogoTabuleiro) itens.get(nomeItem);
		return item.adicionarPecaPerdida(peca);
	}

	public boolean removerItem(String nomeItem) {
		if(!itens.containsKey(nomeItem)){
			throw new IllegalArgumentException("Item nao encontrado");
		}
		itens.remove(nomeItem);
		return true;
		
	}
	

	public void atualizarItem(String nomeItem, String atributo, String valor) {
		if(!itens.containsKey(nomeItem)){
			throw new IllegalArgumentException("Item nao encontrado");
		}
		if(atributo.toLowerCase().equals("preco")){
			double valor2 = Double.parseDouble(valor);
			if (valor2 < 0){
				throw new IllegalArgumentException("Preco invalido");
			}
			itens.get(nomeItem).setPreco(valor2);
		}
		else if(atributo.toLowerCase().equals("nome")){
			Item item = itens.get(nomeItem);
			item.setNome(valor);
			itens.remove(nomeItem);
			itens.put(valor, item);
		}
		else 
			throw new IllegalArgumentException("Argumento invalido");
	}
	
	

}