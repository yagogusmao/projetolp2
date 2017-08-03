package testes;

import static org.junit.Assert.*;

import org.junit.Test;

import projeto.UserController;

public class UserControllerTest {

	
	/// Testes envolvendo cadastro e teste de existencia de usuario
	
	@Test
	public void cadastrarUsuarioTest(){
		UserController controle = new UserController();
		controle.cadastrarUsuario("felipe", "99", "sem email");
		assertTrue(controle.existeUsuario("felipe", "99"));
	}
	
	@Test
	public void cadastrarUsuario2Test(){
		UserController controle = new UserController();
		controle.cadastrarUsuario("felipe", "99", "sem email");
		assertFalse(controle.existeUsuario("tom", "99"));
	}

	@Test
	public void cadastrarUsuario3Test(){
		UserController controle = new UserController();
		controle.cadastrarUsuario("felipe", "99", "sem email");
		controle.cadastrarUsuario("luiza", "11", "email ?");
		assertTrue(controle.existeUsuario("luiza", "11"));
	}
	
	@Test
	public void cadastrarUsuario4Test(){
		UserController controle = new UserController();
		controle.cadastrarUsuario("felipe", "99", "sem email");
		controle.cadastrarUsuario("luiza", "11", "email ?");
		controle.cadastrarUsuario("luiza", "22", "bla bla");
		assertTrue(controle.existeUsuario("luiza", "22"));
	}
	
	@Test
	public void cadastrarUsuario5Test(){
		UserController controle = new UserController();
		controle.cadastrarUsuario("felipe", "99", "sem email");
		controle.cadastrarUsuario("luiza", "11", "email ?");
		controle.cadastrarUsuario("luiza", "22", "bla bla");
		assertFalse(controle.existeUsuario("luiza", "33"));
	}
	
	/// Testes envolvendo cadastro e atualizacao
	
	@Test
	public void cadastroAtualizaTest(){
		UserController controle = new UserController();
		controle.cadastrarUsuario("felipe", "11", "fmota@...");
		assertTrue(controle.existeUsuario("felipe", "11"));
		controle.atualizarUsuario("felipe", "11", "nome", "mota");
		assertTrue(controle.existeUsuario("mota", "11"));
		assertFalse(controle.existeUsuario("felipe", "11"));
	}
	
	@Test
	public void cadastroAtualiza2Test(){
		UserController controle = new UserController();
		controle.cadastrarUsuario("felipe", "11", "fmota@...");
		assertTrue(controle.existeUsuario("felipe", "11"));
		controle.atualizarUsuario("felipe", "11", "telefone", "22");
		assertTrue(controle.existeUsuario("felipe", "22"));
		assertFalse(controle.existeUsuario("felipe", "11"));
	}
	
	@Test
	public void cadastroAtualiza3Test(){
		UserController controle = new UserController();
		controle.cadastrarUsuario("felipe", "11", "fmota@...");
		assertTrue(controle.existeUsuario("felipe", "11"));
		controle.atualizarUsuario("felipe", "11", "email", "felipe.santos");
		assertTrue(controle.existeUsuario("felipe", "11"));
	}
	
	// Testes envolvendo listagem
	
	@Test
	public void listarUsuario(){
		UserController controle = new UserController();
		controle.cadastrarUsuario("felipe", "11", "fmota@...");
		assertEquals("felipe, fmota@..., 11", controle.listarUsuario("felipe", "11"));
	}
}
