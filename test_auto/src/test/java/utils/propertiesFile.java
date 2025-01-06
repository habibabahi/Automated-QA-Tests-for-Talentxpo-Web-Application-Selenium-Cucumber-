package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Properties;

public class propertiesFile {
    static HashMap<String,String> proptiesMap=new HashMap<>();
    public static HashMap<String,String> read(String propertiesFilePath) {
        File file=new File(propertiesFilePath);
        FileInputStream fileInput=null;
        try{fileInput = new FileInputStream(file);}
        catch(FileNotFoundException e){e.printStackTrace();}
        Properties properties = new Properties();
        try{assert fileInput!=null;properties.load(fileInput);}
        catch (IOException e) {e.printStackTrace();}
        Enumeration Keys = properties.keys();
        while (Keys.hasMoreElements()) {
            String key = (String) Keys.nextElement();
            String value = properties.getProperty(key);
            proptiesMap.put(key,value);
        }
        return proptiesMap;
    }
}
