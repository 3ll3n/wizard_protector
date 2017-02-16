package wizard_management;
import behaviours.Flyable;
import behaviours.Protectorable;

public class Wizard {
  String name;
  private Flyable ride;
  private Protectorable protector;

  public Wizard(String name, Flyable ride, Protectorable protector){
    this.name = name;
    this.ride = ride;
    this.protector = protector;
  }

  public String getName(){
    return this.name;
  }

  public Flyable getRide(){
    return this.ride;
  }

  public String fly(){
    return this.ride.fly();
  }

  public void setRide(Flyable ride){
    this.ride = ride;
  }

  // need to create a protect method
  public String protect(){
    return this.protector.protect();
  }

  public void setProtector(Protectorable protector){
    this.protector = protector;
  }
  
  
}