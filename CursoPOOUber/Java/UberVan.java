package CursoPOOUber.Java;

import java.util.ArrayList;
import java.util.Map;

public class UberVan extends Car {

  Map<String, ArrayList<String>> typeCarAccepted; 
  ArrayList<String> seatMaterial;

  public UberVan(String license, Account driver, 
    Map<String, ArrayList<String>> typeCarAcepted,
    ArrayList<String> seatsMaterial)
  {
    super(license, driver);
    this.typeCarAccepted = typeCarAcepted;
    this.seatMaterial = seatsMaterial;
  }
}