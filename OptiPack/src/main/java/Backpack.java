/**
 * Interfejs reprezentuje plecak, do ktorego mozna dodawac przedmioty. 
 */
public interface Backpack {
    /**
     * Metoda dodajaca przedmiot do plecaka. 
     * @param item Przedmiot do dodania.
     */
    void addItem(Item item);
    /** 
     * Metoda zwracajaca max wartosc plecaka. 
     * @return Max wartosc plecaka
     */
    int getMaxValue();
    /**
     * Metoda setCapacity ustawiająca pojemność plecaka
     * @param capacity to pojemnosc, ktora ma zostac ustawiona. 
     */
    void setCapacity(int capacity);
}
