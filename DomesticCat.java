public class DomesticCat extends Cat {
    protected String owner;

    public DomesticCat(int age, String behavior, double averageWeight, String commonColour, String owner) {
        super("Domestic cat", age, behavior, averageWeight, commonColour);
        this.owner = owner;
    }

    @Override
    public void displayInfo() {
       
        System.out.println("Age: " + age);
        System.out.println("Behavior: " + behavior);
        System.out.println("Average Weight: " + averageWeight + " kg");
        System.out.println("Common Colour: " + commonColour);
        System.out.println("Owner: " + owner);
    }
}