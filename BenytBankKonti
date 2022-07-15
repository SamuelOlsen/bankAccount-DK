package kap4;

public class BenytBankKonti {

	public static void main(String[] args) {
		
		Person p = new Person("John");
		p.harBil(true, 10000);
		Konto kt = new Konto(p, 50);
		Konto kk2 = new Konto(p, 100);
		p.antalKonti(p.konti.size());
		p.sum(p.konti.size());
		
		Person t = new Person("Amanda");
		Konto kk = new Konto(t, 400);
		t.harBil(true, 55555);
		t.antalKonti(t.konti.size());
		t.sum(t.konti.size());
		t.setSaldo(0, 400, kk);
		t.setSaldo(0, 600, kk);
		t.setSaldo(0, 1400, kk);
		t.setSaldo(0, -2200, kk);
		kk.udskrivPost();
		System.out.println(kk.post.size());
		
		p.setSaldo(0, 333, kt);
		kt.udskrivPost();
	
	}

}
