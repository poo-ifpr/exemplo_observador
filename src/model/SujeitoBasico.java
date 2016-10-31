package model;

import java.util.ArrayList;
import java.util.List;

import observer.Observer;
import observer.Sujeito;

public abstract class SujeitoBasico<E> implements Sujeito<E>{

	protected List<Observer<E>> observers;

	public SujeitoBasico() {
		super();
		observers = new ArrayList<Observer<E>>();
	}

	@Override
	public void adicionarObserver(Observer<E> observer) {
		observers.add(observer);
	
	}

	@Override
	public void removerObserver(Observer<E> observer) {
		observers.remove(observer);
	}

	@Override
	public abstract void notificar(String nomeEvento);

}