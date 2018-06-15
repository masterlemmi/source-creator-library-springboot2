package com.lemzki.utils.creator.ws.writer.params;

import java.util.Map;
import java.util.regex.Matcher;

public class Template {
    
    private String templateFileName;
    private String data;

    public Template(String templateFileName, String data) {
       this.templateFileName = templateFileName;
       this.data = data;
    }
    
    
    public String performReplace(Map<String, String> params) {
        for (String key: params.keySet()) {
            if(data.contains(key)) {
                String val = params.get(key);
                data = data.replaceAll(key, Matcher.quoteReplacement(val));
            }
        }
        
        return data;
    }


  

}
