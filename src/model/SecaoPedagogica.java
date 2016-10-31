package model;

import observer.Evento;
import observer.Observer;
import observer.Sujeito;

public class SecaoPedagogica implements Observer<Aluno>{

	private Sujeito aluno;
	
	public Sujeito getAluno() {
		return aluno;
	}

	public void setAluno(Sujeito aluno) {
		this.aluno = aluno;
	}

	public SecaoPedagogica(Aluno aluno) {
		this.aluno = aluno;
		aluno.setSecaoPedagogica(this);
	}
	
	public void ofereceOrientacao(){
		System.out.println("O que ta com tezeno?");
	}

	@Override
	public void update(Evento<Aluno> evento) {
		if(Evento.INSUFICIENTE.equals(evento.getNome())){
			ofereceOrientacao();
		}
		else if(Evento.PROFICIENTE.equals(evento.getNome())){
			ofereceCertificado();
		}
	}

	private void ofereceCertificado() {
		System.out.println("A seção pedagógica te oferece um prêmio do bão");
	}
}
