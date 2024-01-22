/**
 * Głowna klasa aplikacji, testuje implementacje problemu plecakowego.
 */
public class Main {
    /**
     * Główna metoda
     * @param args  Argumenty wiersza polecen.
     */
    public static void main(String[] args) {
        BackpackFactory factory = new Factory();
        Backpack backpack = factory.createBackpack();

        Item item1 = new Item("Laptop", 3, 3000);
        Item item2 = new Item("Kamera", 1, 1500);
        Item item3 = new Item("Telefon", 2, 2000);

        backpack.addItem(item1);
        backpack.addItem(item2);
        backpack.addItem(item3);

        backpack.setCapacity(4);

        int maxValue = backpack.getMaxValue();
        System.out.println("Maksymalna wartość plecaka: " + maxValue);
    }
}
