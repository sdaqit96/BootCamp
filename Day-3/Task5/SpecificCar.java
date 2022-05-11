package Task5;

public class SpecificCar extends Car {
    private String carModel;
    public SpecificCar(int maxGear, int maxSpeed, String steering, String compnayName, String carModel){
        super(maxGear, maxSpeed, compnayName);
        this.carModel = carModel;
    }
    public String toString(){
        return "Car Specifications are: maxGears: "+getMaxGear()+" speedLimit: "+getMaxSpeed()+
                " Company: "+getCompanyName()+" Model:"+this.carModel+"";
    }
    public String currentState(){
        return "Car Current status is: currentGear: "+currentGear+" currentSpeed: "+currentSpeed+
                " Steering Directions: "+this.getStreeing();
    }
}
