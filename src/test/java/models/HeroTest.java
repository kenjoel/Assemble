package models;


import org.junit.*;
import static org.junit.Assert.*;

class HeroTest {

    @Test
    public void instantiateClass(){
        Hero hero = new Hero("Joel", 22,"SuperSpeed","Broccoli");
        assertTrue(hero instanceof Hero);
    }

}