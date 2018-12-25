import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSON_Reader
{
    public static void main(String args[]) throws FileNotFoundException, IOException, ParseException
    {
        JSONParser parser = new JSONParser();
        try
        {
            Object object = parser.parse(new FileReader("c:\\sample.json"));
            
            //convert Object to JSONObject
            JSONObject jsonObject = (JSONObject)object;
            JSONArray jsonList = ((Object) jsonObject).getJSONArray("test");
            
            
            
            
//            //Reading the String
//            String name = (String) jsonObject.get("Name");
//            Long age = (Long) jsonObject.get("Age");
//            
//            //Reading the array
//            JSONArray countries = (JSONArray)jsonObject.get("Countries");
//            
//            //Printing all the values
//            System.out.println("Name: " + name);
//            System.out.println("Age: " + age);
//            System.out.println("Countries:");
//            for(Object country : countries)
//            {
//                System.out.println("-Country: "+country.toString());
//            }
            //System.out.println(jsonObject);
        }
        catch(FileNotFoundException fe)
        {
            fe.printStackTrace();
        }
        catch(Exception e)
        {
            e.printStackTrace();
       }
    }
}