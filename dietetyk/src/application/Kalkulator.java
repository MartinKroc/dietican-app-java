package application;

public class Kalkulator {
	protected int wzrost;														// Lab5.01 Zaprezentować działanie modyfikatorów dostępu
	static public double wynik; 
	protected String wniosek;
}

class BMI extends Kalkulator {
	private int masa;
	//wzrost po nadrzednej
	
	static double LiczBMI(int masa, int wzrost) {
		wzrost = wzrost*1000;
		wynik = masa/(Math.pow(wzrost,2));										//Lab3.01. Zaprezentować działanie klasy Math	
		return wynik;
	}

	String Porownaj() {															//Lab3.04. Zaprezentować wykorzystanie różnych wariantów instrukcji warunkowych
		if(wynik<18.5) wniosek = "niedowaga";
		else if (wynik>=18.5 && wynik<=24.9) wniosek = "prawidlowa waga";		//Lab3.08.	Zaprezentować działanie operatorów logicznych i bitowych
		else if (wynik>=25 & wynik<=29.9) wniosek = "nadwaga";
		else wniosek = "otylosc";
		return wniosek;
	}
}

class WHR extends Kalkulator {
	private int talia;
	private int biodra;
	
	static double LiczWHR(int talia, int biodra) {										
		try{
		wynik = talia/biodra;															//Lab10.01 Zaprezentować działanie wywoływania wyjątków
		}
		catch (ArithmeticException e) {
			System.out.println("Nastapil wyjatek: "+e.getMessage());
		}
		finally {																		//Lab10.02 Zaprezentować działanie klauzuli try-catch-finally w różnych konfiguracjach
			System.out.println("Obliczanie wskaznika WHR");
		}
		return wynik;
	}
	
	static void Porownaj(double wynik) {
		String wnioski;
		wnioski = (wynik>1) ? "sylwetka androidalna" : "sylwetka gynoidalna";				//Lab3.06. Zaprezentować zastosowanie operatora trójargumentowego
		System.out.println(wnioski);			
	}

}

class Broc extends Kalkulator {
	private String wiek;
	//wzrost po nadrzednej
	
	static double LiczBroc(int wiek, int wzrost) throws Exception {								//Lab10.07. Zaprezentować działanie klauzuli throw oraz throws
		try {
		Exception x = new Exception("wskaznik Broca jest mniejszy od zera");	//Lab10.3 Zaprezentować działanie wyjątków klasy Exception
		wynik = wzrost - 100;
		if(wynik<0) throw x;
		}
		catch(Exception e) {
			System.out.println("Wyjatek: "+e.getMessage());
		}
		return wynik;
	}


}

class Lorenz extends Kalkulator  {	
	//wzrost po nadrzednej
	static int wynikInt;
	static final int stalaDlaLorenza = 150;										//Lab5.02. 	Zaprezentować działanie zmiennych finalnych
	
	static double LiczLorenzM(int wzrost) {
		try{
		wynik = wzrost-100-((wzrost-stalaDlaLorenza)/4);
		wynikInt = (int)wynik;													//Lab3.10. Zaprezentować rzutowanie między różnymi podstawowymi typami danych
		if(wynik<0) throw new Wyjatkowy(" wyjatek");
		}														
		catch(Wyjatkowy e) {
			System.out.println("wywolano wlasny wyjatek"+e.getMessage());
		}
		return wynikInt;
		}
	
	static double LiczLorenzK(int wzrost) {
		try {
		wynik = wzrost-100-((wzrost-stalaDlaLorenza)/2);
		if(wynik<0) throw new Wyjatkowy(" wyjatek, wynik mniejszy od zera");
		}
		catch (IndexOutOfBoundsException | ArithmeticException e){
			System.out.println("Blad aretmetyczny lub przekroczono zakres "+e.getMessage());		//Lab10.6 Zaprezentować działanie operatora logicznego | (OR) w klauzuli catch
		}
		catch (Wyjatkowy e){
			System.out.println("zgloszono wlasny wyjatek: "+e.getMessage());
		}
		return wynik;
	}
}

class Wyjatkowy extends Exception {											//Lab10.4 Zaprezentować działanie własnych klas wyjątków
	public Wyjatkowy(String ms) {
		super(ms);
	}
}


class watek extends Thread {
	
	@Override
    public void run() {
			int sr = 44;
			try{
				Thread.sleep(1000);											//Lab13.04 Zaprezentować działanie metody sleep
			}catch(InterruptedException e){
				e.printStackTrace();
			}
              System.out.println(" Najczęstszy wśród użytkowników wspólczynnik BMI to : " + sr);
        
	}
}

class wersja implements Runnable {
	
	@Override
    public void run() {
              System.out.println(Thread.currentThread().getName()+ ": napisano w wersji java 8 ");
        }
}


