package modèle;

import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.Rectangle;
import java.lang.String;
public class Brique   {

	protected int x;
	protected int y;
	protected String chemin;
	private boolean destroyed ;
	protected int imageWidth;
	protected int imageHeight;
	protected Image image;
	

	public Brique(int x, int y,String chemin) {

		this.x = x;
		this.y = y;
		this.chemin=chemin;

		destroyed = false;

		loadImage(chemin);
		getImageDimensions();
	}

	public String getChemin() {
		return chemin;
	}
	public void setX(int x) {
		this.x = x;
	}

	public  int getX() {
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


	private void loadImage(String chemin ) {

		ImageIcon imageIcon = new ImageIcon(chemin);
		image = imageIcon.getImage();        
	}

	public boolean isDestroyed() {

		return destroyed;
	}

	public void setDestroyed(boolean val) {

		destroyed = val;
	}
}
