package ishrana;

import greske.GNekorektniPodaci;

public class Hrana extends Namirnica {
	private double tezina, belanc, masti, ugHid;
	
	public Hrana(String ime, double t, double b, double m, double u) throws GNekorektniPodaci {
		super(ime);
		if(b+m+u>100) throw new GNekorektniPodaci();
		tezina = t; belanc = b; masti = m; ugHid = u;
	}
	
	public double belanc() {return tezina * belanc /100;}
	public double masti() {return tezina * masti /100;}
	public double ugHid() {return tezina * ugHid /100;}
	public double tezina() {return tezina;}
	
	@Override
	public double energVred() {
		return 16.7*belanc() + 37.6*masti() + 17.2*ugHid();
	}
	
	public String toString() {
		return super.toString() + "(" + tezina + "," + energVred() + ")";
	}
}
