public class CatTest {
    /**
     * @param args
     */
    public static void main(String[] args) {
        DomesticCat domesticCat = new DomesticCat(5, "Playful, Human friendly", 4.5, "Black stripes with brown background", "Thabo");
        WildCat wildCat = new WildCat(1, "Unpredictable, dangerous to human", 8.2, "Pale gray in winter and darker brown in summer", "Mountain regions", "Sharp teeth");

        System.out.println("Domestic Cat Info:");
        domesticCat.displayInfo();
        System.out.println("\nWild Cat Info:");
        wildCat.displayInfo();
    }
}