package testes;

import static org.junit.Assert.*;

import org.junit.Test;

import projeto.Usuario;

public class UsuarioTest {

	@Test( expected = IllegalArgumentException.class)
	public void cadastraUsuarioInvalido(){
		Usuario invalido = new Usuario(null, null, null);
	}
}
