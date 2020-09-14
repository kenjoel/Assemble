import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static spark.Spark.*;

public class App {
    public static void main(String[] args) { //type “psvm + tab” to autocreate this
        staticFileLocation("/public");

        //get: show new post form
        get("/", (req, res) -> {
            Hero hero1 =  new Hero("Vilgax", 22, "Heat Waves", "Water");
            Hero hero2 = new Hero("WildMat",30,"Alien Vision and Flight","Broccoli");
            Hero hero4 = new Hero("Titanium",1000,"Strength And Durability","Slow");
            Hero hero3 = new Hero("GreyMatter",2000,"Super Intelligence","KumFoolery");
            Hero hero5 = new Hero("Ghost Freak",200,"Invisibility","GhostBusters");
            Hero hero6 = new Hero("Alien X",70,"Time Travel and Manipulation","None");

            Map<String, Object> model = new HashMap<>();

            ArrayList<Hero> master = Hero.getAll();
            model.put("Heros", master);
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

        get("/form", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "form.hbs");
        }, new HandlebarsTemplateEngine());
    }
}
