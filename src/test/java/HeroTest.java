import org.junit.*;
import static org.junit.Assert.*;

public class HeroTest {

    @Test
    public void instantiateClass(){
        Hero hero = new Hero("Joel", 22,"SuperSpeed","Broccoli");
        assertTrue(true);
    }

    @Test
    public void checkValues(){
        Squads squads = new Squads("","",4);
        Hero hero = new Hero("Batman", 40,"Wealthy","Brokenness");
        squads.add(hero);
        assertEquals(1, squads.getMembers().size());
    }

    @Test
    public void methodTest(){
        Hero peter = new Hero("Vilgax", 22, "Heat Waves", "Water");
        assertTrue(Hero.getAll().contains(peter));
    }


}