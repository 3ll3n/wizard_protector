package wizard_management;
import behaviours.Flyable;
import behaviours.Protectorable;

public class Dragon extends MythicalBeast implements Flyable, Protectorable {

  public Dragon(String name){
    super(name);
  }

  public String fly(){
    return "Standing up tall, beating wings, lift off!";
  }

  // need to create a protect method
  // public String protect(){
  //   return "I will protect you!";
  // }

}