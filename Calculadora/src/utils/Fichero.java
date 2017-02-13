package utils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import java.util.Properties;

public class Fichero {
	private static Fichero instance=null;
	private String path;
	
	
	private Fichero(String path){
		this.path=path;
		
	}
	
	public static Fichero getInstansce(){
		if(instance==null)
			instance = new Fichero(((Properties)new Properties()).getProperty("ruta"));
		
		return instance;
		
	}

	public void writeln(String str){
		
	
		
		FileWriter fw;
		BufferedWriter bw;
		
		try {
			fw = new FileWriter(path, true);
			bw = new BufferedWriter(fw);
			
			bw.write(str + "\n");
			
			bw.close();
			fw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
			
			
	}
	
}
