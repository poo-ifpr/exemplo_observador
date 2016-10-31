package model;

import java.util.ArrayList;
import java.util.List;

import main.Responsavel;
import observer.Evento;
import observer.Observer;

public class Aluno extends SujeitoBasico<Aluno> {
	private String nome;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	private Responsavel responsavel;
	private String nota;
	private SecaoPedagogica secaoPedagogica;
	private List<Patrocinador> patrocinadores;

	public List<Patrocinador> getPatrocinadores() {
		return patrocinadores;
	}

	public void setPatrocinadores(List<Patrocinador> patrocinadores) {
		this.patrocinadores = patrocinadores;
	}
	
	public void adicionaPatrocinador(Patrocinador patrocinador){
		patrocinadores.add(patrocinador);
		adicionarObserver(patrocinador);
	}
	
	public void removerPatrocinador (Patrocinador patrocinador){
		patrocinadores.remove(patrocinador);
	}


	public void notificar(String nomeEvento) {
		for (Observer<Aluno> observer : observers) {
			observer.update(new Evento<Aluno>(
					nomeEvento,this));
		}
	}

	public SecaoPedagogica getSecaoPedagogica() {
		return secaoPedagogica;
	}

	public void setSecaoPedagogica(SecaoPedagogica secaoPedagogica) {
		this.secaoPedagogica = secaoPedagogica;
		adicionarObserver(secaoPedagogica);
	}

	public String getNota() {
		return nota;
	}

	public void setNota(String nota) {
		this.nota = nota;
		if ("A".equals(nota)) {
			notificar(Evento.PROFICIENTE);

		}
		if ("D".equals(nota)) {
			notificar(Evento.INSUFICIENTE);
		}
	}

	public Responsavel getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Responsavel responsavel) {
		this.responsavel = responsavel;
		adicionarObserver(responsavel);
	}

	public Aluno(String nome) {
		patrocinadores = new ArrayList<Patrocinador>();
		this.nome = nome;
	}

}
