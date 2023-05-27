package org.lessons.java.valutazioni;

public class Studente {
	
	private int id;
	private int percAssenze;
	private float percVoti;
	
	public Studente(int id, int percAssenze, float percVoti) {
		
		setId(id);
		setPercAssenze(percAssenze);
		setPercVoti(percVoti);
	}
	
	public int getId() {
		
		return id;
	}
	
	public void setId(int id) {
		
		this.id = id;
	}
	
	public int getPercAssenze() {
		
		return percAssenze;
	}
	
	public void setPercAssenze(int percAssenze) {
		
		this.percAssenze = percAssenze;
	}
	
	public float getPercVoti() {
		
		return percVoti;
	}
	
	public void setPercVoti(float percVoti) {
		
		this.percVoti = percVoti;
	}
	
	
	public boolean isBocciato() {
		
		return (getPercAssenze() > 50 || (getPercAssenze() > 25 && getPercVoti() <= 2) || ( getPercAssenze() < 25 && getPercVoti() <= 2) );
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Studente: " + getId() + " | " + getPercAssenze() + "% | " + String.format("%.2f", getPercVoti()) + "% | Bocciato: " + isBocciato() + " | " ;
	}

}
