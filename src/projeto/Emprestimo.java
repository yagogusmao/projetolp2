package projeto;

import itens.Item;

public class Emprestimo {

	private String nomeDonoItem;
	private String telefoneDonoItem;
	private String nomeRequerenteItem;
	private String telefoneRequerenteItem;
	private String nomeItem;
	private String dataInicialEmprestimo[];
	private int numeroDiasParaEmprestimo;
	private String dataDeDevolucao[];
	
	public Emprestimo(String nomeDonoItem, String telefoneDonoItem, String nomeRequerenteItem, String telefoneRequerente, String nomeItem,
			String dataInicialEmprestimo, int numeroDiasParaEmprestimo){
		
		this.nomeDonoItem = nomeDonoItem;
		this.telefoneDonoItem = telefoneDonoItem;
		this.nomeRequerenteItem = nomeRequerenteItem;
		this.telefoneRequerenteItem = telefoneRequerente;
		this.nomeItem = nomeItem;
		this.dataInicialEmprestimo = dataInicialEmprestimo.split("/");
		this.numeroDiasParaEmprestimo = numeroDiasParaEmprestimo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nomeItem == null) ? 0 : nomeItem.hashCode());
		result = prime * result + ((nomeDonoItem == null) ? 0 : nomeDonoItem.hashCode());
		result = prime * result + ((nomeRequerenteItem == null) ? 0 : nomeRequerenteItem.hashCode());
		result = prime * result + ((telefoneDonoItem == null) ? 0 : telefoneDonoItem.hashCode());
		result = prime * result + ((telefoneRequerenteItem == null) ? 0 : telefoneRequerenteItem.hashCode());
		return result;
	}

	public String getNomeDonoItem() {
		return nomeDonoItem;
	}

	public String getTelefoneDonoItem() {
		return telefoneDonoItem;
	}

	public String getNomeRequerenteItem() {
		return nomeRequerenteItem;
	}

	public String getTelefoneRequerenteItem() {
		return telefoneRequerenteItem;
	}

	public String getNomeItem() {
		return nomeItem;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emprestimo other = (Emprestimo) obj;
		if((other.getNomeDonoItem().equals(this.nomeDonoItem)) && (other.getTelefoneDonoItem().equals(this.telefoneDonoItem)) && 
				(other.getNomeRequerenteItem().equals(this.nomeRequerenteItem)) && (other.getTelefoneDonoItem().equals(this.telefoneRequerenteItem)) && 
				(other.getNomeItem().equals(this.nomeItem))){
			return true;
		}
		return false;
	}

	public void setDataDevolucao(String dataDevolucao) {
		this.dataDeDevolucao = dataDevolucao.split("/");
	}

}
