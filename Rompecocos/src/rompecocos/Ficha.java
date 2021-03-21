package rompecocos;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Ficha extends JButton {
	
	private static int fichaSize = 0;
	private static int maxFichas = 0;
	int row;
	int col;
	int idImage;
	ImageIcon image;
	
	
	public Ficha(ImageIcon image, int idImage,  int row, int col) {
		this.row = row;
		this.col = col;
		setImage(image, idImage);
		
		this.setBackground(Color.WHITE);
		Dimension size = new Dimension(fichaSize, fichaSize);
		this.setPreferredSize(size);
		this.setBorder(null);
		this.setFocusPainted(false);
	
	}
	
	public static void setFichaSizeMaxFichas(int tamano, int numeroFichas) {
		maxFichas = numeroFichas;
		fichaSize = tamano;
	}

	public int getRow() {
		return row;
	}

	public int getCol() {
		return col;
	}

	public int getIdImage() {
		return idImage;
	}

	public ImageIcon getImage() {
		return image;
	}

	private void setImage(ImageIcon image, int idImage) {
		this.image = image;
		this.idImage = idImage;
		if (idImage < maxFichas - 1) {
			setIcon(image);
		} else {
			setIcon(null);
		}
	}
	
	
	public void mostrarImagen() {
		setIcon(image);
	}
	
	//pieza.intercambiar(pieza2);
	public void intercambiar(Ficha otraFicha) {
		ImageIcon otraImagen = otraFicha.getImage();
		int idOtraImagen = otraFicha.getIdImage();
		otraFicha.setImage(image, idImage);
		this.setImage(otraImagen, idOtraImagen);
	}
	
	public boolean hasNoImage() {
		if (this.getIcon() == null) {
			return true;
		}
		return false;
	}

	
	
}
