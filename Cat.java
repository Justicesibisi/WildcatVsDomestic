public abstract class Cat {
    
    protected int age;
    protected String behavior;
    protected double averageWeight;
    protected String commonColour;

    public Cat(String type, int age, String behavior, double averageWeight, String commonColour) {
        
        this.age = age;
        this.behavior = behavior;
        this.averageWeight = averageWeight;
        this.commonColour = commonColour;
    }

    public abstract void displayInfo();
}
