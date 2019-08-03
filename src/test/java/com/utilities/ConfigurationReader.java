package com.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

   private static Properties prop;

   static{

       String path = "Configurations.properties";

       try {

           FileInputStream stream = new FileInputStream(path);

           prop =new Properties();
           prop.load(stream);

           stream.close();


       } catch (FileNotFoundException e) {
           e.printStackTrace();
       } catch (IOException e) {
           e.printStackTrace();
       }

   }

   public static String getProperty(String key){
       return prop.getProperty(key);

   }

}
