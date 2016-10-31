package observer;

public class Evento<E> {
	public static final String PROFICIENTE = "Proficiente";
	public static final String INSUFICIENTE = "Insuficiente";
	
	private String nome;
	private E elemento;
	public Evento(String nomeEvento, E elemento) {
		this.nome = nomeEvento;
		this.elemento = elemento;
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public E getElemento() {
		return elemento;
	}

	public void setElemento(E elemento) {
		this.elemento = elemento;
	}

}
