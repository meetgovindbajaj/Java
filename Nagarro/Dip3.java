//GOPAL DUBEY
//18EJICS057
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
public class Dip3 {
	public static void main(String[] args) {
		try {
			File f = new File("G:\\resume\\imdq.jpg");
			BufferedImage image = ImageIO.read(f);
			getResolution(image);
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
	public static void getResolution(BufferedImage img) {
		int height = img.getHeight();
		int width = img.getWidth();
		rgbComponent(height, width, img);
	}
	public static void rgbComponent(int height, int width, BufferedImage img) {
		try {
			mirrorImage(height, width, img);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void mirrorImage(int height, int width, BufferedImage img) throws IOException {
		for (int y = 0; y < height; y++) {
			for (int lx = 0, rx = width - 1; lx < width; lx++, rx--) {
				int p = img.getRGB(lx, y);
				img.setRGB(rx, y, p);
				Color c = new Color(img.getRGB(lx, y));
				int red = (int) (c.getRed() * 0.299);
				int green = (int) (c.getGreen() * 0.587);
				int blue = (int) (c.getBlue() * 0.114);
				Color newColor = new Color(red + green + blue, red + green + blue, red + green + blue);
				img.setRGB(lx, y, newColor.getRGB());
			}
		}
		try {
			File f = new File("G:\\resume\\imgaa.jpg");
			ImageIO.write(img, "jpg", f);
		} catch (Exception e) {
			System.out.println("ERROR");
		}
	}
}