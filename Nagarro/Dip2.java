import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Dip2 {
	public static void main(String[] args) {
		try {
			File input_file1 = new File("G:\\resume\\img.jpg");

			BufferedImage image6 = ImageIO.read(input_file1);
			BufferedImage image7 = ImageIO.read(input_file1);
			int len = image6.getHeight();
			int width = image6.getWidth();
			for (int i = 0; i < len; i++) {
				for (int j = 0; j < width; j++) {
					Color c = new Color(image6.getRGB(j, i));
					int r = c.getRed();
					int g = c.getGreen();
					int b = c.getBlue();
					int r1 = 255-r;
					int b1 = 255-b;
					int g1 = 255-g;
					Color c7 = new Color(r1,g1,b1);
					Color c5 = new Color((r+g)/2, (r+g)/2, 0);													
					
					image6.setRGB(j, i, c5.getRGB());
					image7.setRGB(j, i, c7.getRGB());
				
				}

			}
			File output_file6 = new File("G:\\resume\\img61.jpg");
			File output_file7 = new File("G:\\resume\\img71.jpg");
			
			ImageIO.write(image6, "jpg", output_file6);
			ImageIO.write(image7, "jpg", output_file7);
		}
		catch (IOException e) {
			System.out.println("Error:" + e);
		}
	}
}