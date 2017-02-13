package controlador;

import vista.IInterfaz;
import vista.InterfazConsola;
import modelo.IOperaciones;
import modelo.Operaciones;

public class Controlador{
	private IOperaciones operaciones = new Operaciones();
	private IInterfaz inter = new InterfazConsola();
	
	public void realizaOperacion(int op, int a, int b) throws Exception{
		String res;
		
		if(op == 1)
			res = ""+ operaciones.suma(a, b);
		else if(op==2)
			res = ""+ operaciones.resta(a, b);
		else if(op==3)
			res = ""+ operaciones.mult(a, b);
		else if(op==4)
			res = ""+ operaciones.div(a, b);
		else if(op==0)
			res="Ha salido de la aplicacion correctamente";
		else
			
			res ="Operacion no soportada";
			
		inter.muestraResultado(res);
		
	}
	
	
/*	public static void main(String args[]) throws Exception{
		Controlador contro = new Controlador();
		IInterfaz inter = contro.getInter();
		
		do{
			inter.initInterface();
			contro.realizaOperacion(inter.getOp(),inter.getA(), inter.getB());
		}while(inter.getOp()!=0);	
		
		
	}
*/

	public IOperaciones getOperaciones() {
		return operaciones;
	}


	public void setOperaciones(IOperaciones operaciones) {
		this.operaciones = operaciones;
	}


	public IInterfaz getInter() {
		return inter;
	}


	public void setInter(InterfazConsola inter) {
		this.inter = inter;
	}

}
