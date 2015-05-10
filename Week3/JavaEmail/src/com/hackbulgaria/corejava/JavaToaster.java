package com.hackbulgaria.corejava;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.nitido.utils.toaster.Toaster;

public class JavaToaster {
	public static void main(String[] args) throws IOException {
		Toaster toast = new Toaster();
		toast.setToasterHeight(600);
		toast.setToasterWidth(900);
		toast.setDisplayTime(10000000);
		// ImageIcon icon =
		// ImageIcon(this.getClass().getResource("/images/filename.png"));
		Image img = ImageIO.read(new File("/home/rosen/Downloads/dog.jpeg"));
		// Image img = Toolkit.getDefaultToolkit().getImage(
		// "/home/rosen/Downloads/dog.jpeg");
		toast.setBackgroundImage(img);
		toast.showToaster("Hello");
		// toast.setStep(2);
	}
}
