package com.infy.Department.util;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

public class Deserializer extends JsonDeserializer<String> {
	 @Override
	    public String deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
	        if (jsonParser.getCurrentToken()==JsonToken.VALUE_STRING) {
	        	
	        	try {
	        		 jsonParser.getCurrentValue();
	        		
	        	}
	        	catch(Exception e){
	            throw deserializationContext.wrongTokenException(jsonParser, JsonToken.VALUE_STRING, "Attempted to parse string to int but this is forbidden");
	        	}
	        }
	        return jsonParser.getValueAsString();
	    }
	

}
