package projeto;

public class UsuarioId {

	private String nome;
	private String telefone;
	
	public UsuarioId(String nome, String telefone){
		
		if(nome == null || nome.trim().equals(""))
			throw new IllegalArgumentException("Nome de usuario invalido");
		
		if(telefone == null || telefone.trim().equals(""))
			throw new IllegalArgumentException("Telefone de usuario invalido");
		
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
