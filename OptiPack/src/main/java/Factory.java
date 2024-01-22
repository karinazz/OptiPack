/**
 * Klasa implementująca interfejs BackpackFactory, służąca do tworzenia instancji plecaków.
 */
public class Factory implements BackpackFactory {

    /**
     * Metoda tworząca instancję plecaka.
     *
     * @return Nowa instancja plecaka, w tym przypadku obiekt klasy NewBackpack.
     */
    public Backpack createBackpack() {
        // tworzenie nowej instancji plecaka
        return (Backpack) new NewBackpack();
    }
}
