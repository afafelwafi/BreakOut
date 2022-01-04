package vue;
import contrôleur.Contrôleur;
import modèle.Paramètres;

import java.awt.EventQueue;
import javax.swing.JFrame;
public class Jeu extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Jeu(Contrôleur con) {
        initJeu(con);
    }
    
    private void initJeu(Contrôleur con) {
 
    	
        add(new Fenetre(con));
        setTitle("Breakout");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(Paramètres.WIDTH, Paramètres.HEIGTH);
        setLocationRelativeTo(null);
        setResizable(false);
        
  
    }

    public static void main(String[] args) {
    	Contrôleur con=new Contrôleur();
        EventQueue.invokeLater(() -> {
            Jeu game = new Jeu(con);
            game.setVisible(true);
           
        });
    
    		
    }
       
        
}

