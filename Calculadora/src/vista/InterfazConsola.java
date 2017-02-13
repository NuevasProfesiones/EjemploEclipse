package vista;

import java.util.Scanner;

public class InterfazConsola implements IInterfaz{
	
	private Scanner scanner= new Scanner(System.in);
	private int op,a,b;
	
	public int getOp() {
		return op;
	}


	public void setOp(int op) {
		this.op = op;
	}


	public int getA() {
		return a;
	}


	public void setA(int a) {
		this.a = a;
	}


	public int getB() {
		return b;
	}


	public void setB(int b) {
		this.b = b;
	}


	public void initInterface(){
		
			System.out.println("1. Suma");
			System.out.println("2. Resta");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.println("0. Salir");
			op=scanner.nextInt();
			if(op!=0)
				pideOperandos();

	}
	
	
	public void muestraResultado(String str){
	
		System.out.println("El resultado de la operación es "+ str);
	
	}
	
	
	
	public void pideOperandos(){
		System.out.println("Introduzca los operandos");
		a = scanner.nextInt();
		b = scanner.nextInt();
		
	}
	

	public Scanner getScanner() {
		return scanner;
	}

	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}

}
