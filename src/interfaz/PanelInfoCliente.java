package interfaz;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelInfoCliente extends JPanel {

	private InterfazSimulador ventanaPrincipal;
	
	private JLabel labNombre;
	
	private JTextField txtNombre;
	
	private JLabel labCedula;
	
	private JTextField txtCedula;
	
	public PanelInfoCliente(InterfazSimulador principal) {
		ventanaPrincipal = principal;
		setLayout(new GridLayout(1,4));
		
		TitledBorder border = BorderFactory.createTitledBorder( "Datos cliente" );
		setBorder( border );
		
		labNombre = new JLabel("Nombre: ");
		txtNombre = new JTextField();
		txtNombre.setEditable(false);
		labCedula = new JLabel("Cédula: ");
		txtCedula = new JTextField();
		txtCedula.setEditable(false);
		
		add(labNombre);
		add(txtNombre);
		add(labCedula);
		add(txtCedula);
	}
	
	public void actualizarInfoCliente(String nombre, String cedula) {
		txtNombre.setText(nombre);
		txtCedula.setText(cedula);
	}
}
