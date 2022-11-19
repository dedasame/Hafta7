
public class Person {
	
	protected String adi,soyadi,mail;

	protected Person(String adi, String soyadi, String mail) {
		this.adi = adi;
		this.soyadi = soyadi;
		this.mail = mail;
	}
	
	
	protected String getAdi() {
		return adi;
	}

	protected void setAdi(String adi) {
		this.adi = adi;
	}

	protected String getSoyadi() {
		return soyadi;
	}

	protected void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}

	protected String getMail() {
		return mail;
	}

	protected void setMail(String mail) {
		this.mail = mail;
	}
	
	
	protected String giris() {
		return "Giris Yapildi";
	}
	
	
	
}
