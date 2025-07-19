package TaxiManagement;

public class Vehicle {
    private String brand;
    private String model;
    private String plateNumber;
    private boolean isAvailable;

    public Vehicle(String brand, String model, String plateNumber, boolean isAvailable){
        this.brand = brand;
        this.model = model;
        this.plateNumber = plateNumber;
        this.isAvailable = isAvailable;
    }

    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getModel(){
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPlateNumber(){
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public boolean getIsAvailable(){
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public void drive(){
        System.out.println("Vehicle is moving...");
    }

    public void vehicleInfo(String brand, String model, String plateNumber){
        System.out.println("Vehicle info: " + brand + model + plateNumber);
    }

}
