package SeleniumConceptsPracticeDemo;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.checkerframework.checker.units.qual.Luminance;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

public class ReadQRCodeFromFileAndWebPage {
	
 	public static void main(String args[]) throws IOException, NotFoundException
	{
 		
 		//Read QR code from file

	   File f=new File("C:\\Users\\AKILA RAJESH\\raj.png");
	
	//file contains image so using buffered read , read the image file
	   
	   BufferedImage bufferedimage=ImageIO.read(f);
	   System.out.println(bufferedimage);
	   LuminanceSource ls=new BufferedImageLuminanceSource(bufferedimage);
	   HybridBinarizer hb=new HybridBinarizer(ls);
	   BinaryBitmap bitmap=new BinaryBitmap(hb);
	   MultiFormatReader reader=new MultiFormatReader(); 
	   Result g=reader.decode(bitmap);
	   String barcodedata=g.getText();
	   System.out.println(barcodedata);
	   
	
	 

}
}
