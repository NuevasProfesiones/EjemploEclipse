package modelo.dao;

import modelo.dao.dto.OperacionDTO;

public class OperacionDAOOracle implements IOperacionDAO{

	@Override
	public void guardarOperacion(OperacionDTO op) {
		System.out.println("En ese caso se guarda en oracle");
		
	}

	@Override
	public String leerOperaciones() {
		// TODO Auto-generated method stub
		return null;
	}

}
