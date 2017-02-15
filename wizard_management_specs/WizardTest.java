import static org.junit.Assert.*;
import org.junit.*;
import wizard_management.*;

public class WizardTest {

  Wizard wizard;
  Broomstick broomstick;
  Dragon protector;
  Ogre ogre;

  @Before
  public void before(){
    protector = new Dragon("Rex");
    ogre = new Ogre("Bob");
    broomstick = new Broomstick("Nimbus", 10);
    wizard = new Wizard("Toby", broomstick, protector);
  }

  @Test
  public void hasName(){
    assertEquals("Toby", wizard.getName());
  }

  @Test
  public void hasBroomstick(){
    Broomstick ride = (Broomstick)wizard.getRide();
    assertEquals("Nimbus", ride.getBrand());
  }

  @Test
  public void canFlyBroomstick(){
    assertEquals(wizard.fly(),"mounting broom, running, skipping, flying!");
  }

  @Test
  public void canFlyDragon(){
    Dragon dragon = new Dragon("Smaug");
    wizard = new Wizard("Ridcully", dragon, dragon);
    assertEquals("Standing up tall, beating wings, lift off!", wizard.fly());
  }

  @Test
  public void canFlyMagicCarpet(){
    MagicCarpet magiccarpet = new MagicCarpet("pink");
    wizard = new Wizard("Leon", magiccarpet, protector);
    assertEquals("Hovering up, straightening out, flying off!", wizard.fly());
  }

  @Test
  public void canSetRide(){
    Dragon dragon = new Dragon("Erik");
    wizard.setRide(dragon);
    assertEquals("Standing up tall, beating wings, lift off!", wizard.fly());
  }

  // @Test
  // public void wizardCanProtectSelfWithDragon(){
  //   wizard = new Wizard("Oz", dragon, dragon);
  //   assertEquals();
  // }

  // @Test
  // public void wizardCanProtectSelfWithOgre(){
  //   wizard = new Wizard("Rumple", magiccarpet, ogre)
  //   assertEquals();
  // }
}