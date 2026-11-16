package sistema;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DisciplinaTest {

	@Test
	public void testaAdicionaAluno() {

		Disciplina d = new Disciplina();

		boolean resposta = d.adicionarAluno("Hiago", "3112321");

		assertTrue(resposta);

	}

	@Test
	public void testaRemoverAluno() {

		Disciplina d = new Disciplina();

		d.adicionarAluno("Hiago", "3112321");

		boolean resposta = d.removerAluno("3112321");

		assertTrue(resposta);
	}

	@Test
	public void testaDuplicidade() {

		Disciplina d = new Disciplina();

		d.adicionarAluno("Hiago", "3112321");
		d.adicionarAluno("Hiago", "3112321");
		d.adicionarAluno("Hiago", "3112321");
		d.adicionarAluno("Hiago", "3112321");
		d.adicionarAluno("Hiago", "3112321");

		assertEquals(1, d.qtdAlunos());

	}

}
