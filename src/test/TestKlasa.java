package test;
import ishrana.*;

import ishrana.Meni;

public class TestKlasa {
	
	public static void main(String[] args) {
		try {
			Meni meni = new Meni(5);
			meni.dodaj(new Hrana("Hleb", 600, 7.5, 0.4, 49))
				.dodaj(new Pice("Sok", 0.2, 18540))
				.dodaj(new Hrana("Sir", 200, 17, 1.2, 4));
			System.out.println(meni);
		}catch(Exception g) {System.out.println(g);}
	}
}
