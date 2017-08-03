package itens;

public class JogoEletronico extends Item{
	private String plataforma;
	
	public JogoEletronico(double preco, String nome, String plataforma){
		super(preco, nome);
		this.plataforma = plataforma;
	}
	
	

}
