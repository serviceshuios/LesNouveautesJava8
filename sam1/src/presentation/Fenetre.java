package presentation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import metier.MonInterfaceSAM;

public class Fenetre extends JFrame{

	public Fenetre() {
		JButton monBouton = new JButton("clic");
		add(monBouton);
		
		/*monBouton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent ae) {
				System.out.println("COUCOU");
				
			}
		});*/
		
		monBouton.addActionListener(ae -> System.out.println("COUCOU"));
		
		pack();
	}
	
	public static void appelInterfaceSAM(MonInterfaceSAM i) {
		i.execute();
	}
	
	public static void main(String[] args) {
		appelInterfaceSAM(() -> System.out.println("execution"));

	}

}
