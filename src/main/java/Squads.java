import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Squads {
    private String name;
    private String cause;
    ArrayList<Object> members = new ArrayList<>();

    public Squads(){
        this.name = "Suicide Squad";
        this.cause = "Fight Racism";

    }


    public List<Object> getMembers(){
        return members;
    }



}
