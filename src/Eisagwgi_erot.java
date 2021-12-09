
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Eisagwgi_erot {
	static Scanner s = new Scanner(System.in);
	static ArrayList<Erotisi> epipedo1 = new ArrayList<Erotisi>();
	static ArrayList<Erotisi> epipedo2 = new ArrayList<Erotisi>();
	static ArrayList<Erotisi> epipedo3 = new ArrayList<Erotisi>();

	public static void display_menu() {
		System.out.println("");
		System.out.println("0. για Έξοδο ");
		System.out.println("1. για εισαγωγή νέας ερώτησης ");
		System.out.println("2. για εκτύπωση ερωτήσεων στην οθόνη ");
		System.out.println("Παρακαλώ επιλέξτε : ");

	}

	public static void display_menu_erotisewn() {
		System.out.println("");
		System.out.println("1. για εκτύπωση ερωτήσεων επιπέδου 1");
		System.out.println("2. για εκτύπωση ερωτήσεων επιπέδου 2");
		System.out.println("3. για εκτύπωση ερωτήσεων επιπέδου 3");
		System.out.println("4. για εκτύπωση ερωτήσεων όλων των επιπέδων... ");
		System.out.println("Παρακαλώ επιλέξτε : ");
	}

	public static void printlevel1() {
		int arerwt = 0;
		System.out.println("Επίπεδο 1 ");
		System.out.println("--------- ");
		for (int i = 0; i < epipedo1.size(); i++) {
			arerwt++;
			System.out.println(arerwt + "." + " " + epipedo1.get(i).getErotisi());
		}

	}

	public static void printlevel2() {
		int arerwt = 0;
		System.out.println("Επίπεδο 2 ");
		System.out.println("--------- ");
		for (int i = 0; i < epipedo2.size(); i++) {
			arerwt++;
			System.out.println(arerwt + "." + " " + epipedo2.get(i).getErotisi());

		}

	}

	public static void printlevel3() {
		int arerwt = 0;
		System.out.println("Επίπεδο 3 ");
		System.out.println("--------- ");
		for (int i = 0; i < epipedo3.size(); i++) {
			arerwt++;
			System.out.println(arerwt + "." + " " + epipedo3.get(i).getErotisi());
		}

	}

	public static void kataxorisi_erotisi() {
		System.out.println("Δώσε την καινούγρια ερώτηση");
		String erotisi = s.nextLine();
		String[] pin_apant = new String[4];
		System.out.println("Δώσε την πιθανή απάντηση 1 ");
		pin_apant[0] = s.nextLine();
		System.out.println("Δώσε την πιθανή απάντηση 2 ");
		pin_apant[1] = s.nextLine();
		System.out.println("Δώσε την πιθανή απάντηση 3 ");
		pin_apant[2] = s.nextLine();
		System.out.println("Δώσε την πιθανή απάντηση 4 ");
		pin_apant[3] = s.nextLine();
		System.out.println("Ποιά απο τις τέσσερις είναι η σωστή απάντηση ");
		int sosti_apant = s.nextInt();
		s.nextLine();
		System.out.println("Ποιανού επίπεδου είναι η ερώτηση αυτή ? ");
		int epipedo = s.nextInt();
		s.nextLine();
		Erotisi er = new Erotisi(erotisi, pin_apant, sosti_apant - 1, epipedo);
		if (er.getEpipedo() == 1) {
			epipedo1.add(er);
		} else if (er.getEpipedo() == 2) {
			epipedo2.add(er);
		} else {
			epipedo3.add(er);
		}
	}
	public static void save_files() {
		try {
			FileOutputStream stream1 = new FileOutputStream("epipedo1.ser");
			ObjectOutputStream out1= new ObjectOutputStream(stream1);
			out1.writeObject(epipedo1);
			out1.close();
			stream1.close();
			
			
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
		try {
			FileOutputStream stream2 = new FileOutputStream("epipedo2.ser");
			ObjectOutputStream out2= new ObjectOutputStream(stream2);
			out2.writeObject(epipedo2);
			out2.close();
			stream2.close();
			
			
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
		try {
			FileOutputStream stream3 = new FileOutputStream("epipedo3.ser");
			ObjectOutputStream out3= new ObjectOutputStream(stream3);
			out3.writeObject(epipedo3);
			out3.close();
			stream3.close();
			
			
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}
	
	
	public static void load_files() {
		File tempFile = new File("epipedo1.ser");
		if(tempFile.exists()) {//αν υπαρχουν τα αποθηκεθμενα αρχεια
			try {
				FileInputStream stream1= new FileInputStream("epipedo1.ser");
				ObjectInputStream in1=new ObjectInputStream(stream1);
				epipedo1=(ArrayList<Erotisi>) in1.readObject();
				
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				FileInputStream stream2= new FileInputStream("epipedo2.ser");
				ObjectInputStream in2=new ObjectInputStream(stream2);
				epipedo2=(ArrayList<Erotisi>) in2.readObject();
				
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			try {
				FileInputStream stream3= new FileInputStream("epipedo3.ser");
				ObjectInputStream in3=new ObjectInputStream(stream3);
				epipedo3=(ArrayList<Erotisi>) in3.readObject();
				
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
	
	public static void main(String[] args) {
		load_files();
		int epilogi1;
		int epilogi2;
		do {
			display_menu();
			epilogi1 = s.nextInt();
			s.nextLine();
			if (epilogi1 == 0) {
				System.out.println("Το πρόγραμμα κλίνει. ");
				save_files();
				System.out.println("Οι ερωτήσεις αποθηκεύτηκαν σε αρχεία (3) ενα για κάθε επίπεδο.");
			} else if (epilogi1 == 1) {
				kataxorisi_erotisi();
			} else if (epilogi1 == 2) {
				do {

					display_menu_erotisewn();
					epilogi2 = s.nextInt();
					s.nextLine();
					if (epilogi2 == 1) {
						printlevel1();

					} else if (epilogi2 == 2) {
						printlevel2();
					} else if (epilogi2 == 3) {
						printlevel3();
					} else if (epilogi2 == 4) {
						printlevel1();
						printlevel2();
						printlevel3();

					} else {
						System.out.println("Λάθος επιλογή ξαναεπιλέξτε");
					}
				} while (epilogi2 < 1 || epilogi2 > 4);
			} else {
				System.out.println("Λάθος επιλογή ξαναεπιλέξτε");
			}

		} while (epilogi1 != 0);

	}

}
