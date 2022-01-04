package vue;
import contr�leur.Contr�leur;
import mod�le.Param�tres;

import java.awt.EventQueue;
import javax.swing.JFrame;
public class Jeu extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Jeu(Contr�leur con) {
        initJeu(con);
    }
    
    private void initJeu(Contr�leur con) {
 
    	
        add(new Fenetre(con));
        setTitle("Breakout");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(Param�tres.WIDTH, Param�tres.HEIGTH);
        setLocationRelativeTo(null);
        setResizable(false);
        
  
    }

    public static void main(String[] args) {
    	Contr�leur con=new Contr�leur();
        EventQueue.invokeLater(() -> {
            Jeu game = new Jeu(con);
            game.setVisible(true);
           
        });
    
    		
    }
       
        
}

