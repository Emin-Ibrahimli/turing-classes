package TaxiManagement;

public class Taxi extends Vehicle {

    private int passengerCount;
    private String taxiCompany;

    public Taxi(String brand, String model, String plateNumber, boolean isAvailable, int passegerCount, String taxiCompany) {
        super(brand, model, plateNumber, isAvailable);

        this.passengerCount = passegerCount;
        this.taxiCompany = taxiCompany;
    }
    public int getPassengerCount(){
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount){
        this.passengerCount = passengerCount;
    }

    public String getTaxiCompany(){
        return taxiCompany;
    }

    public void setTaxiCompany(String taxiCompany) {
        this.taxiCompany = taxiCompany;
    }

    public void drive(){
        System.out.println("Taxi company: " + taxiCompany + " Passenger count: " + passengerCount);
    }

    public int calculateFare(int km) {
    return km*1;
    }

    int realKm = 0;

    public int calculateFare(int km ,boolean nightShift){
        if(nightShift){
            System.out.println("Night shift rate applied." + km + "km ");
             return km*2;
        }
        else{
            System.out.println("Night shift rate applied." + km + "km ");
             return  km*1;
        }
    }

}
