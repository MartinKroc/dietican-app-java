package application;
	
import java.util.*;
import java.io.*;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
//import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application implements EventHandler<ActionEvent> {											//Lab12.01 Zaprezentowaæ dzia³anie obiektów klas rozszerzaj¹cych klasê Application
	Stage window;
	Scene menuScene, calulateBMIScene, usersScene, productsScene, infoScene;  
	 @Override
	    public void start(Stage primaryStage) {
		 	window = primaryStage;												
		 	
		 	// menu g³ówne
		 	Label l1 = new Label("menu kalkulatora");
	        Button btn1 = new Button("kalkulatory dietetyczne");
	        btn1.setOnAction(e -> window.setScene(calulateBMIScene));
	        Button btn2 = new Button("u¿ytkownicy");
	        btn2.setOnAction(e -> window.setScene(usersScene));
	        Button btn3 = new Button("produkty spo¿ywcze");
	        btn3.setOnAction(e -> window.setScene(productsScene));
	        Button btn4 = new Button("porady ¿ywieniowe");
	        btn4.setOnAction(e -> window.setScene(infoScene));
	        Button btn5 = new Button("wyjœcie");
	        btn5.setOnAction(e -> Platform.exit());	        
	        VBox layout1 = new VBox(10);										//Lab12.04 Zaprezentowaæ dzia³anie layout-managerów
	        layout1.getChildren().addAll(l1,btn1,btn2,btn3,btn4,btn5);	     
	        menuScene = new Scene(layout1,400,800);
	       
	        
	        // scena kalkulatora dietetycznego
	        
	        Thread watek = new watek();
	    	System.out.println(Thread.currentThread().getName()+ ": Ciekawostka");
	    	watek.start();																				//Lab13.01 Zaprezentowaæ dzia³anie obiektów klas dziedzicz¹cych z Thread
	    	
	    	try {
	    		watek.join();																			//Lab13.05 Zaprezentowaæ dzia³anie metody join
	    	} catch (InterruptedException e) {
	    			throw new IllegalStateException(e);
	    	}
	    	
	    	Runnable ostatniaAk = () -> {
	    		System.out.println(Thread.currentThread().getName()+": czas ostatniej aktualizacji programu: 12 czerwca 2019");
	    	};
	    	new Thread(ostatniaAk).start();																//Lab13.03 Zaprezentowaæ wykorzystanie notacji lambda w tworzeniu nowych w¹tków
	    	
	    	Runnable wersja = new wersja();																//Lab13.02 Zaprezentowaæ dzia³anie obiektów klas implementuj¹cych interfejs Runnable
	    	Thread th = new Thread(wersja);
	    	th.start();
	    	
	        
	        Button btnp1 = new Button("powrót");
	        Label kwprowadz = new Label("Wybierz kalkulator: ");
	        btnp1.setOnAction(e -> window.setScene(menuScene));
	        VBox layout2 = new VBox(5);
	        layout2.setPadding(new Insets(5));	     
	        
	        CheckBox box1 = new CheckBox("BMI (wprowadz mase i wzrost)");
	        CheckBox box2 = new CheckBox("WHR (wproadz obwod talii i bioder");
	        CheckBox box3 = new CheckBox("Wzór Broca (podaj swoj wiek i wzrost)");
	        CheckBox box4 = new CheckBox("Wzór Lorentza (podaj wzrost i p³eæ)");
	        
	        Label kwprowadz7 = new Label("P³eæ: ");
	        CheckBox box5 = new CheckBox("Kobieta");
	        CheckBox box6 = new CheckBox("Mezczyzna");
	        
	        
	        Label kwprowadz2 = new Label("Masa cia³a: ");
	        TextField ktext1 = new TextField();
	        ktext1.setMinWidth(50);
	        Label kwprowadz3 = new Label("Wzrost: ");
	        TextField ktext2 = new TextField();
	        ktext2.setMinWidth(50);
	        Label kwprowadz4 = new Label("Obwód talii: ");
	        TextField ktext3 = new TextField();
	        ktext3.setMinWidth(50);
	        Label kwprowadz5 = new Label("Obwód bioder: ");
	        TextField ktext4 = new TextField();
	        ktext4.setMinWidth(50);
	        Label kwprowadz6 = new Label("Wiek: ");
	        TextField ktext5 = new TextField();
	        ktext4.setMinWidth(50);
	        
	        Button kbtn1 = new Button("Oblicz");
	        
	                     
	        Label kwprowadz8 = new Label("Wynik: ");
	        TextField kwynik = new TextField();
	        
	        kbtn1.setOnAction(e -> handleOptions(box1,box2,box3,box4,box5,box6,ktext1,ktext2,ktext3,ktext4,ktext5,kwynik));	
	        
	        
	        layout2.getChildren().addAll(kwprowadz,box1,box2,box3,box4,kwprowadz7,box5,box6,kwprowadz2,ktext1,kwprowadz3,ktext2,kwprowadz4,ktext3,kwprowadz5,ktext4,kwprowadz6,ktext5,kbtn1,kwprowadz8,kwynik,btnp1);
	        calulateBMIScene = new Scene(layout2,400,800);
	        
	        // scena u¿ytkowników
	        Label uwprowadz1 = new Label("U¿ytkownicy programu: ");
	        
	        Uzytkownik nowy = new Uzytkownik();
	        Czlowiek nowy2 = (Czlowiek) new Uzytkownik();
	        nowy2.ileLudzi();
	        
	        Uzytkownik us = new Uzytkownik();
	        DaneOsobowe dane = (DaneOsobowe) us;	
	        
	        DaneOsobowe nowyuz = new DaneOsobowe(){																					//Lab8.08 Zaprezentowaæ tworzenie klasy anonimowej na podstawie interfejsu
	    		
	        	@Override
	    		public String podajInfo(){
	    			String informacja = "dane osobowe na temat uzytkownikow kalkulatora";
	    			return informacja;
	    		}	     
	    	};
	    	
	    	
	    	
	    	
	        String inff = nowyuz.podajInfo();
	        System.out.println(inff);
	        

	        
	        Button ubtn3 = new Button("Liczba u¿ytkowników");
	        ubtn3.setOnAction(new EventHandler<ActionEvent>() {													//Lab8.09 Zaprezentowaæ tworzenie obiektu anonimowego na podstawie interfejsu
	        	@Override
	        	public void handle(ActionEvent ev) {
	        		nowy.ileLudzi();																			//Lab8.02 Zaprezentowaæ dzia³anie metod abstrakcyjnych
	        	}
	        	

	        });
	        Button ubtn4 = new Button("Liczba u¿ytkowników");
	        ubtn4.setOnAction(new EventHandler<ActionEvent>() {
	        	@Override
	        	public void handle(ActionEvent ev) {
	    	        Czlowiek nowy2 = (Czlowiek) new Uzytkownik();												//Lab8.04 Zaprezentowaæ dzia³anie rzutowania obiektów na typ klasy abstrakcyjnej
	    	        nowy2.ileLudzi();																			
	        	}
	        });
	        Button ubtn5 = new Button("Dane osobowe u¿ytkownika");
	        ubtn4.setOnAction(new EventHandler<ActionEvent>() {
	        	@Override
	        	public void handle(ActionEvent ev) {
	    	        Uzytkownik us = new Uzytkownik();
	    	        DaneOsobowe dane = (DaneOsobowe) us;														//Lab8.05 Zaprezentowaæ dzia³anie rzutowania obiektów na typ interfejsu
	        	}
	        });
	             
	        
	        
	        Button btnp2 = new Button("powrót");
	        btnp2.setOnAction(e -> window.setScene(menuScene));
	        VBox layout3 = new VBox(10);
	        layout3.getChildren().addAll(uwprowadz1,ubtn3,ubtn4,ubtn5,btnp2);	        
	        usersScene = new Scene(layout3,400,800);
	        
	        // scena produktów spo¿ywczych	   
	        
	        TextArea produkt = new TextArea();
	        produkt.setEditable(false);
	        	   
	        Button pbtn1 = new Button("Wyœwietl produkty spo¿ywcze");
	        pbtn1.setOnAction(e -> {
	        	File pliki = new File("produktyuz.txt");							//Lab11.01 Zaprezentowaæ dzia³anie obiektów klasy File	
	        	try {
					Scanner odczyt = new Scanner(pliki);
					String te = "";
					while (odczyt.hasNextLine())
					{
					te = te +" "+  odczyt.nextLine();					
					}
					produkt.setText(te);
					odczyt.close();
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				}
	        	
	        });
	        
	        Label plab1 = new Label("dodaj produkt: ");
	        TextField produkt2 = new TextField();
	        
	        Button pbtn2 = new Button("Dodaj produkt do pliku");
	        pbtn2.setOnAction(e -> {
	        	FileWriter wr = null;
	        	try {
	        		wr = new FileWriter("produktyuz.txt",true);										//Lab11_02 Zaprezentowaæ dzia³anie obiektów klasy FileWriter
	        		wr.write(" "+produkt2.getText());
	        		wr.close();
					
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
				
	        	
	        });
	        
	        
	        Produkty prod = new Produkty();
	        prod.setNazwa("bekon");
	        prod.setRodzaj("mieso");
	        prod.setKalorycznosc(67);
	        
	        System.out.println("Produkt dnia! "+prod.getNazwa() +" rodzaju: "+prod.getRodzaj()+ " kalorycznosc: "+prod.getKalorycznosc());      //Lab2.03 Zaprezentowaæ dzia³anie getterów i setterów
	        
	        
	        Produkty prod2 = new Produkty("maslo","nabial",566,1);
	        System.out.println("Wczorajszy produkt dnia: "+prod2.getNazwa() +" rodzaju: "+prod2.getRodzaj()+ " kalorycznosc: "+prod2.getKalorycznosc());  //Lab2.05 Zaprezentowaæ dzia³anie konstruktorów parametrowych i bezparametrowych
	           
	        Button btnp3 = new Button("powrót");
	        btnp3.setOnAction(e -> window.setScene(menuScene));
	        VBox layout4 = new VBox(10);
	        layout4.getChildren().addAll(pbtn1,produkt,plab1,produkt2,pbtn2,btnp3);	        
	        productsScene = new Scene(layout4,400,800);
	        
	        // scena porad ¿ywieniowych	  
	        
	        Button zbtn1 = new Button("porady dotyczace sniadania");
	        zbtn1.setOnAction(e -> {
	        List sniadanie = new ArrayList();													//Lab9.01 Zaprezentowaæ dzia³anie list bez narzuconego typu obiektów
	        sniadanie.add("dobra jest jajecznica");
	        sniadanie.add("a jeszcze lepsze s¹ parówki");
	        sniadanie.add("do tego koniecznie kawa sypana");
	        
	        sniadanie.sort(null);																//Lab4.05 Zaprezentowaæ dzia³anie metod z klasy Arrays.*
	        
	        for(Object obj : sniadanie){
	    		String str=(String) obj;
	    		System.out.println(str);
	    	}
	        
	        String por1 = "boczek";
	        String por2 = "wedlina";
	        String por3 = "herbata";
	        
	        String[] porad = {por1,por2,por3};
	        System.out.println(Arrays.toString(porad));
	        
	        String por4 = "ser bialy";
	        String por5 = "ser zolty";
	        String por6 = "mleko";
	        
	        String[] porad2 = {por4,por5,por6};
	        System.out.println(Arrays.toString(porad2));
	        
	        System.out.println("porownanie co jest lepsze na sniadanie: ");
	        boolean tak = porad.equals(porad2);												//Lab4.04 wskazaæ znaczenie i zastosowaæ p³ytkie i g³êbokie porównywanie tablic
	        if(tak) System.out.println("lekkie sniadanie jest lepsze");
	        else System.out.println("ciezkie sniadanie jest lepsze: ");
	        System.out.println("inne porownanie: ");
	        boolean tak2 = Arrays.equals(porad, porad2);
	        if(tak) System.out.println("lepiej jesc nabial");
	        else System.out.println("lepiej jesc mieso ");
	        
	        });
	        
	        Button zbtn2 = new Button("porady dotyczace obiadu");
	        zbtn2.setOnAction(e -> {
	        	List<String> obiad = new ArrayList<String>();									//Lab9.02 Zaprezentowaæ dzia³anie list z narzuconym typem obiektów	
	        	obiad.add("na obiad dobry jest rosó³");
	        	obiad.add("zalecane s¹ te¿ schabowe z ziemniakami");
	        	obiad.add("do popicia kompot");
	        	obiad.add("na deser lody");
	        	
	        for(String str : obiad){
	        	String myString=str;
	        	System.out.println(myString);}
	        		});
	        
	        Button zbtn3 = new Button("porady dotyczace kolacji");
	        zbtn3.setOnAction(e -> { 
	        	Porada<PoradaZ> poradnik = new Porada<PoradaZ>();							//Lab9.03 Zaprezentowaæ dzia³anie w³asnej klasy parametryzowanej typem
	        	poradnik.dodajPorade(new PoradaZ("nie jest zbyt pozno"));
	        	poradnik.dodajPorade(new PoradaZ("wypic herbatke"));
	        	poradnik.dodajPorade(new PoradaZ("kanapka z szynka"));

	        	while(poradnik.porady.size()>0){
	    			PoradaZ por = poradnik.poradaGet();
	    			System.out.println("Porada: "+por);
	        	}
	        		});
	        
	        Button zbtn4 = new Button("porady dotyczace podwieczorka");
	        zbtn4.setOnAction(e -> { 
	        	Produkty p1 = new Produkty("Kielbasa","mieso",55,1);
	        	Produkty p2 = new Mleczne(22, "laciata", "dobre mleko");												//Lab6.04. Zaprezentowaæ dzia³anie rzutowania w dó³
	        	Produkty p3 = new Produkty("Kalafior","warzywa",10,3);

	        	Produkty[] p = {p1, p2, p3};																			//Lab7.03. Zaprezentowaæ dzia³anie tablic typu bazowego przechowuj¹cych obiekty ró¿nych typw pochodnych
	        	System.out.println("Porady co jesc na podwieczorek: "+Arrays.toString(p));
	        	
	        	Produkty p4 = (Produkty) new Mleczne();																	//Lab6.03. Zaprezentowaæ dzia³anie rzutowania w górê
	        	System.out.println("Dodatkowa porada: "+p4.toString());
	        	
	        	
	        	
	        		});
	        Button zbtn5 = new Button("porady dotyczace picia");
	        zbtn5.setOnAction(e -> { 
	        	List<String> Picie = new LinkedList<String>();								//Lab9.04 Zaprezentowaæ dzia³anie obiektów klasy LinkedList	
	        	Picie.add("pij du¿o wody");
	        	Picie.add("ograniczaj kawê");
	        	Picie.add("nie pij napojów energetycznych");
	        	for(String s : Picie) System.out.println("Co piæ "+s);
    		});
	        
	        Button zbtn6 = new Button("porady dotyczace podjadania noc¹");
	        zbtn6.setOnAction(e -> { 
	        	Set<String> podjadanie = new HashSet<String>();							//Lab9.05 Zaprezentowaæ dzia³anie obiektów klasy HashSet	
	        	podjadanie.add("najlepiej tak nie rob");

	        	for(String s : podjadanie) System.out.println("Kluczowa porada: "+s);


    		});
	        
	        Button zbtn7 = new Button("porady dotyczace drugiego œniadania");
	        zbtn7.setOnAction(e -> { 
	        	Set<String> drugieSniadanie = new TreeSet<String>();					//Lab9.06 Zaprezentowaæ dzia³anie obiektów klasy TreeSet
	        	drugieSniadanie.add("zjedz jakiœ owoc");
	        	drugieSniadanie.add("napij siê");
	        	drugieSniadanie.add("pamiêtaj o nim!");
	        	for(String s : drugieSniadanie) System.out.println("Na drugie œniadanie: "+s);
    		});
	        
	        Button zbtn8 = new Button("porady dotyczace przek¹sek");
	        zbtn8.setOnAction(e -> { 
	        	Map<Integer, String> Przekaska = new HashMap<Integer, String>();				//Lab9.07 Zaprezentowaæ dzia³anie obiektów klasy HashMap
	        	Przekaska.put(1, "jedz malo czipsow");
	        	Przekaska.put(3, "ograniczaj czekolade");
	        	Przekaska.put(2, "zjedz jakis owoc");
	        	Przekaska.put(3, "nie napychaj sie");
	        	Przekaska.put(3, "nie jedz zbyt wiele fast foodow");

	        	for(Map.Entry<Integer, String> entry : Przekaska.entrySet()) {
	        		Integer key = entry.getKey();
	        		String  value = entry.getValue();
	        		System.out.println("Porada numer:"+key+": "+value);
	        	}
    		});
	        
	        Button zbtn9 = new Button("porady dotyczace diety studenckiej");
	        zbtn9.setOnAction(e -> { 
	        	Map<Integer, String> bieda = new TreeMap<Integer, String>();				//Lab9.08 Zaprezentowaæ dzia³anie obiektów klasy TreeMap
	        	bieda.put(1, "tanie bedzie zrobienie leczo");
	        	bieda.put(3, "z jednej torebki herbaty parz kilka razy");

	        	for(Map.Entry<Integer, String> entry : bieda.entrySet()) {
	        		Integer key = entry.getKey();
	        		String  value = entry.getValue();
	        		System.out.println("porada nr:"+key+": "+value);
	        	}
    		});
	        
	        Button zbtn10 = new Button("ogolne porady dotyczace diety zdrowej");
	        zbtn9.setOnAction(e -> { 
	        	Map<PoradaX, String> zdrowo = new HashMap<PoradaX, String>();				//Lab9.09 Zaprezentowaæ dzia³anie przes³oniêcia metod hashCode oraz equals w przypadku wykorzystania struktur HashMap
	        	zdrowo.put(new PoradaX(1434), "kupuj dobre jakosciowo produkty");
	        	zdrowo.put(new PoradaX(2123), "nie jedz duzo cukru");
	        	zdrowo.put(new PoradaX(3241), "pij duzo plynow");

	        	for(Map.Entry<PoradaX, String> entry : zdrowo.entrySet()) {
	        		System.out.println("Porada: "+entry.getKey()+":  - "+entry.getValue());
	        	}
    		});
	        
	        Button zbtn11 = new Button("ogolne porady dotyczace diety niezdrowej");
	        zbtn9.setOnAction(e -> { 
	        	Map<PoradaX, String> niezdrowo = new TreeMap<PoradaX, String>();			//Lab9.10 Zaprezentowaæ dzia³anie przes³oniêcia metody compareTo w przypadku wykorzystania struktur TreeMap
	        	niezdrowo.put(new PoradaX(14), "kupuj dobre jakosciowo produkty");
	        	niezdrowo.put(new PoradaX(23), "nie jedz duzo cukru");
	        	niezdrowo.put(new PoradaX(32), "pij duzo plynow");

	        	for(Map.Entry<PoradaX, String> entry : niezdrowo.entrySet()) {
	        		System.out.println("Porada: "+entry.getKey()+":  - "+entry.getValue());
	        	}
    		});
	        
	        	        
	        Button btnp4 = new Button("powrót");
	        btnp4.setOnAction(e -> window.setScene(menuScene));
	        VBox layout5 = new VBox(10);
	        layout5.getChildren().addAll(zbtn1,zbtn2,zbtn3,zbtn4,zbtn5,zbtn6,zbtn7,zbtn8,zbtn9,zbtn10,zbtn11,btnp4);	        
	        infoScene = new Scene(layout5,400,800);
	        
	        window.setScene(menuScene);											//Lab12.02 Zaprezentowaæ w praktyce pojêcia STAGE i SCENE
	        window.setTitle("Menu glowne");
	        window.show();
	    }
	 
	 	
	 
	    public static void main(String[] args) {
	        launch(args);
	    }



		@Override
		public void handle(ActionEvent event) {
			
		}
		
		private void handleOptions(CheckBox bmi, CheckBox wnr, CheckBox broc, CheckBox lorenz, CheckBox kobieta, CheckBox mezczyzna, TextField masa, TextField wzrost, TextField talia, TextField biodra, TextField wiek, TextField wynik) {
			
			if(bmi.isSelected()) {
				int masaa = Integer.parseInt(masa.getText());
				int wzrostt = Integer.parseInt(wzrost.getText());
				double wynikk = BMI.LiczBMI(masaa, wzrostt);															//Lab2.04 Zaprezentowaæ dzia³anie metod i pól statycznych	
				wynik.setText(Double.toString(wynikk));																	//Lab3.02 Zaprezentowaæ dzia³anie konwersji liczb na ³añcuchy znaków
        	}
        	
        	if(wnr.isSelected()) {
        		int taliaa = Integer.parseInt(talia.getText());
				int biodraa = Integer.parseInt(biodra.getText());
				double wynikkk = WHR.LiczWHR(taliaa, biodraa);
				WHR.Porownaj(wynikkk);
				wynik.setText(Double.toString(wynikkk));
        	}
        	
        	if(broc.isSelected()) {
        		int wiekk = Integer.parseInt(wiek.getText());
        		int wzrosttt = Integer.parseInt(wzrost.getText());
				double wynikkkk =0;
				try {
					wynikkkk = Broc.LiczBroc(wiekk,wzrosttt);
				} catch (Exception e) {
					System.out.println("Wyjatek: "+e.getMessage());
				}
				wynik.setText(Double.toString(wynikkkk));
				if(kobieta.isSelected()) {
					wynikkkk = wynikkkk-(wynikkkk*0.1);
					wynik.setText(Double.toString(wynikkkk));
					
				}
				if(mezczyzna.isSelected()) {
					wynikkkk = wynikkkk-(wynikkkk*0.05);
					wynik.setText(Double.toString(wynikkkk));
				}
        	}
        	if(lorenz.isSelected()) {
        		int wzrostttt = Integer.parseInt(wzrost.getText());							//Lab3.03 Zaprezentowaæ dzia³anie konwersji ³añcuchów znaków na zmienne odpowiednich typów
				if(kobieta.isSelected()) {
					double w2 = Lorenz.LiczLorenzK(wzrostttt);
					wynik.setText(Double.toString(w2));
					
				}
				if(mezczyzna.isSelected()) {
					double w3 = Lorenz.LiczLorenzM(wzrostttt);
					wynik.setText(Double.toString(w3));
				}
        	}
        }
}















