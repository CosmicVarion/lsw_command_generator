package model;

import java.util.ArrayList;

import view.Observer;
import view.View;

public class Model {
	
	private ArrayList<Observer> _observers;
	
	public Model() {
		_observers = new ArrayList<Observer>();
	}
	
	public void addObserver(Observer o) {
		_observers.add(o);
	}
	
	public void notifyObservers() {
		for (Observer o : _observers) {
			o.update();
		}
	}

}
