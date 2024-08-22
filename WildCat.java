public class WildCat extends Cat {
    protected String habitat;
    protected String specialFeature;

    public WildCat(int age, String behavior, double averageWeight, String commonColour, String habitat, String specialFeature) {
        super("Wild cat", age, behavior, averageWeight, commonColour);
        this.habitat = habitat;
        this.specialFeature = specialFeature;
    }

    @Override
    public void displayInfo() {
        System.out.println("Type: Wild cat");
        System.out.println("Age: " + age);
        System.out.println("Behavior: " + behavior);
        System.out.println("Average Weight: " + averageWeight + " kg");
        System.out.println("Common Colour: " + commonColour);
        System.out.println("Habitat: " + habitat);
        System.out.println("Special Feature: " + specialFeature);
    }
}