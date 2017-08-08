package projeto;

import itens.Item;

public class EmprestimoId {

	private String nomeDonoItem;
	private String telefoneDonoItem;
	private String nomeRequerenteItem;
	private String telefoneRequerenteItem;
	private String nomeItem;
	private String dataEmprestimo;
	
	public EmprestimoId(String nomeDonoItem, String telefoneDonoItem, String nomeRequerenteItem, String telefoneRequerente, String nomeItem,
			String dataEmprestimo){
		
		this.nomeDonoItem = nomeDonoItem;
		this.telefoneDonoItem = telefoneDonoItem;
		this.nomeRequerenteItem = nomeRequerenteItem;
		this.telefoneRequerenteItem = telefoneRequerente;
		this.nomeItem = nomeItem;
		this.dataEmprestimo = dataEmprestimo;
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataEmprestimo == null) ? 0 : dataEmprestimo.hashCode());
		result = prime * result + ((nomeDonoItem == null) ? 0 : nomeDonoItem.hashCode());
		result = prime * result + ((nomeItem == null) ? 0 : nomeItem.hashCode());
		result = prime * result + ((nomeRequerenteItem == null) ? 0 : nomeRequerenteItem.hashCode());
		result = prime * result + ((telefoneDonoItem == null) ? 0 : telefoneDonoItem.hashCode());
		result = prime * result + ((telefoneRequerenteItem == null) ? 0 : telefoneRequerenteItem.hashCode());
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
		EmprestimoId other = (EmprestimoId) obj;
		if (dataEmprestimo == null) {
			if (other.dataEmprestimo != null)
				return false;
		} else if (!dataEmprestimo.equals(other.dataEmprestimo))
			return false;
		if (nomeDonoItem == null) {
			if (other.nomeDonoItem != null)
				return false;
		} else if (!nomeDonoItem.equals(other.nomeDonoItem))
			return false;
		if (nomeItem == null) {
			if (other.nomeItem != null)
				return false;
		} else if (!nomeItem.equals(other.nomeItem))
			return false;
		if (nomeRequerenteItem == null) {
			if (other.nomeRequerenteItem != null)
				return false;
		} else if (!nomeRequerenteItem.equals(other.nomeRequerenteItem))
			return false;
		if (telefoneDonoItem == null) {
			if (other.telefoneDonoItem != null)
				return false;
		} else if (!telefoneDonoItem.equals(other.telefoneDonoItem))
			return false;
		if (telefoneRequerenteItem == null) {
			if (other.telefoneRequerenteItem != null)
				return false;
		} else if (!telefoneRequerenteItem.equals(other.telefoneRequerenteItem))
			return false;
		return true;
	}

	
	
}
