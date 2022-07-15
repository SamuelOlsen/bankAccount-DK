package kap4;

import java.util.*;

public class Person {
	
	public String navn;
	public int saldo;
	public Postering pos;
	public Konto kost;
	public ArrayList<Konto> konti;
	public Boolean ejerBil = false;
	public int bilBeløb;
	
	
	
	public Person(String navn) {
		konti = new ArrayList<Konto>();;
		this.navn = navn;
		
	}
	
	public void harBil(Boolean a, int bilBeløb) {
		
		this.ejerBil = a;
		this.bilBeløb = bilBeløb;
		
		
	}
	
	public void antalKonti(int a) {
		
		kost = new Konto();
		kost.antalKonti(a, this);
		
	}
	
	public void setSaldo(int index, int beløbIndsat, Konto kot) {
		
	
		
		pos = new Postering(index, beløbIndsat, this, kot);
		
	}
	
	
	public void sum(int a) {
		
	
	pos = new Postering();
		pos.sum(a, this);
	
			
	}
	
	
	
	

}
