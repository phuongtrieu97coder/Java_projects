public class Car {

    String modeltype;
    String brandtype;

    public Car(String model, String brand){
        modeltype = model;
        brandtype = brand;
    }
    public static void main(String[] args){
        Car carlist1 = new Car("BMW-125","BMW");
        Car carlist2 = new Car("Ferarri-125","Ferarri");
        System.out.println("Model: "+carlist1.modeltype+". Brand: "+carlist1.brandtype);
    }
}