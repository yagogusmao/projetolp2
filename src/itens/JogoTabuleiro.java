package itens;

import java.util.ArrayList;

public class JogoTabuleiro extends Item{

	private ArrayList<String> pecasPerdidas;

	public JogoTabuleiro(String nome, double preco){
		super(nome, preco);
		this.pecasPerdidas = new ArrayList<String>();
	}
	
	public boolean adicionarPecaPerdida(String peca){
		return pecasPerdidas.add(peca);
	}
}