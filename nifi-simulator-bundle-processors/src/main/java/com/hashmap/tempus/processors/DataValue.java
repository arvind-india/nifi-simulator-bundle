package com.hashmap.tempus.processors;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DataValue {

    @JsonProperty(value = "ts", index = 1)
    private String timeStamp;

    @JsonProperty(index = 2)
    private Map<String, Object> values;


    public String getTimeStamp(){
        return timeStamp;
    }

    public Map getValues(){
        return values;
    }

    public DataValue(){
        values = new HashMap<>();
    }

    public void setTimeStamp(String timeStamp){
        this.timeStamp = timeStamp;
    }

    public void addValue(String key, Object value){
        values.put(key, value);
    }

}
