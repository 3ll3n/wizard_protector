package wizard_management;
import behaviours.Protectorable;

public class Ogre extends MythicalBeast implements Protectorable {
  
  public Ogre(String name){
    super(name);
  }
  
  public String protect(){
    return "I will protect you with my shield!";
  }

}