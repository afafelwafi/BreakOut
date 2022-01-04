package modèle;

import javax.swing.ImageIcon;
import java.awt.Image;

public class Vie  {
	
	protected int x;
	protected int imageWidth;
	protected int imageHeight;
	protected Image image;
	private boolean dead;


	public Vie(int x) {

		this.x = x;
		dead = false;
		loadImage();
		getImageDimensions();
	}


	public void setX(int x) {
		this.x = x;
	}

	public  int getX() {
		return x;
	}
	public boolean isDead() {

		return dead;
	}

	public void sethearts(boolean val) {

		dead= val;
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


	 public void getImageDimensions() {

		imageWidth = image.getWidth(null);
		imageHeight = image.getHeight(null);
	}


	private void loadImage() {

		ImageIcon imageIcon = new ImageIcon("src/Layer 0 (3).png");
		image = imageIcon.getImage();        
	}
}

