package CursoPOOUber.Java;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hola Mundo");
    Car car = new Car("ANQ123", new Account("Andres Herrera", "347639F"));
    car.passengers = 4;
    car.printDataCar();

    Car car2 = new Car("QWES67", new Account("Andrea Herrera", "345465H")); 
    car2.passengers = 3;
    car2.printDataCar();
  }
}