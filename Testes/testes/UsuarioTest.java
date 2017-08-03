package testes;

import static org.junit.Assert.*;

import org.junit.Test;

import projeto.Usuario;

public class UsuarioTest {

	
	// Testes com criacao de usuario invalido
	// Futuramente mudar para modelo try/catch para verificar as mensagens de erro
	@Test( expected = IllegalArgumentException.class)
	public void criaUsuarioNomeInvalidoTest(){
		Usuario invalido = new Usuario(null, "11", "fmota");
	}
	
	@Test( expected = IllegalArgumentException.class)
	public void criaUsuarioNomeInvalido2Test(){
		Usuario invalido = new Usuario("", "11", "fmota");
	}
	
	@Test( expected = IllegalArgumentException.class)
	public void criaUsuarioTelefoneInvalidoTest(){
		Usuario invalido = new Usuario("felipe", null, "fmota");
	}
	
	@Test( expected = IllegalArgumentException.class)
	public void criaUsuarioTelefoneInvalido2Test(){
		Usuario invalido = new Usuario("felipe", "", "fmota");
	}
	
	@Test( expected = IllegalArgumentException.class)
	public void criaUsuarioEmailInvalidoTest(){
		Usuario invalido = new Usuario("felipe", "22", null);
	}
	
	@Test( expected = IllegalArgumentException.class)
	public void criaUsuarioEmailInvalidoTest2(){
		Usuario invalido = new Usuario("felipe", "22", "");
	}
}
