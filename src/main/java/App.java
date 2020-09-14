import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static spark.Spark.*;

public class App {

    static int getHerokuAssignedPort() {
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (processBuilder.environment().get("PORT") != null) {
            return Integer.parseInt(processBuilder.environment().get("PORT"));
        }
        return 4567; //return default port if heroku-port isn't set (i.e. on localhost)
    }
    public static void main(String[] args) { //type “psvm + tab” to autocreate this
        port(getHerokuAssignedPort());
        staticFileLocation("/public");

        //get: index route which is base route
        get("/", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

        //route to form to create squad
        get("/form", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "form.hbs");
        }, new HandlebarsTemplateEngine());


        get("/heroes", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            model.put("addedH", Hero.addedHeroes());
            return new ModelAndView(model, "allhero.hbs");
        }, new HandlebarsTemplateEngine());


        //post route after its created
        post("/success", (request, response) -> {
            String name = request.queryParams("name");
            int size = Integer.parseInt(request.queryParams("size"));
            String cause = request.queryParams("cause");

            Squads squad = new Squads(name,cause,size);

            Map<String, Object> model = new HashMap<>();
            model.put("squad", squad);
            return new ModelAndView(model, "success.hbs");
        }, new HandlebarsTemplateEngine());



        get("/newform", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            model.put("squads", Squads.getMembers());
            return new ModelAndView(model, "newform.hbs");
        }, new HandlebarsTemplateEngine());
    }
}
