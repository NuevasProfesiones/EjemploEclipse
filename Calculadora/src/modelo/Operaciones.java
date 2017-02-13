package modelo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import modelo.dao.IOperacionDAO;
import modelo.dao.OperacionFactoria;
import modelo.dao.dto.OperacionDTO;


public class Operaciones implements IOperaciones{
	private IOperacionDAO dao ;
	
	
	public Operaciones(){
		Properties porp = new Properties();
		try {
			porp.load(new FileInputStream(new File(System.getProperty("user.dir")+"\\config.properties")));
			
			dao= OperacionFactoria.getInstance().createDAO(porp.getProperty("baseDatos"));
		} catch (FileNotFoundException e) {
			System.out.println("Ruta del fichero prop:" +System.getProperty("user.dir")+"\\config.properties");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Ruta del fichero prop:" +System.getProperty("user.dir")+"\\config.properties");
			e.printStackTrace();
		}
		
		
	}
	
	 
	@Override
	public int suma(int a, int b) {
		OperacionDTO dto = new OperacionDTO(a +" + " +b);
		
		dao.guardarOperacion(dto);
		
		String operaciones = dao.leerOperaciones();
		return a+b;
	}

	@Override
	public int resta(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public int mult(int a, int b) {
		
		
		return a*b;
	}

	@Override
	public float div(int a, int b) throws Exception {
		// TODO Auto-generated method stub
		return a/b;
	}

}
