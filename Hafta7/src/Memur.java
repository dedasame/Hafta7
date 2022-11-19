
public class Memur extends Person {
	
	protected String bolum;

	protected Memur(String adi, String soyadi, String mail, String bolum) {
		super(adi, soyadi, mail);
		this.bolum = bolum;
	}

	protected String getBolum() {
		return bolum;
	}

	protected void setBolum(String bolum) {
		this.bolum = bolum;
	}
	
	protected String giris() {
		return "Personel Kapisindan Giris Yapildi";
	}
	
	
	
}
