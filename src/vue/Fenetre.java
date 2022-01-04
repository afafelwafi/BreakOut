package vue;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JPanel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import contrôleur.Contrôleur;
import modèle.Brique;
import modèle.Paramètres;

import javax.swing.ImageIcon;
import java.awt.Image;
public class Fenetre extends JPanel implements Paramètres {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Timer timer;
    private Contrôleur con;
    private boolean played;
    public Fenetre(Contrôleur contrôleur) {
        initFenetre(contrôleur);
    }

    private void initFenetre(Contrôleur contrôleur) {

        this.con=contrôleur;
    	addKeyListener(new TAdapter());
    	addMouseListener(new Adapter());
        setFocusable(true);
        timer = new Timer();
        this.played=true;
 
     
    	
    }

    @Override
    public void addNotify() {

        super.addNotify();
        this.con.gameInit(con.getNiveau()); 
        
        
    }


    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        g2d.setRenderingHint(RenderingHints.KEY_RENDERING,
                RenderingHints.VALUE_RENDER_QUALITY);
        ImageIcon imageIcon = new ImageIcon("src/back.jpg");
 		Image image = imageIcon.getImage();
 		int imageWidth = image.getWidth(null);
 		int imageHeight = image.getHeight(null);
        g2d.drawImage(image, 0,0, imageWidth , imageHeight, this);
        	
        	
   
    
        if  (con.getinGame() && con.getHearts() >0) {
            drawObjects(g2d);
        }
        if (con.getinGame()==false && con.getHearts()>0) {
        	con.setinGame(true);
        	con.gameInit(con.getNiveau());
        	drawObjects(g2d);
        
        	
        	
        }
        if (con.getHearts()<=0) {
        
            gameFinished(g2d);
        }

