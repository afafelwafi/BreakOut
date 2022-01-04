package modèle;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.Rectangle;

public class Raquette implements Paramètres{
	private int dx;
	protected int x;
	protected int y;
	protected int imageWidth;
	protected int imageHeight;
	protected Image image;
	protected String chemin;
	public Raquette(String chemin) {
		this.chemin=chemin;
		loadImage();
		getImageDimensions();

		resetState();
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



	 void loadImage() {

		ImageIcon imageIcon = new ImageIcon(this.chemin);
		image = imageIcon.getImage();        
	}    

	public void move() {

		x += dx;

		if (x <= 0) {
			x = 0;
		}

		if (x >= WIDTH - imageWidth) {
			x = WIDTH - imageWidth;
		}
	}
	public void setChemin(String c) {
		this.chemin=c;
	}
	public void keyPressed(KeyEvent e) {

		int key = e.getKeyCode();

		if (key == KeyEvent.VK_LEFT) {
			dx = -1;
		}

		if (key == KeyEvent.VK_RIGHT) {
			dx = 1;
		}
		
	}

	public void keyReleased(KeyEvent e) {

		int key = e.getKeyCode();

		if (key == KeyEvent.VK_LEFT) {
			dx = 0;
		}

		if (key == KeyEvent.VK_RIGHT) {
			dx = 0;
		}
	}

	private void resetState() {

		x = RAQUETTE_X;
		y = RAQUETTE_Y;
	}
}


