package kap4;
import java.util.*;

public class Postering {
	public Person ejer;
	public Konto ko;
	private int k;
	private int u;
	private int j;
	private int nyS;
	private int bilBeløb;
	
	
	public Postering() {
		
	}
	
	

public Postering(int j, int nyS, Person ejeren, Konto kot) {
		this.ejer = ejeren;
		this.ko = kot;
		ko.post.add(this);
		this.j = j;
		this.nyS = nyS;
		

}

public void info() {
	
	this.u = ejer.konti.get(j).saldo;
	this.k = u+nyS;
	if(this.ejer.ejerBil == false) {
	
	if(nyS<0) {
		if(k<0) {
			System.out.println("Ubs! "+ejer.navn+" du kan ikke hæve mere end hvad der står på din saldo som er: "+ejer.konti.get(j).saldo);
		}
		else{
			int y= j+1;
			System.out.println(ejer.navn+" har nu hævet: "+nyS+" på sin konto nr. "+y+" og har nu samlet set: "+k);	
		}}
	
		if(nyS > 0) {
		int y= j+1;
		System.out.println(ejer.navn+" har nu indsat: "+nyS+" på sin konto nr. "+y+" og har nu samlet set: "+k);	
		
		
	}
		ejer.konti.get(j).saldo = ejer.konti.get(j).saldo + nyS;
	
}
	if(this.ejer.ejerBil == true) {
		this.bilBeløb = ejer.bilBeløb;

		if(nyS<0) {
			if(k<0) {
				System.out.println("Ubs! "+ejer.navn+" du kan ikke hæve mere end hvad der står på din saldo som er: "+ejer.konti.get(j).saldo);
			}
			else{
				int y= j+1;
				System.out.println(ejer.navn+" har nu hævet: "+nyS+" på sin konto nr. "+y+" og har nu samlet set: "+k);	
			}}
		
			if(nyS > 0) {
			int y= j+1;
			System.out.println(ejer.navn+" har nu indsat: "+nyS+" på sin konto nr. "+y+" og har nu samlet set: "+k);	
			
			
		}
			ejer.konti.get(j).saldo = ejer.konti.get(j).saldo + nyS;
	}}
	
	



public void sum(int a, Person ejeren) {
	
	this.ejer = ejeren;
	
	if(this.ejer.ejerBil == true) {
		
		this.bilBeløb = ejer.bilBeløb;
		int sum = 0;
		
		for(int i = 0; i<a; i++) {
			
			int t = ejer.konti.get(i).saldo;
			sum = sum+t;
		}
		System.out.println("Samlet set har "+ejer.navn+" "+(sum+bilBeløb)+" hvoraf beløbet: "+bilBeløb+" er bilens værdi");
		System.out.println("*****************************************************");
				
		}
		
	
		
if(this.ejer.ejerBil == false) {
	
	
	int sum = 0;
	
	for(int i = 0; i<a; i++) {
		
		int t = ejer.konti.get(i).saldo;
		sum = sum+t;
	}
	System.out.println("Samlet set har "+ejer.navn+" "+sum);
	System.out.println("*****************************************************");
			
	}
	
}}
