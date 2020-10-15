package interfaz;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import model.Cliente;

public class InterfazSimulador extends JFrame {
	
	private Cliente elCliente;
	
	private PanelBanner panelBanner;
	
	private PanelInfoCliente panelInfoCliente;
	
	public InterfazSimulador() {
		String nombre = JOptionPane.showInputDialog("Ingrese su nombre");
		String cedula = JOptionPane.showInputDialog("Ingrese su cédula");
		elCliente = new Cliente(nombre, cedula);
		
		JPanel panelAuxiliar = new JPanel(new BorderLayout());
		panelInfoCliente = new PanelInfoCliente(this);
		panelInfoCliente.actualizarInfoCliente(nombre, cedula);
		panelAuxiliar.add(panelInfoCliente, BorderLayout.NORTH);
		
		panelBanner = new PanelBanner(this);
		add(panelBanner, BorderLayout.NORTH);
		add(panelAuxiliar, BorderLayout.CENTER);
		
		setTitle("Simulador Bancario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
	}
	
	public static void main(String[] args) {
		InterfazSimulador simulador = new InterfazSimulador();
		simulador.setVisible(true);
	}
}