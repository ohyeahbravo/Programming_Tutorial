import javax.imageio.ImageIO;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

// had to change the class name because of the conflict with one of the library
public class ImageIOExercise {
	
	public static void main(String[] args) {
		
		try {
			
			BufferedImage img = ImageIO.read(new File("image.jpg"));
			
			int width = img.getWidth();
			int height = img.getHeight();
			
			for(int i = 0; i < height; i++) {
				for(int j = 0; j < width; j++) {
					Color color = new Color(img.getRGB(j, i));
					int r = (int) (color.getRed() * 0.299);
					int g = (int) (color.getGreen() * 0.587);
					int b = (int) (color.getBlue() * 0.114);
					int t = r + g + b;
					Color newColor = new Color(t, t, t);
					img.setRGB(j,  i,  newColor.getRGB());
				}
			}

			File grayimage = new File("grayimage.jpeg");
			ImageIO.write(img,  "jpeg",  grayimage);			
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	//todo: load the file image.jpg into this class
	//change this image into grayscale and save it into a new image
	//use the following color conversion for every pixel in your image:
	//red *= 0.299
	//green *= 0.587
	//blue *= 0.114

}
