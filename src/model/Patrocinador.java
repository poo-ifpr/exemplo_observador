package model;

import observer.Evento;
import observer.Observer;
import observer.Sujeito;

public class Patrocinador implements Observer<Aluno>{

	private Sujeito aluno;
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Sujeito getAluno() {
		return aluno;
	}

	public void setAluno(Sujeito aluno) {
		this.aluno = aluno;
	}
	
	public Patrocinador(String nome, Aluno aluno) {
		this.nome = nome;
		this.aluno = aluno;
		aluno.adicionaPatrocinador(this);
	}

	@Override
	public void update(Evento<Aluno> evento) {
		if(Evento.PROFICIENTE.equals(evento.getNome())){
			Aluno aluno = evento.getElemento();
			concederBolsa(aluno);
		}
		
		
	}

	private void concederBolsa(Aluno aluno) {
		System.out.print(getNome() + ": ");
		System.out.println("para bems " + aluno.getNome());
		
	}
}
