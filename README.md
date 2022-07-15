# bankAccount-DK

So this little program consists of four classes (incl. the main class "BenytBankKonti")

first is called "Person" which is the first object we create in the main class. In this class we have a constructor which take a name of the person, and creates a new ArrayList. This ArrayList holds the Accounts created (danish name is "konto" for account). You are able to give the person a car with the method "harBil" which later will include the value from the car to the persons total assets. You are also able to use a method called "antalKonti", which take an int (person.konti.size()) parameter and shows how many accounts the person has, and how much asset is in each account.
by using "setSaldo", you can specify an account and either withdrawl or deposit an amount, it takes three parameters: index of acocunt, ammount to insert and which account you want.
by using "sum" method with (person.konti.size()) paramter you get the total asset inclusive the car value.


second is called "Konto" which have a constructor where we get the person object so every time we create a new account, we know for who the account is added to, and the ammount you want the person to start with on that account. It also set up a new ArrayList which holds informations for every time a person withdrawl or deposit an amount.

the third is called "Postering" and this is where all the information from the former mentioned classes is used and manipulated. beside the danish in the methods, they should be somewhat self explanatory. You are welcome to right to me if you need more info.

With this in the main class: 
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
    
your result should look like this:    

Antal konti: 2 for person: John
John har bel�b: 50 kr. p� konto nr. 1
John har bel�b: 100 kr. p� konto nr. 2
Samlet set har John 10150 hvoraf bel�bet: 10000 er bilens v�rdi
*****************************************************
Antal konti: 1 for person: Amanda
Amanda har bel�b: 400 kr. p� konto nr. 1
Samlet set har Amanda 55955 hvoraf bel�bet: 55555 er bilens v�rdi
*****************************************************
Amanda har nu indsat: 400 p� sin konto nr. 1 og har nu samlet set: 800
Amanda har nu indsat: 600 p� sin konto nr. 1 og har nu samlet set: 1400
Amanda har nu indsat: 1400 p� sin konto nr. 1 og har nu samlet set: 2800
Amanda har nu h�vet: -2200 p� sin konto nr. 1 og har nu samlet set: 600
4
John har nu indsat: 333 p� sin konto nr. 1 og har nu samlet set: 383



