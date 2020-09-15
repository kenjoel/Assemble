import org.junit.*;

import java.util.List;

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
        assertEquals(4, Squads.getMembers().size());
    }

    @Test
    public void methodTest(){
        Hero peter = new Hero("Vilgax", 22, "Heat Waves", "Water");
        assertTrue(Hero.getAll().contains(peter));
    }

    @Test
    public void testExistingHero(){
        Hero oneH = new Hero("virgo",2,"","");
        Squads.add(oneH);
        assertTrue(Squads.checkHeroInSquad(oneH));
    }

    @Test
    public void addedHeroesTest(){
        List hello = Hero.addedHeroes();
        assertEquals(7, hello.size());
    }


}