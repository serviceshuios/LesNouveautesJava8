package presentation;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Fenetre extends JFrame{

	JTextField leTexte;
	public Fenetre() {
		
		setLayout(new FlowLayout());
		//
		JTextField texte = new JTextField("Hello Java Word");
		add(texte);
		
		leTexte = new JTextField("Bonjour Java");
		add(leTexte);
		//
		JButton clic = new JButton("clic");
		add(clic);
		// lambda accède 
		clic.addActionListener(ae -> texte.setText("Hello"));
		//
		JButton clic2 = new JButton("clic2");
		add(clic2);
		// lambda accède l'attribut
		clic2.addActionListener(ae -> leTexte.setText("Bonjour"));
		
		pack();
	}
	
	public static void main(String[] args) {
		Fenetre f = new Fenetre();
		f.setVisible(true);

	}

}
