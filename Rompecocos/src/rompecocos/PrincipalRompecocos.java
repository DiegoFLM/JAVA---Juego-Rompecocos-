package rompecocos;

import java.awt.EventQueue;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class PrincipalRompecocos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String javaLookAndFeel = UIManager.getCrossPlatformLookAndFeelClassName();
			UIManager.setLookAndFeel(javaLookAndFeel);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "Oops, hay un daño en la JVM");
		} 
		
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				Rompecocos miVista = new Rompecocos();
			}
			
		});
	}

}
