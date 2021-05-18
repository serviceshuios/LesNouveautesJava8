package presentation;

import javax.swing.JButton;
import javax.swing.JFrame;
// une expression Lambda remplace 
// avantageusement une classe anonyme
public class Fenetre extends JFrame {
	
	public Fenetre() {
		JButton myButton = new JButton("Cliquez moi");
		add(myButton);
		
		myButton.addActionListener(ae -> System.out.println("cliques moi a fonctionné"));
		
		pack();
	}


	public static void main(String[] args) {
		Fenetre f = new Fenetre();
		f.setVisible(true);

	}

}
