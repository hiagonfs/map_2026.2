package testes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import codigo.Aluno;

public class AlunoTest {

	private Aluno alunoTeste;

	@Before
	public void setUp() {
		alunoTeste = new Aluno("Hiago", 10, 9);
	}

	@Test
	public void testaCalculaMediaCorreta() {

		double media = alunoTeste.calcularMedia();

		assertEquals(9.5, media, 0.0001);

	}

	@Test
	public void testaNomeCorreto() {

		assertEquals("Hiago", alunoTeste.getNome());

	}

	@Test
	public void testaNota1Correta() {

		Aluno meuAluno = new Aluno("Sthefany", 10, 8);

		assertEquals(10, meuAluno.getNota1(), 0.001);

	}

	@Test
	public void testaEstaAprovado() {

		Aluno meuAluno = new Aluno("Sthefany", 10, 8);

		assertTrue(meuAluno.estaAprovado());

	}

	@Test(expected = IllegalArgumentException.class)
	public void testaNota1InvalidaMenorQueZero() {

		Aluno meuAluno = new Aluno("Sthefany", -1, 8);

	}

}
