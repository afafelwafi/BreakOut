package contrôleur;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

import modèle.Balle;
import modèle.Brique;
import modèle.Paramètres;
import modèle.Raquette;
import modèle.Vie;
public class Contrôleur implements Paramètres {
 
    private Balle balle;
    private int hearts; 
    private int niveau;
    private Vie vie[];
    private  Raquette raquette;
    private Brique  brique[];
    private boolean inGame = true;
    private int score;
    private int nbrBriqueParLigne;
    public List<String> chemin;
    public String message;
    public int nbrdes;
    public Contrôleur() {

        initContrôle();
    } 
   public void initContrôle() {
	   this.chemin= new ArrayList<String>();
	   chemin.add("src/Layer 0 (4).png");
       chemin.add("src/Layer 0 (5).png");
       chemin.add("src/Layer 0 (6).png");
       chemin.add("src/Layer 0 (7).png");
       chemin.add("src/Layer 0 (8).png");
       chemin.add("src/Layer 0 (4).png");
       chemin.add("src/Layer 0 (5).png");
       chemin.add("src/Layer 0 (6).png");
       chemin.add("src/Layer 0 (7).png");
       chemin.add("src/Layer 0 (8).png");
       chemin.add("src/Layer 0 (4).png");
       chemin.add("src/Layer 0 (5).png");
       chemin.add("src/Layer 0 (6).png");
       chemin.add("src/Layer 0 (7).png");
       chemin.add("src/Layer 0 (8).png");
       chemin.add("src/Layer 0 (4).png");
       chemin.add("src/Layer 0 (5).png");
       chemin.add("src/Layer 0 (6).png");
       chemin.add("src/Layer 0 (7).png");
       chemin.add("src/Layer 0 (8).png");
       chemin.add("src/Layer 0 (4).png");
       chemin.add("src/Layer 0 (5).png");
       chemin.add("src/Layer 0 (6).png");
       chemin.add("src/Layer 0 (7).png");
       chemin.add("src/Layer 0 (8).png");
       chemin.add("src/Layer 0 (4).png");
       chemin.add("src/Layer 0 (5).png");
       chemin.add("src/Layer 0 (6).png");
       chemin.add("src/Layer 0 (7).png");
       chemin.add("src/Layer 0 (8).png");
       chemin.add("src/Layer 0 (4).png");
       chemin.add("src/Layer 0 (5).png");
       chemin.add("src/Layer 0 (6).png");
       chemin.add("src/Layer 0 (7).png");
       chemin.add("src/Layer 0 (8).png");
       chemin.add("src/Layer 0 (4).png");
       chemin.add("src/Layer 0 (5).png");
       chemin.add("src/Layer 0 (6).png");
       chemin.add("src/Layer 0 (7).png");
       chemin.add("src/Layer 0 (8).png");
       chemin.add("src/Layer 0 (4).png");
       chemin.add("src/Layer 0 (5).png");
       chemin.add("src/Layer 0 (6).png");
       chemin.add("src/Layer 0 (7).png");
       chemin.add("src/Layer 0 (8).png");
       chemin.add("src/Layer 0 (4).png");
       chemin.add("src/Layer 0 (5).png");
       chemin.add("src/Layer 0 (6).png");
       chemin.add("src/Layer 0 (7).png");
       chemin.add("src/Layer 0 (8).png");
       chemin.add("src/Layer 0 (4).png");
       chemin.add("src/Layer 0 (5).png");
       chemin.add("src/Layer 0 (6).png");
       chemin.add("src/Layer 0 (7).png");
       chemin.add("src/Layer 0 (8).png");
       chemin.add("src/Layer 0 (4).png");
       chemin.add("src/Layer 0 (5).png");
       chemin.add("src/Layer 0 (6).png");
       chemin.add("src/Layer 0 (7).png");
       chemin.add("src/Layer 0 (8).png");
       chemin.add("src/Layer 0 (4).png");
       chemin.add("src/Layer 0 (5).png");
       chemin.add("src/Layer 0 (6).png");
       chemin.add("src/Layer 0 (7).png");
       chemin.add("src/Layer 0 (8).png");
       chemin.add("src/Layer 0 (4).png");
       chemin.add("src/Layer 0 (5).png");
       chemin.add("src/Layer 0 (6).png");
       chemin.add("src/Layer 0 (7).png");
       chemin.add("src/Layer 0 (8).png");
       chemin.add("src/Layer 0 (4).png");
       chemin.add("src/Layer 0 (5).png");
       chemin.add("src/Layer 0 (6).png");
       chemin.add("src/Layer 0 (7).png");
       chemin.add("src/Layer 0 (8).png");
       chemin.add("src/Layer 0 (4).png");
       chemin.add("src/Layer 0 (5).png");
       chemin.add("src/Layer 0 (6).png");
       chemin.add("src/Layer 0 (7).png");
       chemin.add("src/Layer 0 (8).png");
       chemin.add("src/Layer 0 (4).png");
       chemin.add("src/Layer 0 (5).png");
       chemin.add("src/Layer 0 (6).png");
       chemin.add("src/Layer 0 (7).png");
       chemin.add("src/Layer 0 (8).png");
       chemin.add("src/Layer 0 (4).png");
       chemin.add("src/Layer 0 (5).png");
       chemin.add("src/Layer 0 (6).png");
       chemin.add("src/Layer 0 (7).png");
       chemin.add("src/Layer 0 (8).png");
       chemin.add("src/Layer 0 (4).png");
       chemin.add("src/Layer 0 (5).png");
       chemin.add("src/Layer 0 (6).png");
       chemin.add("src/Layer 0 (7).png");
       chemin.add("src/Layer 0 (8).png");
       chemin.add("src/Layer 0 (4).png");
       chemin.add("src/Layer 0 (5).png");
       chemin.add("src/Layer 0 (6).png");
       chemin.add("src/Layer 0 (7).png");
       chemin.add("src/Layer 0 (8).png");
       chemin.add("src/Layer 0 (4).png");
       chemin.add("src/Layer 0 (5).png");
       chemin.add("src/Layer 0 (6).png");
       chemin.add("src/Layer 0 (7).png");
       chemin.add("src/Layer 0 (8).png");
       chemin.add("src/Layer 0 (4).png");
       chemin.add("src/Layer 0 (5).png");
       chemin.add("src/Layer 0 (6).png");
       chemin.add("src/Layer 0 (7).png");
       chemin.add("src/Layer 0 (8).png");
       chemin.add("src/Layer 0 (4).png");
       chemin.add("src/Layer 0 (5).png");
       chemin.add("src/Layer 0 (6).png");
       chemin.add("src/Layer 0 (7).png");
       chemin.add("src/Layer 0 (8).png");
       chemin.add("src/Layer 0 (4).png");
       chemin.add("src/Layer 0 (5).png");
       chemin.add("src/Layer 0 (6).png");
       chemin.add("src/Layer 0 (7).png");
       chemin.add("src/Layer 0 (8).png");
       chemin.add("src/Layer 0 (4).png");
       chemin.add("src/Layer 0 (5).png");
       chemin.add("src/Layer 0 (6).png");
       chemin.add("src/Layer 0 (7).png");
       chemin.add("src/Layer 0 (8).png");
       chemin.add("src/Layer 0 (4).png");
       chemin.add("src/Layer 0 (5).png");
       chemin.add("src/Layer 0 (6).png");
       chemin.add("src/Layer 0 (7).png");
       chemin.add("src/Layer 0 (8).png");
       chemin.add("src/Layer 0 (4).png");
       chemin.add("src/Layer 0 (5).png");
       chemin.add("src/Layer 0 (6).png");
       chemin.add("src/Layer 0 (7).png");
       chemin.add("src/Layer 0 (8).png");
       chemin.add("src/Layer 0 (4).png");
       chemin.add("src/Layer 0 (5).png");
       chemin.add("src/Layer 0 (6).png");
       chemin.add("src/Layer 0 (7).png");
       chemin.add("src/Layer 0 (8).png");
       chemin.add("src/Layer 0 (4).png");
       chemin.add("src/Layer 0 (5).png");
       chemin.add("src/Layer 0 (6).png");
       chemin.add("src/Layer 0 (7).png");
       chemin.add("src/Layer 0 (8).png");
       chemin.add("src/Layer 0 (4).png");
       chemin.add("src/Layer 0 (5).png");
       chemin.add("src/Layer 0 (6).png");
       chemin.add("src/Layer 0 (7).png");
       chemin.add("src/Layer 0 (8).png");
       chemin.add("src/Layer 0 (4).png");
       chemin.add("src/Layer 0 (5).png");
       chemin.add("src/Layer 0 (6).png");
       chemin.add("src/Layer 0 (7).png");
       chemin.add("src/Layer 0 (8).png");
       chemin.add("src/Layer 0 (4).png");
       chemin.add("src/Layer 0 (5).png");
       chemin.add("src/Layer 0 (6).png");
       chemin.add("src/Layer 0 (7).png");
       chemin.add("src/Layer 0 (8).png");
       chemin.add("src/Layer 0 (4).png");
       chemin.add("src/Layer 0 (5).png");
       chemin.add("src/Layer 0 (6).png");
       chemin.add("src/Layer 0 (7).png");
       chemin.add("src/Layer 0 (8).png");
       chemin.add("src/Layer 0 (4).png");
       chemin.add("src/Layer 0 (5).png");
       chemin.add("src/Layer 0 (6).png");
       chemin.add("src/Layer 0 (7).png");
       chemin.add("src/Layer 0 (8).png");
       chemin.add("src/Layer 0 (4).png");
       chemin.add("src/Layer 0 (5).png");
       chemin.add("src/Layer 0 (6).png");
       chemin.add("src/Layer 0 (7).png");
       chemin.add("src/Layer 0 (8).png");
       chemin.add("src/Layer 0 (4).png");
       chemin.add("src/Layer 0 (5).png");
       chemin.add("src/Layer 0 (6).png");
       chemin.add("src/Layer 0 (7).png");
       chemin.add("src/Layer 0 (8).png");
       chemin.add("src/Layer 0 (4).png");
       chemin.add("src/Layer 0 (5).png");
       chemin.add("src/Layer 0 (6).png");
       chemin.add("src/Layer 0 (7).png");
       chemin.add("src/Layer 0 (8).png");
       chemin.add("src/Layer 0 (4).png");
       chemin.add("src/Layer 0 (5).png");
       chemin.add("src/Layer 0 (6).png");
       chemin.add("src/Layer 0 (7).png");
       chemin.add("src/Layer 0 (8).png");
       chemin.add("src/Layer 0 (4).png");
       chemin.add("src/Layer 0 (5).png");
       chemin.add("src/Layer 0 (6).png");
       chemin.add("src/Layer 0 (7).png");
       chemin.add("src/Layer 0 (8).png");
       chemin.add("src/Layer 0 (4).png");
       chemin.add("src/Layer 0 (5).png");
       chemin.add("src/Layer 0 (6).png");
       chemin.add("src/Layer 0 (7).png");
       chemin.add("src/Layer 0 (8).png");
       chemin.add("src/Layer 0 (4).png");
       chemin.add("src/Layer 0 (5).png");
       chemin.add("src/Layer 0 (6).png");
       chemin.add("src/Layer 0 (7).png");
       chemin.add("src/Layer 0 (8).png");
       chemin.add("src/Layer 0 (4).png");
       chemin.add("src/Layer 0 (5).png");
       chemin.add("src/Layer 0 (6).png");
       chemin.add("src/Layer 0 (7).png");
       chemin.add("src/Layer 0 (8).png");
       chemin.add("src/Layer 0 (4).png");
       chemin.add("src/Layer 0 (5).png");
       chemin.add("src/Layer 0 (6).png");
       chemin.add("src/Layer 0 (7).png");
       chemin.add("src/Layer 0 (8).png");
       chemin.add("src/Layer 0 (4).png");
       chemin.add("src/Layer 0 (5).png");
       chemin.add("src/Layer 0 (6).png");
       chemin.add("src/Layer 0 (7).png");
       chemin.add("src/Layer 0 (8).png");
       chemin.add("src/Layer 0 (4).png");
       chemin.add("src/Layer 0 (5).png");
       chemin.add("src/Layer 0 (6).png");
       chemin.add("src/Layer 0 (7).png");
       chemin.add("src/Layer 0 (8).png");
       chemin.add("src/Layer 0 (4).png");
       chemin.add("src/Layer 0 (5).png");
       chemin.add("src/Layer 0 (6).png");
       chemin.add("src/Layer 0 (7).png");
       chemin.add("src/Layer 0 (8).png");
       chemin.add("src/Layer 0 (4).png");
       chemin.add("src/Layer 0 (5).png");
       chemin.add("src/Layer 0 (6).png");
       chemin.add("src/Layer 0 (7).png");
       chemin.add("src/Layer 0 (8).png");
       chemin.add("src/Layer 0 (4).png");
       chemin.add("src/Layer 0 (5).png");
       chemin.add("src/Layer 0 (6).png");
       chemin.add("src/Layer 0 (7).png");
       chemin.add("src/Layer 0 (8).png");
       chemin.add("src/Layer 0 (4).png");
       chemin.add("src/Layer 0 (5).png");
       chemin.add("src/Layer 0 (6).png");
       chemin.add("src/Layer 0 (7).png");
       chemin.add("src/Layer 0 (8).png");
       chemin.add("src/Layer 0 (4).png");
       chemin.add("src/Layer 0 (5).png");
       chemin.add("src/Layer 0 (6).png");
       chemin.add("src/Layer 0 (7).png");
       chemin.add("src/Layer 0 (8).png");
       chemin.add("src/Layer 0 (4).png");
       chemin.add("src/Layer 0 (5).png");
       chemin.add("src/Layer 0 (6).png");
       chemin.add("src/Layer 0 (7).png");
       chemin.add("src/Layer 0 (8).png");
       chemin.add("src/Layer 0 (4).png");
       chemin.add("src/Layer 0 (5).png");
       chemin.add("src/Layer 0 (6).png");
       chemin.add("src/Layer 0 (7).png");
       chemin.add("src/Layer 0 (8).png");
       chemin.add("src/Layer 0 (4).png");
       chemin.add("src/Layer 0 (5).png");
       chemin.add("src/Layer 0 (6).png");
       chemin.add("src/Layer 0 (7).png");
       chemin.add("src/Layer 0 (8).png");
       chemin.add("src/Layer 0 (4).png");
       chemin.add("src/Layer 0 (5).png");
       chemin.add("src/Layer 0 (6).png");
       chemin.add("src/Layer 0 (7).png");
       chemin.add("src/Layer 0 (8).png");
       this.nbrBriqueParLigne=(int)(WIDTH-60)/(new Brique(0,0,"src/19-Breakout-Tiles.png").getImageWidth());
       this.brique = new Brique[N_BRIQUES];
       this.vie= new Vie[N_VIE];
       this.hearts=N_VIE;
       this.score=0;
       this.niveau=0;
       this.inGame=false;
       this.message="Game Over";
       this.nbrdes=0;
       
       
    }
    public void gameInit(int x) {
    	this.niveau=x;
    	score=0;
    	inGame=true;
    	balle = new Balle();
    	this.nbrdes=0;
    	
        if (this.niveau==1) {
        	raquette= new Raquette("src/slow.png");
        	
        this.nbrBriqueParLigne=(int)(WIDTH-60)/(new Brique(0,0,"src/19-Breakout-Tiles.png").getImageWidth());       
        brique[0]=new Brique(30,80,"src/19-Breakout-Tiles.png");
        for (int k=1; k<N_BRIQUES ; k++) {
        	if (brique[k-1].getImageWidth()<= WIDTH-brique[k-1].getX()-brique[k-1].getImageWidth()-30) {
                brique[k] = new Brique(brique[k-1].getX()+brique[k-1].getImageWidth(), brique[k-1].getY(),brique[k-1].getChemin());
        	}
        	else {
        		 brique[k] = new Brique(30, brique[k-1].getY()+brique[k-1].getImageHeight(),chemin.get(chemin.size()-1));
        		 chemin.remove(chemin.size()-1);
        	}
        }
        }
        if (this.niveau==2) {
        	
        	raquette= new Raquette("src/Layer 0 (2).png");
        brique[0]=new Brique(30,80,"src/19-Breakout-Tiles.png");
        for (int k=1; k< N_BRIQUES/2; k++) {
        	
        	if (brique[k-1].getImageWidth()<= (WIDTH/2)-brique[k-1].getX()-brique[k-1].getImageWidth()-60) {
                brique[k] = new Brique(brique[k-1].getX()+brique[k-1].getImageWidth(), brique[k-1].getY(),brique[k-1].getChemin());
        	}
        	else {
       		 brique[k] = new Brique(30, brique[k-1].getY()+brique[k-1].getImageHeight(),chemin.get(chemin.size()-1));
       		 chemin.remove(chemin.size()-1);
       	}
        }
        
        brique[N_BRIQUES/2]=new Brique(WIDTH/2+30,80,"src/19-Breakout-Tiles.png");
        	for (int k=N_BRIQUES/2+1; k<N_BRIQUES; k++) {
            	
            	if (brique[k-1].getImageWidth()<= WIDTH-brique[k-1].getX()-brique[k-1].getImageWidth()-60) {
                    brique[k] = new Brique(brique[k-1].getX()+brique[k-1].getImageWidth(), brique[k-1].getY(),brique[k-1].getChemin());
            	}
            	else {
           		 brique[k] = new Brique(WIDTH/2+30, brique[k-1].getY()+brique[k-1].getImageHeight(),chemin.get(chemin.size()-1));
           		 chemin.remove(chemin.size()-1);
           	}
        }
        }
        
        
        	if (this.niveau==3) {
       
        		raquette= new Raquette("src/fast.png");
        		brique[0]=new Brique(30,80,"src/19-Breakout-Tiles.png");
        		int ligne=N_BRIQUES*brique[0].getImageWidth()/(WIDTH-60);// nombres de lignes 
        		int nbrBpL=   (int) (WIDTH-60)/ brique[0].getImageWidth();//nombres de briques par lignes
        	    for (int k=1; k<N_BRIQUES ; k++) {
        	        if (brique[k-1].getImageWidth()<= WIDTH-brique[k-1].getX()-brique[k-1].getImageWidth()-30) {
        	                brique[k] = new Brique(brique[k-1].getX()+brique[k-1].getImageWidth(), brique[k-1].getY(),brique[k-1].getChemin());
        	        }
        	        else {
        	        		 brique[k] = new Brique(30, brique[k-1].getY()+brique[k-1].getImageHeight(),chemin.get(chemin.size()-1));
        	        		 chemin.remove(chemin.size()-1);
        	        }
        	       }
        	    
        	    for (int k=0;k<=ligne;k++) {
        	    		brique[k*nbrBpL].setDestroyed(true);
        	    		brique [nbrBpL-1+k*nbrBpL].setDestroyed(true);
        	    		for (int i=6;i<=10;i++) {
        	    			brique[i+k*nbrBpL].setDestroyed(true);
        	  	
        	    	}
        	    	 }
        	    
        	    for (int i=3;i<=10;i++) {
        	    	for (int k=2;k<=5;k++) {
        	    		brique[k+i*nbrBpL].setDestroyed(true);
        	    	}
        	    
        	    }
        	    for (int i=2;i<=5;i++) {
        	    	for (int k=12;k<=15;k++) {
        	    		brique[k+i*nbrBpL].setDestroyed(true);
        	    	}
        	    	
        	    }
        		
        	    for (int i=8;i<=11;i++) {
        	    	for (int k=11;k<=14;k++) {
        	    		brique[k+i*nbrBpL].setDestroyed(true);
        	    	}
        	    	
        	    }
        		
        		
        				        }
        
       for (int j=0;j<hearts ;j++) {
    	  if (j==0) {
    		  vie[0]=new Vie(30);
    	  }
    	  else {
    		  vie[j] = new Vie(vie[j-1].getX()+vie[j-1].getImageWidth());
    	  
      }
      
        
    }
        }
    public Brique[] getBrique() {
    	return this.brique;
    }
    
