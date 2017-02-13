package modelo.dao;

public class OperacionFactoria {
	
	private static OperacionFactoria instance = null;
	
	private OperacionFactoria(){
			
	}
	
	public static OperacionFactoria getInstance(){
		if(instance == null)
			instance = new OperacionFactoria();
			
		return instance;	
	}
	
	public IOperacionDAO createDAO(String impl){
		if(impl.equals("Fichero"))
			return ((IOperacionDAO) new OperacionDAOFich());
		else if(impl.equals("Oracle"))
			return ((IOperacionDAO) new OperacionDAOOracle());
		else
			return ((IOperacionDAO) new OperacionDAOXml());
		
	}

}
