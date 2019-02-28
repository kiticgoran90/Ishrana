package ishrana;

public class Pice extends Namirnica {
	private double kolicina, enVred;
	
	public Pice(String ime, double k, double ev) {
		super(ime); kolicina = k; enVred = ev;
	}
	
	public double kolicina() {return kolicina;}
	
	@Override
	public double energVred() {
		return kolicina * enVred;
	}
	
	@Override
	public String toString() {
		return super.toString() + "(" + kolicina + "," + energVred() + ")"; 
	}
}
