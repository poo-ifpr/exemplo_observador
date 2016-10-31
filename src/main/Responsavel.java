package main;

import model.Aluno;
import observer.Evento;
import observer.Observer;
import observer.Sujeito;

public class Responsavel implements Observer<Aluno> {

	private Sujeito aluno;

	public Sujeito getAluno() {
		return aluno;
	}

	public void setAluno(Sujeito aluno) {
		this.aluno = aluno;
	}

	public Responsavel(Aluno aluno) {
		this.aluno = aluno;
		aluno.setResponsavel(this);
	}

	public void darSermao() {
		System.out.println("Seja responsável!!! >:c");
	}

	@Override
	public void update(Evento<Aluno> evento) {
		if(Evento.INSUFICIENTE.equals(evento.getNome())){
			darSermao();
		}
	}
}
