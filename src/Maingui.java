import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;

public class Maingui extends JFrame {
	private ArrayList<Erotisi> epipedo1 = new ArrayList<Erotisi>();
	private ArrayList<Erotisi> epipedo2 = new ArrayList<Erotisi>();
	private ArrayList<Erotisi> epipedo3 = new ArrayList<Erotisi>();
	private String epipedo;

	public Maingui(String epipedo) {
		super("Odysseia");
		setSize(300, 500);
		this.epipedo = epipedo;
		load_files();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// otan patietai to x stamataei to programma
		setVisible(true); // emfanise to login frame
	}

	public void load_files() {
		File tempFile = new File("epipedo1.ser");

		if (tempFile.exists() == true) {// αν υπαρχουν τα αποθηκεθμενα αρχεια
			try {
				FileInputStream stream1 = new FileInputStream("epipedo1.ser");
				ObjectInputStream in1 = new ObjectInputStream(stream1);

				epipedo1 = (ArrayList<Erotisi>) in1.readObject();

			} catch (FileNotFoundException e) {

				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				FileInputStream stream2 = new FileInputStream("epipedo2.ser");
				ObjectInputStream in2 = new ObjectInputStream(stream2);
				epipedo2 = (ArrayList<Erotisi>) in2.readObject();

			} catch (FileNotFoundException e) {

				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				FileInputStream stream3 = new FileInputStream("epipedo3.ser");
				ObjectInputStream in3 = new ObjectInputStream(stream3);
				epipedo3 = (ArrayList<Erotisi>) in3.readObject();

			} catch (FileNotFoundException e) {

				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void eisagwgi_erotisis() {
		Erotisi er ;
		if(epipedo.equals("1") ) {
int rand =get_random(0,epipedo1.size()-1);
er	= epipedo1.get(rand);
		}
	}
	public static int get_random(int min, int max) {
		Random rand = new Random();
		int random_number = rand.nextInt((max + 1) - min) + min;
		return random_number;

	}
}
