package modèle;

import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.Rectangle;
import javax.swing.ImageIcon;

public class Balle implements Paramètres {

    private int xx;
    private int yy;
    protected int x;
	protected int y;
	protected int imageWidth;
	protected int imageHeight;
	protected Image image;
	
	public Balle() {

        loadImage();
        getImageDimensions();
        resetState();
    }

	public int getXX() {
		return xx;
	}

	public int getYY(int y) {
		return yy;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getX() {
		return x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getY() {
		return y;
	}

	public int getImageWidth() {
		return imageWidth;
	}

	public int getImageHeight() {
		return imageHeight;
	}

	 public Image getImage() {
		return image;
	}

	 public Rectangle getRect() {
		return new Rectangle(x, y,
				image.getWidth(null), image.getHeight(null));
	}

	 public void getImageDimensions() {

		imageWidth = image.getWidth(null);
		imageHeight = image.getHeight(null);
	}


    private void loadImage() {

        ImageIcon imageIcon = new ImageIcon("src/Layer 0 (1).png");
        image = imageIcon.getImage();
    }

    public void move() {

    	x += xx;
    	y += yy;

    	if (x == 0) {
    		setXX(1);
    	}

    	if (x == WIDTH - imageWidth) {
    		setXX(-1);
    	}

    	if (y == 0) {
    		setYY(1);
    	}
    }
  
    	
   public void mouseClicked(MouseEvent e) {
	   if(e.getButton()== MouseEvent.BUTTON1) {
		   xx+=1;
		   yy-=1;

		   
	   }
    	}
    

    

    private void resetState() {

        x = BALLE_X;
        y = BALLE_Y;
    }

    public void setXX(int x) {
        xx = x;
    }

    public void setYY(int y) {
        yy = y;
    }

    public int getYY() {
        return yy;
    }
}

