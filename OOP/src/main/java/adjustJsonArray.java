import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import models.PickEventTypeSpecification;
import org.apache.log4j.Logger;

public class adjustJsonArray {

    private static final Logger LOGGER= Logger.getLogger(adjustJsonArray.class);
    public static JsonObject createJsonValue(PickEventTypeSpecification pickEventTypeSpecification){
        JsonObject picker = new JsonObject();
        JsonArray allpicks= new JsonArray();
        JsonObject picks= new JsonObject();
        picks.addProperty("article_name",pickEventTypeSpecification.getArticle().getName());
        picks.addProperty("timestamp", pickEventTypeSpecification.getTimeStamp());
        picker.addProperty("picker_name",pickEventTypeSpecification.getPicker().getName());
        picker.addProperty("active_since", pickEventTypeSpecification.getPicker().getActiveSince());
        allpicks.add(picks);
        picker.add("picks",allpicks);
        return picker;
    }
    public static JsonObject updateJsonValue(PickEventTypeSpecification pickEventTypeSpecification){
        JsonObject picks= new JsonObject();
        picks.addProperty("article_name",pickEventTypeSpecification.getArticle().getName());
        picks.addProperty("timestamp", pickEventTypeSpecification.getTimeStamp());
        return picks;


    }
    public static void  printJson(JsonArray jsonArray){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonParser jp  = new JsonParser();
        String prettyJsonString = gson.toJson(jsonArray);
        LOGGER.info(prettyJsonString);
    }


    }
