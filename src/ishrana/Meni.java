package ishrana;

import greske.GPunMeni;

public class Meni {
	private Namirnica[] niz;
	private int brNam;
	
	public Meni(int kap) {
		niz = new Namirnica[kap];
	}
	
	public Meni dodaj(Namirnica n) throws GPunMeni {
		if(brNam == niz.length) throw new GPunMeni();
		niz[brNam++] = n;
		return this;
	}
	
	public double energVred() {
		double ev = 0;
		for(int i=0; i<brNam; i++)
			ev += niz[i].energVred();
		return ev;
	}
	
	public String toString() {
		String s = "{";
		for(int i=0; i<brNam; i++) {
			if(i>0) s += ", ";
			s+= niz[i];
		}
		return s + "}[" + energVred() + "]";
	}
}
