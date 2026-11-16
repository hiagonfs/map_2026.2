package sistema;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TurmaTest {

	@Test
	public void testaCriarTurmaVazia() {

		Turma t = new Turma();

		assertEquals(0, t.qtdAlunosMatriculados());

	}

	@Test
	public void testaAdicionarAluno() {
		Turma t = new Turma();

		boolean resposta = t.cadastrarAluno("Hiago", "3128372");

		assertTrue(resposta);
	}

	@Test
	public void testaRemoverAluno() {

		Turma t = new Turma();

		t.cadastrarAluno("Hiago", "3128372");

		boolean resposta = t.removerAluno("3128372");

		assertTrue(resposta);
	}

}
