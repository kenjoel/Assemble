import java.util.ArrayList;
import java.util.List;

public class Hero {
    private String name;
    private int age;
    private String specialPower;
    private String weakness;
    private static List<Hero> hInstances = new ArrayList<>();
    private int size;


    public Hero(String name, int age, String specialPower, String weakness) {
        this.name = name;
        this.age = age;
        this.specialPower = specialPower;
        this.weakness = weakness;
        hInstances.add(this);
        size = hInstances.size();

    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public  String getSpecialPower(){
        return specialPower;
    }

    public String getWeakness(){
        return weakness;
    }

    public static List<Hero> getAll() {
        return hInstances;
    }

    public static Hero addedHeroes(){
        Hero heroes = new Hero("Vilgax", 23,"Alien Intelligence and Immortality","Ben !0");
        Hero second = new Hero("Alien X", 989827, "Infinite Existance and time manipulation","Unknown");
        Hero vintage = new Hero("Cameo", 398729728,"Master god","mistress god");
        hInstances.add(heroes);
        hInstances.add(second);
        hInstances.add(vintage);
        return  hInstances;
    }
}
