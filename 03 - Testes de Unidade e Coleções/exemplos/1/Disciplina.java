package sistema;

import java.util.HashSet;

public class Disciplina {

	private HashSet<Aluno> alunos;

	public Disciplina() {
		alunos = new HashSet<Aluno>();
	}

	public boolean adicionarAluno(String nome, String matricula) {
		Aluno novoAluno = new Aluno(nome, matricula);

		return alunos.add(novoAluno);
	}

	public int qtdAlunos() {
		return alunos.size();
	}

	public Aluno pesquisaAluno(String matricula) {
		for (Aluno aluno : alunos) {
			if (aluno.getMatricula().equals(matricula)) {
				return aluno;
			}
		}
		return null;
	}

	public boolean removerAluno(String matricula) {
		Aluno alunoEncontrado = pesquisaAluno(matricula);

		if (alunoEncontrado != null) {
			return alunos.remove(alunoEncontrado);
		}

		return false;
	}

}
