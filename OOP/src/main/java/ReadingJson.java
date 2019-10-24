import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import models.PickEventTypeSpecification;
import org.apache.log4j.Logger;

public class ReadingJson {
    private static final Logger LOGGER  = Logger.getLogger(ReadingJson.class);
    private static Map<String,PickEventTypeSpecification> controlMap = new HashMap<>();
    private static JsonArray pickerJson= new JsonArray();

    static JsonArray mappingJson(String line){
        Gson g = new Gson();
        PickEventTypeSpecification pickEventTypeSpecification = g.fromJson(line, PickEventTypeSpecification.class);
        String id = pickEventTypeSpecification.getPicker().getId();
        String name= pickEventTypeSpecification.getPicker().getName();
        if(controlMap.containsKey(id)){

            JsonObject jsonObject= adjustJsonArray.updateJsonValue(pickEventTypeSpecification);
            for(int i=0; i<jsonObject.size(); i++){
                JsonArray object= pickerJson.getAsJsonArray();
                for (JsonElement json:object) {
                    json.toString();
                }

            }

        }else {
            controlMap.put(id,pickEventTypeSpecification );
            try{
                JsonObject jsonObject=adjustJsonArray.createJsonValue(pickEventTypeSpecification);
                pickerJson.add(jsonObject);

            }catch (Exception E){
                LOGGER.info("can't achive adding");
            }
        }
        return pickerJson;

    }

    public static void main(String[] args) {
        String directory = System.getProperty("user.home");
        String fileName = "file.txt";
        String absolutePath = directory + File.separator +"Desktop/"+fileName;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(absolutePath))) {
            String line = bufferedReader.readLine();
            while (line != null) {
                mappingJson(line);
                line = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            // exception handling
        } catch (IOException e) {
            // exception handling
        }
       adjustJsonArray.printJson(pickerJson);
    }
}
