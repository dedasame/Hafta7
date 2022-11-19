
public class Hoca extends AkademikPersonel{
	
	protected String unvan;

	protected Hoca(String adi, String soyadi, String mail, String departman, String unvan) {
		super(adi, soyadi, mail, departman);
		this.unvan = unvan;
	}

	protected String getUnvan() {
		return unvan;
	}

	protected void setUnvan(String unvan) {
		this.unvan = unvan;
	}
	
	protected String giris() {
		return "Fakulte A Kapisindan Giris Yapildi";
	}
	
	protected String cikis() {
		return "Fakulte A Kapisindan Cikis Yapildi";
	}
	
	
}
