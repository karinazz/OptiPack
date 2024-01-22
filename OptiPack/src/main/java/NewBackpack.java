import java.util.Arrays;

/**
 * Implementacja plecaka z wykorzystaniem algorytmu programowania dynamicznego.
 */
public class NewBackpack implements Backpack {
    private int[][] table;
    private Item[] items;  // Zainicjowana jako pusta tablica przedmiotów
    private int capacity;

    /**
     * Konstruktor klasy NewBackpack.
     */
    public NewBackpack() {
        this.items = new Item[0];  // Inicjalizacja jako pusta tablica przedmiotów
    }

    @Override
    public void addItem(Item item) {
        items = Arrays.copyOf(items, items.length + 1);
        items[items.length - 1] = item;
    }

    @Override
    public int getMaxValue() {
        // Implementacja algorytmu programowania dynamicznego...
        return 0; // Dummy return, zastąp odpowiednią implementacją.
    }

    /**
     * Metoda ustawiająca pojemność plecaka.
     *
     * @param capacity Pojemność plecaka.
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
