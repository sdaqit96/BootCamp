package Task5;

public class Car extends Vehicle{
    private String companyName;
    public Car(int maxGears, int maxSpeed,String companyName) {
        super(maxGears, maxSpeed);
        this.companyName = companyName;
    }
    public String getCompanyName() {
        return companyName;
    }

}
