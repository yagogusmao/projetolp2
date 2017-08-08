package projeto;

/**
 * Identificador para usuario
 * 
 * @author Felipe Mota, Yago Gusmao 
 */
public class UsuarioId {

	private String nome;
	private String telefone;
	
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
	
	public UsuarioId(String nome, String telefone){
		
		this.valideNome(nome);
		this.valideTelefone(telefone);
		
		this.nome = nome;
		this.telefone = telefone;
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
		UsuarioId other = (UsuarioId) obj;
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
	
}
