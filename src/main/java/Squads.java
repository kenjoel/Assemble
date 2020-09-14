import java.util.ArrayList;
import java.util.List;

public class Squads {
    private String name;
    private String cause;
    private int size;
    private int cqsize; //returns size of squad
    private static List<Object> members = new ArrayList<>(); //can essentially add squad members
    private List<Hero> hero = new ArrayList<>();

    public Squads(String name, String cause, int size){
        this.size = size;
        this.name = name;
        this.cause = cause;
        members.add(this);
        cqsize = members.size();
    }

    public String getName() {
        return name;
    }

    public String getCause() {
        return cause;
    }

    public int getSize() {
        return size;
    }

    public void add(Hero hero){
        members.add(hero);
    }



    public static List<Object> getMembers(){
        return members;
    }



}
