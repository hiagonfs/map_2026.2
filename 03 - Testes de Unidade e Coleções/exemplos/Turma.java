package sistema;

import java.util.ArrayList;

public class Turma {

	private ArrayList<Aluno> alunos;

	public Turma() {
		alunos = new ArrayList<Aluno>();
	}

	public boolean cadastrarAluno(String nome, String matricula) {
		Aluno novoAluno = new Aluno(nome, matricula);

		return alunos.add(novoAluno);
	}

	public boolean removerAluno(String matricula) {
		for (Aluno aluno : alunos) {
			if (aluno.getMatricula().equals(matricula)) {
				return alunos.remove(aluno);
			}
		}
		return false;
	}
	
	public int qtdAlunosMatriculados() {
		return alunos.size(); 
	}

}
