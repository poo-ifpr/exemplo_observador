package observer;

public interface Sujeito<E> {

	void notificar(String nomeEvento);

	void adicionarObserver(Observer<E> observer);

	void removerObserver(Observer<E> observer);

}