import java.io.Serializable;
import java.util.Arrays;

public class Erotisi implements Serializable{
	private String erotisi;
	private String[] apantiseis;
	private int apantisi ; 
	private int epipedo;
	
	public Erotisi(String erotisi, String[] apantiseis, int apantisi, int epipedo) {
		this.erotisi = erotisi;
		this.apantiseis = apantiseis;
		this.apantisi = apantisi;
		this.epipedo = epipedo;
	}
	public String getErotisi() {
		return erotisi;
	}
	public void setErotisi(String erotisi) {
		this.erotisi = erotisi;
	}
	public String[] getApantiseis() {
		return apantiseis;
	}
	public void setApantiseis(String[] apantiseis) {
		this.apantiseis = apantiseis;
	}
	public int getApantisi() {
		return apantisi;
	}
	public void setApantisi(int apantisi) {
		this.apantisi = apantisi;
	}
	public int getEpipedo() {
		return epipedo;
	}
	public void setEpipedo(int epipedo) {
		this.epipedo = epipedo;
	}
	@Override
	public String toString() {
		String erot=erotisi;
		
		int ar_apantisis;
		for(int i=0;i<apantiseis.length;i++) {
			ar_apantisis=i+1;
			erot=erot+"\n"+ar_apantisis+"."+apantiseis[i];
		}
		erot=erot+"\nParakalo Epilekste:";
		
		return erot;
	}
	
	public void display_erotisi() {
		System.out.println(toString());
	}
	
	
	

}
