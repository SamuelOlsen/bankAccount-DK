package kap4;
import java.util.*;

public class Konto {
	
	public int saldo;
	public Person ejer;
	public ArrayList<Postering> post;
	public Postering ptt;
	
	public Konto() {
		
	}
	
	public Konto(Person ejeren, int j) {
		this.ejer = ejeren;
		post = new ArrayList<Postering>();
		ejer.konti.add(this);
		this.saldo = j;
		
	}
	
	public void udskrivPost() {
		
		
			for(Postering p : post) {
				
				p.info();
			
			}
			
			
	}
	
        public void antalKonti(int a, Person ejeren) {
		
        	this.ejer = ejeren;
		System.out.println("Antal konti: "+ejer.konti.size()+ " for person: "+ejer.navn);
		for(int i = 0; i<a; i++) {
			int t = ejer.konti.get(i).saldo;
			int y = i+1;
			System.out.println(ejer.navn+" har beløb: "+t+" kr. på konto nr. "+y);
		}
		
		
		
	}
  
        
        	
        }
	
