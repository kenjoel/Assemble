import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Squads {
    private String name;
    private String cause;
    ArrayList<Object> members = new ArrayList<>(); //can essentially add squad members

    public Squads(String name, String cause){
        this.name = name;
        this.cause = cause;
    }


    public List<Object> getMembers(){
        return members;
    }



}
