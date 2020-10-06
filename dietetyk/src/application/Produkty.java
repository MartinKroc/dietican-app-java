package application;

public class Produkty {																			//Lab2.02.  Zaprezentowa� w�a�ciw� (niew�a�ciw�) konstrukcj� i nazewnictwo klas

private String nazwa;
private String rodzaj;
private int kalorycznosc;
int lata_przydatnosci;
int iloscCukru;
String komunikat = "klasa dotyczaca produktow";

private static int liczbaProduktow;																//Lab2.04.  Zaprezentowa� dzia�anie metod i p�l statycznych

static {																						//Lab4.01.	Zaprezentowa� dzia�anie inicjalizacji statycznej i instancyjnej
	Produkty.liczbaProduktow = 0;
}

{
	this.iloscCukru = 69;
}

public Produkty() {}

public Produkty(String nazwa,String rodzaj,int kalorycznosc,int lata_przydatnosci) {			//Lab2.05.  Zaprezentowa� dzia�anie konstruktor�w parametrowych i bezparametrowych
	this.nazwa = nazwa;
	this.rodzaj = rodzaj;
	this.kalorycznosc = kalorycznosc;
	this.lata_przydatnosci = lata_przydatnosci;
	
	Produkty.liczbaProduktow++;
}

public String getNazwa() {																		//Lab2.03.  Zaprezentowa� dzia�anie getter�w i setter�w
	return nazwa;
}
public void setNazwa(String nazwa) {
	this.nazwa = nazwa;
}
public String getRodzaj() {
	return rodzaj;
}
public void setRodzaj(String rodzaj) {
	this.rodzaj = rodzaj;
}
public int getKalorycznosc() {
	return kalorycznosc;
}
public void setKalorycznosc(int kalorycznosc) {
	if(kalorycznosc<0) {
		System.out.println("niew�a�ciwa wartosc kaloryczno�ci");
	}
	else {
	this.kalorycznosc = kalorycznosc;
}}

public static int getLiczbaProduktow() {
	return liczbaProduktow;
}


String komunikuj() {
	return komunikat;
}

int policzCos(int lata_przydatnosci, int iloscCukru) {
	return lata_przydatnosci+iloscCukru;
}

public String toString(){
    return this.nazwa;
}


}
class Mleczne extends Produkty implements InfoProdukty {
	int iloscTluszczu;
	String zJakiejKrowy;
	String komunikuj = "jablko";
	
	public Mleczne() {
	}
	
	public Mleczne(int i, String z, String k) {
		this.iloscTluszczu=i;
		this.zJakiejKrowy=z;
		this.komunikuj=k;
	}
	
	@Override																				//Lab7.01 Zaprezentowa� dzia�anie adnotacji
	final String komunikuj() {																//Lab6.01 Zaprezentowa� dzia�anie przes�aniania w hierarchii klas
		return komunikat;																	//Lab7.02 Zaprezentowa� dzia�anie metod finalnych
	}

	@Override																		
	public String infoProdukt() {
		String komun3;
		komun3 = "To sa produkty mleczne";
		return komun3;
	}
	
	public String toString(){
        return this.komunikuj;
    }
	
}






class Pszenne extends Produkty implements InfoProdukty,InfoPszenne{						//Lab8.11 Zaprezentowa� dzia�anie dziedziczenia interfejs�w
	int zawartoscMaki;
	String rodzajPszenicy;
	
	int policzCos(int zawartoscMaki, int iloscCukru,int lata_przydatnosci) {			//Lab6.02 Zaprezentowa� dzia�anie przeci��ania w hierarchii
		return (zawartoscMaki+iloscCukru)/lata_przydatnosci;
	}

	@Override
	public String infoPszenne() {														//Lab8.12 Zaprezentowa� dzia�anie implementowania wielu interfejs�w
		String komun;
		komun = "To sa produkty pszenne";
		return komun;
	}

	@Override
	public String infoProdukt() {
		String komun2;
		komun2 = "To sa produkty pszenne dziedziczace po produktach";
		return komun2;
	}
}



interface InfoProdukty {
	public String infoProdukt();
}

interface InfoPszenne {
	public String infoPszenne();
}























