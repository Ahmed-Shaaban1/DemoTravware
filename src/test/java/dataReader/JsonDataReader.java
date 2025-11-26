package dataReader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class JsonDataReader {

	public String earlyDate, laterDate, nextCalenderPage, invalidDate, invalidDateValue, specialCharacter1, specialCharacter2, emptyValue;

	public void jsonReader() throws IOException, ParseException  {

		String filePath = System.getProperty("user.dir") + "/src/test/java/data/testData.json";

		File srcFile = new File(filePath);
		
		JSONParser parser = new JSONParser();
				
		JSONArray jArray = (JSONArray)parser.parse(new FileReader(srcFile));
		
		for (Object jsonObj : jArray ) {
			
			JSONObject dates = (JSONObject)jsonObj;
			
			earlyDate = (String)dates.get("earlyDate");
			laterDate = (String)dates.get("laterDate");
			nextCalenderPage = (String)dates.get("nextCalenderPage");
			invalidDate = (String)dates.get("invalidDate");
			specialCharacter1 = (String)dates.get("specialCharacter1");
			specialCharacter2 = (String)dates.get("specialCharacter2");
			emptyValue = (String)dates.get("emptyValue");
			invalidDateValue = (String)dates.get("invalidDateValue");
		}

		
	
		

	}

}
