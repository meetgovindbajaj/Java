import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Dip1 {
	public static BufferedImage rotate(BufferedImage img) {
		int width = img.getWidth();
		int height = img.getHeight();
		BufferedImage newImage = new BufferedImage(img.getWidth(), img.getHeight(), img.getType());
		Graphics2D g2 = newImage.createGraphics();
		g2.rotate(Math.toRadians(30), width / 2, height / 2);
		g2.drawImage(img, null, 0, 0);
		return newImage;
	}
	public static BufferedImage rotate1(BufferedImage img) {
		int width = img.getWidth();
		int height = img.getHeight();
		BufferedImage newImage = new BufferedImage(img.getWidth(), img.getHeight(), img.getType());
		Graphics2D g2 = newImage.createGraphics();
		g2.rotate(Math.toRadians(315), width / 2, height / 2);
		g2.drawImage(img, null, 0, 0);
		return newImage;
	}
	public static void main(String[] args) {
		try {
			BufferedImage orignalImg = ImageIO.read(new File("G:\\resume\\img.jpg"));
			BufferedImage SubImg = rotate(orignalImg);
			File outputfile = new File("G:\\resume\\imgx.jpg");
			ImageIO.write(SubImg, "jpg", outputfile);
			
			BufferedImage rotatedImg = ImageIO.read(new File("G:\\resume\\imgx.jpg"));
			BufferedImage SubImg1 = rotate1(rotatedImg);
			File outputfile1 = new File("G:\\resume\\imgy.jpg");
			ImageIO.write(SubImg1, "jpg", outputfile1);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
