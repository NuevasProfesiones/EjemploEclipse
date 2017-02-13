package vista;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import utils.Fichero;

import controlador.BotonController;
import controlador.Controlador;

public class InterfazAWT extends Frame implements ActionListener,IInterfaz {
	Label etiqueta = new Label("Esto es una etiqueta");
	Button boton = new Button("Aceptar");

	public InterfazAWT(){
		super("Frame de ejemplo");
		initInterface();
		
		addWindowListener(new WindowAdapter() {
			public void cierre(WindowEvent we){
				System.exit(0);
				
			}
		});
		
		
	}
	
	@Override
	public void initInterface() {

		
		
		this.setSize(640, 480);
		this.setLayout(new FlowLayout());
		this.setVisible(true);
		this.add(etiqueta);
		
		boton.addActionListener(this);
		this.add(boton);

		

	}

	@Override
	public void muestraResultado(String str) {
		// TODO Auto-generated method stub

	}

	public static void main(String args[]){
		IInterfaz inter = new InterfazAWT();
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		etiqueta.setText("Ha pulsado el botón");
		
		Controlador contr = new Controlador();
		try {
			contr.realizaOperacion(1, 2, 3);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		//f.writeln(etiqueta.getText());
	}

}
