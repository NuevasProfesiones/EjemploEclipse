package modelo.dao;

import modelo.dao.dto.OperacionDTO;

public interface IOperacionDAO {

	
	public void guardarOperacion(OperacionDTO op);
	
	public String leerOperaciones();
	
}
