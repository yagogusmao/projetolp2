package testes;

import static org.junit.Assert.*;

import org.junit.Test;

import projeto.UserController;

public class UserControllerTest {

	@Test
	public void cadastrarUsuarioTest(){
		UserController controle = new UserController();
		controle.cadastrarUsuario("felipe", "99", "sem email");
		assertTrue(controle.existeUsuario("felipe", "99"));
	}

}
