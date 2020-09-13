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
        Squads squads = new Squads();
        Hero hero = new Hero("Batman", 40,"Wealthy","Brokenness");
        squads.members.add(hero);
        assertEquals(1, squads.members.size());
    }

}