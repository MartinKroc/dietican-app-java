package application;

import java.util.*;

class PoradaZ {
    String po;
    public PoradaZ(){};
    public PoradaZ(String por){ this.po=por; }
    public String toString(){ return "Treœæ porady: "+this.po; }
}

class PoradaX implements Comparable {
    int id;
    public PoradaX(){};
    public PoradaX(int pId){ this.id=pId; }
    public String toString(){ return "Porada: "+this.id; }
    
    public int hashCode(){
        return this.id%3;
    }
    
    public boolean equals(Object other){																//Lab3.09 Zaprezentowaæ znaczenie metody equals	
        if (other != null && other instanceof PoradaX){
            PoradaX ot = (PoradaX)other;
            return ot.id==this.id;
        }
        else {
            return false;
        }
    }
    
	@Override
	public int compareTo(Object o) {																	//Lab8.13 Zaprezentowaæ znaczenie interfejsów Serializable, Clonable, Comparable
        return this.id - ((PoradaX)o).id;
	}
}





class Porada<T> {
	
    List<T> porady = new ArrayList<T>();
    T poradaGet() { return porady.remove(0); }
    void dodajPorade(T porada) { this.porady.add(porada); }

}
