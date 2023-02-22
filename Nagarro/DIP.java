import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class DIP {
@SuppressWarnings("unused")
	public static void main(String[] args) {
//        int width=963;
//        int height=640;
		//int n=0;
//		BufferedImage image1 = null;
//		BufferedImage image2 = null;
//		BufferedImage image3 = null;
//		BufferedImage image4 = null;
//		BufferedImage image5 = null;
//		BufferedImage image6 = null;
		try {
//			File input_file3 = new File("G:\\spyder\\data\\wc.png");
			File input_file1 = new File("G:\\resume\\img.jpg");
//			File input_file2 = new File("G:\\spyder\\data\\wc.png");
//			File input_file4 = new File("G:\\spyder\\data\\wc.png");
//			File input_file5 = new File("G:\\spyder\\data\\wc.png");
//			File input_file6 = new File("G:\\spyder\\data\\wc.png");
			BufferedImage image1 = ImageIO.read(input_file1);
			BufferedImage image2 = ImageIO.read(input_file1);
			BufferedImage image3 = ImageIO.read(input_file1);
			BufferedImage image4 = ImageIO.read(input_file1);
			BufferedImage image5 = ImageIO.read(input_file1);
			BufferedImage image6 = ImageIO.read(input_file1);
			BufferedImage image7 = ImageIO.read(input_file1);
			int len = image1.getHeight();
			int width = image1.getWidth();
//			System.out.println("length= " + len);
//			System.out.println("width= " + width);
//			System.out.println("Resolution= " + len * width);
			for (int i = 0; i < len; i++) {
				for (int j = 0; j < width; j++) {
					Color c = new Color(image1.getRGB(j, i));
					int r = c.getRed();
					int g = c.getGreen();
					int b = c.getBlue();
					int r1 = 255-r;
					int b1 = 255-b;
					int g1 = 255-g;
//					
//					int sum = r1 + b1 + g1;
//					
//					int avg=(r+b+g)/3;
//					
//					double r2=r*0.289;
//					double g2=g*0.589;
//					double b2=b*0.114;
//					int n=(int)(r2 + g2 + b2);
//					
					Color c7 = new Color(r1,g1,b1);
					Color c1 = new Color(r,0,0);
					Color c2 = new Color(0, g, 0);
					Color c3 = new Color(0,0,b);														
					Color c4 = new Color(0,(g+b)/2,(g+b)/2);
					Color c5 = new Color((r+g)/2, (r+g)/2, 0);
					Color c6 = new Color((r+b)/2,0,(r+b)/2);														
					
					image1.setRGB(j, i, c1.getRGB());
					image2.setRGB(j, i, c2.getRGB());
					image3.setRGB(j, i, c3.getRGB());
					image4.setRGB(j, i, c4.getRGB());
					image6.setRGB(j, i, c5.getRGB());
					image5.setRGB(j, i, c6.getRGB());
					image7.setRGB(j, i, c7.getRGB());
				
				}

			}
			File output_file1 = new File("G:\\resume\\img1.jpg");
			File output_file2 = new File("G:\\resume\\img2.jpg");
			File output_file3 = new File("G:\\resume\\img3.jpg");
			File output_file4 = new File("G:\\resume\\img4.jpg");
			File output_file5 = new File("G:\\resume\\img5.jpg");
			File output_file6 = new File("G:\\resume\\img6.jpg");
			File output_file7 = new File("G:\\resume\\img7.jpg");
			
			ImageIO.write(image1, "jpg", output_file1);
			ImageIO.write(image2, "jpg", output_file2);
			ImageIO.write(image3, "jpg", output_file3);
			ImageIO.write(image4, "jpg", output_file4);
			ImageIO.write(image5, "jpg", output_file5);
			ImageIO.write(image6, "jpg", output_file6);
			ImageIO.write(image7, "jpg", output_file7);
		
		}

		catch (IOException e) {
			System.out.println("Error:" + e);
		}

	}
}