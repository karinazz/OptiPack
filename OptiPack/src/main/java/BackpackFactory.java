/**
 * Interfejs reprezentujący fabrykę plecaków, która dostarcza metody do tworzenia instancji plecaka.
 */
public interface BackpackFactory {
    /**
     * Metoda abstrakcyjna służąca do tworzenia instancji plecaka.
     *
     * @return Nowa instancja plecaka, zgodna z interfejsem Backpack.
     */
    Backpack createBackpack();
}
