package rompecocos;

import misComponentes.Titulos;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Rompecocos extends JFrame {
	public static final String rutaFile = "src/imagenes/rompecocos.jpg";

	private int fichaSize = 100;
	private int gridSize = 4;
	private BufferedImage bufferImage = null;
	private Ficha[][] tablero = new Ficha [gridSize][gridSize];
	private JPanel centralPanel, panelBotones;
	private JButton ayuda, revolver, salir;
	ActionListener escucha;
	
	public Rompecocos() {
		try {
			bufferImage = ImageIO.read(new File(rutaFile));
			Ficha.setFichaSizeMaxFichas(fichaSize, gridSize * gridSize);
			
			initGUI();
			
			//default window configuration
			this.setUndecorated(true);
			pack();
			this.setResizable(false);
			this.setLocationRelativeTo(null);
			this.setVisible(true);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "No se ha encontrado el archivo para el tablero de rompecocos.jpg");
		}
	}
	
	private void initGUI() {
		//define window container & layout
		
		//Crear el escucha
		escucha = new Escuchas();
		
		//Crear la GUI	
		
		//titulo
		Titulos titulo = new Titulos("Rompecocos", 30, Color.BLACK);
		add(titulo, BorderLayout.NORTH);
		
		//Zona de juego - central panel
		dividirImage();
		
		//Panel de botones
		panelBotones = new JPanel();
		ayuda = new JButton("Ayuda");
		ayuda.addActionListener(escucha);
		panelBotones.add(ayuda);
		revolver = new JButton("Revolver");
		revolver.addActionListener(escucha);
		panelBotones.add(revolver);
		salir = new JButton("Salir");
		salir.addActionListener(escucha);
		panelBotones.add(salir);
		
		add(panelBotones, BorderLayout.SOUTH);
		
	
	}
	
	
	
	
	private void dividirImage() {
		
	}
	
	
	
	
	private class Escuchas implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent eventAction) {
			// TODO Auto-generated method stub
			//Responde a los eventos de los botones ayuda, devolver y salir.
			if (eventAction.getSource() == salir) {
				System.exit(0);
			} else if (eventAction.getSource() == ayuda) {
				//Llamar a la ventana ayuda
			} else {
				//Llamar a revolver fichas
			}
		}
		
	}
	
}
