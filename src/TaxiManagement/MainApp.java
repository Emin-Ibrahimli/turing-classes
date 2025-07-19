package TaxiManagement;

public class MainApp {
    public static void main(String[] args) {

        Vehicle v1 = new Taxi("BYD","Destroyer 05","77-CH-376",true,5,"Wolt");
        Vehicle v2 = new Bus("BMC","Procity","99-EE-500",true,60,false);
        v1.drive();
        v2.drive();

        if(v1 instanceof Taxi){
            Taxi taxi = (Taxi) v1;
            int fare = taxi.calculateFare(20, true);
            System.out.println(fare);
        }

        Driver d1 = new Driver("Aslan",27,"421AAF");
        Driver d2 = new Driver("Ibrahim",34,"121ADW");

        System.out.println(d1);
        System.out.println(d2);

    }
}
