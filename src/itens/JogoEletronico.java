package itens;

public class JogoEletronico extends Item{
	private String plataforma;
	
	public JogoEletronico(String nome, double preco, String plataforma){
		super(nome, preco);
		this.plataforma = plataforma;
	}
	
	

}
