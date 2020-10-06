package application;

public abstract class Czlowiek {												//Lab8.01 Zaprezentowaæ dzia³anie klas abstrakcyjnych
	public abstract String daneOs();
	private int iloscLudzi = 69;												//Lab8.03 Zaprezentowaæ dzia³anie nieabstrakcyjnych elementów klasy abstrakcyjnej
	
	public void ileLudzi() {
		System.out.println("Ludzi jest "+this.iloscLudzi);
	}
	
}

interface DaneOsobowe {
	public String podajInfo();
}

interface DaneDietetyka extends DaneOsobowe {									//Lab8.11 Zaprezentowaæ dzia³anie dziedziczenia interfejsów	
	public String WymienKwalifikacje();											//Lab8.06 Zaprezentowaæ znaczenie i zastosowanie interfejsów	
}

class Uzytkownik extends Czlowiek implements DaneOsobowe {

	String imie;
	String nazwisko;
	int wiek;
	int waga;
	
	@Override
	public String daneOs() {													//Lab8.02 Zaprezentowaæ dzia³anie metod abstrakcyjnych
		return null;
	}

	@Override
	public String podajInfo() {
		return null;
	}
	
}

class Dietetyk extends Czlowiek implements DaneDietetyka {

	int identyfikatorDietetyka;
	String imie;
	String nazwisko;
	
	@Override
	public String daneOs() {
		return null;
	}

	@Override
	public String podajInfo() {
		return null;
	}

	@Override
	public String WymienKwalifikacje() {
		return null;
	}
	
}


