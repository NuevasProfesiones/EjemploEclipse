package modelo.dao;

import modelo.dao.dto.OperacionDTO;
import utils.Fichero;

public class OperacionDAOFich implements IOperacionDAO{

	@Override
	public void guardarOperacion(OperacionDTO op) {
		//Fichero f = Fichero.getInstansce();
		System.out.println("Se guarda en un fichero");
		//f.writeln(op.getOperacion());
		
	}

	@Override
	public String leerOperaciones() {
		// TODO Auto-generated method stub
		return null;
	}

}
