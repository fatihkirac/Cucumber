package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    public static Properties properties;
    static { //her method'dan once calisir

        String dosyaYolu="configuration.properties"; //configuration dosyasına sag tıklayıp content root kopyalayıp yapistirdik
        try {
            FileInputStream fis=new FileInputStream(dosyaYolu);
            properties=new Properties();
            properties.load(fis); //fis'in okudugu bilgileri properties'e yukledi

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static String getProperty(String key){
        /*
        Test methodundan yolldadigimiz String key degeri alıp
        Properties class'indan getProperty() methodunu kullanarak
        bu key'e ait value'yu bize getirir
         */

        return properties.getProperty(key);

    }
}
