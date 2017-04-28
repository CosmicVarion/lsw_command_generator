package view;

import model.Model;

public class View implements Runnable, Observer {
	
	public View() {
		
	}
	
	@Override
	public void run() {
		Model m = new Model();
		m.addObserver(this);
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

}
