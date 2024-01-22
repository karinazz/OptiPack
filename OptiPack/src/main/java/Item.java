/**
 * Klasa Item, przedmiot, ktory mozna umiescic w plecaku.
 */
public class Item {
    private String name; 
    private int weight;
    private int value; 
 
    /**
     * Kontrukt. klasy Item.
     * @param name Nazwa przedmiotu.
     * @param weight Waga przedmiotu.
     * @param value  Wartość przedmiotu.
     */
    
    public Item(String name, int weight, int value){
        this.name=name;
        this.weight=weight;
        this.value=value;
    }
    
    // pozostałe metody klasy Item - getName, getWeight, getValue


    /**
     * Metoda getName - Zwraca nazwę przedmiotu.
     * @return Nazwa przedmiotu.
     */
    public String getName(){
        return name;
    }
    
    /**
     * Metoda getWeight - Zwraca wagę przedmiotu.
     * @return Waga przedmiotu.
     */
    public int getWeight(){
        return weight;
    }
    
    /**
     * Metoda getValue - Zwraca wartość przedmiotu.
     * @return Wartość przedmiotu.
     */
    public int getValue(){
        return value;
    }
}