    public Balle getBalle() {
    	return this.balle;
    }
    public Raquette getRaquette() {
    	return this.raquette;
    }
    public void setRaquette() {
    	if (this.niveau==1) {
    		raquette= new Raquette("src/slow.png");
    		
    	}
    	if (this.niveau==2) {
    		raquette= new Raquette("src/Layer 0 (2).png");
    		
    	}
    	if (this.niveau==3) {
    		raquette= new Raquette("src/fast.png");
    		
    	}
    }
    public Vie[] getVie() {
    	return this.vie;
    }
    public int getScore() {
    	return this.score;
    }
    public void setScore(int x) {
    	this.score=x;
    }
    public Boolean getinGame() {
    	return inGame;
    }
    public int getNbrBriqueParLigne() {
    	return this.nbrBriqueParLigne;
    }
    public int getHearts() {
    	return this.hearts;
    }
    public void setinGame(Boolean game) {
    	 this.inGame=game;
    }
    public int getNiveau() {
    	return this.niveau;
    }
    public void setNiveau(int x) {
    	 this.niveau=x;
    }
    public int getnbrdes() {
    	return this.nbrdes;
    }
    public void setnbrdes(int x) {
    	this.nbrdes=x;
    }
  
    
    public String getMessage() {
   	 return message;
   }
 
private void stopGame() {

    this.inGame = false;
    this.hearts--;
   
   
}
public void pausegame() {
	this.inGame = false;
}
public void playgame() {
	this.inGame = true;
}
public void checkCollision() {

    if (balle.getRect().getMaxY() > Paramètres.BOTTOM_EDGE) {
        stopGame();
       
    }

    for (int i = 0, j = 0; i < N_BRIQUES;i++) {
        
        if (brique[i].isDestroyed()) {
            j++;

            
          
        }
        
        if (j == N_BRIQUES) {
        	message="victory";
        	stopGame();
        }
    }
    

    if ((balle.getRect()).intersects(raquette.getRect())) {

        /*int raquettePos = (int) raquette.getRect().getMinX();
        int ballePos = (int) balle.getRect().getMinX();

        int first = raquettePos + 8;
        int second = raquettePos + 16;
        int third = raquettePos + 24;
        int fourth = raquettePos + 32;

        if (ballePos < first) {
            balle.setXX(-1);
            balle.setYY(-1);
        }

        if (ballePos >= first && ballePos < second) {
            balle.setXX(-1);
            balle.setYY(-1 * balle.getYY());
        }

        if (ballePos >= second && ballePos < third) {
            balle.setXX(0);
            balle.setYY(-1);
        }

        if (ballePos >= third && ballePos < fourth) {
            balle.setXX(1);
            balle.setYY(-1 * balle.getYY());
        }

        if (ballePos > fourth) {
            balle.setXX(1);
            balle.setYY(-1);
        
        }*/
    	int x=(int)(Math.random()*2)-1;
    	int y=(int)(Math.random()*2)-1;
    	balle.setXX(x);
        balle.setYY(y);
    			;
    	
    }

    for (int i = 0; i <N_BRIQUES; i++) {
        
        if ((balle.getRect()).intersects(brique[i].getRect())) {

            int balleLeft = (int) balle.getRect().getMinX();
            int balleHeight = (int) balle.getRect().getHeight();
            int balleWidth = (int) balle.getRect().getWidth();
            int balleTop = (int) balle.getRect().getMinY();

            Point pointRight = new Point(balleLeft + balleWidth + 1, balleTop);
            Point pointLeft = new Point(balleLeft - 1, balleTop);
            Point pointTop = new Point(balleLeft, balleTop - 1);
            Point pointBottom = new Point(balleLeft, balleTop + balleHeight + 1);

            if (!brique[i].isDestroyed()) {
                if (brique[i].getRect().contains(pointRight)) {
                    balle.setXX(-1);
                } else if (brique[i].getRect().contains(pointLeft)) {
                    balle.setXX(1);
                }

                if (brique[i].getRect().contains(pointTop)) {
                    balle.setYY(1);
                } else if (brique[i].getRect().contains(pointBottom)) {
                    balle.setYY(-1);
                }

                brique[i].setDestroyed(true);
                this.nbrdes+=1;
                score=score+(N_BRIQUES-i)/nbrBriqueParLigne+1;

           
        }
            }
    }
}
}

