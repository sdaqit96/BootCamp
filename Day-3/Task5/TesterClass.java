package Task5;

public class TesterClass {
    public static void main(String[] args){
        var hondaCar = new SpecificCar(5, 180, "straight", "Honda", "Civic");
        System.out.println(hondaCar.toString());
        hondaCar.currentStatus();

        System.out.println();
        hondaCar.changeGear(1);
        hondaCar.changeSpeed(30);
        hondaCar.handleSteering("right");
        hondaCar.currentStatus();

        System.out.println();
        hondaCar.changeGear(7);
        hondaCar.changeSpeed(300);
        hondaCar.handleSteering("righu");
        hondaCar.currentStatus();

        System.out.println();
        hondaCar.changeGear(5);
        hondaCar.changeSpeed(150);
        hondaCar.handleSteering("left");
        hondaCar.currentStatus();


    }

}