        Toolkit.getDefaultToolkit().sync();
    }
    
    private void drawObjects(Graphics2D g2d) {
    	if (con.getNiveau()!=0){
    	  Font font3 = new Font("Verdana",Font.PLAIN , 50);
    	  FontMetrics metr3=this.getFontMetrics(font3); 
          g2d.setColor(Color.BLUE);
          g2d.setFont(font3);
          g2d.drawString(Integer.toString(con.getScore()),Paramètres.WIDTH - metr3.stringWidth(Integer.toString(con.getScore()))-100,50);
    	  for (int i=0; i < con.getHearts(); i++) {
          	g2d.drawImage(con.getVie()[i].getImage(), con.getVie()[i].getX(), 20,
          			con.getVie()[i].getImageWidth(), con.getVie()[i].getImageHeight(), this);  
          	
          }	
    	  
    	
    	
        g2d.drawImage(con.getBalle().getImage(), con.getBalle().getX(), con.getBalle().getY(),
    	con.getBalle().getImageWidth(), con.getBalle().getImageHeight(), this);
    	
        g2d.drawImage(con.getRaquette().getImage(), con.getRaquette().getX(), con.getRaquette().getY(),
        		con.getRaquette().getImageWidth(), con.getRaquette().getImageHeight(), this);
    

 
        
        
        
        
        for (int i = 0; i < N_BRIQUES; i++) {
        
        		if (!con.getBrique()[i].isDestroyed()) {
        			g2d.drawImage(con.getBrique()[i].getImage(), con.getBrique()[i].getX(),
            			con.getBrique()[i].getY(), con.getBrique()[i].getImageWidth(),
            			con.getBrique()[i].getImageHeight(), this);}
      
        	
        		
        }
        ImageIcon imageIcon = new ImageIcon("src/star.png");
		Image image = imageIcon.getImage();
		int imageWidth = image.getWidth(null);
		int imageHeight = image.getHeight(null);
		g2d.drawImage(image,Paramètres.WIDTH-100 ,5, imageWidth-8 , imageHeight-8, this);
		if (this.played==false) {
			imageIcon = new ImageIcon("src/play.png");
			image = imageIcon.getImage();
			int imageWidthp = image.getWidth(null);
			int imageHeightp = image.getHeight(null);
			g2d.drawImage(image, Paramètres.WIDTH/2-50,5, imageWidthp , imageHeightp, this);}
		else {
			imageIcon = new ImageIcon("src/pause.png");
			image = imageIcon.getImage();
			int imageWidthp = image.getWidth(null);
			int imageHeightp = image.getHeight(null);
			g2d.drawImage(image, Paramètres.WIDTH/2-50,5, imageWidthp , imageHeightp, this);}
		}
		
    	
		
        
        
        if (con.getBalle().getXX()==0 & con.getBalle().getYY()==0 & con.getinGame()) {
        	
            
            /* ImageIcon imageIcon = new ImageIcon("src/Sans titre.png");
     		Image image = imageIcon.getImage();
     		int imageWidth = image.getWidth(null);
     		int imageHeight = image.getHeight(null);
             g2d.drawImage(image, 450,350,
         			imageWidth, imageHeight, this);*/
         
         	g2d.setColor(new Color(81,81,162)); 
         	g2d.fillRoundRect(560,305,240,50,50,50);
         	g2d.setColor(new Color(54,54,109));       	
         	g2d.fillRoundRect(550,300,240,50,50,50);
            	Font font = new Font("Verdana",Font.PLAIN , 50);
               g2d.setColor(Color.YELLOW);
               g2d.setFont(font);
               g2d.drawString("EASY",607, 340);
               g2d.setColor(new Color(81,81,162)); 
           	g2d.fillRoundRect(560,365,240,50,50,50);
           	g2d.setColor(new Color(54,54,109)); 
               g2d.fillRoundRect(550,360,240,50,50,50);
           	  Font fonth = new Font("Verdana",Font.PLAIN , 50);
               g2d.setColor(Color.ORANGE);
               g2d.setFont(fonth);
               g2d.drawString("MEDIUM",565, 400);
               g2d.setColor(new Color(81,81,162)); 
           	g2d.fillRoundRect(560,425,240,50,50,50);
           	g2d.setColor(new Color(54,54,109)); 
               g2d.fillRoundRect(550,420,240,50,50,50);
             	Font fonth2 = new Font("Verdana",Font.PLAIN , 50);
                 g2d.setColor(Color.RED);
                 g2d.setFont(fonth2);
                 g2d.drawString("HARD",600, 460);}
      
          
            	
            
            
        	
        	
        }
       
        
   
    
    private void gameFinished(Graphics2D g2d) {
    		
    	Brique[] bri=new Brique[11];
    	bri[0]=new Brique(300,500,"src/19-Breakout-Tiles.png");
    	bri[1]=new Brique(30,80,"src/Layer 0 (4).png");
    	bri[2]=new Brique(30,80,"src/Layer 0 (5).png");
    	bri[3]=new Brique(30,80,"src/Layer 0 (6).png");
    	bri[4]=new Brique(30,80,"src/Layer 0 (7).png");
    	bri[5]=new Brique(30,80,"src/Layer 0 (8).png");
    	bri[6]=new Brique(30,80,"src/background (2).png");
    	bri[7]=new Brique(30,80,"src/background (1).png");
    	bri[8]=new Brique(30,80,"src/background (3).png");
    	bri[9]=new Brique(30,80,"src/background (4).png");
    	bri[10]=new Brique(200,500,"src/19-Breakout-Tiles.png");
    	g2d.drawImage(bri[0].getImage(), bri[0].getX(),
    			bri[0].getY(), bri[0].getImageWidth(),
    			bri[0].getImageHeight(), this);
    	for (int i = 1; i < 11; i++) {
            	g2d.drawImage(bri[i].getImage(), bri[0].getX()+i*bri[i].getImageWidth(),
            			bri[0].getY(), bri[i].getImageWidth(),
            			bri[i].getImageHeight(), this);
    	}
    	Font font = new Font("Verdana", Font.BOLD, 100);
        Font font2 = new Font("Verdana",Font.PLAIN , 50);
        FontMetrics metr = this.getFontMetrics(font);
        FontMetrics metr2=this.getFontMetrics(font2); 
        g2d.setColor(Color.RED);
        g2d.setFont(font);
        g2d.drawString(con.getMessage(),
                (Paramètres.WIDTH - metr.stringWidth(con.getMessage())-200) / 2+100,
                Paramètres.HEIGTH  / 2);
        g2d.setColor(Color.YELLOW);
        g2d.setFont(font2);
        g2d.drawString("votre score est "+ Integer.toString(con.getScore()),
                (Paramètres.WIDTH - metr2.stringWidth(con.getMessage())) / 2-100,
               ( Paramètres.HEIGTH+100) / 2);
    }

    private class TAdapter extends KeyAdapter {

        @Override
        public void keyReleased(KeyEvent e) {
        	con.getRaquette().keyReleased(e);
        }

        @Override
        public void keyPressed(KeyEvent e) {
        	con.getRaquette().keyPressed(e);
        	
        }
    }
    private class Adapter extends MouseAdapter {

        @Override
        public void mouseClicked(MouseEvent e) {
        	int x=e.getX();
        	int y=e.getY();
        	if (x<=800 & x>=560 & y<=350 & y>=300) {
        		con.setNiveau(1);
        		con.gameInit(con.getNiveau());
        		timer.scheduleAtFixedRate(new ScheduleTask(), 0, PERIOD+5);
        		
        		con.getBalle().mouseClicked(e);
        
        	}
        	if (x<=800 & x>=560 & y<=410 & y>=360) {
        		con.setNiveau(2);
        		con.gameInit(con.getNiveau());
        	timer.scheduleAtFixedRate(new ScheduleTask(), 0, PERIOD);
        		con.getBalle().mouseClicked(e);
        	}
        	if (x<=800 & x>=560 & y<=470 & y>=420) {
        		con.setNiveau(3);
        	
        		con.gameInit(con.getNiveau());
        	timer.scheduleAtFixedRate(new ScheduleTask(), 0, PERIOD-3);
        	
        		con.getBalle().mouseClicked(e);
        	}
        	
        	if (x<=Paramètres.WIDTH/2+100 & x>Paramètres.WIDTH/2-50 & y<=100 & y>=5) {
        		if (played==false) {
        		played=true;
        		repaint();
        		timer.scheduleAtFixedRate(new ScheduleTask(), 10000000,PERIOD);
        		con.getBalle().move();
        		con.getBalle().mouseClicked(e);
        		
        		}
        		
        		else {
        			played=false;
        			repaint();
        			timer.schedule(new ScheduleTask(), 0);
        			con.getBalle().move();
        			con.getBalle().mouseClicked(e);
        		}
           		
        	}
    
        	
        }
  
        	}
        	
        	

    private class ScheduleTask extends TimerTask {

        @Override
        public void run() {
        
        	
        	con.getBalle().move();
        	con.getRaquette().move();
        	con.checkCollision();
            repaint();
        }
    }

  
    }
