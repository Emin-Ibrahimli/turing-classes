package TaxiManagement;

public class Driver {

    private String name;
    private int age;
    private String licanceNumber;

    public Driver(String name, int age, String licanceNumber){

        this.name = name;
        this.age = age;
        this.licanceNumber = licanceNumber;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getLicanceNumber(){
         return licanceNumber;
    }

    public void setLicanceNumber(String licanceNumber){
        this.licanceNumber = licanceNumber;
    }

    public String toString(){
        return ("name = %s, age = %d, licanceNumber = %s ")
                .formatted(this.name, this.age, this.licanceNumber);
    }
}
