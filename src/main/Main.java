package main;

import model.Aluno;
import model.Patrocinador;
import model.SecaoPedagogica;

public class Main {

public static void main(String[] args) {

	Aluno aluno = new Aluno("Jureg");
	Responsavel responsavel = new Responsavel(aluno);
	SecaoPedagogica secaoPedagogica = new SecaoPedagogica(aluno);
	Patrocinador parsa = new Patrocinador("Parsa", aluno);
	Patrocinador lady = new Patrocinador("Lady", aluno);
	aluno.setNota("A");
}
	
}
