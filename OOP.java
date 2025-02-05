public class OOP{
    String carBrand;
    String carModel;
    int carYear;

    public OOP(String brand, String model, int year){
        carBrand = brand;
        carModel = model;
        carYear = year;
    }

    public static void main(String[] args){
        OOP myCar = new OOP("Toyota", "Premio", 2004);
        System.out.println(myCar.carBrand + " " + myCar.carModel + " " + myCar.carYear);
    }
}