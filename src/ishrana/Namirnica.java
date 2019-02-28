package ishrana;

public abstract class Namirnica implements Energent {
	private static int ID = 0;
	private int id = ++ID;
	private String ime;
	
	public Namirnica(String ime) {
		this.ime = ime;
	}
	
	public String  getIme() {return ime;}
	
	public int getID() {return id;}
	
	public String toString() {
		return ime + "[" + id + "]";
	}
}
