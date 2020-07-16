package CursoPOOUber.Java;

public class Car {
  int id;
  String license;
  Account driver;
  int passengers;

  public Car(String license, Account driver){
    this.license = license;
    this.driver = driver;
  }

  void printDataCar(){
    System.out.println("License: "+license+" Name Driver: "+driver.name);
  }
}