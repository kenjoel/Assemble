import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SquadsTest {
    @Test
    public void squadTest(){
        Squads squad = new Squads("cobra", "fifhr",22);
        Hero hero1 = new Hero("chris", 33,"VocalKiller","Sugar");
        squad.add(hero1);
        assertTrue(Squads.getMembers().contains(hero1));
    }

    @Test
    public void TestIfSquadContainsMembers(){
        List firstTest = Squads.getMembers();
        assertEquals(2, firstTest.size());
    }
}