package Task5;

public class Vehicle {
    private int maxGear;
    int currentGear;
    private int maxSpeed;
    int currentSpeed;
    private String streeing;
    public Vehicle(int maxGears, int maxSpeed){
        this.maxGear = maxGears;
        this.maxSpeed = maxSpeed;
        this.streeing = "straight";
    }
    public void handleSteering(String direction){
        if (direction.equals("left") || direction.equals("right") || direction.equals("straight") || direction.equals("back")){
            System.out.println("Direction Changed to: "+direction);
            this.streeing = direction;
        }
        else System.out.println("Steering Did not changed, try again.");
    }
    public void changeGear(int gear){
        if (gear <= this.getMaxGear() && gear >=0  && gear!=currentGear){
            this.currentGear = gear;
            System.out.println("Gear Changed to: "+gear);
        }
        else
        {
            System.out.println("Gear did not changed");
        }
    }
    public void changeSpeed(int speed){
        if(speed >=0 && speed <= this.getMaxSpeed() && this.currentSpeed != speed){
            this.currentSpeed = speed;
            System.out.println("Speed Changed to: "+speed);
        }
        else System.out.println("New Speed Should be between 1 and "+getMaxSpeed());
    }
    public void currentStatus(){
        System.out.println("Current speed: "+getCurrentSpeed()+" Current Gear: "+getCurrentGear()+" Steering Direction:"+getStreeing());
    }
    public int getMaxGear() {
        return maxGear;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }
    public String getStreeing() {
        return streeing;
    }
    public int getCurrentGear() {
        return currentGear;
    }
    public int getCurrentSpeed() {
        return currentSpeed;
    }


}

