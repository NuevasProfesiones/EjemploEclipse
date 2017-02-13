package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LeeProperties {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args){
		Properties porp = new Properties();
		
		try {
			porp.load(new FileInputStream(new File(System.getProperty("user.dir")+"\\config.properties")));
		} catch (FileNotFoundException e) {
			System.out.println("Ruta del fichero prop:" +System.getProperty("user.dir")+"\\config.properties");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Ruta del fichero prop:" +System.getProperty("user.dir")+"\\config.properties");
			e.printStackTrace();
		}
		
		System.out.println("La propiedad versión vale: "+ porp.getProperty("version"));
		System.out.println("La propiedad ruta vale: "+ porp.getProperty("ruta"));
		System.out.println("La propiedad memoria vale: "+ porp.getProperty("memoria"));
		
		
		
	}

}
