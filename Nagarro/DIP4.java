//GOVIND BAJAJ
//18EJICS057
import java.io.*;
import java.util.Scanner;
import java.awt.image.BufferedImage;
import java.awt.*;
import javax.imageio.ImageIO;

public class DIP4 {

	public static void main(String args[]) throws Exception {
		BufferedImage simg = null; // BufferedImage for source image
		File f = null; // File object
		// Read source image file
		try {
			f = new File("G:\\resume\\img.jpg");
			simg = ImageIO.read(f);
		} catch (IOException e) {
			System.out.println("Error: " + e);
		}
// Get source image dimension
		int width = simg.getWidth();
		int height = simg.getHeight();
// BufferedImage for mirror image
		BufferedImage mimg = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		System.out.println("Height : " + height);
		System.out.println("Width : " + width);

//Negative
		int count = 0;
		for (int i = 0; i < height / 2; i++) {
			for (int j = 0; j < width / 2; j++) {
				count++;
				Color c = new Color(simg.getRGB(j, i));
				int red = c.getRed();
				int green = c.getGreen();
				int blue = c.getBlue();
				if ((green + 100) < 255) {
					green = 255 - green;
				}
				if ((red + 100) < 255) {
					red = 255 - red;
				}
				if ((blue + 100) < 255) {
					blue = 255 - blue;
				}
				Color nc = new Color(red, green, blue);
				mimg.setRGB(j, i, nc.getRGB());
			}
		}

		count = 0;
		for (int i = 0; i < height / 2; i++) {
			for (int j = width / 2; j < width; j++) {
				count++;
				Color c = new Color(simg.getRGB(j, i));
				int red = c.getRed();
				int green = c.getGreen();
				int blue = c.getBlue();
				Color nc = new Color(red, green, blue);
				mimg.setRGB(j, i, nc.getRGB());
			}
		}

		count = 0;
		for (int i = height / 2; i < height; i++) {
			for (int j = 0; j < width / 2; j++) {
				count++;
				Color c = new Color(simg.getRGB(j, i));
				int red = c.getRed();
				int green = c.getGreen();
				int blue = c.getBlue();
				Color nc = new Color(red, green, blue);
				mimg.setRGB(j, i, nc.getRGB());
			}
		}

//Magenta
		count = 0;
		for (int i = height / 2; i < height; i++) {
			for (int j = width / 2; j < width; j++) {
				count++;
				Color c = new Color(simg.getRGB(j, i));
				int red = c.getRed();
				int green = c.getGreen();
				int blue = c.getBlue();
				if ((blue + 100) < 255) {
					blue = blue + 100;
				}
				if ((red + 100) < 255) {
					red = red + 100;
					Color nc = new Color(red, green, blue);
					mimg.setRGB(j, i, nc.getRGB());
				}
			}

// save image
			try {
				f = new File("G:\\resume\\imgz.jpg");
				ImageIO.write(mimg, "jpg", f);
			} catch (IOException e) {
				System.out.println("Error: " + e);
			}
		}
	}
}