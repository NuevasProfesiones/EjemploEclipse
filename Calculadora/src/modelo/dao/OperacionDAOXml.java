package modelo.dao;

import modelo.dao.dto.OperacionDTO;

public class OperacionDAOXml implements IOperacionDAO{

	@Override
	public void guardarOperacion(OperacionDTO op) {
		System.out.println("Este es el nuevo de XML");
		
	}

	@Override
	public String leerOperaciones() {
		// TODO Auto-generated method stub
		return null;
	}

}
